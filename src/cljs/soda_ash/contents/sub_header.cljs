(ns soda-ash.contents.sub-header
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def types
  [:default])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "sub-header"
   :types types})


(defcomp "default" opts)
