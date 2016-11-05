(ns soda-ash.content
  (:require-macros
   [soda-ash.macros :refer [defc]])
  (:require
   [soda-ash.helpers :as h]

   [soda-ash.contents.actions :as actions]
   [soda-ash.contents.author :as author]
   [soda-ash.contents.avatar :as avatar]
   [soda-ash.contents.card :as card]
   [soda-ash.contents.content :as content]
   [soda-ash.contents.date :as date]
   [soda-ash.contents.description :as description]
   [soda-ash.contents.detail :as detail]
   [soda-ash.contents.divider :as divider]
   [soda-ash.contents.event :as event]
   [soda-ash.contents.extra :as extra]
   [soda-ash.contents.header :as header]
   [soda-ash.contents.image :as image]
   [soda-ash.contents.item :as item]
   [soda-ash.contents.label :as label]
   [soda-ash.contents.s-comment :as s-comment]
   [soda-ash.contents.s-meta :as s-meta]
   [soda-ash.contents.section :as section]
   [soda-ash.contents.s-or :as s-or]
   [soda-ash.contents.statistic :as statistic]
   [soda-ash.contents.sub-header :as sub-header]
   [soda-ash.contents.summary :as summary]
   [soda-ash.contents.title :as title]
   [soda-ash.contents.value :as value]
   ))


;; actions

(defc "actions" nil)


;; author

(defc "author" nil)
(defc "author" "link")


;; avatar

(defc "avatar" nil)
(defc "avatar" "link")


;; card

(defc "card" nil)
(defc "card" "link")


;; content

(defc "content" nil)
(defc "content" "extra")
(defc "content" "hidden")
(defc "content" "visible")


;; date

(defc "date" nil)
(defc "date" "link")


;; description

(defc "description" nil)


;; detail

(defc "detail" nil)
(defc "detail" "link")


;; divider

(defc "divider" nil)


;; event

(defc "event" nil)


;; extra

(defc "extra" nil)
(defc "extra" "images")
(defc "extra" "text")


;; header

(defc "header" nil)
(defc "header" "link")


;; image

(defc "image" nil)
(defc "image" "link")


;; item

(defc "item" nil)
(defc "item" "link")


;; label

(defc "label" nil)


;; s-comment

(defc "s-comment" nil)


;; meta

(defc "s-meta" nil)


;; section

(defc "section" nil)
(defc "section" "link")


;; sub-header

(defc "sub-header" nil)


;; summary

(defc "summary" nil)


;; s-or

(defc "s-or" nil)


;; statistic

(defc "statistic" nil)


;; title

(defc "title" nil)


;; value

(defc "value" nil)
