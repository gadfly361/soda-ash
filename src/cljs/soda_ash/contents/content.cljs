(ns soda-ash.contents.content
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))



(def types
  [:default
   :hidden
   :visible])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "content"
   :types types})


(defcomp "default" opts)
(defcomp "hidden" (assoc opts :type :hidden))
(defcomp "visible" (assoc opts :type :visible))
