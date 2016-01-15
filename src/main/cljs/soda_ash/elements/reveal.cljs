(ns soda-ash.elements.reveal
  (:require [soda-ash.elements.template :as t]))


;; Meta

(def e-name "reveal")

(def default-tag :div)

(def ui? true)


;; Types

(def type-set
  #{:fade
    :move
    :move-right
    :move-up
    :move-down
    :rotate
    :rotate-left})


;; Variations + States

(def bool-set
  #{:instant?})

(def opt-set
  #{:state ;; :active :disabled
    })


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set type-set
              :bool-set bool-set
              :opt-set opt-set}))
