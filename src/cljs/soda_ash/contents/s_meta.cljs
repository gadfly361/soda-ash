(ns soda-ash.contents.s-meta
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "s-meta"
          :only-one? true}
         m))

(def types
  [:default])


(def variations
  [(create-group
    {:group-name   "floated"
     :group-vector (vector
                    :right-floated)})
   ])


(def opts
  {:tag        :div
   :ui?        false
   :ui-name    "s-meta"
   :types      types
   :variations variations})


(defcomp "default" opts)
