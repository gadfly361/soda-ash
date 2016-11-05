(ns soda-ash.views.items
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "items")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default])


(def variations
  [(create-group
    {:group-name   "divided"
     :group-vector (vector
                    :divided)})

   (create-group
    {:group-name   "relaxed"
     :group-vector (vector
                    :relaxed
                    :very-relaxed)})

   (create-group
    {:group-name   "link"
     :group-vector (vector
                    :link)})])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :variations variations})


(defcomp "default" opts)
