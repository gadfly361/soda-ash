(ns soda-ash.elements.button-card
  (:require-macros [devcards.core
                    :as dc
                    :refer [defcard-rg defcard-doc mkdn-pprint-source]])
  (:require [reagent.core :as reagent]
            [devcards.core]
            [reagent.core :as reagent]
            [soda-ash.elements.button :as button]
            [soda-ash.elements.card-helpers :as h]
            [soda-ash.element :as s]))



(defcard-doc
"
[back](http://localhost:3449/#!/soda_ash.an_overview_card)

# button

* **default tag** :button
* **:type**
    *ANIMATED* :animated | :vertical-animated | :animated-fade |
    *BASIC* :basic | :inverted-basic |
    *EMPHASIS* :primary | :secondary |
    *ICON* :icon | :labeled-icon | :right-labeled-icon |
    *INVERTED* :inverted | :inverted-basc |
    *LABELED* :labeled | :left-labeled | :labeled-icon | :right-labeled-icon
* **:state** :default | :active | :disabled | :loading
* **variations**
    :attached | :circular? | :color | :compact? | :consequence |
    :floated | :fluid? | :size | :social | :toggle?

where

* **:attached** :top | :bottom | :left | :right
* **:color**
   :red | :orange | :yellow | :olive |
   :green | :teal | :blue | :violet |
   :purple | :pink | :brown | :grey |
   :black
* **consequence** :positive | :negative
* **:floated** :left | :right
* **size**
    :mini | :tiny | :small | :medium |
    :large | :big | :huge | :massive
* **:social**
    :facebook | :twitter | :google-plus |
    :vk | :linkedin | :instagram | :youtube


Notes:

* Although any tag can be used for a button, it will only be keyboard focusable if you use a `:button` tag or you add the property `:tab-index \"0\"`. Keyboard accessible buttons will preserve focus styles after click, which may be visually jarring.

---
")



;; ====================
;; TYPES

(defcard-doc
"# TYPES")


;; Button

(defn button []
  [:div
   ;; :button
   [s/button {:soda {:type :default}}
    "button"]

   ;; :div
   [s/button {:soda {:tag :div
                     :type :default}
              :tab-index "0"}
    "div"]])

(defcard-doc
  "
### Button

A standard button
"
  (mkdn-pprint-source button))

(defcard-rg
  [button])


;; Emphasis

(defn emphasis []
  [:div
   [s/button {:soda {:type :primary}}
    "primary"]

   [s/button {:soda {:tag :div
                     :type :secondary}
              :tab-index "0"}
    "secondary"]])

(defcard-doc
  "
### Emphasis

A button can be formatted to show different levels of emphasis

Notes:

* Setting your brand colors to primary and secondary color variables in site.variables will allow you to use your color theming for UI elements
"
  (mkdn-pprint-source emphasis))

(defcard-rg
  [emphasis])


;; Animated

(defn animated []
  [:div
   [s/button {:soda {:type :animated}}
    [:div.visible.content
     "Next"]
    [:div.hidden.content
     [s/icon {:soda {:icon :right-arrow}}]]]

   [s/button {:soda {:type :vertical-animated}}
    [:div.visible.content
     [s/icon {:soda {:icon :shop}}]]
    [:div.hidden.content
     "Shop"]]

   [s/button {:soda {:type :animated-fade}}
    [:div.visible.content
     "Sign-up for a Pro account"]
    [:div.hidden.content
     "$12.99 a mont"]]])

(defcard-doc
  "
### Animated

A button can animate to show hidden content

Notes:

* The button will be automatically sized according to the visible content size. Make sure there is enough room for the hidden content to show
"
  (mkdn-pprint-source animated))

(defcard-rg
  [animated])


;; Labeled

(defn labeled []
  [:div
   [s/button {:soda {:tag :div
                     :type :labeled}
              :tab-index "0"}
    [s/button {}
     [s/icon {:soda {:icon :heart}}]
     "Like"]
    [s/label {:soda {:tag :a
                     :basic? true}}
     "2,048"]]

   [s/button {:soda {:tag :div
                     :type :left-labeled}
              :tab-index "0"}
    [s/label {:soda {:tag :a
                     :type :right-pointing
                     :basic? true}}
     "2,048"]
    [s/button {}
     [s/icon {:soda {:icon :heart}}]
     "Like"]]])

(defcard-doc
  "
### Labeled

A button can appear alongside a label
"
  (mkdn-pprint-source labeled))

(defcard-rg
  [labeled])


;; Icon

(defn icon []
  [s/button {:soda {:type :icon}}
   [s/icon {:soda {:icon :cloud}}]])

(defcard-doc
  "
### Icon

A button can have only an icon
"
  (mkdn-pprint-source icon))

(defcard-rg
  [icon])



;; Labeled-Icon

(defn labeled-icon []
  [:div
   [s/button {:soda {:type :labeled-icon}}
    [s/icon {:soda {:icon :pause}}]
    "Pause"]

   [s/button {:soda {:type :right-labeled-icon}}
    [s/icon {:soda {:icon :right-arrow}}]
    "Next"]])

(defcard-doc
  "
### Labeled Icon

A button can use an icon as a label
"
  (mkdn-pprint-source labeled-icon))

(defcard-rg
  [labeled-icon])


;; Basic

(defn basic []
  [s/button {:soda {:type :basic}}
   [s/icon {:soda {:icon :user}}]
   "Add Friend"])

(defcard-doc
  "
### Basic

A basic button is less pronounced
"
  (mkdn-pprint-source basic))

(defcard-rg
  [basic])


;; Inverted

(defn inverted []
  [s/segment {:soda {:inverted? true}}
   [s/button {:soda {:type :inverted
                     :color :red}}
    "Red"]

   [s/button {:soda {:type :inverted
                     :color :orange}}
    "Orange"]

   [s/button {:soda {:type :inverted
                     :color :yellow}}
    "Yellow"]])

(defcard-doc
  "
### Inverted

A inverted button is less pronounced
"
  (mkdn-pprint-source inverted))

(defcard-rg
  [inverted])



;; Inverted-Basic

(defn inverted-basic []
  [s/segment {:soda {:inverted? true}}
   [s/button {:soda {:type :inverted-basic
                     :color :red}}
    "Red"]

   [s/button {:soda {:type :inverted-basic
                     :color :orange}}
    "Orange"]

   [s/button {:soda {:type :inverted-basic
                     :color :yellow}}
    "Yellow"]])

(defcard-doc
  "
### Inverted Basic
"
  (mkdn-pprint-source inverted-basic))

(defcard-rg
  [inverted-basic])



;; ====================
;; STATES

(defcard-doc
  "# STATES")



;; Active

(defn active []
  [s/button {:soda {:state :active}}
   [s/icon {:soda {:icon :user}}]
   "Follow"])

(defcard-doc
  "
### Active

A button can show it is currently the active user selection
"
  (mkdn-pprint-source active))

(defcard-rg
  [active])


;; Disabled

(defn disabled []
  [s/button {:soda {:state :disabled}}
   [s/icon {:soda {:icon :user}}]
   "Followed"])

(defcard-doc
  "
### Disabled

A button can show it is currently unable to be interacted with
"
  (mkdn-pprint-source disabled))

(defcard-rg
  [disabled])


;; Loading

(defn loading []
  [s/button {:soda {:state :loading}}
   [s/icon {:soda {:icon :user}}]
   "Follow"])

(defcard-doc
  "
### Loading

A button can show a loading indicator
"
  (mkdn-pprint-source loading))

(defcard-rg
  [loading])



;; ====================
;; VARIATIONS

(defcard-doc
  "# VARIATIONS")


;; Social

(defn social []
  [:div
  [s/button {:soda {:social :facebook}}
   [s/icon {:soda {:icon :facebook}}]
   "Facebook"]

   [s/button {:soda {:social :twitter}}
    [s/icon {:soda {:icon :twitter}}]
    "Twitter"]

   [s/button {:soda {:social :google-plus}}
    [s/icon {:soda {:icon :google-plus}}]
    "Google Plus"]

   [s/button {:soda {:social :vk}}
    [s/icon {:soda {:icon :vk}}]
    "VK"]

   [s/button {:soda {:social :linkedin}}
    [s/icon {:soda {:icon :linkedin}}]
    "LinkedIn"]

   [s/button {:soda {:social :youtube}}
    [s/icon {:soda {:icon :youtube}}]
    "YouTube"]])

(defcard-doc
  "
### Social

A button can be formatted to link to a social website
"
  (mkdn-pprint-source social))

(defcard-rg
  [social])


;; Size

(defn size []
  [:div
   [s/button {:soda {:size :mini}}
    "Mini"]
   [s/button {:soda {:size :tiny}}
    "Tiny"]
   [s/button {:soda {:size :small}}
    "Small"]
   [s/button {:soda {:size :medium}}
    "Medium"]
   [s/button {:soda {:size :large}}
    "Large"]
   [s/button {:soda {:size :big}}
    "Big"]
   [s/button {:soda {:size :huge}}
    "Huge"]
   [s/button {:soda {:size :massive}}
    "Massive"]])

(defcard-doc
  "
### Size

A button can have different sizes
"
  (mkdn-pprint-source size))

(defcard-rg
  [size])


;; Floated

(defn floated []
  [:div
   [s/button {:soda {:floated :left}}
    "Left Floated"]

   [s/button {:soda {:floated :right}}
    "Right Floated"]

   [h/fake-content]
   ])

(defcard-doc
  "
### Floated

A button can be aligned to the left or right of its container
"
  (mkdn-pprint-source floated))

(defcard-rg
  [floated])


;; Colored

(defn colored []
  [:div
   [s/button {:soda {:color :red}}
    "Red"]
   [s/button {:soda {:color :orange}}
    "Orange"]
   [s/button {:soda {:color :yellow}}
    "Yellow"]
   [s/button {:soda {:color :olive}}
    "Olive"]
   [s/button {:soda {:color :green}}
    "Green"]
   [s/button {:soda {:color :teal}}
    "Teal"]
   [s/button {:soda {:color :blue}}
    "Blue"]
   [s/button {:soda {:color :violet}}
    "Violet"]
   [s/button {:soda {:color :purple}}
    "Purple"]
   [s/button {:soda {:color :pink}}
    "Pink"]
   [s/button {:soda {:color :brown}}
    "Brown"]
   [s/button {:soda {:color :grey}}
    "Grey"]
   [s/button {:soda {:color :black}}
    "Black"]])

(defcard-doc
  "
### Colored

A button can have different colors
"
  (mkdn-pprint-source colored))

(defcard-rg
  [colored])


;; Compact

(defn compact []
  [:div
   [s/button {:soda {:compact? true}}
    "Hold"]

   [s/button {:soda {:type :labeled-icon
                     :compact? true}}
    [s/icon {:soda {:icon :pause}}]
    "Pause"]])

(defcard-doc
  "
### Compact

A button can reduce its padding to fit into tighter spaces
"
  (mkdn-pprint-source compact))

(defcard-rg
  [compact])


;; Toggle

(defn toggle-state [state]
  (if (= :active state)
    :default
    :active))

(defn toggle-text [state]
  (if (= :active state)
    "Voted"
    "Vote"))

(defn handle-on-click! [ratom state]
  (swap! ratom update-in [:foo :soda :state] toggle-state))

(defn toggle-component []
  (let [ratom (reagent/atom {})]
    (fn []
      (let [state (get-in @ratom [:foo :soda :state])]
        [s/button {:soda {:ratom ratom
                          :path :foo
                          :toggle? true
                          :state :default}
                   :on-click #(handle-on-click! ratom state)}
         (toggle-text state)]))))

(defcard-doc
  "
### Toggle

A button can be formatted to toggle on and off
"
  (mkdn-pprint-source toggle-state)
  (mkdn-pprint-source toggle-text)
  (mkdn-pprint-source handle-on-click!)
  (mkdn-pprint-source toggle-component))

(defcard-rg
  [toggle-component])


;; Positive

(defn positive []
  [s/button {:soda {:consequence :positive}}
   "Positive"])

(defcard-doc
  "
### Positive

A button can hint towards a positive consequence
"
  (mkdn-pprint-source positive))

(defcard-rg
  [positive])


;; Negative

(defn negative []
  [s/button {:soda {:consequence :negative}}
   "Negative"])

(defcard-doc
  "
### Negative

A button can hint towards a negative consequence
"
  (mkdn-pprint-source negative))

(defcard-rg
  [negative])


;; Fluid

(defn fluid []
  [s/button {:soda {:fluid? true}}
   "Fluid"])

(defcard-doc
  "
### Fluid

A button can hint towards a fluid consequence
"
  (mkdn-pprint-source fluid))

(defcard-rg
  [fluid])


;; Circular

(defn circular []
  [s/button {:soda {:type :icon
                    :circular? true}}
   [s/icon {:soda {:icon :settings}}]])

(defcard-doc
  "
### Circular

A button can hint towards a circular consequence
"
  (mkdn-pprint-source circular))

(defcard-rg
  [circular])


;; Vertically Attached

(defn vertically-attached []
  [:div
   [s/button {:soda {:tag :div
                     :attached :top}
              :tab-index "0"}
    "Top"]
   [s/segment {:soda {:attached :default}}
    [h/fake-content]]
   [s/button {:soda {:tag :div
                     :attached :bottom}
              :tab-index "0"}
    "Bottom"]])

(defcard-doc
  "
### Vertically Attached

A button can be attached to the top or bottom of other content
"
  (mkdn-pprint-source vertically-attached))

(defcard-rg
  [vertically-attached])


;; Horizontally Attached

(defn horizontally-attached []
  [:div
   [s/button {:soda {:attached :left}}
    "Left"]
   [s/button {:soda {:attached :right}}
    "Right"]])

(defcard-doc
  "
### Horizontally Attached

A button can be attached to the left or right of other content
"
  (mkdn-pprint-source horizontally-attached))

(defcard-rg
  [horizontally-attached])
