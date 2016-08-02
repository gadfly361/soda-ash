(ns soda-ash.contents.summary
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))



(def types
  [:default])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "summary"
   :types   types})


(defcomp "default" opts)
