(ns soda-ash.elements.label
  (:require [soda-ash.elements.template :as t]
            [clojure.set :as set]))


;; Meta

(def e-name "label")

(def default-tag :div)

(def ui? true)


;; Types

(def attached-types
  #{:top-attached
    :bottom-attached
    :top-right-attached
    :top-left-attached
    :bottom-left-attached
    :bottom-right-attached})

(def corner-types
  #{:left-corner
    :right-corner})

(def floating-type
  #{:floating})

(def horizontal-type
  #{:horizontal})

(def image-type
  #{:image})

(def pointing-types
  #{:pointing
    :pointing-below
    :left-pointing
    :right-pointing})

(def tag-type
  #{:tag})

(def ribbon-types
  #{:ribbon
    :right-ribbon})

(def type-set
  (set/union attached-types
             corner-types
             horizontal-type
             floating-type
             image-type
             pointing-types
             tag-type
             ribbon-types))


;; Variations + States

(def bool-set
  #{:circular? :empty? :basic?})

(def opt-set
  #{:color
    :size})


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set type-set
              :bool-set bool-set
              :opt-set opt-set}))
