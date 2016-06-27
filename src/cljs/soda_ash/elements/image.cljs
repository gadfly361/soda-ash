(ns soda-ash.elements.image
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "image"
          :only-one? true}
         m))


(def groups
  [;; States
   (create-group
    {:group-name "states"
     :group-set (sorted-set
                 :hidden
                 :disabled)})

   ;; Variations
   (create-group
    {:group-name "avatar"
     :group-set  (sorted-set
                  :avatar)})

   (create-group
    {:group-name "bordered"
     :group-set  (sorted-set
                  :bordered)})

   (create-group
    {:group-name "fluid"
     :group-set  (sorted-set
                  :fluid)})

   (create-group
    {:group-name "rounded"
     :group-set  (sorted-set
                  :rounded)})

   (create-group
    {:group-name "circular"
     :group-set  (sorted-set
                  :circular)})

   (create-group
    {:group-name "aligned"
     :group-set  (sorted-set
                  :top-aligned
                  :middle-aligned
                  :bottom-aligned)})

   (create-group
    {:group-name "centered"
     :group-set  (sorted-set
                  :centered)})

   (create-group
    {:group-name "spaced"
     :group-set  (sorted-set
                  :spaced)})

   (create-group
    {:group-name "floated"
     :group-set  (sorted-set
                  :left-floated
                  :right-floated)})

   (create-group
    {:group-name "size"
     :group-set  (sorted-set
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
  {:tag     :img
   :ui?     true
   :ui-name "image"
   :groups  groups})


(defcomp "default" opts)
