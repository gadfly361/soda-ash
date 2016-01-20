(ns soda-ash.elements.segment-card
  (:require-macros [devcards.core
                    :as dc
                    :refer [defcard-rg defcard-doc mkdn-pprint-source]])
  (:require [reagent.core :as reagent]
            [devcards.core]
            [soda-ash.elements.card-helpers :as h]
            [soda-ash.element :as s]))



(defcard-doc
"
[back](#!/soda_ash.an_overview_card)

# segment

* **base class** ui segment
* **default tag** :div
* **:type**
    :default |
    *RAISED*
    :raised |
    *STACKED*
    :stacked |
    :tall-stacked |
    *PILED*
    :piled |
    *VERTICAL*
    :vertical
* **:state** :disabled | :loading
* **variations**
    :aligned | :attached | :basic? |
     :circular? | :clearing? | :color | :compact? |
    :horizontal? (inside segments) | :empasis | :floated | :inverted? | padded

where

* **:aligned** :left | :right | :center
* **:attached** :default | :top | :bottom
* **:color**
   :red | :orange | :yellow | :olive |
   :green | :teal | :blue | :violet |
   :purple | :pink | :brown | :grey |
   :black
* **:emphasis** :secondary | :tertiary
* **floated** :left | :right
* **:padded** :defanult | :very

# segments

* **base class** ui segments
* **default tag** :div

---
")



;; ====================
;; TYPES

(defcard-doc
"# TYPES")


;; Segment

(defn segment []
  [s/segment {:soda {:type :default}}
   [h/fake-content]])

(defcard-doc
  "
### Segment

A segment of content
"
  (mkdn-pprint-source segment))

(defcard-rg
  [segment])


;; Raised

(defn raised []
  [s/segment {:soda {:type :raised}}
   [h/fake-content]])

(defcard-doc
  "
### Raised

A segment may be formatted to raise above the page.
"
  (mkdn-pprint-source raised))

(defcard-rg
  [raised])


;; Stacked

(defn stacked []
  [s/segment {:soda {:type :stacked}}
   [h/fake-content]])

(defcard-doc
  "
### Stacked

A segment can be formatted to show it contains multiple pages
"
  (mkdn-pprint-source stacked))

(defcard-rg
  [stacked])


;; Tall-Stacked

(defn tall-stacked []
  [s/segment {:soda {:type :tall-stacked}}
   [h/fake-content]])

(defcard-doc
  (mkdn-pprint-source tall-stacked))

(defcard-rg
  [tall-stacked])


;; Piled

(defn piled []
  [s/segment {:soda {:type :piled}}
   [s/header {:soda {:tag :h4}}
    "A header"]
   [h/fake-content]])

(defcard-doc
  "
### Piled

A segment can be formatted to look like a pile of pages

Notes:

* Piled segments use negative z-index to format the additional pages below the segment. In order for them to appear correctly, your segment's offset container must have a z-index declared.
"
  (mkdn-pprint-source piled))

(defcard-rg
  [piled])


;; Vertical

(defn vertical []
  [:div
   [s/segment {:soda {:type :vertical}}
    [h/fake-content]]
   [s/segment {:soda {:type :vertical}}
    [h/fake-content]]
   [s/segment {:soda {:type :vertical}}
    [h/fake-content]]
   ])

(defcard-doc
  "
### Vertical Segment

A vertical segment formats content to be aligned as part of a vertical group
"
  (mkdn-pprint-source vertical))

(defcard-rg
  [vertical])



;; ====================
;; GROUPS

(defcard-doc
"# GROUPS")


;; Segments

(defn segments []
  [s/segments {}
   [s/segment {} [:p "Top"]]
   [s/segment {} [:p "Middle"]]
   [s/segment {} [:p "Middle"]]
   [s/segment {} [:p "Bottom"]]])

(defcard-doc
  "
### Segments

A group of segments can be nested in another group of segments
"
  (mkdn-pprint-source segments))

(defcard-rg
  [segments])


;; Nested-Segments

(defn nested-segments []
  [s/segments {}
   [s/segment {} [:p "Top"]]
   [s/segments {}
    [s/segment {} [:p "Nested Top"]]
    [s/segment {} [:p "Nested Middle"]]
    [s/segment {} [:p "Nested Bottom"]]]
   [s/segment {} [:p "Bottom"]]])

(defcard-doc
  "
### Nested Segments

A group of segments can be nested in another group of segments
"
  (mkdn-pprint-source nested-segments))

(defcard-rg
  [nested-segments])


;; Horizontal-Segments

(defn horizontal-segments []
  [s/segments {:soda {:horizontal? true}}
   [s/segment {} [:p "Left"]]
   [s/segment {} [:p "Middle"]]
   [s/segment {} [:p "Middle"]]
   [s/segment {} [:p "Right"]]])

(defcard-doc
  "
### Horizontal Segments

A segment group can appear horizontally
"
  (mkdn-pprint-source horizontal-segments))

(defcard-rg
  [horizontal-segments])


;; Raised-Segments

(defn raised-segments []
  [s/segments {:soda {:type :raised}}
   [s/segment {} [:p "Top"]]
   [s/segment {} [:p "Middle"]]
   [s/segment {} [:p "Middle"]]
   [s/segment {} [:p "Bottom"]]])

(defcard-doc
  "
### Raised Segments

A group of segments can be raised
"
  (mkdn-pprint-source raised-segments))

(defcard-rg
  [raised-segments])


;; Stacked-Segments

(defn stacked-segments []
  [s/segments {:soda {:type :stacked}}
   [s/segment {} [:p "Top"]]
   [s/segment {} [:p "Middle"]]
   [s/segment {} [:p "Middle"]]
   [s/segment {} [:p "Bottom"]]])

(defcard-doc
  "
### Stacked Segments

A group of segments can be stacked
"
  (mkdn-pprint-source stacked-segments))

(defcard-rg
  [stacked-segments])


;; Piled-Segments

(defn piled-segments []
  [s/segments {:soda {:type :piled}}
   [s/segment {} [:p "Top"]]
   [s/segment {} [:p "Middle"]]
   [s/segment {} [:p "Bottom"]]])

(defcard-doc
  "
### Piled Segments

A group of segments can be piled

Notes:

* **This isn't appearing as it is supposed to.**
"
  (mkdn-pprint-source piled-segments))

(defcard-rg
  [piled-segments])



;; ====================
;; STATES

(defcard-doc
"# STATES")


;; Disabled

(defn disabled []
  [s/segment {:soda {:state :disabled}}
   [h/fake-content]])

(defcard-doc
  "
### Disabled

A segment may show its content is disabled
"
  (mkdn-pprint-source disabled))

(defcard-rg
  [disabled])


;; Loading

(defn loading []
  [s/segment {:soda {:state :loading}}
   [h/fake-content]])

(defcard-doc
  "
### Loading

A segment may show its content is being loaded
"
  (mkdn-pprint-source loading))

(defcard-rg
  [loading])



;; ====================
;; VARIATIONS

(defcard-doc
"# VARIATIONS")


;; Inverted

(defn inverted []
  [s/segment {:soda {:inverted? true}}
   [h/fake-content]])

(defcard-doc
  "
### Inverted

A segment can have its colors inverted for contrast
"
  (mkdn-pprint-source inverted))

(defcard-rg
  [inverted])


;; Attached

(defn attached []
  [:div
   [s/segment {:soda {:attached :top}}
    [h/fake-content]]
   [s/segment {:soda {:attached :default}}
    [h/fake-content]]
   [s/segment {:soda {:attached :bottom}}
    [h/fake-content]]])

(defcard-doc
  "
### Attached

A segment can be attached to other content on a page

Notes:

* Attached segments are designed to be used with other attached variations like attached header or attached messages.
"
  (mkdn-pprint-source attached))

(defcard-rg
  [attached])


;; Padded

(defn padded []
  [:div
   [s/segment {:soda {:type :default}}
    [h/fake-content]]
   [s/segment {:soda {:padded :default}}
    [h/fake-content]]
   [s/segment {:soda {:padded :very}}
    [h/fake-content]]])

(defcard-doc
  "
### Padded

A segment can increase its padding
"
  (mkdn-pprint-source padded))

(defcard-rg
  [padded])


;; Compact

(defn compact []
  [s/segment {:soda {:compact? true}}
   "foo bar baz"])

(defcard-doc
  "
### Compact

A segment may take up only as much space as is necessary
"
  (mkdn-pprint-source compact))

(defcard-rg
  [compact])


;; Colored

(defn colored []
  [:div
   [s/segment {:soda {:color :red}}
    "foo bar baz"]
   [s/segment {:soda {:color :orange}}
    "foo bar baz"]
   [s/segment {:soda {:color :yellow}}
    "foo bar baz"]
   [s/segment {:soda {:color :olive}}
    "foo bar baz"]
   [s/segment {:soda {:color :green}}
    "foo bar baz"]
   [s/segment {:soda {:color :teal}}
    "foo bar baz"]
   [s/segment {:soda {:color :blue}}
    "foo bar baz"]
   [s/segment {:soda {:color :violet}}
    "foo bar baz"]
   [s/segment {:soda {:color :purple}}
    "foo bar baz"]
   [s/segment {:soda {:color :pink}}
    "foo bar baz"]
   [s/segment {:soda {:color :brown}}
    "foo bar baz"]
   [s/segment {:soda {:color :grey}}
    "foo bar baz"]
   [s/segment {:soda {:color :black}}
    "foo bar baz"]])

(defcard-doc
  "
### Colored

A segment can be colored
"
  (mkdn-pprint-source colored))

(defcard-rg
  [colored])


;; Inverted-Color

(defn inverted-color []
  [:div
   [s/segment {:soda {:color :red
                      :inverted? true}}
    "foo bar baz"]
   [s/segment {:soda {:color :orange
                      :inverted? true}}
    "foo bar baz"]
   [s/segment {:soda {:color :yellow
                      :inverted? true}}
    "foo bar baz"]
   [s/segment {:soda {:color :olive
                      :inverted? true}}
    "foo bar baz"]
   [s/segment {:soda {:color :green
                      :inverted? true}}
    "foo bar baz"]
   [s/segment {:soda {:color :teal
                      :inverted? true}}
    "foo bar baz"]
   [s/segment {:soda {:color :blue
                      :inverted? true}}
    "foo bar baz"]
   [s/segment {:soda {:color :violet
                      :inverted? true}}
    "foo bar baz"]
   [s/segment {:soda {:color :purple
                      :inverted? true}}
    "foo bar baz"]
   [s/segment {:soda {:color :pink
                      :inverted? true}}
    "foo bar baz"]
   [s/segment {:soda {:color :brown
                      :inverted? true}}
    "foo bar baz"]
   [s/segment {:soda {:color :grey
                      :inverted? true}}
    "foo bar baz"]
   [s/segment {:soda {:color :black
                      :inverted? true}}
    "foo bar baz"]])

(defcard-doc
  "
These colors can be inverted
"
  (mkdn-pprint-source inverted-color))

(defcard-rg
  [inverted-color])


;; Emphasis

(defn emphasis []
  [:div
   [s/segment {:soda {:type :default}}
    [h/fake-content]]
   [s/segment {:soda {:emphasis :secondary}}
    [h/fake-content]]
   [s/segment {:soda {:emphasis :tertiary}}
    [h/fake-content]]

   ;; inverted
   [s/segment {:soda {:inverted? true}}
    [h/fake-content]]
   [s/segment {:soda {:emphasis :secondary
                      :inverted? true}}
    [h/fake-content]]
   [s/segment {:soda {:emphasis :tertiary
                      :inverted? true}}
    [h/fake-content]]

   ;; inverted & color
   [s/segment {:soda {:inverted? true
                      :color :red}}
    [h/fake-content]]
   [s/segment {:soda {:emphasis :secondary
                      :inverted? true
                      :color :red}}
    [h/fake-content]]
   [s/segment {:soda {:emphasis :tertiary
                      :inverted? true
                      :color :red}}
    [h/fake-content]]])

(defcard-doc
  "
### Emphasis

A segment can be formatted to appear more or less noticeable
"
  (mkdn-pprint-source emphasis))

(defcard-rg
  [emphasis])


;; Circular

(defn circular []
  [:div
  [s/segment {:soda {:circular? true}}
   [s/header {:soda {:tag :h2}}
    "Buy Now"
    [:div.sub.header "$10.99"]]]

   [s/segment {:soda {:circular? true
                      :inverted? true}}
    [s/header {:soda {:tag :h2
                      :inverted? true}}
     "Buy Now"
     [:div.sub.header "$10.99"]]]
   ])

(defcard-doc
  "
### Circular

A segment can be circular
"
  (mkdn-pprint-source circular))

(defcard-rg
  [circular])


;; Clearing

(defn clearing []
  [s/segment {:soda {:clearing? true}}
   [:div.ui.right.floated.button "Floated"]])

(defcard-doc
  "
### Clearing

A segment can clear floated content
"
  (mkdn-pprint-source clearing))

(defcard-rg
  [clearing])


;; Floated

(defn floated []
  [:div
   [s/segment {:soda {:floated :right}}
    [:p "This segment will appear to the right"]]

   [s/segment {:soda {:floated :left}}
    [:p "This segment will appear to the left"]]

   [h/fake-content]])

(defcard-doc
  "
### Floated

A segment can appear to the left or right of other content
"
  (mkdn-pprint-source floated))

(defcard-rg
  [floated])


;; Aligned

(defn aligned []
  [:div
   [s/segment {:soda {:aligned :right}}
    "Right"]
   [s/segment {:soda {:aligned :left}}
    "Left"]
   [s/segment {:soda {:aligned :center}}
    "Center"]])

(defcard-doc
  "
### Aligned

A segment can have its text aligned to a side
"
  (mkdn-pprint-source aligned))

(defcard-rg
  [aligned])


;; Basic

(defn basic []
  [s/segment {:soda {:basic? true}}
   [h/fake-content]])

(defcard-doc
  "
### Basic

A basic segment has no special formatting
"
  (mkdn-pprint-source basic))

(defcard-rg
  [basic])
