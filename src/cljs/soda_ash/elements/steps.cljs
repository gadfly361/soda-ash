(ns soda-ash.elements.steps
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "steps"
          :only-one? true}
         m))


(def types
  [:default
   :ordered
   :vertical])


(def variations
  [(create-group
    {:group-name   "stackable"
     :group-vector (vector
                    :tablet-stackable)})

   (create-group
    {:group-name   "fluid"
     :group-vector (vector
                    :fluid)})

   (create-group
    {:group-name   "attached"
     :group-vector (vector
                    :attached
                    :bottom-attached)})

   (create-group
    {:group-name   "divided"
     :group-vector (vector
                    :two
                    :three
                    :four
                    :five
                    :six
                    :seven
                    :eight)})

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
  {:tag        :div
   :ui?        true
   :ui-name    "steps"
   :types      types
   :variations variations})


(defcomp "default" opts)
(defcomp "ordered" (assoc opts :type :ordered))
(defcomp "vertical" (assoc opts :type :vertical))
