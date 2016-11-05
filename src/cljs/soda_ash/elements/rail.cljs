(ns soda-ash.elements.rail
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "rail")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:left
   :right
   :left-internal
   :right-internal
   :left-dividing
   :right-dividing])


(def variations
  [(create-group
    {:group-name   "attached"
     :group-vector (vector
                    :attached)})

   (create-group
    {:group-name   "close"
     :group-vector (vector
                    :close
                    :very-close)})

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
   ])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :variations variations})


(defcomp "left" (assoc opts :type :left))
(defcomp "right" (assoc opts :type :right))
(defcomp "left-internal" (assoc opts :type :left-internal))
(defcomp "right-internal" (assoc opts :type :right-internal))
(defcomp "left-dividing" (assoc opts :type :left-dividing))
(defcomp "right-dividing" (assoc opts :type :right-dividing))
