(ns soda-ash.elements.images
  (:require [soda-ash.elements.template :as t]
            [soda-ash.elements.image :as i]))


;; Meta

(def e-name "images")

(def default-tag :div)

(def ui? true)


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :bool-set i/bool-set
              :mod-set i/mod-set
              :opt-set i/opt-set}))
