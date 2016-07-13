(ns soda-ash.elements.rail-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.helpers :as h]
   [soda-ash.elements.rail :as rail]))


(def list-keys
  (h/list-keys rail/variations))


(defcard-doc
  (h/devcard-docs rail/opts))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types rail/opts))

(defn type-left []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-left
    [se/segment
     "left"]]
   ])

(defcard-doc
  (mkdn-pprint-source type-left))

(defcard-rg
  [type-left])


(defn type-right []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-right
    [se/segment
     "right"]]
   ])

(defcard-doc
  (mkdn-pprint-source type-right))

(defcard-rg
  [type-right])


(defn type-left-internal []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-left-internal
    [se/segment
     "left-internal"]]
   ])

(defcard-doc
  (mkdn-pprint-source type-left-internal))

(defcard-rg
  [type-left-internal])


(defn type-right-internal []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-right-internal
    [se/segment
     "right-internal"]]
   ])

(defcard-doc
  (mkdn-pprint-source type-right-internal))

(defcard-rg
  [type-right-internal])


(defn type-left-dividing []
  [:div
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-left-dividing
    [se/segment
     "left-dividing"]]
   ])

(defcard-doc
  (mkdn-pprint-source type-left-dividing))

(defcard-rg
  [type-left-dividing])


(defn type-right-dividing []
  [:div
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-right-dividing
    [se/segment
     "right-dividing"]]
   ])

(defcard-doc
  (mkdn-pprint-source type-right-dividing))

(defcard-rg
  [type-right-dividing])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")


(defcard-doc
  "
## Attached"
  (list-keys "attached"))

(defn variation-attached []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-left {:ash [:attached]}
    [se/segment
     "attached"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-attached))

(defcard-rg
  [variation-attached])


(defcard-doc
  "
## Close"
  (list-keys "close"))

(defn variation-close []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-left {:ash [:close]}
    [se/segment
     "close"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-close))

(defcard-rg
  [variation-close])


(defn variation-very-close []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-left {:ash [:very-close]}
    [se/segment
     "very-close"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-very-close))

(defcard-rg
  [variation-very-close])
