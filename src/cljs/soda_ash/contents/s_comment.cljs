(ns soda-ash.contents.s-comment
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))



(def types
  [:default])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "comment"
   :types   types})


(defcomp "default" opts)
