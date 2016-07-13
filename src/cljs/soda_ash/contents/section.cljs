(ns soda-ash.contents.section
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "section"
          :only-one? true}
         m))


(def types
  [:default
   :link])


(def states
  [(create-group
    {:group-name   "states"
     :group-vector (vector
                    :active)})
   ])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "section"
   :types types
   :states states})


(defcomp "default" opts)
(defcomp "link" (assoc opts :tag :a))
