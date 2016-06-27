(ns soda-ash.elements.header
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "header"
          :only-one? true}
         m))


(def groups
  [;; Types
   (create-group
    {:group-name "types"
     :group-set  (sorted-set
                  ;; based on rem
                  :h1
                  :h2
                  :h3
                  :h4
                  :h5

                  ;; based on em
                  :huge
                  :large
                  :medium
                  :small
                  :tiny

                  :icon
                  :sub
                  )})

   ;; States
   (create-group
    {:group-name "states"
     :group-set  (sorted-set
                  :disabled)})

   ;; Variations

   ;; Note: this is a type, but makes more sense to implement as :ash
   (create-group
    {:group-name "icon"
     :group-set  (sorted-set
                  :icon)})

   (create-group
    {:group-name "dividing"
     :group-set  (sorted-set
                  :dividing)})

   (create-group
    {:group-name "block"
     :group-set  (sorted-set
                  :block)})

   (create-group
    {:group-name "attached"
     :group-set  (sorted-set
                  :top-attached
                  :attached
                  :bottom-attached)})

   (create-group
    {:group-name "floating"
     :group-set  (sorted-set
                  :right-floated
                  :left-floated)})

   (create-group
    {:group-name "text alignment"
     :group-set  (sorted-set
                  :right-aligned
                  :center-aligned
                  :left-aligned
                  :justified)})

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
                  :grey)})

   (create-group
    {:group-name "inverted"
     :group-set  (sorted-set
                  :inverted)})
   ])


(def opts
  {:tag     :div
   :ui?     true
   :ui-name "header"
   :groups  groups})


(defcomp "h1" (assoc opts :type :h1 :tag :h1))
(defcomp "h2" (assoc opts :type :h2 :tag :h2))
(defcomp "h3" (assoc opts :type :h3 :tag :h3))
(defcomp "h4" (assoc opts :type :h4 :tag :h4))
(defcomp "h5" (assoc opts :type :h5 :tag :h5))

(defcomp "huge" (assoc opts :type :huge))
(defcomp "large" (assoc opts :type :large))
(defcomp "medium" (assoc opts :type :medium))
(defcomp "small" (assoc opts :type :small))
(defcomp "tiny" (assoc opts :type :tiny))

(defcomp "sub" (assoc opts :type :sub))
