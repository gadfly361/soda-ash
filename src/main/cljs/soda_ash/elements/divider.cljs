(ns soda-ash.elements.divider
  (:require [soda-ash.elements.template :as t]))


;; Meta

(def e-name "divider")

(def default-tag :div)

(def ui? true)


;; Types

(def type-set
  #{:vertical :horizontal})


;; Variations

(def bool-set
  #{:clearing? :fitted? :hidden? :inverted? :section?})


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set type-set
              :bool-set bool-set}))
