(ns soda-ash.elements.test-helpers
  (:require [cljs.test :refer-macros [is]]))


(defn get-attr [attr node]
  (.getAttribute node attr))

(def get-class (partial get-attr "class"))


(defn check-class
  ([class regex]
   (check-class class regex nil))
  ([class regex doc-string]
   (is (re-find regex class)
       doc-string)))

(defn !check-class
  ([class regex]
   (!check-class class regex nil))
  ([class regex doc-string]
   (is (not (re-find regex class))
       doc-string)))
