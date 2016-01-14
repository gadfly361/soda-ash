(ns soda-ash.elements.helpers
  (:require [clojure.string :as string]))


;; class

(defn soda->class [e-name
                   soda
                   type-set
                   bool-set
                   mod-set
                   opt-set
                   special-map]

  )


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
