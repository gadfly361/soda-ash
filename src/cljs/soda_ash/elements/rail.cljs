(ns soda-ash.elements.rail
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "rail"
          :only-one? true}
         m))


(def types
  [:left
   :right
   :left-internal
   :right-internal
   :left-dividing
   :right-dividing])


(def groups
  [;; Variations
   (create-group
    {:group-name   "attached"
     :group-vector (vector
                    :attached)})

   (create-group
    {:group-name   "close"
     :group-vector (vector
                    :close
                    :very-close)})
   ])


(def opts
  {:tag     :div
   :ui?     true
   :ui-name "rail"
   :groups  groups})


(defcomp "left" (assoc opts :type :left))
(defcomp "right" (assoc opts :type :right))
(defcomp "left-internal" (assoc opts :type :left-internal))
(defcomp "right-internal" (assoc opts :type :right-internal))
(defcomp "left-dividing" (assoc opts :type :left-dividing))
(defcomp "right-dividing" (assoc opts :type :right-dividing))
