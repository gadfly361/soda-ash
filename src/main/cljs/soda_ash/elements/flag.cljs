(ns soda-ash.elements.flag
  (:require [soda-ash.elements.template :as t]))


;; Meta

(def e-name "flag")

(def default-tag :i)

(def ui? false)


;; Variations

(def opt-set
  #{:flag})


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :opt-set opt-set}))
