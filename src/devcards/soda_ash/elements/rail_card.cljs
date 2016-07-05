(ns soda-ash.elements.rail-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.core :as sa]
   [soda-ash.helpers :as h]
   [soda-ash.elements.rail :as rail]))


(def list-keys
  (h/list-keys rail/groups))


(defcard-doc
  "# SUMMARY"
  "## Types"
  (h/list-types rail/types "rail" false)

  "## Variations (*ash*)"
  "### Attached"
  (list-keys "attached")
  "### Close"
  (list-keys "close")
  )



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types rail/types "rail" false)
  )

;; TODO: update when segment is available
(defn type-left []
  [:div.ui.segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [sa/rail-left
    [:div.ui.segment
     "left"]]
   ])

(defcard-doc
  (mkdn-pprint-source type-left))

(defcard-rg
  [type-left])


;; TODO: update when segment is available
(defn type-right []
  [:div.ui.segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [sa/rail-right
    [:div.ui.segment
     "right"]]
   ])

(defcard-doc
  (mkdn-pprint-source type-right))

(defcard-rg
  [type-right])


;; TODO: update when segment is available
(defn type-left-internal []
  [:div.ui.segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [sa/rail-left-internal
    [:div.ui.segment
     "left-internal"]]
   ])

(defcard-doc
  (mkdn-pprint-source type-left-internal))

(defcard-rg
  [type-left-internal])


;; TODO: update when segment is available
(defn type-right-internal []
  [:div.ui.segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [sa/rail-right-internal
    [:div.ui.segment
     "right-internal"]]
   ])

(defcard-doc
  (mkdn-pprint-source type-right-internal))

(defcard-rg
  [type-right-internal])


;; TODO: update when segment is available
(defn type-left-dividing []
  [:div
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [sa/rail-left-dividing
    [:div.ui.segment
     "left-dividing"]]
   ])

(defcard-doc
  (mkdn-pprint-source type-left-dividing))

(defcard-rg
  [type-left-dividing])


;; TODO: update when segment is available
(defn type-right-dividing []
  [:div
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [sa/rail-right-dividing
    [:div.ui.segment
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

;; TODO: update when segment is available
(defn variation-attached []
  [:div.ui.segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [sa/rail-left {:ash [:attached]}
    [:div.ui.segment
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

;; TODO: update when segment is available
(defn variation-close []
  [:div.ui.segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [sa/rail-left {:ash [:close]}
    [:div.ui.segment
     "close"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-close))

(defcard-rg
  [variation-close])


;; TODO: update when segment is available
(defn variation-very-close []
  [:div.ui.segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [sa/rail-left {:ash [:very-close]}
    [:div.ui.segment
     "very-close"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-very-close))

(defcard-rg
  [variation-very-close])
