(ns soda-ash.elements.input
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "input")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default])


(def states
  [(create-group
    {:group-name   "states"
     :group-vector (vector
                    :focus
                    :loading
                    :disabled
                    :error)})])


(def variations
  [(create-group
    {:group-name   "icon"
     :group-vector (vector
                    :icon
                    :left-icon)})

   (create-group
    {:group-name   "labeled"
     :group-vector (vector
                    :labeled
                    :right-labeled
                    :left-corner-labeled
                    :corner-labeled)})

   (create-group
    {:group-name   "action"
     :group-vector (vector
                    :action
                    :left-action)})

   (create-group
    {:group-name   "transparent"
     :group-vector (vector
                    :transparent)})

   (create-group
    {:group-name   "inverted"
     :group-vector (vector
                    :inverted)})

   (create-group
    {:group-name   "fluid"
     :group-vector (vector
                    :fluid)})

   (create-group
    {:group-name   "size"
     :group-vector (vector
                    :mini
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
