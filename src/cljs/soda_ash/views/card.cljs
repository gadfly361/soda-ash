(ns soda-ash.views.card
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "card"
          :only-one? true}
         m))


(def types
  [:default])


(def variations
  [(create-group
    {:group-name   "fluid"
     :group-vector (vector
                    :fluid)})

   (create-group
    {:group-name   "centered"
     :group-vector (vector
                    :centered)})

   (create-group
    {:group-name   "raised"
     :group-vector (vector
                    :raised)})

   (create-group
    {:group-name   "link"
     :group-vector (vector
                    :link)})

   (create-group
    {:group-name   "colored"
     :group-vector (vector
                    :red
                    :orange
                    :yellow
                    :olive
                    :green
                    :teal
                    :blue
                    :violet
                    :purple
                    :pink
                    :brown
                    :grey
                    :black)})
   ])


(def opts
  {:tag     :div
   :ui?     true
   :ui-name "card"
   :types types
   :variations  variations})


(defcomp "default" opts)
