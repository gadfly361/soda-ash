(ns soda-ash.elements.labels
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "labels"
          :only-one? true}
         m))


(def types
  [:default
   :tag
   :circular])


(def variations
  [(create-group
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
    {:group-name   "size"
     :group-vector (vector
                    :mini
                    :tiny
                    :small
                    :medium
                    :large
                    :big
                    :huge
                    :massive)})
   ])


(def opts
  {:tag        :div
   :ui?        true
   :ui-name    "labels"
   :types      types
   :variations variations})


(defcomp "default" opts)
(defcomp "tag" (assoc opts :type :tag))
(defcomp "circular" (assoc opts :type :circular))
