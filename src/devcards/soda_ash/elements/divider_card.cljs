(ns soda-ash.elements.divider-card
  (:require-macros [devcards.core
                    :as dc
                    :refer [defcard-rg defcard-doc mkdn-pprint-source]])
  (:require [reagent.core :as reagent]
            [devcards.core]
            [soda-ash.elements.divider :as divider]
            [soda-ash.elements.card-helpers :as h]
            [soda-ash.element :as s]))



(defcard-doc
"
[back](#!/soda_ash.an_overview_card)

# divider

* **default tag** :div
* **:type**
    :default | :vertical | :horizontal
* **variations** clearing? | fitted? | hidden? | inverted? | section?

---
")



;; ====================
;; TYPES

(defcard-doc
"# TYPES")


;; Divider

(defn divider []
  [:div
   [h/fake-content]
   [s/divider {:soda {:type :default}}]
   [h/fake-content]])

(defcard-doc
  "
### Divider

A standard divider

Notes:

* To add a divider between parts of a grid use a divided grid variation.
"
  (mkdn-pprint-source divider))

(defcard-rg
  [divider])


;; Vertical

(defn vertical []
  [:div.ui.two.column.very.relaxed.grid
   [:div.column
    [h/fake-content]]

   [s/divider {:soda {:type :vertical}}
    "and"]

   [:div.column
    [h/fake-content]]])

(defcard-doc
  "
### Vertical Divider

A divider can segment content vertically

Notes:

* Vertical dividers requires position: relative on the element that you would like to contain the divider
* A vertical divider will automatically swap to a horizontal divider at mobile resolutions when used inside a stackable grid
"
  (mkdn-pprint-source vertical))

(defcard-rg
  [vertical])


;; Horizontal

(defn horizontal []
  [:div
   [h/fake-content]
   [s/divider {:soda {:type :horizontal}}
    [s/icon {:soda {:icon :bar-chart}}]
     "Specifications"]
   [h/fake-content]])

(defcard-doc
  "
### Horizontal

A divider can segment content horizontally

Notes:

* Horizontal dividers can also be used in combination with headers and icons to create different styles of dividers.
* Dividers will automatically vary the size of their dividing rules to match the length of your text
"
  (mkdn-pprint-source horizontal))

(defcard-rg
  [horizontal])



;; ====================
;; VARIATIONS

(defcard-doc
"# VARIATIONS")


;; Inverted

(defn inverted []
  [s/segment {:soda {:inverted? true}}
   [h/fake-content]
   [s/divider {:soda {:inverted? true}}]
   [h/fake-content]])

(defcard-doc
  "
### Inverted

A divider can have its colors inverted
"
  (mkdn-pprint-source inverted))

(defcard-rg
  [inverted])


;; Fitted

(defn fitted []
  [:div
   [h/fake-content]
   [s/divider {:soda {:fitted? true}}]
   [h/fake-content]])

(defcard-doc
  "
### Fitted

A divider can be fitted, without any space above or below it.
"
  (mkdn-pprint-source fitted))

(defcard-rg
  [fitted])


;; Hidden

(defn hidden []
  [:div
   [h/fake-content]
   [s/divider {:soda {:hidden? true}}]
   [h/fake-content]])

(defcard-doc
  "
### Hidden

A hidden divider divides content without creating a dividing line
"
  (mkdn-pprint-source hidden))

(defcard-rg
  [hidden])


;; Section

(defn section []
  [:div
   [s/header {:soda {:tag :h3}}
    "Section Two"]
   [h/fake-content]
   [s/divider {:soda {:section? true}}]
   [s/header {:soda {:tag :h3}}
    "Section Two"]
   [h/fake-content]])

(defcard-doc
  "
### Section

A divider can provide greater margins to divide sections of content
"
  (mkdn-pprint-source section))

(defcard-rg
  [section])


;; Clearing

(defn clearing []
  [s/segment {:soda {:type :default}}
   [s/header {:soda {:tag :h2
                     :floated :right}}
    "Floated Content"]
   [s/divider {:soda {:clearing? true}}]
   [h/fake-content]])

(defcard-doc
  "
### Clearing

A divider can clear the contents above it
"
  (mkdn-pprint-source clearing))

(defcard-rg
  [clearing])
