(ns soda-ash.elements.divider
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "divider"
          :only-one? true}
         m))


(def groups
  [;; Types
   (create-group
    {:group-name "types"
     :group-set  (sorted-set
                  :vertical
                  :horizontal
                  ;; :horizontal-header
                  )})

   ;; Variations
   (create-group
    {:group-name "inverted"
     :group-set  (sorted-set
                  :inverted)})

   (create-group
    {:group-name "fitted"
     :group-set  (sorted-set
                  :fitted)})

   (create-group
    {:group-name "hidden"
     :group-set  (sorted-set
                  :hidden)})

   (create-group
    {:group-name "section"
     :group-set  (sorted-set
                  :section)})

   (create-group
    {:group-name "clearing"
     :group-set  (sorted-set
                  :clearing)})
   ])


(def opts
  {:tag     :div
   :ui?     true
   :ui-name "divider"
   :groups  groups})


(defcomp "default" opts)
(defcomp "vertical" (assoc opts :type :vertical))
(defcomp "horizontal" (assoc opts :type :horizontal))
(defcomp "horizontal-header" (assoc opts :type :horizontal-header))
