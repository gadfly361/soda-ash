(ns soda-ash.elements.rail
  (:require [soda-ash.elements.template :as t]
            [clojure.set :as set]))


;; Meta

(def e-name "rail")

(def default-tag :div)

(def ui? true)


;; Types

(def type-set
  #{:left
    :right
    :left-internal
    :right-internal
    :left-dividing
    :right-dividing})


;; Variations + States

(def bool-set
  #{:attached?})

(def mod-set
  #{:close ;; :default | :very
    })


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set type-set
              :bool-set bool-set
              :mod-set mod-set}))
