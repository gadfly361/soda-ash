(ns soda-ash.elements.image
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :img)
(def ui? true)
(def ui-name "image")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default])


(def states
  [(create-group
    {:group-name   "states"
     :group-vector (vector
                    :hidden
                    :disabled)})])


(def variations
  [(create-group
    {:group-name   "avatar"
     :group-vector (vector
                    :avatar)})

   (create-group
    {:group-name   "bordered"
     :group-vector (vector
                    :bordered)})

   (create-group
    {:group-name   "fluid"
     :group-vector (vector
                    :fluid)})

   (create-group
    {:group-name   "rounded"
     :group-vector (vector
                    :rounded)})

   (create-group
    {:group-name   "circular"
     :group-vector (vector
                    :circular)})

   (create-group
    {:group-name   "aligned"
     :group-vector (vector
                    :top-aligned
                    :middle-aligned
                    :bottom-aligned)})

   (create-group
    {:group-name   "centered"
     :group-vector (vector
                    :centered)})

   (create-group
    {:group-name   "spaced"
     :group-vector (vector
                    :left-spaced
                    :spaced
                    :right-spaced)})

   (create-group
    {:group-name   "floated"
     :group-vector (vector
                    :left-floated
                    :right-floated)})

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
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :states     states
   :variations variations})


(defcomp "default" opts)
