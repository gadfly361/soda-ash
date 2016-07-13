(ns soda-ash.content
  (:require-macros
   [soda-ash.macros :refer [defc]])
  (:require
   [soda-ash.helpers :as h]

   [soda-ash.contents.content :as content]
   [soda-ash.contents.description :as description]
   [soda-ash.contents.detail :as detail]
   [soda-ash.contents.divider :as divider]
   [soda-ash.contents.header :as header]
   [soda-ash.contents.item :as item]
   [soda-ash.contents.section :as section]
   [soda-ash.contents.s-or :as s-or]
   [soda-ash.contents.sub-header :as sub-header]
   [soda-ash.contents.title :as title]
   ))


;; content

(defc "content" nil)
(defc "content" "hidden")
(defc "content" "visible")


;; description

(defc "description" nil)


;; detail

(defc "detail" nil)
(defc "detail" "link")


;; divider

(defc "divider" nil)


;; header

(defc "header" nil)


;; item

(defc "item" nil)
(defc "item" "link")


;; section

(defc "section" nil)
(defc "section" "link")


;; sub-header

(defc "sub-header" nil)


;; s-or

(defc "s-or" nil)


;; title

(defc "title" nil)
