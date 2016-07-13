(ns soda-ash.contents.header
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def types
  [:default])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "header"
   :types types})


(defcomp "default" opts)
