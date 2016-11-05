(ns soda-ash.elements.divider
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "divider")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


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
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :variations variations})


(defcomp "default" opts)
(defcomp "vertical" (assoc opts :type :vertical))
(defcomp "horizontal" (assoc opts :type :horizontal))
(defcomp "horizontal-header" (assoc opts :type :horizontal-header))
