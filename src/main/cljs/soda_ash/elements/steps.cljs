(ns soda-ash.elements.steps
  (:require [soda-ash.elements.template :as t]))


;; Meta

(def e-name "steps")

(def default-tag :div)

(def ui? true)


;; Types

(def type-set
  #{:ordered
    :tablet-stackable
    :vertical})


;; Variations + States

(def bool-set
  #{:fluid?})

(def mod-set
  #{:attached ;; top | bottom
    :divided ;; one | two | ...
    })

(def opt-set
  #{:size ;; :default | small | large
    })


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set type-set
              :bool-set bool-set
              :mod-set mod-set
              :opt-set opt-set}))
