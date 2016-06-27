(ns soda-ash.helpers
  (:require
   [clojure.string :as string]
   [clojure.set :as set]
   [soda-ash.config :as config]))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Devcards

(defn list-types [groups ui-name]
  (->> groups
       (filter #(= "types"
                   (:group-name %)))
       first
       :group-set
       (map #(str ui-name "-" (name %)))
       (string/join ", ")))

(defn list-keys [groups]
  (fn [group-name]
    (->> groups
         (filter #(= group-name
                     (:group-name %)))
         first
         :group-set
         (string/join ", "))))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Class

(defn keyword->class [k]
  "Convert keyword to string and replace dashes with spaces.
  Returns: string || nil"
  (some-> k
          name
          (string/replace #"-" " ")))


(defn- ->keyword-error-msg [k]
  (str "**[Soda-ash] `" k "` cannot contain whitespace**"))


(defn ->keyword [k]
  (cond
    (keyword? k)
    k

    (re-find #" " (name k))
    #? (:clj
        (throw (IllegalArgumentException.
                (->keyword-error-msg k)))
        :cljs
        (condp = (:issues-as @config/options)
            :warnings (js/console.warn
                       (->keyword-error-msg k))
            :errors (js/Error.
                     (->keyword-error-msg k))
            nil))

    :else
    (keyword (name k))))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Ash

(defn ash->set [ash]
  (reduce (fn [ash-set k]
            (let [k' (->keyword k)]
              (conj ash-set k')))
          (sorted-set)
          ash))


(defn ash-intersection-error-msg [{:keys [ui-name
                                          group-name
                                          group-set
                                          only-one?]
                                   :as   group}
                                  overlap]
  (str "**[Soda ash] When using `"
       ui-name
       "`, the `"
       group-name
       "` group can only use one of these --> "
       (string/join ", " (sort overlap))
       "**"))


(defn ash-set->intersection [{:keys [ui-name
                                group-name
                                group-set
                                only-one?]
                         :as   group}
                        ash-set]
  (let [overlap       (set/intersection group-set ash-set)
        overlap-count (count overlap)]

    (cond

      (and only-one?
           (> overlap-count 1))
      #? (:clj
          (throw (IllegalArgumentException.
                  (ash-intersection-error-msg group overlap)))
          :cljs
          (condp = (:issues-as @config/options)
            :warnings (js/console.warn
                       (ash-intersection-error-msg group overlap))
            :errors   (js/Error.
                       (ash-intersection-error-msg group overlap))
            nil))

      :else overlap)))


(defn ash->intersections [groups
                          ash]
  (let [intersections (doall
                       (for [group groups]
                         (ash-set->intersection group (ash->set ash))))]
    (remove empty? intersections)))


(defn intersections->class [intersections]
  (some->> intersections
           (apply set/union)
           (reduce (fn [coll k]
                     (let [class (keyword->class k)]
                       (conj coll class)))
                   [])
           sort
           (string/join " ")))

(defn ash->class [groups
                  ash]
  (let [class (some->> ash
                       (ash->intersections groups)
                       intersections->class)]
    (if (empty? class)
      nil
      class)))
