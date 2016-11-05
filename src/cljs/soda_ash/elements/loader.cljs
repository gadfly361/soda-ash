(ns soda-ash.elements.loader
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))

(def tag :div)
(def ui? true)
(def ui-name "loader")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default
   :text])

(def states
  [(create-group
    {:group-name   "states"
     :group-vector (vector
                    :indeterminate
                    :active
                    :disabled)})])


(def variations
  [(create-group
    {:group-name   "inline"
     :group-vector (vector
                    :inline)})

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

   (create-group
    {:group-name   "inverted"
     :group-vector (vector
                    :inverted)})
   ])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :states     states
   :variations variations})


(defcomp "default" opts)
(defcomp "text" (assoc opts :type :text))
