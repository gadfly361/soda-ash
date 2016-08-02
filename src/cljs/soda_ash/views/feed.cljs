(ns soda-ash.views.feed
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "feed"
          :only-one? true}
         m))


(def types
  [:default])


(def variations
  [(create-group
    {:group-name   "size"
     :group-vector (vector
                    :small
                    :medium ;; doesn't actually exist
                    :large)})])


(def opts
  {:tag        :div
   :ui?        true
   :ui-name    "feed"
   :types      types
   :variations variations})


(defcomp "default" opts)
