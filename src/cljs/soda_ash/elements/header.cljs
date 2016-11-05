(ns soda-ash.elements.header
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "header")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


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
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :states     states
   :variations variations})


(defcomp "h1" (assoc opts :tag :h1))
(defcomp "h2" (assoc opts :tag :h2))
(defcomp "h3" (assoc opts :tag :h3))
(defcomp "h4" (assoc opts :tag :h4))
(defcomp "h5" (assoc opts :tag :h5))

(defcomp "huge" (assoc opts :type :huge))
(defcomp "large" (assoc opts :type :large))
(defcomp "medium" (assoc opts :type :medium))
(defcomp "small" (assoc opts :type :small))
(defcomp "tiny" (assoc opts :type :tiny))

(defcomp "sub" (assoc opts :type :sub))
