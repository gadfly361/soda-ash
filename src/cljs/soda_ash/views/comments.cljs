(ns soda-ash.views.comments
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "comments"
          :only-one? true}
         m))


(def types
  [:default])

(def states
  [(create-group
    {:group-name   "states"
     :group-vector (vector
                    :collapsed)})])


(def variations
  [(create-group
    {:group-name   "threaded"
     :group-vector (vector
                    :threaded)})

   (create-group
    {:group-name   "minimal"
     :group-vector (vector
                    :minimal)})
   ])


(def opts
  {:tag        :div
   :ui?        true
   :ui-name    "comments"
   :types      types
   :states     states
   :variations variations})


(defcomp "default" opts)
