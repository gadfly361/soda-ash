(ns soda-ash.elements.button
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "button"
          :only-one? true}
         m))


(def groups
  [;; Types
   (create-group
    {:group-name "types"
     :group-set  (sorted-set
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

                  :basic
                  :inverted
                  :inverted-basic)})

   ;; States
   (create-group
    {:group-name "states"
     :group-set  (sorted-set
                  :active
                  :disabled
                  :loading)})

   ;; Variations
   (create-group
    {:group-name "social"
     :group-set  (sorted-set
                  :facebook
                  :twitter
                  :google-plus
                  :vk
                  :linkedin
                  :instagram
                  :youtube)})

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

   (create-group
    {:group-name "floated"
     :group-set  (sorted-set
                  :left-floated
                  :right-floated)})

   (create-group
    {:group-name "colored"
     :group-set  (sorted-set
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
    {:group-name "compact"
     :group-set  (sorted-set
                  :compact)})

   (create-group
    {:group-name "toggle"
     :group-set  (sorted-set
                  :toggle)})

   (create-group
    {:group-name "consequence"
     :group-set  (sorted-set
                  :positive
                  :negative)})

   (create-group
    {:group-name "fluid"
     :group-set  (sorted-set
                  :fluid)})

   (create-group
    {:group-name "circular"
     :group-set  (sorted-set
                  :circular)})

   (create-group
    {:group-name "vertically attached"
     :group-set  (sorted-set
                  :top-attached
                  :bottom-attached)})

   (create-group
    {:group-name "horizontally attached"
     :group-set  (sorted-set
                  :left-attached
                  :right-attached)})
   ])


(def opts
  {:tag     :button
   :ui?     true
   :ui-name "button"
   :groups  groups})


(defcomp "default" opts)
(defcomp "primary" (assoc opts :type :primary))
(defcomp "secondary" (assoc opts :type :secondary))
(defcomp "animated" (assoc opts :type :animated))
(defcomp "vertical-animated" (assoc opts :type :vertical-animated))
(defcomp "animated-fade" (assoc opts :type :animated-fade))
(defcomp "labeled" (assoc opts :type :labeled))
(defcomp "left-labeled" (assoc opts :type :left-labeled))
(defcomp "icon" (assoc opts :type :icon))
(defcomp "labeled-icon" (assoc opts :type :labeled-icon))
(defcomp "right-labeled-icon" (assoc opts :type :right-labeled-icon))
(defcomp "basic" (assoc opts :type :basic))
(defcomp "inverted" (assoc opts :type :inverted))
(defcomp "inverted-basic" (assoc opts :type :inverted-basic))
