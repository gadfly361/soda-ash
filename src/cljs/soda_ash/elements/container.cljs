(ns soda-ash.elements.container
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "container"
          :only-one? true}
         m))


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
  {:tag        :div
   :ui?        true
   :ui-name    "container"
   :types      types
   :variations variations})


(defcomp "default" opts)
(defcomp "text" (assoc opts :type :text))
