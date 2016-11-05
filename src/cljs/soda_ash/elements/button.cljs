(ns soda-ash.elements.button
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :button)
(def ui? true)
(def ui-name "button")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default
   :primary
   :secondary

   :animated
   :vertical-animated
   :animated-fade

   :labeled
   :left-labeled
   :icon
   :labeled-icon
   :right-labeled-icon

   :inverted

   :basic
   :primary-basic
   :secondary-basic
   :inverted-basic])


(def states
  [(create-group
    {:group-name   "states"
     :group-vector (vector
                    :active
                    :disabled
                    :loading)})])

(def variations
  [(create-group
    {:group-name   "social"
     :group-vector (vector
                    :facebook
                    :twitter
                    :google-plus
                    :vk
                    :linkedin
                    :instagram
                    :youtube)})

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

   (create-group
    {:group-name   "floated"
     :group-vector (vector
                    :left-floated
                    :right-floated)})

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
    {:group-name   "compact"
     :group-vector (vector
                    :compact)})

   (create-group
    {:group-name   "toggle"
     :group-vector (vector
                    :toggle)})

   (create-group
    {:group-name   "consequence"
     :group-vector (vector
                    :positive
                    :negative)})

   (create-group
    {:group-name   "fluid"
     :group-vector (vector
                    :fluid)})

   (create-group
    {:group-name   "circular"
     :group-vector (vector
                    :circular)})

   (create-group
    {:group-name   "vertically-attached"
     :group-vector (vector
                    :top-attached
                    :bottom-attached)})

   (create-group
    {:group-name   "horizontally-attached"
     :group-vector (vector
                    :left-attached
                    :right-attached)})
   ])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :states     states
   :variations variations})


(defcomp "default" opts)
(defcomp "primary" (assoc opts :type :primary))
(defcomp "secondary" (assoc opts :type :secondary))
(defcomp "animated" (assoc opts :type :animated))
(defcomp "vertical-animated" (assoc opts :type :vertical-animated))
(defcomp "animated-fade" (assoc opts :type :animated-fade))
(defcomp "labeled" (assoc opts :type :labeled :tag :div :tab-index? true))
(defcomp "left-labeled" (assoc opts :type :left-labeled :tag :div :tab-index? true))
(defcomp "icon" (assoc opts :type :icon))
(defcomp "labeled-icon" (assoc opts :type :labeled-icon))
(defcomp "right-labeled-icon" (assoc opts :type :right-labeled-icon))
(defcomp "inverted" (assoc opts :type :inverted))

(defcomp "basic" (assoc opts :type :basic))
(defcomp "primary-basic" (assoc opts :type :primary-basic))
(defcomp "secondary-basic" (assoc opts :type :secondary-basic))
(defcomp "inverted-basic" (assoc opts :type :inverted-basic))
