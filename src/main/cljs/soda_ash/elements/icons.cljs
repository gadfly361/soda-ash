(ns soda-ash.elements.icons
  (:require [soda-ash.elements.template :as t]
            [soda-ash.elements.icon :as i]))


;; Meta

(def e-name "icons")

(def default-tag :i)

(def ui? false)


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :bool-set i/bool-set
              :mod-set i/mod-set
              :opt-set i/opt-set}))
