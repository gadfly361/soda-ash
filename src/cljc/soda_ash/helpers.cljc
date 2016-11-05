(ns soda-ash.helpers
  (:require
   [clojure.string :as string]
   [clojure.set :as set]
   [soda-ash.config :as config]))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Devcards

(defn list-keys [groups]
  (fn [group-name]
    (->> groups
         (filter #(= group-name
                     (:group-name %)))
         first
         :group-vector
         (string/join ", "))))


(defn list-types
  "Assumes if :default exists, it is in first position"
  [opts]
  (let [{:keys [types
                ui-name]} opts
        default? (= :default (first types))]
    (if default?
      ;; w/ default
      (str ui-name
           (when (> (count types) 1) ", ")
           (some->> types
                    (drop 1)
                    (map #(str ui-name "-" (name %)))
                    (string/join ", ")))

      (some->> types
               (map #(str ui-name "-" (name %)))
               (string/join ", ")))))


(defn list-groups [groups]
  (->> (for [group groups]
         (let [{:keys [group-name
                       group-vector]} group
               ks                     (string/join ", " group-vector)]
           (str "\n**" group-name "**\n" ks "\n")))
       sort
       (apply str)))


(defn devcard-docs [opts]
  (let [{:keys [ui-name
                states
                variations]} opts
        types-docs           (list-types opts)
        states-docs          (list-groups states)
        variations-docs      (list-groups variations)]
    (apply str

           "# SUMMARY FOR " (string/upper-case ui-name) "\n"

           (str "# **types**\n"
                types-docs "\n")

           (when-not (empty? states-docs)
             (str "# **:data-soda**\n"
                  states-docs))

           (when-not (empty? variations-docs)
             (str "# **:data-ash**\n"
                  variations-docs)))))



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


(defn group-error-msg [{:keys [ui-name
                                          group-name
                                          group-vector
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
                                group-vector
                                only-one?]
                         :as   group}
                        ash-set]
  (let [group-set (into #{} group-vector)
        overlap       (set/intersection group-set ash-set)
        overlap-count (count overlap)]

    (cond

      (and only-one?
           (> overlap-count 1))
      #? (:clj
          (throw (IllegalArgumentException.
                  (group-error-msg group overlap)))
          :cljs
          (condp = (:issues-as @config/options)
            :warnings (js/console.warn
                       (group-error-msg group overlap))
            :errors   (js/Error.
                       (group-error-msg group overlap))
            nil))

      :else overlap)))


(defn missing-error-msg [ui-name
                         missing-keys]
  (str "**[Soda ash] When using `"
       ui-name
       "`, the following keys are not recognized: "
       (string/join ", " (sort missing-keys))
       "**"))


(defn ash->intersections [groups
                          ash]
  (let [intersections (->> (doall
                            (for [group groups]
                              (ash-set->intersection group (ash->set ash))))
                           (remove empty?)
                           (apply set/union))
        ash-set       (into #{} ash)
        ui-name       (-> groups first :ui-name)
        missing-keys  (set/difference ash-set intersections)
        ]
    (if (= ash-set intersections)
      intersections
      ;; else
      #? (:clj
          (throw (IllegalArgumentException.
                  (missing-error-msg ui-name missing-keys)))
          :cljs
          (condp = (:issues-as @config/options)
            :warnings (js/console.warn
                       (missing-error-msg ui-name missing-keys))
            :errors   (js/Error.
                       (missing-error-msg ui-name missing-keys))
            nil)))))


(defn intersections->class [intersections]
  (some->> intersections
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
