(ns soda-ash.elements.segment-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.helpers :as h]
   [soda-ash.elements.segment :as segment]
   [soda-ash.elements.segments :as segments]))


(def list-keys
  (h/list-keys segment/variations))


(defcard-doc
  (h/devcard-docs segment/opts))

(defcard-doc
  (h/devcard-docs segments/opts))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Segment
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types segment/opts))

(defn type-default []
  [se/segment
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
  [se/segment-raised
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
  [se/segment-stacked
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
  [se/segment-tall-stacked
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
  [se/segment-piled
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
   [se/segment-vertical
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   [se/segment-vertical
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
  [se/segment {:soda :disabled}
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
  [se/segment {:soda :loading}
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
   [se/segment {:ash [:top-attached]}
    "This segment is on top"]
   [se/segment {:ash [:attached]}
    "This segment is attached on both sides"]
   [se/segment {:ash [:bottom-attached]}
    "This segment is on bottom"]])

(defcard-doc
  (mkdn-pprint-source variation-attached))

(defcard-rg
  [variation-attached])


(defcard-doc
  "## Padded"
  (list-keys "padded"))

(defn variation-padded []
  [se/segment {:ash [:padded]}
   [se/header-h3 "padded"]
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
  [se/segment {:ash [:very-padded]}
   [se/header-h3 "very-padded"]
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
  [se/segment {:ash [:compact]}
   [se/header-h3 "compact"]
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
  [se/segment {:ash [:red]}
   [se/header-h3 "red"]])

(defcard-doc
  (mkdn-pprint-source variation-colored))

(defcard-rg
  [:div
   [variation-colored]
   [se/segment {:ash [:orange]}
    [se/header-h3 "orange"]]
   [se/segment {:ash [:yellow]}
    [se/header-h3 "yellow"]]
   [se/segment {:ash [:olive]}
    [se/header-h3 "olive"]]
   [se/segment {:ash [:green]}
    [se/header-h3 "green"]]
   [se/segment {:ash [:teal]}
    [se/header-h3 "teal"]]
   [se/segment {:ash [:blue]}
    [se/header-h3 "blue"]]
   [se/segment {:ash [:violet]}
    [se/header-h3 "violet"]]
   [se/segment {:ash [:purple]}
    [se/header-h3 "purple"]]
   [se/segment {:ash [:pink]}
    [se/header-h3 "pink"]]
   [se/segment {:ash [:brown]}
    [se/header-h3 "brown"]]
   [se/segment {:ash [:grey]}
    [se/header-h3 "grey"]]
   [se/segment {:ash [:black]}
    [se/header-h3 "black"]]
   ])


(defcard-doc
  "## Inverted"
  (list-keys "inverted"))

(defn variation-inverted []
  [se/segment {:ash [:red
                     :inverted]}
   [se/header-h3 "red"]])

(defcard-doc
  (mkdn-pprint-source variation-inverted))

(defcard-rg
  [:div
   [variation-inverted]
   [se/segment {:ash [:orange
                      :inverted]}
    [se/header-h3 "orange"]]
   [se/segment {:ash [:yellow
                      :inverted]}
    [se/header-h3 "yellow"]]
   [se/segment {:ash [:olive
                      :inverted]}
    [se/header-h3 "olive"]]
   [se/segment {:ash [:green
                      :inverted]}
    [se/header-h3 "green"]]
   [se/segment {:ash [:teal
                      :inverted]}
    [se/header-h3 "teal"]]
   [se/segment {:ash [:blue
                      :inverted]}
    [se/header-h3 "blue"]]
   [se/segment {:ash [:violet
                      :inverted]}
    [se/header-h3 "violet"]]
   [se/segment {:ash [:purple
                      :inverted]}
    [se/header-h3 "purple"]]
   [se/segment {:ash [:pink
                      :inverted]}
    [se/header-h3 "pink"]]
   [se/segment {:ash [:brown
                      :inverted]}
    [se/header-h3 "brown"]]
   [se/segment {:ash [:grey
                      :inverted]}
    [se/header-h3 "grey"]]
   [se/segment {:ash [:black
                      :inverted]}
    [se/header-h3 "black"]]
   ])


(defcard-doc
  "## Emphasis"
  (list-keys "emphasis"))

(defn variation-secondary []
  [se/segment {:ash [:secondary]}
   "secondary"])

(defcard-doc
  (mkdn-pprint-source variation-secondary))

(defcard-rg
  [variation-secondary])


(defn variation-tertiary []
  [se/segment {:ash [:tertiary]}
   "tertiary"])

(defcard-doc
  (mkdn-pprint-source variation-tertiary))

(defcard-rg
  [variation-tertiary])


(defcard-doc
  "## Circular"
  (list-keys "circular"))

(defn variation-circular []
  [se/segment {:ash [:circular]}
   [se/header-h3 "circular"]
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
  [se/segment {:ash [:clearing]}
   [se/header-h3 "clearing"]
   [se/header-h3 {:ash [:right-floated]}
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
   [se/segment {:ash [:left-floated]}
    "left-floated"]
   [se/segment {:ash [:right-floated]}
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
   [se/segment {:ash [:left-aligned]}
    "left algined"]

   [se/segment {:ash [:center-aligned]}
    "center algined"]

   [se/segment {:ash [:right-aligned]}
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
   [se/segment {:ash [:basic]}
    [se/header-h3 "basic"]
    "A basic segment has no special formatting"]])

(defcard-doc
  (mkdn-pprint-source variation-basic))

(defcard-rg
  [variation-basic])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Segments
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types segments/opts))


(defn segments-default []
  [se/segments
   [se/segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]

   [se/segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   ])

(defcard-doc
  (mkdn-pprint-source segments-default))

(defcard-rg
  [segments-default])


(defn segments-horizontal []
  [se/segments-horizontal
   [se/segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]

   [se/segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   ])

(defcard-doc
  (mkdn-pprint-source segments-horizontal))

(defcard-rg
  [segments-horizontal])



(defn segments-raised []
  [se/segments-raised
   [se/segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]

   [se/segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   ])

(defcard-doc
  (mkdn-pprint-source segments-raised))

(defcard-rg
  [segments-raised])


(defn segments-stacked []
  [se/segments-stacked
   [se/segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]

   [se/segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   ])

(defcard-doc
  (mkdn-pprint-source segments-stacked))

(defcard-rg
  [segments-stacked])


(defn segments-piled []
  [se/segments-piled {:style {:z-index 1}}
   [se/segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cuipdatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]

   [se/segment
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   ])

(defcard-doc
  (mkdn-pprint-source segments-piled))

(defcard-rg
  [segments-piled])
