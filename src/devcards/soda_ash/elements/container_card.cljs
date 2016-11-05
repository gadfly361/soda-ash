(ns soda-ash.elements.container-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.helpers :as h]
   [soda-ash.elements.container :as container]))


(def list-keys
  (h/list-keys container/variations))

(defcard-doc
  (h/devcard-docs container/opts))


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
  (h/list-types container/opts))

(defcard-doc
  "**Container**"
  "A default container")

(defn type-default []
  [se/container
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg default
  [type-default])



(defcard-doc
  "**Text Container**"
  "A container can reduce its maximum width to more naturally
  accomodate a single column of text")

(defn type-text []
  [se/container-text
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source type-text))

(defcard-rg text
  [type-text])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")

(defcard-doc
  "**Text Alignment**"
  "A container can specify its text alignment"
  (list-keys "text alignment"))

(defn left-aligned []
  [se/container {:data-ash [:left-aligned]}
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source left-aligned))

(defcard-rg left-aligned
  [left-aligned])


(defn center-aligned []
  [se/container {:data-ash [:center-aligned]}
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source center-aligned))

(defcard-rg center-aligned
  [center-aligned])


(defn right-aligned []
  [se/container {:data-ash [:right-aligned]}
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source right-aligned))

(defcard-rg right-aligned
  [right-aligned])


(defn justified []
  [se/container {:data-ash [:justified]}
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source justified))

(defcard-rg justified
  [justified])



(defcard-doc
  "**Fluid**"
  "A fluid container has no maximum width"
  (list-keys "fluid")
  )

(defn fluid []
  [se/container {:data-ash [:fluid]}
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source fluid))

(defcard-rg fluid
  [fluid])
