(ns soda-ash.elements.segment-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.core :as sa]
   [soda-ash.helpers :as h]
   [soda-ash.elements.segment :as segment]))


(def list-keys
  (h/list-keys segment/groups))


(defcard-doc
  "# SUMMARY"
  "## Types"
  (h/list-types segment/types "segment")

  "## States (*soda*)"
  (list-keys "states")

  "## Variations (*ash*)"
  "### Attached"
  (list-keys "attached")
  "### Padded"
  (list-keys "padded")
  "### Compact"
  (list-keys "compact")
  "### Colored"
  (list-keys "colored")
  "### Inverted"
  (list-keys "inverted")
  "### Emphasis"
  (list-keys "emphasis")
  "### Circular"
  (list-keys "circular")
  "### Clearing"
  (list-keys "clearing")
  "### Floated"
  (list-keys "floated")
  "### Text Alignment"
  (list-keys "text alignment")
  "### Basic"
  (list-keys "basic")
  )



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types segment/types "segment" true)
  )

(defn type-default []
  [sa/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])


(defn type-raised []
  [sa/segment-raised
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source type-raised))

(defcard-rg
  [type-raised])


(defn type-stacked []
  [sa/segment-stacked
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source type-stacked))

(defcard-rg
  [type-stacked])


(defn type-tall-stacked []
  [sa/segment-tall-stacked
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source type-tall-stacked))

(defcard-rg
  [type-tall-stacked])


(defn type-piled []
  [sa/segment-piled
   {:style {:z-index 1}} ;; Note the z-index
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source type-piled))

(defcard-rg
  [type-piled])


(defn type-vertical []
  [:div
   [sa/segment-vertical
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   [sa/segment-vertical
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]])

(defcard-doc
  (mkdn-pprint-source type-vertical))

(defcard-rg
  [type-vertical])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# States"
  (list-keys "states"))

(defn state-disabled []
  [sa/segment {:soda :disabled}
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg
  [state-disabled])


(defn state-loading []
  [sa/segment {:soda :loading}
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source state-loading))

(defcard-rg
  [state-loading])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")

(defcard-doc
  "## Attached"
  (list-keys "attached"))

(defn variation-attached []
  [:div
   [sa/segment {:ash [:top-attached]}
    "This segment is on top"]
   [sa/segment {:ash [:attached]}
    "This segment is attached on both sides"]
   [sa/segment {:ash [:bottom-attached]}
    "This segment is on bottom"]])

(defcard-doc
  (mkdn-pprint-source variation-attached))

(defcard-rg
  [variation-attached])


(defcard-doc
  "## Padded"
  (list-keys "padded"))

(defn variation-padded []
  [sa/segment {:ash [:padded]}
   [sa/header-h3 "padded"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source variation-padded))

(defcard-rg
  [variation-padded])


(defn variation-very-padded []
  [sa/segment {:ash [:very-padded]}
   [sa/header-h3 "very-padded"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source variation-very-padded))

(defcard-rg
  [variation-very-padded])


(defcard-doc
  "## Compact"
  (list-keys "compact"))

(defn variation-compact []
  [sa/segment {:ash [:compact]}
   [sa/header-h3 "compact"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source variation-compact))

(defcard-rg
  [variation-compact])


(defcard-doc
  "## Colored"
  (list-keys "colored"))

(defn variation-colored []
  [sa/segment {:ash [:red]}
   [sa/header-h3 "red"]])

(defcard-doc
  (mkdn-pprint-source variation-colored))

(defcard-rg
  [:div
   [variation-colored]
   [sa/segment {:ash [:orange]}
    [sa/header-h3 "orange"]]
   [sa/segment {:ash [:yellow]}
    [sa/header-h3 "yellow"]]
   [sa/segment {:ash [:olive]}
    [sa/header-h3 "olive"]]
   [sa/segment {:ash [:green]}
    [sa/header-h3 "green"]]
   [sa/segment {:ash [:teal]}
    [sa/header-h3 "teal"]]
   [sa/segment {:ash [:blue]}
    [sa/header-h3 "blue"]]
   [sa/segment {:ash [:violet]}
    [sa/header-h3 "violet"]]
   [sa/segment {:ash [:purple]}
    [sa/header-h3 "purple"]]
   [sa/segment {:ash [:pink]}
    [sa/header-h3 "pink"]]
   [sa/segment {:ash [:brown]}
    [sa/header-h3 "brown"]]
   [sa/segment {:ash [:grey]}
    [sa/header-h3 "grey"]]
   [sa/segment {:ash [:black]}
    [sa/header-h3 "black"]]
   ])


(defcard-doc
  "## Inverted"
  (list-keys "inverted"))

(defn variation-inverted []
  [sa/segment {:ash [:red
                     :inverted]}
   [sa/header-h3 "red"]])

(defcard-doc
  (mkdn-pprint-source variation-inverted))

(defcard-rg
  [:div
   [variation-inverted]
   [sa/segment {:ash [:orange
                      :inverted]}
    [sa/header-h3 "orange"]]
   [sa/segment {:ash [:yellow
                      :inverted]}
    [sa/header-h3 "yellow"]]
   [sa/segment {:ash [:olive
                      :inverted]}
    [sa/header-h3 "olive"]]
   [sa/segment {:ash [:green
                      :inverted]}
    [sa/header-h3 "green"]]
   [sa/segment {:ash [:teal
                      :inverted]}
    [sa/header-h3 "teal"]]
   [sa/segment {:ash [:blue
                      :inverted]}
    [sa/header-h3 "blue"]]
   [sa/segment {:ash [:violet
                      :inverted]}
    [sa/header-h3 "violet"]]
   [sa/segment {:ash [:purple
                      :inverted]}
    [sa/header-h3 "purple"]]
   [sa/segment {:ash [:pink
                      :inverted]}
    [sa/header-h3 "pink"]]
   [sa/segment {:ash [:brown
                      :inverted]}
    [sa/header-h3 "brown"]]
   [sa/segment {:ash [:grey
                      :inverted]}
    [sa/header-h3 "grey"]]
   [sa/segment {:ash [:black
                      :inverted]}
    [sa/header-h3 "black"]]
   ])


(defcard-doc
  "## Emphasis"
  (list-keys "emphasis"))

(defn variation-secondary []
  [sa/segment {:ash [:secondary]}
   "secondary"])

(defcard-doc
  (mkdn-pprint-source variation-secondary))

(defcard-rg
  [variation-secondary])


(defn variation-tertiary []
  [sa/segment {:ash [:tertiary]}
   "tertiary"])

(defcard-doc
  (mkdn-pprint-source variation-tertiary))

(defcard-rg
  [variation-tertiary])


(defcard-doc
  "## Circular"
  (list-keys "circular"))

(defn variation-circular []
  [sa/segment {:ash [:circular]}
   [sa/header-h3 "circular"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source variation-circular))

(defcard-rg
  [variation-circular])


(defcard-doc
  "## Clearing"
  (list-keys "clearing"))

(defn variation-clearing []
  [sa/segment {:ash [:clearing]}
   [sa/header-h3 "clearing"]
   [sa/header-h3 {:ash [:right-floated]}
    "this is right floated"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source variation-clearing))

(defcard-rg
  [variation-clearing])


(defcard-doc
  "## Floated"
  (list-keys "floated"))

(defn variation-floated []
  [:div
   [sa/segment {:ash [:left-floated]}
    "left-floated"]
   [sa/segment {:ash [:right-floated]}
    "right-floated"]])

(defcard-doc
  (mkdn-pprint-source variation-floated))

(defcard-rg
  [variation-floated])


(defcard-doc
  "
<br>
## Text Alignment"
  (list-keys "text alignment"))

(defn variation-text-alignment []
  [:div
   [sa/segment {:ash [:left-aligned]}
    "left algined"]

   [sa/segment {:ash [:center-aligned]}
    "center algined"]

   [sa/segment {:ash [:right-aligned]}
    "right algined"]
   ])

(defcard-doc
  (mkdn-pprint-source variation-text-alignment))

(defcard-rg
  [variation-text-alignment])


(defcard-doc
  "## Basic"
  (list-keys "basic"))

(defn variation-basic []
  [:div
   [sa/segment {:ash [:basic]}
    [sa/header-h3 "basic"]
    "A basic segment has no special formatting"]])

(defcard-doc
  (mkdn-pprint-source variation-basic))

(defcard-rg
  [variation-basic])
