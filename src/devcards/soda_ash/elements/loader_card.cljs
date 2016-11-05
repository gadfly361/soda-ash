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

(defcard-doc
  "Require the following:
   ```
  [soda-ash.element :as se]
  ```")



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types loader/opts))

(defcard-doc
  "**Loader**"
  "A loader")

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

(defcard-rg default
  [type-default])



(defcard-doc
  "**Text loader**"
  "A loader can contain text")

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

(defcard-rg text
  [type-text])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# States"
  (list-keys "states"))


(defcard-doc
  "**Indeterminate**"
  "A loader can show it's unsure of how long a task will take")

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
    [se/loader {:data-soda :indeterminate}]]
   ])

(defcard-doc
  (mkdn-pprint-source state-indeterminate))

(defcard-rg indeterminate
  [state-indeterminate])



(defcard-doc
  "**Active**"
  "A loader can be active or visible")

(defn state-active []
  [se/loader {:data-soda :active}])

(defcard-doc
  (mkdn-pprint-source state-active))

(defcard-rg active
  [state-active])



(defcard-doc
  "**Disabled**"
  "A loader can be disabled or hidden")

(defn state-disabled []
  [se/loader {:data-soda :disabled}])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg disabled
  [state-disabled])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")

(defcard-doc
  "**Inline**"
  "Loaders can appear inline with content"
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
    [se/loader {:data-ash [:inline]}]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-inline))

(defcard-rg inline
  [variation-inline])


;; TODO: update when dimmer is available
(defn variation-centered-inline []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [:div.ui.dimmer.active
    [se/loader {:data-ash [:centered-inline]}]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-centered-inline))

(defcard-rg centered-inline
  [variation-centered-inline])



(defcard-doc
  "**Size**"
  "Loaders can have different sizes"
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
    [se/loader-text {:data-ash [:mini]}
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
    [se/loader-text {:data-ash [size]}
     (name size)]]])

(defcard-doc
  (mkdn-pprint-source variation-size-mini))

(defcard-rg size
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
  "**Inverted**"
  "Loaders can have their colors inverted"
  (list-keys "inverted"))

;; TODO: update when dimmer is available
(defn variation-inverted []
  [se/segment {:data-ash [:inverted]}
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad largem veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   [se/loader-text {:data-soda :active
                    :data-ash [:inverted]}
    "inverted"]])

(defcard-doc
  (mkdn-pprint-source variation-inverted))

(defcard-rg inverted
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
    [se/loader-text {:data-soda :active}
     "normal"]]
   ])


;; TODO: explain loaders w/ dimmers
