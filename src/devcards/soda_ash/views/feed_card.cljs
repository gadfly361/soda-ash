(ns soda-ash.views.feed-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.view :as sv]
   [soda-ash.helpers :as h]
   [soda-ash.content :as sco]
   [soda-ash.views.feed :as feed]))


(def list-keys
  (h/list-keys feed/variations))


(defcard-doc
  (h/devcard-docs feed/opts))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; FEED
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Feed Types"
  (h/list-types feed/opts))

(defn type-default []
  [sv/feed
   [sco/event
    [sco/label
     [:img {:src "/images/gadfly.png"}]]
    [sco/content
     [sco/date "3 days ago"]
     [sco/summary
      [:span [:a "Gadfly361"] " added 2 photos"]]
     [sco/extra-images
      [:a [:img {:src "/images/square-image.png"}]]
      [:a [:img {:src "/images/square-image.png"}]]]]]

   [sco/event
    [sco/label
     [:img {:src "/images/escherize.jpg"}]]
    [sco/content
     [sco/date "3 days ago"]
     [sco/summary
      [:span [:a "Escherize"] " created a post"]]
     [sco/extra-text
      "Have you seen what's going on over in javascript? Can you believe it?"]]]
   ])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg default
  [type-default])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Feed Variations")

(defcard-doc
  "## size"
  (list-keys "size"))

(defn variation-size-small []
  [sv/feed {:data-ash [:small]}
   [sco/event
    [sco/label
     [:img {:src "/images/gadfly.png"}]]
    [sco/content
     [sco/date "3 days ago"]
     [sco/summary
      [:span [:a "Gadfly361"] " added 2 photos"]]
     [sco/extra-images
      [:a [:img {:src "/images/square-image.png"}]]
      [:a [:img {:src "/images/square-image.png"}]]]]]

   [sco/event
    [sco/label
     [:img {:src "/images/escherize.jpg"}]]
    [sco/content
     [sco/date "3 days ago"]
     [sco/summary
      [:span [:a "Escherize"] " created a post"]]
     [sco/extra-text
      "Have you seen what's going on over in javascript? Can you believe it?"]]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-size-small))

(defcard-rg size-small
  [variation-size-small])


(defn variation-size-large []
  [sv/feed {:data-ash [:large]}
   [sco/event
    [sco/label
     [:img {:src "/images/gadfly.png"}]]
    [sco/content
     [sco/date "3 days ago"]
     [sco/summary
      [:span [:a "Gadfly361"] " added 2 photos"]]
     [sco/extra-images
      [:a [:img {:src "/images/square-image.png"}]]
      [:a [:img {:src "/images/square-image.png"}]]]]]

   [sco/event
    [sco/label
     [:img {:src "/images/escherize.jpg"}]]
    [sco/content
     [sco/date "3 days ago"]
     [sco/summary
      [:span [:a "Escherize"] " created a post"]]
     [sco/extra-text
      "Have you seen what's going on over in javascript? Can you believe it?"]]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-size-large))

(defcard-rg size-large
  [variation-size-large])
