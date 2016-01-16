(ns soda-ash.elements.icon-card
  (:require-macros [devcards.core
                    :as dc
                    :refer [defcard-rg defcard-doc mkdn-pprint-source]])
  (:require [reagent.core :as reagent]
            [devcards.core]
            [soda-ash.elements.icon :as icon]
            [soda-ash.elements.card-helpers :as h]
            [soda-ash.element :as s]))



(defcard-doc
  "
[back](http://localhost:3449/#!/soda_ash.an_overview_card)

# icon

* **default tag** :i
* **:icon** see [Semantic UI docs](http://semantic-ui.com/elements/icon.html)
* **:state** :default | :disabled | :loading
* **variations** :bordered? | :circular? | :color | :flipped |
    :fitted? | :inverted? | :link? | :rotated | :size
* **groups** :group? | :corner?


where

* **:color**
   :red | :orange | :yellow | :olive |
   :green | :teal | :blue | :violet |
   :purple | :pink | :brown | :grey |
   :black
* **:flipped** :horizontally | :vertically
* **:rotated** :clockwise | :counterclockwise
* **:size**
    :mini | :tiny | :small | :large | :big | :huge | :massive

---
")



;; ====================
;; STATES

(defcard-doc
  "# STATES")


;; Disabled

(defn disabled []
  [s/icon {:soda {:icon :users
                  :state :disabled}}])

(defcard-doc
  "
### Disabled

An icon can show that it is disabled
"
  (mkdn-pprint-source disabled))

(defcard-rg
  [disabled])


;; Loading

(defn loading []
  [:div
   [s/icon {:soda {:icon :spinner
                   :state :loading}}]

   [s/icon {:soda {:icon :notched-circle
                   :state :loading}}]

   [s/icon {:soda {:icon :asterisk
                   :state :loading}}]])

(defcard-doc
  "
### Loading

An icon can be used as a simple loader
"
  (mkdn-pprint-source loading))

(defcard-rg
  [loading])



;; ====================
;; VARIATIONS

(defcard-doc
  "# VARIATIONS")


;; Fitted

(defn fitted []
  [:div
   "Tight spacing"
   [s/icon {:soda {:icon :help
                   :fitted? true}}]
   "Tight spacing"])

(defcard-doc
  "
### Fitted

An icon can be fitted, without any space to the left or right of it.
"
  (mkdn-pprint-source fitted))

(defcard-rg
  [fitted])



;; Size

(defn size []
  [:div
   [s/icon {:soda {:icon :home :size :mini}}]
   [s/icon {:soda {:icon :home :size :tiny}}]
   [s/icon {:soda {:icon :home :size :small}}]
   [s/icon {:soda {:icon :home}}]
   [s/icon {:soda {:icon :home :size :large}}]
   [s/icon {:soda {:icon :home :size :big}}]
   [s/icon {:soda {:icon :home :size :huge}}]
   [s/icon {:soda {:icon :home :size :massive}}]])

(defcard-doc
  "
### Size

An icon can vary in size
"
  (mkdn-pprint-source size))

(defcard-rg
  [size])


;; Link

(defn link []
  [:div
   [s/icon {:soda {:icon :close
                   :link? true}}]
   [s/icon {:soda {:icon :help
                   :link? true}}]])

(defcard-doc
  "
### Link

An icon can be formatted as a link
"
  (mkdn-pprint-source link))

(defcard-rg
  [link])


;; Flipped

(defn flipped []
  [:div
   [s/icon {:soda {:icon :cloud
                   :flipped :horizontally}}]
   [s/icon {:soda {:icon :cloud
                   :flipped :vertically}}]])

(defcard-doc
  "
### Flipped

An icon can be flipped
"
  (mkdn-pprint-source flipped))

(defcard-rg
  [flipped])


;; Rotated

(defn rotated []
  [:div
   [s/icon {:soda {:icon :cloud
                   :rotated :clockwise}}]
   [s/icon {:soda {:icon :cloud
                   :rotated :counterclockwise}}]])

(defcard-doc
  "
### Rotated

An icon can be rotated
"
  (mkdn-pprint-source rotated))

(defcard-rg
  [rotated])


;; Circular

(defn circular []
  [:div
   [s/icon {:soda {:icon :users
                   :circular? true}}]
   [s/icon {:soda {:icon :users
                   :circular? true
                   :color :teal}}]
   [s/icon {:soda {:icon :users
                   :circular? true
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :circular? true
                   :color :teal
                   :inverted? true}}]])

(defcard-doc
  "
### Circular

An icon can be formatted to appear circular
"
  (mkdn-pprint-source circular))

(defcard-rg
  [circular])


;; Bordered

(defn bordered []
  [:div
   [s/icon {:soda {:icon :users
                   :bordered? true}}]
   [s/icon {:soda {:icon :users
                   :bordered? true
                   :color :teal}}]
   [s/icon {:soda {:icon :users
                   :bordered? true
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :bordered? true
                   :color :teal
                   :inverted? true}}]])

(defcard-doc
  "
### Bordered

An icon can be formatted to appear bordered
"
  (mkdn-pprint-source bordered))

(defcard-rg
  [bordered])


;; Colored

(defn colored []
  [:div
   [s/icon {:soda {:icon :users
                   :color :red}}]
   [s/icon {:soda {:icon :users
                   :color :orange}}]
   [s/icon {:soda {:icon :users
                   :color :yellow}}]
   [s/icon {:soda {:icon :users
                   :color :olive}}]
   [s/icon {:soda {:icon :users
                   :color :green}}]
   [s/icon {:soda {:icon :users
                   :color :teal}}]
   [s/icon {:soda {:icon :users
                   :color :blue}}]
   [s/icon {:soda {:icon :users
                   :color :violet}}]
   [s/icon {:soda {:icon :users
                   :color :purple}}]
   [s/icon {:soda {:icon :users
                   :color :pink}}]
   [s/icon {:soda {:icon :users
                   :color :brown}}]
   [s/icon {:soda {:icon :users
                   :color :grey}}]
   [s/icon {:soda {:icon :users
                   :color :black}}]])

(defcard-doc
  "
### Colored

An icon can be formatted to appear colored
"
  (mkdn-pprint-source colored))

(defcard-rg
  [colored])


;; Inverted

(defn inverted []
  [s/segment {:soda {:inverted? true}}
   [s/icon {:soda {:icon :users
                   :color :red
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :color :orange
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :color :yellow
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :color :olive
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :color :green
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :color :teal
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :color :blue
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :color :violet
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :color :purple
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :color :pink
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :color :brown
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :color :grey
                   :inverted? true}}]
   [s/icon {:soda {:icon :users
                   :color :black
                   :inverted? true}}]])

(defcard-doc
  "
### Inverted

An icon can be formatted to appear inverted
"
  (mkdn-pprint-source inverted))

(defcard-rg
  [inverted])




;; ====================
;; GROUPS

(defcard-doc
  "# GROUPS")


;; Icons

(defn icons []
  [:div
   [s/icon {:soda {:group? true
                   :size :huge}}
    [s/icon {:soda {:icon :thin-circle
                    :size :big}}]
    [s/icon {:soda {:icon :user}}]]

   [s/icon {:soda {:group? true
                   :size :huge}}
    [s/icon {:soda {:icon :loading-sun
                    :color :teal
                    :size :big}}]
    [s/icon {:soda {:icon :user}}]]])

(defcard-doc
  "
### Icons

Several icons can be used together as a group
"
  (mkdn-pprint-source icons))

(defcard-rg
  [icons])


;; Corner-Icons

(defn corner-icons []
  [:div
   [s/icon {:soda {:group? true
                   :size :huge}}
    [s/icon {:soda {:icon :puzzle}}]
    [s/icon {:soda {:icon :add
                    :corner? true}}]]])

(defcard-doc
  "
### Corner Icons

Several corner-icons can be used together as a group
"
  (mkdn-pprint-source corner-icons))

(defcard-rg
  [corner-icons])
