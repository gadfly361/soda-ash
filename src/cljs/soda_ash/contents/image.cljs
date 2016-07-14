(ns soda-ash.contents.image
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))



(def types
  [:default
   :link])


(def opts
  {:tag        :div
   :ui?        false
   :ui-name    "image"
   :types      types})


(defcomp "default" opts)
(defcomp "link" (assoc opts :tag :a))
