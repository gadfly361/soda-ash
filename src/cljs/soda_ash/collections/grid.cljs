(ns soda-ash.collections.grid
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "grid")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default
   :divided
   :vertically-divided
   :celled
   :internally-celled])


(def variations
  [(create-group
    {:group-name   "equal-width"
     :group-vector (vector
                    :equal-width)})

   (create-group
    {:group-name   "padded"
     :group-vector (vector
                    :padded
                    :horizontally-padded
                    :vertically-padded)})

   (create-group
    {:group-name   "relaxed"
     :group-vector (vector
                    :relaxed
                    :very-relaxed)})

   (create-group
    {:group-name   "centered"
     :group-vector (vector
                    :centered)})

   (create-group
    {:group-name   "text-alignment"
     :group-vector (vector
                    :center-aligned
                    :right-aligned
                    :left-aligned)})

   (create-group
    {:group-name   "vertical-alignment"
     :group-vector (vector
                    :top-aligned
                    :middle-aligned
                    :bottom-aligned)})

   (create-group
    {:group-name   "doubling"
     :group-vector (vector
                    :doubling)})

   (create-group
    {:group-name   "stackable"
     :group-vector (vector
                    :stackable)})

   ;; TODO: reversed
   ])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :variations variations})


(defcomp "default" opts)
(defcomp "divided" (assoc opts :type :divided))
(defcomp "vertically-divided" (assoc opts :type :vertically-divided))
(defcomp "celled" (assoc opts :type :celled))
(defcomp "internally-celled" (assoc opts :type :internally-celled))
