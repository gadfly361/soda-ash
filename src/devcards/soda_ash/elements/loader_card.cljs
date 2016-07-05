(ns soda-ash.elements.loader-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.core :as sa]
   [soda-ash.helpers :as h]
   [soda-ash.elements.loader :as loader]))


(def list-keys
  (h/list-keys loader/groups))


(defcard-doc
  "# SUMMARY"
  "## Types"
  (h/list-types loader/types "loader")

  "## States (*soda*)"
  (list-keys "states")

  "## Variations (*ash*)"
  "### Inline"
  (list-keys "inline")
  "### Size"
  (list-keys "size")
  "### Inverted"
  (list-keys "inverted")
  )



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types loader/types "loader" true)
  )

;; TODO: update when segment / dimmer are available
(defn type-default []
  [:div.ui.segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [:div.ui.dimmer.active
   [sa/loader]]
   ])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])


;; TODO: update when segment / dimmer are available
(defn type-text []
  [:div.ui.segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [:div.ui.dimmer.active
    [sa/loader-text
     "Foo bar"]]])

(defcard-doc
  (mkdn-pprint-source type-text))

(defcard-rg
  [type-text])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# States"
  (list-keys "states"))

;; TODO: update when segment / dimmer are available
(defn state-indeterminate []
  [:div.ui.segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [:div.ui.dimmer.active
    [sa/loader {:soda :indeterminate}]]
   ])

(defcard-doc
  (mkdn-pprint-source state-indeterminate))

(defcard-rg
  [state-indeterminate])


(defn state-active []
  [sa/loader {:soda :active}])

(defcard-doc
  (mkdn-pprint-source state-active))

(defcard-rg
  [state-active])


(defn state-disabled []
  [sa/loader {:soda :disabled}])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg
  [state-disabled])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")

(defcard-doc
  "
## Inline"
  (list-keys "inline"))

;; TODO: update when segment / dimmer are available
(defn variation-inline []
  [:div.ui.segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [:div.ui.dimmer.active
    [sa/loader {:ash [:inline]}]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-inline))

(defcard-rg
  [variation-inline])


(defcard-doc
  "
## Size"
  (list-keys "size"))

;; TODO: update when segment / dimmer are available
(defn variation-size []
  [:div.ui.segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [:div.ui.dimmer.active
    [sa/loader-text {:ash [:mini]}
     "mini"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-size))

(defcard-rg
  [:div
   [variation-size]
   [:div.ui.segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad smallm veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
    [:div.ui.dimmer.active
     [sa/loader-text {:ash [:small]}
      "small"]]]

   [:div.ui.segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad mediumm veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
    [:div.ui.dimmer.active
     [sa/loader-text {:ash [:medium]}
      "medium"]]]

   [:div.ui.segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad largem veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
    [:div.ui.dimmer.active
     [sa/loader-text {:ash [:large]}
      "large"]]]
   ])


(defcard-doc
  "
## Inverted"
  (list-keys "inverted"))

;; TODO: update when segment / dimmer are available
(defn variation-inverted []
  [:div.ui.inverted.segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad largem veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [sa/loader-text {:soda :active
                    :ash [:inverted]}
    "inverted"]])

(defcard-doc
  (mkdn-pprint-source variation-inverted))

(defcard-rg
  [:div
   [variation-inverted]
   [:div.ui.segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad largem veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
    [sa/loader-text {:soda :active}
     "normal"]]
   ])


;; TODO: make sure to explain loaders w/ dimmers
