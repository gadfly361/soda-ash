(ns soda-ash.elements.header-card
  (:require-macros [devcards.core
                    :as dc
                    :refer [defcard-rg defcard-doc mkdn-pprint-source]])
  (:require [reagent.core :as reagent]
            [devcards.core]
            [soda-ash.elements.header :as header]
            [soda-ash.elements.card-helpers :as h]
            [soda-ash.element :as s]))



(defcard-doc
"
[back](http://localhost:3449/#!/soda_ash.an_overview_card)

# header

* **default tag** :div
* **:type**
    *HEADERS* :huge | :large | :medium | :small | :tiny
    *ICON* :icon
    *SUB* :sub
* **:state** :disabled
* **content** image | icon | subheader
* **variations**
    :aligned | :attached | :block? | :color |
    :dividing? | :floated | inverted?

where

* **aligned** :right | :left | :justified | :center
* **:color**
   :red | :orange | :yellow | :olive |
   :green | :teal | :blue | :violet |
   :purple | :pink | :brown | :grey |
   :black
* **:floated** :right | :left

---
")



;; ====================
;; TYPES

(defcard-doc
"# TYPES")


;; page headers

(defn page-headers []
  [:div
   [s/header {:soda {:tag :h1}} "First header"]
   [s/header {:soda {:tag :h2}} "Second header"]
   [s/header {:soda {:tag :h3}} "Third header"]
   [s/header {:soda {:tag :h4}} "Fourth header"]
   [s/header {:soda {:tag :h5}} "Fifth header"]
   ])

(defcard-doc
  "
### Page Headers

Headers may be oriented to give the hierarchy of a section in the context of the page

Notes:

* Page headings are sized using rem and are not affected by surrounding content size.
"
  (mkdn-pprint-source page-headers))

(defcard-rg
  [page-headers])


;; content headers

(defn content-headers []
  [:div
   [s/header {:soda {:type :huge}} "Huge"]
   [s/header {:soda {:type :large}} "Large"]
   [s/header {:soda {:type :medium}} "Medium"]
   [s/header {:soda {:type :small}} "Small"]
   [s/header {:soda {:type :tiny}} "Tiny"]
   ])

(defcard-doc
  "
### Content Headers

Headers may be oriented to give the importance of a section in the context of the content that surrounds it.

Notes:

* Content headings are sized with *em* and are based on the font-size of their container.
"
  (mkdn-pprint-source content-headers))

(defcard-rg
  [content-headers])


;; icon headers

(defn icon-headers []
  [s/header {:soda {:tag :h2
                    :type :icon}}
   [s/icon {:soda {:icon :settings}}]
   "Account Settings"])

(defcard-doc
  "
### Icon Headers

A header can be formatted to emphasize an icon
"
  (mkdn-pprint-source icon-headers))

(defcard-rg
  [icon-headers])


;; sub headers

(defn sub-headers []
  [:div
   [s/header {:soda {:tag :h2
                     :type :sub}}
    "Price"]
   [:span "$10.99"]])

(defcard-doc
  "
### Sub Headers

A header can be formatted to emphasize an sub
"
  (mkdn-pprint-source sub-headers))

(defcard-rg
  [sub-headers])



;; ====================
;; CONTENT

(defcard-doc
"# Content")


;; image

(defn image []
  [s/header {:soda {:tag :h2}}
   [s/image {:src "/images/icons/school.png"}]
   [:div.content
    "Learn More"]])

(defcard-doc
  "
### Image

A header may contain an image
"
  (mkdn-pprint-source image))

(defcard-rg
  [image])


;; icon

(defn icon []
  [s/header {:soda {:tag :h2}}
   [s/icon {:soda {:icon :plug}}]
   [:div.content
    "Uptime Guarantee"]])

(defcard-doc
  "
### Icon

A header may contain an icon
"
  (mkdn-pprint-source icon))

(defcard-rg
  [icon])


;; subheader

(defn subheader []
  [:div
   [s/header {:soda {:tag :h2}}
    "H1"
    [:div.sub.header ;; <-- attention (note: this isn't a soda header element)
     "Sub Header"]]

   [s/header {:soda {:tag :h2}}
    "H2"
    [:div.sub.header
     "Sub Header"]]

   [s/header {:soda {:tag :h3}}
    "H3"
    [:div.sub.header
     "Sub Header"]]

   [s/header {:soda {:tag :h4}}
    "H4"
    [:div.sub.header
     "Sub Header"]]

   [s/header {:soda {:tag :h5}}
    "H5"
    [:div.sub.header
     "Sub Header"]]])

(defcard-doc
  "
### Subheader

A header may contain an subheader
"
  (mkdn-pprint-source subheader))

(defcard-rg
  [subheader])



;; ====================
;; STATES

(defcard-doc
"# States")


(defn states []
  [s/header {:soda {:state :disabled}}
   "Disabled Header"])

(defcard-doc
  "
### Disabled

A header can show that it is inactive
"
  (mkdn-pprint-source states))

(defcard-rg
  [states])



;; ====================
;; VARIATIONS

(defcard-doc
"# Variations")


;; dividing

(defn dividing []
  [:div
   [h/fake-content]
   [s/header {:soda {:dividing? true}}
    "Dividing Header"]
   [h/fake-content]])

(defcard-doc
  "
### Disabled

A header can show that it is inactive
"
  (mkdn-pprint-source dividing))

(defcard-rg
  [dividing])


;; block

(defn block []
  [:div
   [s/header {:soda {:block? true}}
    "Block Header"]
   [h/fake-content]])

(defcard-doc
  "
### Disabled

A header can show that it is inactive
"
  (mkdn-pprint-source block))

(defcard-rg
  [block])


;; attached

(defn attached []
  [:div
   [s/header {:soda {:tag :h3
                     :attached :top}}
    "Top Attached"]
   [s/segment {:soda {:attached :default}}
    [h/fake-content]]
   [s/header {:soda {:tag :h3
                     :attached :default}}
    "Attached"]
   [s/segment {:soda {:attached :default}}
    [h/fake-content]]
   [s/header {:soda {:tag :h3
                     :attached :bottom}}
    "Bottom Attached"]])

(defcard-doc
  "
### Disabled

A header can show that it is inactive
"
  (mkdn-pprint-source attached))

(defcard-rg
  [attached])


;; floating

(defn floating []
  [s/segment {:soda {:clearing? true}}
   [s/header {:soda {:floated :right}}
    "Go Forward"]
   [s/header {:soda {:floated :left}}
    "Go Back"]
   [h/fake-content]])

(defcard-doc
  "
### Floating

A header can sit to the left or right of other content
"
  (mkdn-pprint-source floating))

(defcard-rg
  [floating])


;; alignment

(defn alignment []
  [s/segment {}
   [s/header {:soda {:aligned :right}} "Right"]
   [s/header {:soda {:aligned :left}} "Left"]
   [s/header {:soda {:aligned :justified}}
    "This should take up the full width even if only one line"]
   [s/header {:soda {:aligned :center}} "Center"]])

(defcard-doc
  "
### Text Alignment

A header can have its text aligned to a side
"
  (mkdn-pprint-source alignment))

(defcard-rg
  [alignment])


;; colored

(defn colored []
  [:div
   [s/header {:soda {:color :red}} "Red"]
   [s/header {:soda {:color :orange}} "Orange"]
   [s/header {:soda {:color :yellow}} "Yellow"]
   [s/header {:soda {:color :olive}} "Olive"]
   [s/header {:soda {:color :green}} "Green"]
   [s/header {:soda {:color :teal}} "Teal"]
   [s/header {:soda {:color :blue}} "Blue"]
   [s/header {:soda {:color :purple}} "Purple"]
   [s/header {:soda {:color :violet}} "Violet"]
   [s/header {:soda {:color :pink}} "Pink"]
   [s/header {:soda {:color :brown}} "Brown"]
   [s/header {:soda {:color :grey}} "Grey"]
   ])

(defcard-doc
  "
### Colored

A header can be formatted with different colors
"
  (mkdn-pprint-source colored))

(defcard-rg
  [colored])


;; inverted-colored

(defn inverted-colored []
  [s/segment {:soda {:inverted? true}}
   [s/header {:soda {:inverted? true
                     :color :red}} "Red"]
   [s/header {:soda {:inverted? true
                     :color :orange}} "Orange"]
   [s/header {:soda {:inverted? true
                     :color :yellow}} "Yellow"]
   [s/header {:soda {:inverted? true
                     :color :olive}} "Olive"]
   [s/header {:soda {:inverted? true
                     :color :green}} "Green"]
   [s/header {:soda {:inverted? true
                     :color :teal}} "Teal"]
   [s/header {:soda {:inverted? true
                     :color :blue}} "Blue"]
   [s/header {:soda {:inverted? true
                     :color :purple}} "Purple"]
   [s/header {:soda {:inverted? true
                     :color :violet}} "Violet"]
   [s/header {:soda {:inverted? true
                     :color :pink}} "Pink"]
   [s/header {:soda {:inverted? true
                     :color :brown}} "Brown"]
   [s/header {:soda {:inverted? true
                     :color :grey}} "Grey"]
   ])

(defcard-doc
  "
### Inverted-Colored

A header can have its colors inverted for contrast

Notes:

* Inverted headers use modified light versions of your site's color scheme that are adapted to have more contrast on dark background
"
  (mkdn-pprint-source inverted-colored))

(defcard-rg
  [inverted-colored])
