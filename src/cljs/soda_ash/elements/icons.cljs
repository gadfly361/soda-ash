(ns soda-ash.elements.icons
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "icons"
          :only-one? true}
         m))


(def types
  [:default])


(def variations
  [(create-group
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
   ])


(def opts
  {:tag        :i
   :ui?        false
   :ui-name    "icons"
   :types      types
   :variations variations})


(defcomp "default" opts)
