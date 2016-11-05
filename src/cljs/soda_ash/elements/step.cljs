(ns soda-ash.elements.step
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? false)
(def ui-name "step")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default
   :link])


(def states
  [(create-group
    {:group-name   "states"
     :group-vector (vector
                    :active
                    :completed
                    :disabled)})
   ])


(def opts
  {:tag     tag
   :ui?     ui?
   :ui-name ui-name
   :types   types
   :states  states})


(defcomp "default" opts)
(defcomp "link" (assoc opts :type :link :tag :a))
