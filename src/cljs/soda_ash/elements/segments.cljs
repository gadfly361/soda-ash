(ns soda-ash.elements.segments
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "segments"
          :only-one? true}
         m))


(def types
  [:horizontal
   :raised
   :stacked
   :piled])


(def groups
  [])


(def opts
  {:tag     :div
   :ui?     true
   :ui-name "segments"
   :groups  groups})


(defcomp "default" opts)
(defcomp "horizontal" (assoc opts :type :horizontal))
(defcomp "raised" (assoc opts :type :raised))
(defcomp "stacked" (assoc opts :type :stacked))
(defcomp "piled" (assoc opts :type :piled))
