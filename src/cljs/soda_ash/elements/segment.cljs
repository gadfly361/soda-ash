(ns soda-ash.elements.segment
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "segment")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default
   :raised
   :stacked
   :tall-stacked
   :piled
   :vertical])


(def states
  [(create-group
    {:group-name   "states"
     :group-vector (vector
                    :disabled
                    :loading)})])


(def variations
  [(create-group
    {:group-name   "attached"
     :group-vector (vector
                    :top-attached
                    :attached
                    :bottom-attached)})

   (create-group
    {:group-name   "padded"
     :group-vector (vector
                    :padded
                    :very-padded)})

   (create-group
    {:group-name   "compact"
     :group-vector (vector
                    :compact)})

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
    {:group-name   "emphasis"
     :group-vector (vector
                    :secondary
                    :tertiary)})

   (create-group
    {:group-name   "circular"
     :group-vector (vector
                    :circular)})

   (create-group
    {:group-name   "clearing"
     :group-vector (vector
                    :clearing)})

   (create-group
    {:group-name   "floated"
     :group-vector (vector
                    :left-floated
                    :right-floated)})

   (create-group
    {:group-name   "text alignment"
     :group-vector (vector
                    :left-aligned
                    :center-aligned
                    :right-aligned)})

   (create-group
    {:group-name   "basic"
     :group-vector (vector
                    :basic)})

   (create-group
    {:group-name   "blurring"
     :group-vector (vector
                    :blurring)})
   ])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :states     states
   :variations variations})


(defcomp "default" opts)
(defcomp "raised" (assoc opts :type :raised))
(defcomp "stacked" (assoc opts :type :stacked))
(defcomp "tall-stacked" (assoc opts :type :tall-stacked))
(defcomp "piled" (assoc opts :type :piled))
(defcomp "vertical" (assoc opts :type :vertical))
