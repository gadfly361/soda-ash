(ns soda-ash.contents.author
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? false)
(def ui-name "author")


(def types
  [:default
   :link])


(def opts
  {:tag     tag
   :ui?     ui?
   :ui-name ui-name
   :types   types})


(defcomp "default" opts)
(defcomp "link" (assoc opts :tag :a))
