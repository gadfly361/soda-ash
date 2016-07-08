(ns soda-ash.collections.breadcrumb-section
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "section"
          :only-one? true}
         m))


(def groups
  [;; States
   (create-group
    {:group-name   "states"
     :group-vector (vector
                    :active)})
   ])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "section"
   :groups  groups})


(defcomp "default" opts)
(defcomp "link" (assoc opts :tag :a))
