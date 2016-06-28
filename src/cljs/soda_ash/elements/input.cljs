(ns soda-ash.elements.input
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "input"
          :only-one? true}
         m))


(def groups
  [;; States
   (create-group
    {:group-name   "states"
     :group-vector (vector
                    :focus
                    :loading
                    :disabled
                    :error)})

   ;; Variations
   (create-group
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
  {:tag     :div
   :ui?     true
   :ui-name "input"
   :groups  groups})


(defcomp "default" opts)
