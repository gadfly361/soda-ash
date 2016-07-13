(ns soda-ash.contents.s-or
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))



(def types
  [:default])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "s-or"
   :types types})


(defcomp "default" opts)
