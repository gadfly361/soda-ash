(ns soda-ash.contents.image
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div) ;; TODO: check if this should be an img instead
(def ui? false)
(def ui-name "image")


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
