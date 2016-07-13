(ns soda-ash.collection
  (:require-macros
   [soda-ash.macros :refer [defc]])
  (:require
   [soda-ash.helpers :as h]

   [soda-ash.collections.breadcrumb :as breadcrumb]
   [soda-ash.collections.message :as message]
   ))



;; breadcrumb

(defc "breadcrumb" nil)


;; message

(defc "message" nil)
(defc "message" "icon")
