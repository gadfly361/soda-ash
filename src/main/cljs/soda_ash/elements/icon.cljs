(ns soda-ash.elements.icon
  (:require [soda-ash.elements.template :as t]))


;; Meta

(def e-name "icon")

(def default-tag :i)

(def ui? false)


;; Variations + States

(def bool-set
  #{:bordered? :circular? :fitted? :inverted? :link?})

(def mod-set
  #{:flipped ;; horizontally | vertically
    :rotated ;; clockwise | counterclockwise
    })

(def opt-set
  #{:color
    :icon
    :size
    :state ;; disabled | loading
    })


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :bool-set bool-set
              :mod-set mod-set
              :opt-set opt-set}))
