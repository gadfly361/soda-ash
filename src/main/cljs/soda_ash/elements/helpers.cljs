(ns soda-ash.elements.helpers
  (:require [clojure.string :as string]))



;; errors


(defn throw-error [k v e-name]
  (throw (js/Error.
          (string/join " "
                       ["Soda-ash"
                        k v
                        "doesn't exist for"
                        e-name
                        "element"]))))

(def throw-type-error
  (partial throw-error :type))



;; class


(defn value->class [v]
  (-> (name v)
      (string/replace #"-" " ")))

(defn type->class [v type-set e-name]
  (if (type-set v)
    (value->class v)
    (throw-type-error v e-name)))

(defn bool->class [k v]
  (when v
    (-> (value->class k)
        (string/replace #"\?" ""))))

(defn mod->class [k v]
  (let [k' (name k)
        v' (when-not (= :default v)
             (value->class v))]
    (->> [v' k']
         (remove nil?)
         (string/join " "))))

(defn opt->class [v]
  (value->class v))

(defn special->class [k v special-map e-name]
  (or ((special-map k) v)
      (throw-error k v e-name)))


(defn soda->class [e-name
                   soda
                   type-set
                   bool-set
                   mod-set
                   opt-set
                   special-map]
  (when (keys soda)
    (->> (for [[k v] soda]
           (cond (= :type k) (type->class v type-set e-name)
                 (bool-set k) (bool->class k v)
                 (mod-set k) (mod->class k v)
                 (opt-set k) (opt->class v)
                 (special-map k) (special->class k v special-map e-name)
                 :else (throw-error k v e-name)))
         (remove nil?)
         (string/join " "))))


(defn class [ui?
             soda-class
             e-name]
  (->> [(when ui? "ui") soda-class e-name]
       (remove nil?)
       (string/join " ")))



;; sanitize


(defn sanitize-soda [soda]
  (dissoc soda :ratom :path :tag))

(defn sanitize-attrs [attrs]
  (dissoc attrs :soda))
