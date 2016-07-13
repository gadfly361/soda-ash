(ns soda-ash.elements.label
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "label"
          :only-one? true}
         m))


(def types
  [:default
   :image
   :pointing
   :pointing-below
   :left-pointing
   :right-pointing
   :left-corner
   :right-corner
   :tag
   :ribbon
   :right-ribbon
   :top-attached
   :bottom-attached
   :top-right-attached
   :top-left-attached
   :bottom-right-attached
   :bottom-left-attached
   :horizontal
   :floating])


(def variations
  [(create-group
    {:group-name   "circular"
     :group-vector (vector
                    :circular
                    :empty-circular)})

   (create-group
    {:group-name   "basic"
     :group-vector (vector
                    :basic)})

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
  {:tag        :div
   :ui?        true
   :ui-name    "label"
   :types      types
   :variations variations})


(defcomp "default" opts)
(defcomp "image" (assoc opts :type :image))
(defcomp "pointing" (assoc opts :type :pointing))
(defcomp "pointing-below" (assoc opts :type :pointing-below))
(defcomp "left-pointing" (assoc opts :type :left-pointing))
(defcomp "right-pointing" (assoc opts :type :right-pointing))
(defcomp "left-corner" (assoc opts :type :left-corner))
(defcomp "right-corner" (assoc opts :type :right-corner))
(defcomp "tag" (assoc opts :type :tag))
(defcomp "ribbon" (assoc opts :type :ribbon))
(defcomp "right-ribbon" (assoc opts :type :right-ribbon))
(defcomp "top-attached" (assoc opts :type :top-attached))
(defcomp "bottom-attached" (assoc opts :type :bottom-attached))
(defcomp "top-right-attached" (assoc opts :type :top-right-attached))
(defcomp "top-left-attached" (assoc opts :type :top-left-attached))
(defcomp "bottom-right-attached" (assoc opts :type :bottom-right-attached))
(defcomp "bottom-left-attached" (assoc opts :type :bottom-left-attached))
(defcomp "horizontal" (assoc opts :type :horizontal))
(defcomp "floating" (assoc opts :type :floating))
