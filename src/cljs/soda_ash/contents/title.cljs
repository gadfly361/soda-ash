(ns soda-ash.contents.title
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))



(def types
  [:default])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "title"
   :types   types})


(defcomp "default" opts)
