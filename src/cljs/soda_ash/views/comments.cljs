(ns soda-ash.views.comments
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "comments")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


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
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :states     states
   :variations variations})


(defcomp "default" opts)
