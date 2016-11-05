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
  (h/list-types rail/opts))

(defcard-doc
  "**Rail**"
  "A rail can be presented on the left or right side of a container")

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

(defcard-rg left
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

(defcard-rg right
  [type-right])



(defcard-doc
  "**Internal**"
  "A rail can attach itself to the inside of a container")

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

(defcard-rg left-internal
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

(defcard-rg right-internal
  [type-right-internal])



(defcard-doc
  "**Dividing**"
  "A rail can create a division between itself and a container")

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

(defcard-rg left-dividing
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

(defcard-rg right-dividing
  [type-right-dividing])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")


(defcard-doc
  "**Attached**"
  "A rail can appear attached to the main viewport"
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

   [se/rail-left {:data-ash [:attached]}
    [se/segment
     "attached"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-attached))

(defcard-rg attached
  [variation-attached])



(defcard-doc
  "**Close**"
  "A rail can appear closer to the main viewport"
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

   [se/rail-left {:data-ash [:close]}
    [se/segment
     "close"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-close))

(defcard-rg close
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

   [se/rail-left {:data-ash [:very-close]}
    [se/segment
     "very-close"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-very-close))

(defcard-rg very-close
  [variation-very-close])



(defcard-doc
  "**Size**"
  "A rail can have different sizes"
  "**NOTE**: The sizes don't appear to work..."
  (list-keys "size"))

(defn variation-mini []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-left {:data-ash [:mini]}
    [se/segment
     "mini"]]])

(defcard-doc
  (mkdn-pprint-source variation-mini))

(defcard-rg mini
  [variation-mini])


(defn variation-tiny []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-left {:data-ash [:tiny]}
    [se/segment
     "tiny"]]])

(defcard-doc
  (mkdn-pprint-source variation-tiny))

(defcard-rg tiny
  [variation-tiny])


(defn variation-small []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-left {:data-ash [:small]}
    [se/segment
     "small"]]])

(defcard-doc
  (mkdn-pprint-source variation-small))

(defcard-rg small
  [variation-small])


(defn variation-large []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-left {:data-ash [:large]}
    [se/segment
     "large"]]])

(defcard-doc
  (mkdn-pprint-source variation-large))

(defcard-rg large
  [variation-large])


(defn variation-big []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-left {:data-ash [:big]}
    [se/segment
     "big"]]])

(defcard-doc
  (mkdn-pprint-source variation-big))

(defcard-rg big
  [variation-big])


(defn variation-huge []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-left {:data-ash [:huge]}
    [se/segment
     "huge"]]])

(defcard-doc
  (mkdn-pprint-source variation-huge))

(defcard-rg huge
  [variation-huge])


(defn variation-massive []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/rail-left {:data-ash [:massive]}
    [se/segment
     "massive"]]])

(defcard-doc
  (mkdn-pprint-source variation-massive))

(defcard-rg massive
  [variation-massive])
