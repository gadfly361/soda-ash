(ns soda-ash.elements.divider
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "divider"
          :only-one? true}
         m))


(def types
  [:default
   :vertical
   :horizontal
   :horizontal-header ;; TODO: check this
   ])


(def variations
  [(create-group
    {:group-name   "inverted"
     :group-vector (vector
                    :inverted)})

   (create-group
    {:group-name   "fitted"
     :group-vector (vector
                    :fitted)})

   (create-group
    {:group-name   "hidden"
     :group-vector (vector
                    :hidden)})

   (create-group
    {:group-name   "section"
     :group-vector (vector
                    :section)})

   (create-group
    {:group-name   "clearing"
     :group-vector (vector
                    :clearing)})
   ])


(def opts
  {:tag        :div
   :ui?        true
   :ui-name    "divider"
   :types      types
   :variations variations})


(defcomp "default" opts)
(defcomp "vertical" (assoc opts :type :vertical))
(defcomp "horizontal" (assoc opts :type :horizontal))
(defcomp "horizontal-header" (assoc opts :type :horizontal-header))
