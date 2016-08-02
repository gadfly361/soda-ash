(ns soda-ash.contents.actions
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))



(def types
  [:default
   :link])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "actions"
   :types   types})


(defcomp "default" opts)
