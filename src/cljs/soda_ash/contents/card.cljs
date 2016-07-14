(ns soda-ash.contents.card
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "card"
          :only-one? true}
         m))


(def types
  [:default
   :link
   ])


(def variations
  [(create-group
    {:group-name   "raised"
     :group-vector (vector
                    :raised)})

   (create-group
    {:group-name   "centered"
     :group-vector (vector
                    :centered)})

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
   :ui?     false
   :ui-name "card"
   :types types
   :variations variations})


(defcomp "default" opts)
(defcomp "link" (assoc opts :tag :a))
