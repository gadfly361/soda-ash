(ns soda-ash.contents.event
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? false)
(def ui-name "event")


(def types
  [:default])


(def opts
  {:tag     tag
   :ui?     ui?
   :ui-name ui-name
   :types   types})


(defcomp "default" opts)
