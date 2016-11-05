(ns soda-ash.elements.buttons-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core :as reagent]
   [soda-ash.helpers :as h]
   [soda-ash.element :as se]
   [soda-ash.content :as sco]
   [soda-ash.elements.button :as button]
   [soda-ash.elements.buttons :as buttons]))


(def list-variation-keys
  (h/list-keys buttons/variations))


(defcard-doc
  (h/devcard-docs buttons/opts))


(defcard-doc
  "Require the following:
   ```
   [soda-ash.element :as se]
   [soda-ash.content :as sco]
  ```")




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Buttons Types"
  "buttons")

(defn type-buttons []
  [se/buttons
   [se/button "button 1"]
   [se/button "button 2"]])

(defcard-doc
  (mkdn-pprint-source type-buttons))

(defcard-rg
  [type-buttons])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Content

(defcard-doc
  "
---
# Button Content")

(defcard-doc
  "**Conditionals**"
  "Button groups can contain conditionals")

(defn content-or []
  [se/buttons
   [se/button "Cancel"]
   [sco/s-or] ;; <-- s-or
   [se/button {:ash [:positive]}
    "Save"]])

(defcard-doc
  (mkdn-pprint-source content-or))

(defcard-rg
  [content-or])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Buttons Variations")

(defcard-doc
  "**Vertical Buttons**"
  "Groups can be formatted to appear vertically"
  (list-variation-keys "vertical"))

(defn buttons-vertical []
  [:div
   [se/buttons {:ash [:vertical]}
    [se/button "Foo"]
    [se/button "Bar"]
    [se/button "Baz"]]])

(defcard-doc
  (mkdn-pprint-source buttons-vertical))

(defcard-rg
   [buttons-vertical])


(defcard-doc
  "**Icon Buttons**"
  "Groups can be formatted as icons"
  (list-variation-keys "icon"))

(defn buttons-icon []
  [se/buttons {:ash [:icon]}
   [se/button
    [se/icon-star]]
   [se/button
    [se/icon-alarm]]
   [se/button
    [se/icon-arrow-up]]])

(defcard-doc
  (mkdn-pprint-source buttons-icon))

(defcard-rg
  [buttons-icon])


(defcard-doc
  "**Labeled Icon Buttons**"
  "Groups can be formatted as labeled icons"
  (list-variation-keys "icon"))

(defn buttons-labeled-icon []
  [se/buttons {:ash [:labeled-icon]}
   [se/button
    [se/icon-star]
    "Star"]
   [se/button
    [se/icon-alarm]
    "Alarm"]
   [se/button
    [se/icon-arrow-up]
    "Arrow up"]])

(defcard-doc
  (mkdn-pprint-source buttons-labeled-icon))

(defcard-rg
  [buttons-labeled-icon])


(defcard-doc
  "**Mixed Group**"
  "Groups can be formatted to use multiple button types together")

(defn buttons-mixed []
  [se/buttons
   [se/button-labeled-icon
    [se/icon-chevron-left]
    "Back"]

   [se/button
    [se/icon-stop]
    "Stop"]

   [se/button-right-labeled-icon
    [se/icon-chevron-right]
    "Forward"]
   ])

(defcard-doc
  (mkdn-pprint-source buttons-mixed))

(defcard-rg
  [buttons-mixed])



(defcard-doc
  "**Equal width**"
  "Groups can have their widths divided evenly"
  (list-variation-keys "width"))

(defn buttons-width-two []
  [se/buttons {:ash [:two]}
   [se/button {:ash [:red]}
    "one"]
   [se/button {:ash [:orange]}
    "two"]])


(defn buttons-width [width]
  (let [widths  [[:one :red]
                 [:two :orange]
                 [:three :yellow]
                 [:four :olive]
                 [:five :green]
                 [:six :teal]
                 [:seven :blue]
                 [:eight :violet]
                 [:nine :purple]
                 [:ten :pink]
                 [:eleven :brown]
                 [:twelve :grey]]
        widths' (take width widths)
        width'  (-> widths'
                    last
                    first)]
    (fn []
      [:div [:br]
       [se/buttons {:ash [width']}
        (for [[n color] widths']
          ^{:key n}
          [se/button {:ash [color]}
           (name n)])]])))

(defcard-doc
  (mkdn-pprint-source buttons-width-two))

(defcard-rg
  [:div
   [buttons-width-two]
   (for [n (range 3 13)]
     ^{:key n}
     [buttons-width n])
   ])



(defcard-doc
  "**Colored Buttons**"
  "Groups can have a shared color"
  (list-variation-keys "colored"))

(defn buttons-colored-red []
  [:div
   [se/buttons {:ash [:red]}
    [se/button "Red"]
    [se/button "Foo"]
    [se/button "Bar"]]])

(defn buttons-colored [colored]
  [:div
   [:br]
   [se/buttons {:ash [colored]}
    [se/button (name colored)]
    [se/button "Foo"]
    [se/button "Bar"]]])

(defcard-doc
  (mkdn-pprint-source buttons-colored-red))

(def colors
  [:red
   :orange
   :yellow
   :olive
   :green
   :teal
   :blue
   :violet
   :purple
   :pink
   :brown
   :grey
   :black])

(defcard-rg
  [:div
   [buttons-colored-red]
   (for [color (drop 1 colors)]
     ^{:key color}
     [buttons-colored color])
   ])



(defcard-doc
  "**Basic**"
  "A button group can be less pronounced"
  (list-variation-keys "basic"))

(defn buttons-basic []
  [se/buttons {:ash [:basic]}
   [se/button "basic"]
   [se/button "foo"]
   [se/button "bar"]])

(defcard-doc
  (mkdn-pprint-source buttons-basic))

(defcard-rg
  [buttons-basic])



(defcard-doc
  "**Group Sizes**"
  "Groups can have a shared size"
  (list-variation-keys "size"))

(defn buttons-size-mini []
  [:div
   [se/buttons {:ash [:mini]}
    [se/button "Mini"]
    [se/button "Foo"]
    [se/button "Bar"]]])

(defn buttons-size [size]
  [:div
   [:br]
   [se/buttons {:ash [size]}
    [se/button (name size)]
    [se/button "Foo"]
    [se/button "Bar"]]])

(defcard-doc
  (mkdn-pprint-source buttons-size-mini))

(defcard-rg
  [:div
   [buttons-size-mini]
   [buttons-size :tiny]
   [buttons-size :small]
   [buttons-size :medium]
   [buttons-size :large]
   [buttons-size :big]
   [buttons-size :huge]
   [buttons-size :massive]
   ])
