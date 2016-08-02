(ns soda-ash.contents.content
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "content"
          :only-one? true}
         m))


(def types
  [:default
   :extra
   :hidden
   :visible])


(def variations
  [;; for items
   (create-group
    {:group-name   "aligned"
     :group-vector (vector
                    ;;
                    :middle-aligned
                    :bottom-aligned)})])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "content"
   :types types
   :variations variations})


(defcomp "default" opts)
(defcomp "extra" (assoc opts :type :extra))
(defcomp "hidden" (assoc opts :type :hidden))
(defcomp "visible" (assoc opts :type :visible))
