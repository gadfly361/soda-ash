(ns soda-ash.elements.label-card
  (:require-macros [devcards.core
                    :as dc
                    :refer [defcard-rg defcard-doc mkdn-pprint-source]])
  (:require [reagent.core :as reagent]
            [devcards.core]
            [soda-ash.elements.label :as label]
            [soda-ash.elements.card-helpers :as h]
            [soda-ash.element :as s]))



(defcard-doc
"
[back](http://localhost:3449/#!/soda_ash.an_overview_card)

# label

* **default tag** :div
* **:type**
    :default |
    *ATTACHED*
    :top-attached |
    :bottom-attached |
    :top-right-attached |
    :top-left-attached |
    :bottom-left-attached |
    :bottom-right-attached |
    *CORNER*
    :left-corner |
    :right-corner |
    *FLOATING*
    :floating |
    *HORIZONTAL*
    :horizontal |
    *IMAGE*
    :image |
    *POINTING*
    :pointing |
    :pointing-below |
    :left-pointing |
    :right-pointing |
    *TAG*
    :tag |
    *RIBBON*
    :ribbon |
    :right-ribbon
* **content** detail | icon | image | link
* **variations** :basic? | :circular? | :color | :size

where

* **:color**
   :red | :orange | :yellow | :olive |
   :green | :teal | :blue | :violet |
   :purple | :pink | :brown | :grey |
   :black
* **:size**
    :mini | :tiny | :small | :large | :big | :huge | :massive

---
")



;; ====================
;; TYPES

(defcard-doc
"# TYPES")


;; Label

(defn label []
  [s/label {:soda {:type :default}}
   [s/icon {:soda {:icon :mail}}]
   "23"])

(defcard-doc
  "
### Label

A label
"
  (mkdn-pprint-source label))

(defcard-rg
  [label])


;; Image

(defn image []
  [:div
   [s/label {:soda {:tag :a
                    :type :image}}
    [s/image {:src "/images/avatar/small/joe.jpg"}]
    "Joe"
    [s/icon {:soda {:icon :delete}}]]
   [s/label {:soda {:tag :a
                    :type :image}}
    [s/image {:src "/images/avatar/small/elliot.jpg"}]
    "Elliot"
    [s/icon {:soda {:icon :delete}}]]
   [s/label {:soda {:tag :a
                    :type :image}}
    [s/image {:src "/images/avatar/small/stevie.jpg"}]
    "Stevie"
    [s/icon {:soda {:icon :delete}}]]
   ])

(defcard-doc
  "
### Image

A label can be formatted to emphasize an image
"
  (mkdn-pprint-source image))

(defcard-rg
  [image])


;; Pointing

(defn pointing []
  [:form.ui.fluid.form
   [:div.field
    [:input {:type "text" :placeholder "Some text.."}]
    [s/label {:soda {:type :pointing}}
     "Please enter a value"]]

   [:div.field
    [s/label {:soda {:type :pointing-below}}
     "Please enter a value"]
    [:input {:type "text" :placeholder "Some text.."}]]

   [:div.inline.field
    [:input {:type "text" :placeholder "Some text.."}]
    [s/label {:soda {:type :left-pointing
                     :color :red
                     :basic? :red}}
     "Please enter a value"]]

   [:div.inline.field
    [s/label {:soda {:type :right-pointing}}
     "Please enter a value"]
    [:input {:type "text" :placeholder "Some text.."}]]
   ])

(defcard-doc
  "
### Pointing

A label can point to content next to it
"
  (mkdn-pprint-source pointing))

(defcard-rg
  [pointing])


;; Corner

(defn corner []
  [:div.ui.two.column.grid
   [:div.column
    [:div.ui.fluid.image
     [s/label {:soda {:type :left-corner}}
      [s/icon {:soda {:icon :heart}}]]
     [s/image {:src "/images/wireframe/image.png"}]
     ]]

   [:div.column
    [:div.ui.fluid.image
     [s/label {:soda {:type :right-corner
                      :color :red}}
      [s/icon {:soda {:icon :save}}]]
     [s/image {:src "/images/wireframe/image.png"}]
     ]]])

(defcard-doc
  "
### Corner

A label can position itself in the corner of an element

Notes:

* Regarding style (not soda): A corner label must be positioned inside a container with *position: relative* to display properly. If a container is rounded you will need to add *overflow:hidden* to the container to produce a rounded label.
"
  (mkdn-pprint-source corner))

(defcard-rg
  [corner])


;; Tag

(defn tag []
  [:div
   [s/label {:soda {:tag :a
                    :type :tag}}
    "New"]

   [s/label {:soda {:tag :a
                    :type :tag
                    :color :red}}
    "Upcoming"]

   [s/label {:soda {:tag :a
                    :type :tag
                    :color :teal}}
    "Featured"]])

(defcard-doc
  "
### Tag

A label can appear as a tag
"
  (mkdn-pprint-source tag))

(defcard-rg
  [tag])


;; Ribbon

(defn ribbon []
  [:div.ui.two.column.grid
   [:div.column
    [s/segment {:soda {:type :raised}}
     [s/label {:soda {:type :ribbon
                      :color :red}}
      "Overview"]
     [:span "Account Details"]
     [h/fake-content]
     ]]

   [:div.column
    [s/segment {:soda {:type :raised}}
     [s/label {:soda {:type :right-ribbon
                      :color :orange}}
      "Specs"]
     [h/fake-content]]]])

(defcard-doc
  "
### Ribbon

A label can appear as a ribbon attaching itself to an element.
"
  (mkdn-pprint-source ribbon))

(defcard-rg
  [ribbon])



;; Attached

(defn attached []
  [:div
   [s/segment {:soda {:type :default}}
    [s/label {:soda {:type :top-attached}} "HTML"]
    [h/fake-content]]

   [s/segment {:soda {:type :default}}
    [s/label {:soda {:type :bottom-attached}} "CSS"]
    [h/fake-content]]

   [s/segment {:soda {:type :default}}
    [s/label {:soda {:type :top-right-attached}} "Code"]
    [h/fake-content]]

   [s/segment {:soda {:type :default}}
    [s/label {:soda {:type :top-left-attached}} "View"]
    [h/fake-content]]

   [s/segment {:soda {:type :default}}
    [s/label {:soda {:type :bottom-left-attached}} "User View"]
    [h/fake-content]]

   [s/segment {:soda {:type :default}}
    [s/label {:soda {:type :bottom-right-attached}} "Admin View"]
    [h/fake-content]]])

(defcard-doc
  "
### Attached

A label can attach to a content segment

Notes:

* Attached labels attempt to intelligently pad other content to account for their position, but may not in all cases apply this padding correctly. If this happens you may need to manually correct the padding of the other elements inside the container.
"
  (mkdn-pprint-source attached))

(defcard-rg
  [attached])


;; Horizontal

(defn horizontal []
  [:div.ui.divided.selection.list
   [:a.item
    [s/label {:soda {:type :horizontal
                     :color :red}}
     "Fruit"]
     "Kumquats"]
   [:a.item
    [s/label {:soda {:type :horizontal
                     :color :purple}}
     "Candy"]
    "Ice Cream"]
   ])

(defcard-doc
  "
### Horizontal

A horizontal label is formatted to label content along-side it horizontally
"
  (mkdn-pprint-source horizontal))

(defcard-rg
  [horizontal])


;; Floating

(defn floating []
  [:div.ui.compact.menu
   [:a.item
    [s/icon {:soda {:icon :mail}}]
    "Messages"
    [s/label {:soda {:type :floating
                     :color :red}}
     "22"]]

   [:a.item
    [s/icon {:soda {:icon :users}}]
    "Friends"
    [s/label {:soda {:type :floating
                     :color :teal}}
     "22"]]])

(defcard-doc
  "
### Floating

A label can float above another element
"
  (mkdn-pprint-source floating))

(defcard-rg
  [floating])



;; ====================
;; CONTENT

(defcard-doc
"# CONTENT")


;; Detail

(defn detail []
  [s/label {:soda {:type :default}}
   "Dogs"
   [:div.detail "214"]])

(defcard-doc
  "
### Detail

A label can contain a detail
"
  (mkdn-pprint-source detail))

(defcard-rg
  [detail])


;; Icon

(defn icon []
  [:div
   [s/label {:soda {:tag :a}}
    [s/icon {:soda {:icon :mail}}]
    "Mail"]

   [s/label {:soda {:tag :a}}
    "Tag"
    [s/icon {:soda {:icon :delete}}]]])

(defcard-doc
  "
### Icon

A label can contain a icon
"
  (mkdn-pprint-source icon))

(defcard-rg
  [icon])


;; Image

(defn content-image []
  [:div
   [s/label {:soda {:tag :a}}
    [s/image {:soda {:spaced :right
                     :avatar? true}
              :src "/images/avatar/small/elliot.jpg"}]
    "Elliot"]

   [s/label {:soda {:tag :a}}
    [:img {:src "/images/avatar/small/stevie.jpg"}]
    "Stevie"]])

(defcard-doc
  "
### Image

A label can include an image
"
  (mkdn-pprint-source content-image))

(defcard-rg
  [content-image])


;; Link

(defn content-link []
  [s/label {:soda {:tag :a}}
   [s/icon {:soda {:icon :mail}}]
   "23"])

(defcard-doc
  "
### Link

A label can be a link or contain an item that links
"
  (mkdn-pprint-source content-link))

(defcard-rg
  [content-link])



;; ====================
;; VARIATIONS

(defcard-doc
  "# VARIATIONS")

(def colors
  [:red :orange :yellow :olive
   :green :teal :blue :violet
   :purple :pink :brown :grey
   :black])


;; Circular

(defn circle [color]
  [s/label {:soda {:tag :a
                   :circular? true
                   :color color}}
   "2"])

(defn circular []
  [:div
   (for [color colors]
     ^{:key color}
     [circle color])])

(defcard-doc
  "
### Circular

A label can be circular
"
  (mkdn-pprint-source circular))

(defcard-rg
  [circular])


;; Circular-Empty

(defn circle-empty [color]
  [s/label {:soda {:tag :a
                   :circular? true
                   :color color
                   :empty? true}}])

(defn circular-empty []
  [:div
   (for [color colors]
     ^{:key color}
     [circle-empty color])])

(defcard-doc
  (mkdn-pprint-source circular-empty))

(defcard-rg
  [circular-empty])


;; Basic

(defn basic []
  [:div
   [s/label {:soda {:tag :a
                    :basic? true}}
    "Basic"]

   [s/label {:soda {:tag :a
                    :type :pointing
                    :basic? true
                    :color :blue}}
    "Pointing"]

   [s/label {:soda {:type :image
                    :basic? true}}
    [s/image {:src "/images/avatar/small/elliot.jpg"}]
    "Elliot"]])

(defcard-doc
  "
### Basic

A label can reduce its complexity
"
  (mkdn-pprint-source basic))

(defcard-rg
  [basic])


;; Colored

(defn colored []
  [:div
   [s/label {:soda {:tag :a
                    :color :red}}
    "Red"]
   [s/label {:soda {:tag :a
                    :color :orange}}
    "Orange"]
   [s/label {:soda {:tag :a
                    :color :yellow}}
    "Yellow"]
   [s/label {:soda {:tag :a
                    :color :olive}}
    "Olive"]
   [s/label {:soda {:tag :a
                    :color :green}}
    "Green"]
   [s/label {:soda {:tag :a
                    :color :teal}}
    "Teal"]
   [s/label {:soda {:tag :a
                    :color :blue}}
    "Blue"]
   [s/label {:soda {:tag :a
                    :color :violet}}
    "Violet"]
   [s/label {:soda {:tag :a
                    :color :purple}}
    "Purple"]
   [s/label {:soda {:tag :a
                    :color :pink}}
    "Pink"]
   [s/label {:soda {:tag :a
                    :color :brown}}
    "Brown"]
   [s/label {:soda {:tag :a
                    :color :grey}}
    "Grey"]
   [s/label {:soda {:tag :a
                    :color :black}}
    "Black"]])

(defcard-doc
  "
### Colored

A label can have different colors
"
  (mkdn-pprint-source colored))

(defcard-rg
  [colored])



;; Size

(defn size []
  [:div
   [s/label {:soda {:size :mini}}
    "Mini"]
   [s/label {:soda {:size :tiny}}
    "Tiny"]
   [s/label {:soda {:size :small}}
    "Small"]
   [s/label {:soda {:type :default}}
    "Medium"]
   [s/label {:soda {:size :large}}
    "Large"]
   [s/label {:soda {:size :big}}
    "Big"]
   [s/label {:soda {:size :huge}}
    "Huge"]
   [s/label {:soda {:size :massive}}
    "Massive"]
   ])

(defcard-doc
  "
### Size

A label can have different colors
"
  (mkdn-pprint-source size))

(defcard-rg
  [size])
