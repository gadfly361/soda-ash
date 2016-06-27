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
    {:group-name "states"
     :group-set  (sorted-set
                  :focus
                  :loading
                  :disabled
                  :error)})

   ;; Variations
   (create-group
    {:group-name "icon"
     :group-set  (sorted-set
                  :icon
                  :left-icon)})

   (create-group
    {:group-name "labeled"
     :group-set  (sorted-set
                  :labeled
                  :right-labeled
                  :left-corner-labeled
                  :corner-labeled)})

   (create-group
    {:group-name "action"
     :group-set  (sorted-set
                  :action
                  :left-action)})

   (create-group
    {:group-name "transparent"
     :group-set  (sorted-set
                  :transparent)})

   (create-group
    {:group-name "inverted"
     :group-set  (sorted-set
                  :inverted)})

   (create-group
    {:group-name "fluid"
     :group-set  (sorted-set
                  :fluid)})

   (create-group
    {:group-name "size"
     :group-set  (sorted-set
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
