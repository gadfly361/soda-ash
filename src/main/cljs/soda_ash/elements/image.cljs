(ns soda-ash.elements.image
  (:require [soda-ash.elements.template :as t]
            [clojure.set :as set]))


;; Meta

(def e-name "image")

(def default-tag :img)

(def ui? true)


;; Variations + States

(def bool-set
  #{:avatar? :bordered? :centered?
    :circular? :fluid? :rounded?})

(def mod-set
  #{:aligned ;; top | middle | bottom
    :spaced ;; default | left | right
    :floated ;; left | right
    })

(def opt-set
  #{:state ;; hidden | disabled
    :size
    })


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :bool-set bool-set
              :mod-set mod-set
              :opt-set opt-set}))
