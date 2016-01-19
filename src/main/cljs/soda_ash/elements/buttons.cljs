(ns soda-ash.elements.buttons
  (:require [soda-ash.elements.template :as t]
            [soda-ash.elements.button :as b]
            [clojure.set :as set]))


;; Meta

(def e-name "buttons")

(def default-tag :div)

(def ui? true)


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set b/type-set
              :bool-set b/bool-set
              :mod-set b/mod-set
              :opt-set b/opt-set}))
