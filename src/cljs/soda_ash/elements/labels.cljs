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
  [:tag
   :circular])


(def groups
  [;; Variations
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
  {:tag     :div
   :ui?     true
   :ui-name "labels"
   :groups  groups})


(defcomp "default" opts)
(defcomp "tag" (assoc opts :type :tag))
(defcomp "circular" (assoc opts :type :circular))
