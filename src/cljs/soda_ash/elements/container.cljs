(ns soda-ash.elements.container
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "container"
          :only-one? true}
         m))


(def groups
  [;; Types
   (create-group
    {:group-name "types"
     :group-set  (sorted-set
                  :text)})

   ;; Variations
   (create-group
    {:group-name "text alignment"
     :group-set  (sorted-set
                  :left-aligned
                  :center-aligned
                  :right-aligned
                  :justified)})

   (create-group
    {:group-name "fluid"
     :group-set  (sorted-set
                  :fluid)})
   ])


(def opts
  {:tag     :div
   :ui?     true
   :ui-name "container"
   :groups  groups})


(defcomp "default" opts)
(defcomp "text" (assoc opts :type :text))
