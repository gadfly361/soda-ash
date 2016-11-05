(ns soda-ash.collections.message
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "message")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default
   :icon])


(def states
  [(create-group
    {:group-name   "states"
     :group-vector (vector
                    :hidden
                    :visible)})])


(def variations
  [(create-group
    {:group-name   "floating"
     :group-vector (vector
                    :floating)})

   (create-group
    {:group-name   "compact"
     :group-vector (vector
                    :compact)})

   (create-group
    {:group-name   "attached"
     :group-vector (vector
                    :attached
                    :bottom-attached)})

   (create-group
    {:group-name   "context"
     :group-vector (vector
                    :warning
                    :info
                    :positive :success
                    :negative :error)})

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
                    ;;
                    :large
                    :big
                    :huge
                    :massive)})
   ])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :states     states
   :variations variations})


(defcomp "default" opts)
(defcomp "icon" (assoc opts :type :icon))
