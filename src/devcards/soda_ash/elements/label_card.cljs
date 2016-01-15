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
# label

---
")



;; ====================
;; TYPES

(defcard-doc
"# TYPES")


;; Label

(defn label []
  [s/label {}
   [s/icon {:soda {:icon :mail}}]
   "23"])

(defcard-doc
  "
### Label
"
  (mkdn-pprint-source label))

(defcard-rg
  [label])


;; Image

(defn image []
  [:div
   [s/label {:soda {:tag :a
                    :type :image}}
    [:img {:src "/images/avatar/small/joe.jpg"}]
    "Joe"
    [s/icon {:soda {:icon :delete}}]]
   [s/label {:soda {:tag :a
                    :type :image}}
    [:img {:src "/images/avatar/small/elliot.jpg"}]
    "Elliot"
    [s/icon {:soda {:icon :delete}}]]
   [s/label {:soda {:tag :a
                    :type :image}}
    [:img {:src "/images/avatar/small/stevie.jpg"}]
    "Stevie"
    [s/icon {:soda {:icon :delete}}]]
   ])

(defcard-doc
  "
### Image
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
     [:img {:src "/images/wireframe/image.png"}]
     ]]

   [:div.column
    [:div.ui.fluid.image
     [s/label {:soda {:type :right-corner
                      :color :red}}
      [s/icon {:soda {:icon :save}}]]
     [:img {:src "/images/wireframe/image.png"}]
     ]]])

(defcard-doc
  "
### Corner
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
"
  (mkdn-pprint-source tag))

(defcard-rg
  [tag])


;; Ribbon

(defn ribbon []
  [:div.ui.two.column.grid
   [:div.column
    [:div.ui.raise.segment
     [s/label {:soda {:type :ribbon
                      :color :red}}
      "Overview"]
     [:span "Account Details"]
     [h/fake-content]
     ]]

   [:div.column
    [:div.ui.raise.segment
     [s/label {:soda {:type :right-ribbon
                      :color :orange}}
      "Specs"]
     [h/fake-content]]]])

(defcard-doc
  "
### Ribbon
"
  (mkdn-pprint-source ribbon))

(defcard-rg
  [ribbon])



;; Attached

(defn attached []
  [:div
   [:div.ui.segment
    [s/label {:soda {:type :top-attached}} "HTML"]
    [h/fake-content]]

   [:div.ui.segment
    [s/label {:soda {:type :bottom-attached}} "CSS"]
    [h/fake-content]]

   [:div.ui.segment
    [s/label {:soda {:type :top-right-attached}} "Code"]
    [h/fake-content]]

   [:div.ui.segment
    [s/label {:soda {:type :top-left-attached}} "View"]
    [h/fake-content]]

   [:div.ui.segment
    [s/label {:soda {:type :bottom-left-attached}} "User View"]
    [h/fake-content]]

   [:div.ui.segment
    [s/label {:soda {:type :bottom-right-attached}} "Admin View"]
    [h/fake-content]]])

(defcard-doc
  "
### Attached
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
"
  (mkdn-pprint-source floating))

(defcard-rg
  [floating])
