(ns soda-ash.contents.event
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))



(def types
  [:default])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "event"
   :types   types})


(defcomp "default" opts)
