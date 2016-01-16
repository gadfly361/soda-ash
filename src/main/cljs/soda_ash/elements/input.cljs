(ns soda-ash.elements.input
  (:require [soda-ash.elements.template :as t]))


;; Meta

(def e-name "input")

(def default-tag :div)

(def ui? true)


;; Variations

(def bool-set
  #{:fluid? :inverted? :transparent?})

(def mod-set
  #{:action ;; default | left | (right)
    :icon ;; default | left
    :labeled ;; default | right | left-corner | corner
    })

(def opt-set
  #{:size
    :state ;; focus | loading | disabled | error
    })


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :bool-set bool-set
              :mod-set mod-set
              :opt-set opt-set}))
