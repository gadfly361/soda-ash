(ns soda-ash.elements.loader
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "loader"
          :only-one? true}
         m))


(def types
  [:text])


(def groups
  [;; States
   (create-group
    {:group-name   "states"
     :group-vector (vector
                    :indeterminate
                    :active
                    :disabled)})

   ;; Variations
   (create-group
    {:group-name   "inline"
     :group-vector (vector
                    :inline)})

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

   (create-group
    {:group-name   "inverted"
     :group-vector (vector
                    :inverted)})
   ])


(def opts
  {:tag     :div
   :ui?     true
   :ui-name "loader"
   :groups  groups})


(defcomp "default" opts)
(defcomp "text" (assoc opts :type :text))
