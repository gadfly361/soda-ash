(ns soda-ash.views.comments-card
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
   [soda-ash.views.comments :as comments]))


(def list-keys
  (h/list-keys comments/variations))

(defcard-doc
  (h/devcard-docs comments/opts))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; COMMENTS
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Comments Types"
  (h/list-types comments/opts))

(defn type-default []
  [sv/comments
   [se/header-h3 {:data-ash [:dividing]}
    "Comments"]

   [sco/s-comment
    [sco/avatar-link
     [:img {:src "images/gadfly.png"}]]
    [sco/content
     [sco/author-link "Matt"]
     [:div.metadata
      "Today at 5:42PM"]
     [:div.text "Do you like re-frame?"]
     [sco/actions
      [:a "Reply"]]]]

   [sco/s-comment
    [sco/avatar-link
     [:img {:src "images/escherize.jpg"}]]
    [sco/content
     [sco/author-link "Bryan"]
     [:div.metadata
      "Today at 5:43PM"]
     [:div.text "Love it."]
     [sco/actions
      [:a "Reply"]]]

    [sv/comments
     [sco/s-comment
      [sco/avatar-link
       [:img {:src "images/rachel.png"}]]
      [sco/content
       [sco/author-link "Rachel"]
       [:div.metadata
        "Today at 5:44PM"]
       [:div.text "Me too!"]
       [sco/actions
        [:a "Reply"]]]]]
    ]
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
# Comments States"
  (list-keys "states"))

(defn states-collapsed []
  [sv/comments
   [se/header-h3 {:data-ash [:dividing]}
    "Comments"]

   [sco/s-comment
    [sco/avatar-link
     [:img {:src "images/gadfly.png"}]]
    [sco/content
     [sco/author-link "Matt"]
     [:div.metadata
      "Today at 5:42PM"]
     [:div.text "Do you like re-frame?"]
     [sco/actions
      [:a "Reply"]]]]

   [sco/s-comment
    [sco/avatar-link
     [:img {:src "images/escherize.jpg"}]]
    [sco/content
     [sco/author-link "Bryan"]
     [:div.metadata
      "Today at 5:43PM"]
     [:div.text "Love it."]
     [sco/actions
      [:a "Reply"]]]

    [sv/comments {:data-soda :collapsed} ;; <-- Attention
     [sco/s-comment
      [sco/avatar-link
       [:img {:src "images/rachel.png"}]]
      [sco/content
       [sco/author-link "Rachel"]
       [:div.metadata
        "Today at 5:44PM"]
       [:div.text "Me too!"]
       [sco/actions
        [:a "Reply"]]]]]
    ]
   ])

(defcard-doc
  (mkdn-pprint-source states-collapsed))

(defcard-rg collapsed
  [states-collapsed])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Comments Variations")

(defcard-doc
  "## threaded"
  (list-keys "threaded"))

(defn variation-threaded []
  [sv/comments {:data-ash [:threaded]} ;; <-- attention
   [se/header-h3 {:data-ash [:dividing]}
    "Comments"]

   [sco/s-comment
    [sco/avatar-link
     [:img {:src "images/gadfly.png"}]]
    [sco/content
     [sco/author-link "Matt"]
     [:div.metadata
      "Today at 5:42PM"]
     [:div.text "Do you like re-frame?"]
     [sco/actions
      [:a "Reply"]]]]

   [sco/s-comment
    [sco/avatar-link
     [:img {:src "images/escherize.jpg"}]]
    [sco/content
     [sco/author-link "Bryan"]
     [:div.metadata
      "Today at 5:43PM"]
     [:div.text "Love it."]
     [sco/actions
      [:a "Reply"]]]

    [sv/comments
     [sco/s-comment
      [sco/avatar-link
       [:img {:src "images/rachel.png"}]]
      [sco/content
       [sco/author-link "Rachel"]
       [:div.metadata
        "Today at 5:44PM"]
       [:div.text "Me too!"]
       [sco/actions
        [:a "Reply"]]]]]
    ]

   [sco/s-comment
    [sco/avatar-link
     [:img {:src "images/gadfly.png"}]]
    [sco/content
     [sco/author-link "Matt"]
     [:div.metadata
      "Today at 5:46PM"]
     [:div.text "Awesome!"]
     [sco/actions
      [:a "Reply"]]]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-threaded))

(defcard-rg threaded
  [variation-threaded])


(defcard-doc
  "## minimal"
  (list-keys "minimal"))

(defn variation-minimal []
  [sv/comments {:data-ash [:minimal]} ;; <-- attention
   [se/header-h3 {:data-ash [:dividing]}
    "Comments"]

   [sco/s-comment
    [sco/avatar-link
     [:img {:src "images/gadfly.png"}]]
    [sco/content
     [sco/author-link "Matt"]
     [:div.metadata
      "Today at 5:42PM"]
     [:div.text "Do you like re-frame?"]
     [sco/actions
      [:a "Reply"]]]]

   [sco/s-comment
    [sco/avatar-link
     [:img {:src "images/escherize.jpg"}]]
    [sco/content
     [sco/author-link "Bryan"]
     [:div.metadata
      "Today at 5:43PM"]
     [:div.text "Love it."]
     [sco/actions
      [:a "Reply"]]]

    [sv/comments
     [sco/s-comment
      [sco/avatar-link
       [:img {:src "images/rachel.png"}]]
      [sco/content
       [sco/author-link "Rachel"]
       [:div.metadata
        "Today at 5:44PM"]
       [:div.text "Me too!"]
       [sco/actions
        [:a "Reply"]]]]]
    ]

   [sco/s-comment
    [sco/avatar-link
     [:img {:src "images/gadfly.png"}]]
    [sco/content
     [sco/author-link "Matt"]
     [:div.metadata
      "Today at 5:46PM"]
     [:div.text "Awesome!"]
     [sco/actions
      [:a "Reply"]]]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-minimal))

(defcard-rg minimal
  [variation-minimal])
