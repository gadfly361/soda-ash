(ns soda-ash.elements.icons
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "icons"
          :only-one? true}
         m))


(def groups
  [;; Variations
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
   ])


(def opts
  {:tag     :i
   :ui?     false
   :ui-name "icons"
   :groups  groups})


(defcomp "default" opts)
