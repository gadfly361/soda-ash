(ns soda-ash.elements.step
  (:require [soda-ash.elements.template :as t]))


;; Meta

(def e-name "step")

(def default-tag :div)

(def ui? false)


;; Types

(def type-set
  #{:link})


;; Variations + States

(def opt-set
  #{:state ;; active | completed | disabled
    })


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set type-set
              :opt-set opt-set}))
