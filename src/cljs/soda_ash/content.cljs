(ns soda-ash.content
  (:require-macros
   [soda-ash.macros :refer [defc]])
  (:require
   [soda-ash.helpers :as h]

   [soda-ash.contents.card :as card]
   [soda-ash.contents.content :as content]
   [soda-ash.contents.description :as description]
   [soda-ash.contents.detail :as detail]
   [soda-ash.contents.divider :as divider]
   [soda-ash.contents.header :as header]
   [soda-ash.contents.image :as image]
   [soda-ash.contents.item :as item]
   [soda-ash.contents.s-meta :as s-meta]
   [soda-ash.contents.section :as section]
   [soda-ash.contents.s-or :as s-or]
   [soda-ash.contents.sub-header :as sub-header]
   [soda-ash.contents.title :as title]
   ))


;; card

(defc "card" nil)
(defc "card" "link")

;; content

(defc "content" nil)
(defc "content" "extra")
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
(defc "header" "link")


;; image

(defc "image" nil)
(defc "image" "link")


;; item

(defc "item" nil)
(defc "item" "link")


;; meta

(defc "s-meta" nil)


;; section

(defc "section" nil)
(defc "section" "link")


;; sub-header

(defc "sub-header" nil)


;; s-or

(defc "s-or" nil)


;; title

(defc "title" nil)
