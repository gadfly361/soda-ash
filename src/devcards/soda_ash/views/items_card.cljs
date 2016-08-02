(ns soda-ash.views.items-card
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
   [soda-ash.views.items :as items]))


(def list-keys
  (h/list-keys items/variations))

(defcard-doc
  (h/devcard-docs items/opts))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ITEMS
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Items Types"
  (h/list-types items/opts))

(defn type-default []
  [sv/items
   [sco/item
    [sco/image
     [:img {:src "/images/gadfly.png"}]]
    [sco/content
     [sco/header-link
      "Header"]
     [sco/s-meta "Some Meta Label"]
     [sco/description
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
     [sco/extra
      "Additional Details"]]]

   [sco/item
    [sco/image
     [:img {:src "/images/escherize.jpg"}]]
    [sco/content
     [sco/header-link
      "Header"]
     [sco/s-meta "Some Meta Label"]
     [sco/description
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
     [sco/extra
      "Additional Details"]]]
   ])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Items Variations")

(defcard-doc
  "## divided"
  (list-keys "divided"))

(defn variation-divided []
  [sv/items {:ash [:divided]}
   [sco/item
    [sco/image
     [:img {:src "/images/gadfly.png"}]]
    [sco/content
     [sco/header-link
      "Header"]
     [sco/s-meta "Some Meta Label"]
     [sco/description
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
     [sco/extra
      "Additional Details"]]]

   [sco/item
    [sco/image
     [:img {:src "/images/escherize.jpg"}]]
    [sco/content
     [sco/header-link
      "Header"]
     [sco/s-meta "Some Meta Label"]
     [sco/description
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
     [sco/extra
      "Additional Details"]]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-divided))

(defcard-rg
  [variation-divided])


(defcard-doc
  "## link"
  (list-keys "link"))

(defn variation-link []
  [sv/items {:ash [:link]}
   [sco/item
    [sco/image
     [:img {:src "/images/gadfly.png"}]]
    [sco/content
     [sco/header-link
      "Header"]
     [sco/s-meta "Some Meta Label"]
     [sco/description
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
     [sco/extra
      "Additional Details"]]]

   [sco/item
    [sco/image
     [:img {:src "/images/escherize.jpg"}]]
    [sco/content
     [sco/header-link
      "Header"]
     [sco/s-meta "Some Meta Label"]
     [sco/description
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
     [sco/extra
      "Additional Details"]]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-link))

(defcard-rg
  [variation-link])


(defcard-doc
  "## relaxed"
  (list-keys "relaxed"))

(defn variation-relaxed []
  [sv/items {:ash [:relaxed]}
   [sco/item
    [sco/image
     [:img {:src "/images/gadfly.png"}]]
    [sco/content
     [sco/header-link
      "Header"]
     [sco/s-meta "Some Meta Label"]
     [sco/description
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
     [sco/extra
      "Additional Details"]]]

   [sco/item
    [sco/image
     [:img {:src "/images/escherize.jpg"}]]
    [sco/content
     [sco/header-link
      "Header"]
     [sco/s-meta "Some Meta Label"]
     [sco/description
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
     [sco/extra
      "Additional Details"]]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-relaxed))

(defcard-rg
  [variation-relaxed])


(defn variation-very-relaxed []
  [sv/items {:ash [:very-relaxed]}
   [sco/item
    [sco/image
     [:img {:src "/images/gadfly.png"}]]
    [sco/content
     [sco/header-link
      "Header"]
     [sco/s-meta "Some Meta Label"]
     [sco/description
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
     [sco/extra
      "Additional Details"]]]

   [sco/item
    [sco/image
     [:img {:src "/images/escherize.jpg"}]]
    [sco/content
     [sco/header-link
      "Header"]
     [sco/s-meta "Some Meta Label"]
     [sco/description
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
     [sco/extra
      "Additional Details"]]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-very-relaxed))

(defcard-rg
  [variation-very-relaxed])
