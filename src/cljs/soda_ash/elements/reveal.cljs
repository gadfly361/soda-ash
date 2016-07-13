(ns soda-ash.elements.reveal
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "reveal"
          :only-one? true}
         m))


(def types
  [:fade
   :move
   :move-right
   :move-up
   :move-down
   :rotate
   :rotate-left])


(def states
  [(create-group
    {:group-name   "states"
     :group-vector (vector
                    :active
                    :disabled)})])


(def variations
  [(create-group
    {:group-name   "instant"
     :group-vector (vector
                    :instant)})
   ])


(def opts
  {:tag        :div
   :ui?        true
   :ui-name    "reveal"
   :types      types
   :states     states
   :variations variations})


(defcomp "fade" (assoc opts :type :fade))
(defcomp "move" (assoc opts :type :move))
(defcomp "move-right" (assoc opts :type :move-right))
(defcomp "move-up" (assoc opts :type :move-up))
(defcomp "move-down" (assoc opts :type :move-down))
(defcomp "rotate" (assoc opts :type :rotate))
(defcomp "rotate-left" (assoc opts :type :rotate-left))
