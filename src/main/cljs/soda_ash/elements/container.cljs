(ns soda-ash.elements.container
  (:require [soda-ash.elements.template :as t]))


;; Meta

(def e-name "container")

(def default-tag :div)

(def ui? true)


;; Types

(def type-set
  #{:text})


;; Variations

(def bool-set
  #{:fluid?})

(def special-map
  {:aligned {:right "right aligned"
             :left "left aligned"
             :justified "justified"
             :center "center aligned"}})


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set type-set
              :bool-set bool-set
              :special-map special-map}))
