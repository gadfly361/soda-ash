(ns soda-ash.elements.segments
  (:require [soda-ash.elements.template :as t]
            [soda-ash.elements.segment :as s]))


;; Meta

(def e-name "segments")

(def default-tag :div)

(def ui? true)


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set s/type-set
              :bool-set s/bool-set
              :mod-set s/mod-set
              :opt-set s/opt-set}))
