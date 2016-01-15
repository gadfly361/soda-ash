(ns soda-ash.elements.loader
  (:require [soda-ash.elements.template :as t]))


;; Meta

(def e-name "loader")

(def default-tag :div)

(def ui? true)


;; Types

(def type-set
  #{:text})


;; Variations

(def bool-set
  #{:centered? ;; couples with inline
    :inverted?})

(def mod-set
  #{:inline ;; default | small | large
    })

(def opt-set
  #{:size ;; mini | small | medium | large
    :state ;; indeterminate | active | disabled
    })


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set type-set
              :bool-set bool-set
              :mod-set mod-set
              :opt-set opt-set}))
