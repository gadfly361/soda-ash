(ns soda-ash.elements.container
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "container")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default
   :text])


(def variations
  [(create-group
    {:group-name   "text alignment"
     :group-vector (vector
                    :left-aligned
                    :center-aligned
                    :right-aligned
                    :justified)})

   (create-group
    {:group-name   "fluid"
     :group-vector (vector
                    :fluid)})
   ])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :variations variations})


(defcomp "default" opts)
(defcomp "text" (assoc opts :type :text))
