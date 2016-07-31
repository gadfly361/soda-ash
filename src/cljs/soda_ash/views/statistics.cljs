(ns soda-ash.views.statistics
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "statistics"
          :only-one? true}
         m))


(def types
  [:default])



(def variations
  [(create-group
    {:group-name   "horizontal"
     :group-vector (vector
                    :horizontal)})

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

   (create-group
    {:group-name   "inverted"
     :group-vector (vector
                    :inverted)})

   (create-group
    {:group-name   "count"
     :group-vector (vector
                    :one
                    :two
                    :three
                    :four
                    :five
                    :six
                    :seven
                    :eight
                    :nine
                    :ten)})

   (create-group
    {:group-name   "size"
     :group-vector (vector
                    :mini
                    :tiny
                    :small
                    :medium ;; doesn't actually exist
                    :large
                    :huge)})
   ])


(def opts
  {:tag        :div
   :ui?        true
   :ui-name    "statistics"
   :types      types
   :variations variations})


(defcomp "default" opts)
