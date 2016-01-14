(ns soda-ash.elements.header
  (:require [soda-ash.elements.template :as t]))


;; Meta

(def e-name "header")

(def default-tag :div)

(def ui? true)


;; Types

(def type-set
  #{:icon
    :sub

    :huge
    :large
    :medium
    :small
    :tiny})


;; Variations + States

(def bool-set
  #{:block?
    :disabled?
    :dividing?
    :inverted?})

(def mod-set
  #{:attached ;; attached | top attached | bottom attached
    :floated ;; right floated | left floated
    })

(def opt-set
  #{:color})

(def special-map
  {:aligned {:right "right aligned"
             :left "left aligned"
             :justified "justified"
             :center "center aligned"}})


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set type-set
              :bool-set bool-set
              :mod-set mod-set
              :opt-set opt-set
              :special-map special-map}))
