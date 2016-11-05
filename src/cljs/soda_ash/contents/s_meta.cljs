(ns soda-ash.contents.s-meta
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? false)
(def ui-name "meta")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default])


(def variations
  [(create-group
    {:group-name   "floated"
     :group-vector (vector
                    :right-floated)})
   ])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :variations variations})


(defcomp "default" opts)
