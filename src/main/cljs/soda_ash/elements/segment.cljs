(ns soda-ash.elements.segment
  (:require [soda-ash.elements.template :as t]))


;; Meta

(def e-name "segment")

(def default-tag :div)

(def ui? true)


;; Types

(def type-set
  #{:raised
    :stacked
    :tall-stacked
    :piled
    :vertical})


;; Variations + States

(def bool-set
  #{:basic? :circular? :clearing? :compact? :inverted?})

(def mod-set
  #{:aligned ;; left | right | center
    :attached ;; default | top | bottom
    :floated ;; left | right
    :padded ;; default | very
    })

(def opt-set
  #{:color
    :emphasis ;; secondary | tertiary
    :state ;; disabled | loading
    })


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set type-set
              :bool-set bool-set
              :mod-set mod-set
              :opt-set opt-set}))
