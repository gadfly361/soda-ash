(ns soda-ash.elements.header
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "header"
          :only-one? true}
         m))


(def types
  [;; based on rem
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
   :sub])


(def states
  [(create-group
    {:group-name   "states"
     :group-vector (vector
                    :disabled)})])


(def variations
  ;; Note: this is a type, but makes more sense to implement as :ash
  [(create-group
    {:group-name   "icon"
     :group-vector (vector
                    :icon)})

   (create-group
    {:group-name   "dividing"
     :group-vector (vector
                    :dividing)})

   (create-group
    {:group-name   "block"
     :group-vector (vector
                    :block)})

   (create-group
    {:group-name   "attached"
     :group-vector (vector
                    :top-attached
                    :attached
                    :bottom-attached)})

   (create-group
    {:group-name   "floating"
     :group-vector (vector
                    :right-floated
                    :left-floated)})

   (create-group
    {:group-name   "text alignment"
     :group-vector (vector
                    :left-aligned
                    :center-aligned
                    :right-aligned
                    :justified)})

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
                    :grey)})

   (create-group
    {:group-name   "inverted"
     :group-vector (vector
                    :inverted)})
   ])


(def opts
  {:tag        :div
   :ui?        true
   :ui-name    "header"
   :types      types
   :states     states
   :variations variations})


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
