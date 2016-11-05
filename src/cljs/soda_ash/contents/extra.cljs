(ns soda-ash.contents.extra
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? false)
(def ui-name "extra")


(def types
  [:default
   :images
   :text])


(def opts
  {:tag     tag
   :ui?     ui?
   :ui-name ui-name
   :types   types})


(defcomp "default" opts)
(defcomp "images" (assoc opts :type "images"))
(defcomp "text" (assoc opts :type "text"))
