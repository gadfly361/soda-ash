(ns soda-ash.elements.icon
  (:require [soda-ash.elements.template :as t]
            [clojure.set :as set]))


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

(def special-map
  {})


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set type-set
              :bool-set bool-set
              :mod-set mod-set
              :opt-set opt-set
              :special-map special-map}))
