(ns soda-ash.elements.labels
  (:require [soda-ash.elements.template :as t]
            [soda-ash.elements.label :as l]
            [clojure.set :as set]))


;; Meta

(def e-name "labels")

(def default-tag :div)

(def ui? true)


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set l/type-set
              :bool-set l/bool-set
              :opt-set l/opt-set}))
