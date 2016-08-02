(ns soda-ash.views.items
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "items"
          :only-one? true}
         m))


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
  {:tag        :div
   :ui?        true
   :ui-name    "items"
   :types      types
   :states     states
   :variations variations})


(defcomp "default" opts)
