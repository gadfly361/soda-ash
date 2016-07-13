(ns soda-ash.elements.loader-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.helpers :as h]
   [soda-ash.elements.loader :as loader]))


(def list-keys
  (h/list-keys loader/variations))


(defcard-doc
  (h/devcard-docs loader/opts))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types loader/opts))

;; TODO: update when dimmer is available
(defn type-default []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [:div.ui.dimmer.active
    [se/loader]]
   ])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])

;; TODO: update when dimmer is available
(defn type-text []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [:div.ui.dimmer.active
    [se/loader-text
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

;; TODO: update when dimmer is available
(defn state-indeterminate []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [:div.ui.dimmer.active
    [se/loader {:soda :indeterminate}]]
   ])

(defcard-doc
  (mkdn-pprint-source state-indeterminate))

(defcard-rg
  [state-indeterminate])


(defn state-active []
  [se/loader {:soda :active}])

(defcard-doc
  (mkdn-pprint-source state-active))

(defcard-rg
  [state-active])


(defn state-disabled []
  [se/loader {:soda :disabled}])

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

;; TODO: update when dimmer is available
(defn variation-inline []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [:div.ui.dimmer.active
    [se/loader {:ash [:inline]}]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-inline))

(defcard-rg
  [variation-inline])


(defcard-doc
  "
## Size"
  (list-keys "size"))

;; TODO: update when dimmer is available
(defn variation-size-mini []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [:div.ui.dimmer.active
    [se/loader-text {:ash [:mini]}
     "mini"]]
   ])

(defn variation-size [size]
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad smallm veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [:div.ui.dimmer.active
    [se/loader-text {:ash [size]}
     (name size)]]])

(defcard-doc
  (mkdn-pprint-source variation-size-mini))

(defcard-rg
  [:div
   [variation-size-mini]
   [variation-size :tiny]
   [variation-size :small]
   [se/segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad mediumm veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
    [:div.ui.dimmer.active
     [se/loader-text
      "default"]]]
   [variation-size :large]
   [variation-size :big]
   [variation-size :huge]
   [variation-size :massive]
   ])


(defcard-doc
  "
## Inverted"
  (list-keys "inverted"))

;; TODO: update when dimmer is available
(defn variation-inverted []
  [se/segment {:ash [:inverted]}
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad largem veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [se/loader-text {:soda :active
                    :ash  [:inverted]}
    "inverted"]])

(defcard-doc
  (mkdn-pprint-source variation-inverted))

(defcard-rg
  [:div
   [variation-inverted]
   [se/segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad largem veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
    [se/loader-text {:soda :active}
     "normal"]]
   ])


;; TODO: make sure to explain loaders w/ dimmers
