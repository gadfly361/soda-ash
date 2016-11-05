(ns soda-ash.elements.segments
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "segments")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default
   :horizontal
   :raised
   :stacked
   :piled])


(def variations
  [])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :variations variations})


(defcomp "default" opts)
(defcomp "horizontal" (assoc opts :type :horizontal))
(defcomp "raised" (assoc opts :type :raised))
(defcomp "stacked" (assoc opts :type :stacked))
(defcomp "piled" (assoc opts :type :piled))
