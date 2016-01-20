(ns soda-ash.elements.list-card
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

# list

* **default tag** :div
* **:type** :bulleted | :bulleted-link | :link | :ordered | :ordered-link
* **variations**
    :aligned | :animated? | :celled? | :divided? | :horizontal? |
    :inverted? | :right-floated? | :relaxed | :selection? | :size

where

* **:aligned** :top | :middle | :bottom
* **:relaxed** :default | :very
* **:size** :default | :mini | :tiny | :small | :large | :big | :huge | :massive

---
")



;; ====================
;; TYPES

(defcard-doc
  "# TYPES")


;; List

(defn s-list []
  [s/s-list {}
   [:div.item "Apples"]
   [:div.item "Pears"]
   [:div.item "Oranges"]])

(defcard-doc
  "
### List

A list groups related content
"
  (mkdn-pprint-source s-list))

(defcard-rg
  [s-list])



;; List2

(defn s-list2 []
  [s/s-list {}
   [:div.item
    [s/icon {:soda {:icon :users}}]
    [:div.content "Semantic UI"]]

   [:div.item
    [s/icon {:soda {:icon :marker}}]
    [:div.content "New York, NY"]]

   [:div.item
    [s/icon {:soda {:icon :mail}}]
    [:div.content
     [:a {:href "mailto:jack@semantic-ui.com"}
      "jack@semantic-ui.com"]]]

   [:div.item
    [s/icon {:soda {:icon :linkify}}]
    [:div.content
     [:a {:href "http://www.semantic-ui.com"}
      "semantic-ui.com"]]]])

(defcard-doc
  (mkdn-pprint-source s-list2))

(defcard-rg
  [s-list2])


;; Bulleted

(defn s-bulleted []
  [s/s-list {:soda {:type :bulleted}}
   [:div.item "Gaining Access"]
   [:div.item "Inviting Friends"]
   [:div.item
    [:div "Benefits"]
    [:div.list ;; <-- Note: not the same as an s-list
     [:div.item "Use Anywhere"]
     [:div.item "Rebates"]
     [:div.item "Discounts"]]]
   [:div.item "Warranty"]])

(defcard-doc
"
### Bulleted

A list can mark items with a bullet
"
  (mkdn-pprint-source s-bulleted))

(defcard-rg
  [s-bulleted])


;; Bulleted2

(defn s-bulleted2 []
  [s/s-list {:soda {:tag :ul
                    :type :bulleted}}
   [:li "Gaining Access"]
   [:li "Inviting Friends"]
   [:li "Benefits"
    [:ul
     [:li "Use Anywhere"]
     [:li "Rebates"]
     [:li "Discounts"]]]
   [:li "Warranty"]])

(defcard-doc
"
For convenience, a simple bulleted list can also use `:ul` tag.
"
  (mkdn-pprint-source s-bulleted2))

(defcard-rg
  [s-bulleted2])



;; Ordered

(defn s-ordered []
  [s/s-list {:soda {:type :ordered}}
   [:div.item "Gaining Access"]
   [:div.item "Inviting Friends"]
   [:div.item
    [:div "Benefits"]
    [:div.list ;; <-- Note: not the same as an s-list
     [:div.item "Use Anywhere"]
     [:div.item "Rebates"]
     [:div.item "Discounts"]]]
   [:div.item "Warranty"]])

(defcard-doc
"
### Ordered

A list can be ordered numerically
"
  (mkdn-pprint-source s-ordered))

(defcard-rg
  [s-ordered])


;; Ordered2

(defn s-ordered2 []
  [s/s-list {:soda {:tag :ol
                    :type :ordered}}
   [:li "Gaining Access"]
   [:li "Inviting Friends"]
   [:li "Benefits"
    [:ol
     [:li "Use Anywhere"]
     [:li "Rebates"]
     [:li "Discounts"]]]
   [:li "Warranty"]])

(defcard-doc
"
An ordered list can also use the `:ol` tag
"
  (mkdn-pprint-source s-ordered2))

(defcard-rg
  [s-ordered2])


;; Ordered3

(defn s-ordered3 []
  [s/s-list {:soda {:tag :ol
                    :type :ordered}}
   [:li {:value "*"} "Gaining Access"]
   [:li {:value "*"} "Inviting Friends"]
   [:li {:value "*"} "Benefits"
    [:ol
     [:li {:value "-"} "Use Anywhere"]
     [:li {:value "-"} "Rebates"]
     [:li {:value "-"} "Discounts"]]]
   [:li {:value "*"} "Warranty"]])

(defcard-doc
"
You can also manually specify a value for an ordered list using `:data-value` on a `:div`, or `:value` on an `:li`.
"
  (mkdn-pprint-source s-ordered3))

(defcard-rg
  [s-ordered3])


;; Link

(defn s-link []
  [s/s-list {:soda {:type :link}}
   [:a.active.item "Home"]
   [:a.item "About"]
   [:a.item "Jobs"]
   [:a.item "Team"]])

(defcard-doc
"
### Link

A list can be specially formatted for navigation links
"
  (mkdn-pprint-source s-link))

(defcard-rg
  [s-link])



;; ====================
;; CONTENT

(defcard-doc
  "# CONTENT")


;; Item

(defn s-item []
  [s/s-list {}
   [:div.item "1"]
   [:div.item "2"]
   [:div.item "3"]])

(defcard-doc
"
### Item

A list item can contain a set of items
"
  (mkdn-pprint-source s-item))

(defcard-rg
  [s-item])


;; Icon

(defn s-icon []
  [s/s-list {}
   [:a.item
    [s/icon {:soda {:icon :help}}]
    [:div.content
     [:div.header "Floated Icon"]
     [:div.description
      "This text will always have a left margin to make sure it sits
      alongside your icon"]]]

   [:a.item
    [s/icon {:soda {:icon :right-triangle}}]
    [:div.content
     [:div.header "Icon Alignment"]
     [:div.description
      "Floated icons are by default top aligned. To have an icon top
      aligned try this example."]]]])

(defcard-doc
"
### Icon

A list item can contain an icon
"
  (mkdn-pprint-source s-icon))

(defcard-rg
  [s-icon])


;; Image

(defn s-image []
  [s/s-list {}
   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar2/small/rachel.png"}]
    [:div.content
     [s/header {} "Rachel"]
     [:div.description
      "Last seen watching "
      [:a [:b "Arrested Development"]]
      " just now."]]]

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar2/small/lindsay.png"}]
    [:div.content
     [s/header {} "Lindsay"]
     [:div.description
      "Last seen watching "
      [:a [:b "Bob's Burgers"]]
      " 10 hours ago."]]]])

(defcard-doc
"
### Image

A list item can contain an image
"
  (mkdn-pprint-source s-image))

(defcard-rg
  [s-image])


;; Link-content

(defn s-link-content []
  [s/s-list {}
   [:a.item "What is a FAQ?"]
   [:a.item "Who is our user?"]
   [:a.item "Where is our office located?"]])

(defcard-doc
"
### Link

A list can contain links
"
  (mkdn-pprint-source s-link-content))

(defcard-rg
  [s-link-content])


;; Link-content2

(defn s-link-content2 []
  [s/s-list {}
   [:div.item
    [:a.header "Header"]
    [:div.description
     "Click a link in our "
     [:a "description"]]]

   [:div.item
    [:a.header "Learn More"]
    [:div.description
     "Learn more about this site on "
     [:a "our FAQ page."]]]])

(defcard-doc
  (mkdn-pprint-source s-link-content2))

(defcard-rg
  [s-link-content2])


;; header

(defn s-header []
  [s/s-list {}
   [:div.item
    [:div.header "New York City"]
    "A lovely city"]

   [:div.item
    [:div.header "Chicago"]
    "Also quite a lovely city"]

   [:div.item
    [:div.header "Los Angeles"]
    "Sometimes can be a lovely city"]
   ])

(defcard-doc
"
### Header

A list item can contain a header
"
  (mkdn-pprint-source s-header))

(defcard-rg
  [s-header])


;; description

(defn s-description []
  [s/s-list {}
   [:div.item
    [s/icon {:soda {:icon :marker}}]
    [:div.content
     [:a.header "Krowlewski Jadlo"]
     [:div.description
      "Ad excellent polish restaurant, quick delivery and heart,
      filling mieals."]]]

   [:div.item
    [s/icon {:soda {:icon :marker}}]
    [:div.content
     [:a.header "Xian Famous Foods"]
     [:div.description
      "A taste of Shaanxi's delicious culinary traditions, with
      delights like spicy cold noodles and lamb burgers."]]]])

(defcard-doc
"
### Description

A list item can contain a description
"
  (mkdn-pprint-source s-description))

(defcard-rg
  [s-description])



;; ====================
;; VARIATIONS

(defcard-doc
  "# VARIATIONS")


;; Horizontal

(defn s-horizontal []
  [s/s-list {:soda {:horizontal? true}}
   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/tom.jpg"}]
    [:div.content
     [:div.header "Tom"]
     "Top Contributor"]]

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/christian.jpg"}]
    [:div.content
     [:div.header "Christian Rocha"]
     "Admin"]]

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/matt.jpg"}]
    [:div.content
     [:div.header "Matt"]
     "Top Rated User"]]])

(defcard-doc
  "
### Horizontal

A list can be formatted to have items appear horizontally
"
  (mkdn-pprint-source s-horizontal))

(defcard-rg
  [s-horizontal])


;; Ordered-Horizontal

(defn s-ordered-horizontal []
  [s/s-list {:soda {:type :ordered
                    :horizontal? true}}
   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/tom.jpg"}]
    [:div.content
     [:div.header "Tom"]
     "Top Contributor"]]

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/christian.jpg"}]
    [:div.content
     [:div.header "Christian Rocha"]
     "Admin"]]

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/matt.jpg"}]
    [:div.content
     [:div.header "Matt"]
     "Top Rated User"]]])

(defcard-doc
  "
### Ordered Horizontal
"
  (mkdn-pprint-source s-ordered-horizontal))

(defcard-rg
  [s-ordered-horizontal])


;; Inverted

(defn s-inverted []
  [s/segment {:soda {:inverted? true}}
   [s/s-list {:soda {:inverted? true
                     :divided? true
                     :relaxed :default}}
    [:div.item
     [:div.content
      [:div.header "Snickerdoodle"]
      "An excellent companion"]]

    [:div.item
     [:div.content
      [:div.header "Poodle"]
      "A poodle, its pretty basic"]]

    [:div.item
     [:div.content
      [:div.header "Paulo"]
      "He's alsa a dog"]]]])

(defcard-doc
  "
### Inverted

A list can be inverted to appear on a dark background
"
  (mkdn-pprint-source s-inverted))

(defcard-rg
  [s-inverted])


;; Selection

(defn s-selection []
  [s/s-list {:soda {:selection? true}}
   [:div.item
    [:div.content
     [:div.header "Snickerdoodle"]
     "An excellent companion"]]

   [:div.item
    [:div.content
     [:div.header "Poodle"]
     "A poodle, its pretty basic"]]

   [:div.item
    [:div.content
     [:div.header "Paulo"]
     "He's alsa a dog"]]])

(defcard-doc
  "
### Selection

A selection list formats list items as possible choices
"
  (mkdn-pprint-source s-selection))

(defcard-rg
  [s-selection])


;; Animated

(defn s-animated []
  [s/s-list {:soda {:animated? true}}

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/tom.jpg"}]
    [:div.content
     [:div.header "Tom"]
     "Top Contributor"]]

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/christian.jpg"}]
    [:div.content
     [:div.header "Christian Rocha"]
     "Admin"]]

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/matt.jpg"}]
    [:div.content
     [:div.header "Matt"]
     "Top Rated User"]]])

(defcard-doc
  "
### Animated

A list can animate to set the current item apart from the list

Notes:

* Be sure content can fit on one line when using the animated variation, otherwise text content will reflow when hovered.
"
  (mkdn-pprint-source s-animated))

(defcard-rg
  [s-animated])


;; Relaxed

(defn s-relaxed []
  [s/s-list {:soda {:relaxed :default}}

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/tom.jpg"}]
    [:div.content
     [:div.header "Tom"]
     "Top Contributor"]]

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/christian.jpg"}]
    [:div.content
     [:div.header "Christian Rocha"]
     "Admin"]]

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/matt.jpg"}]
    [:div.content
     [:div.header "Matt"]
     "Top Rated User"]]])

(defcard-doc
  "
### Relaxed

A list can relax its padding to provide more negative space

Notes:

* Be sure content can fit on one line when using the relaxed variation, otherwise text content will reflow when hovered.
"
  (mkdn-pprint-source s-relaxed))

(defcard-rg
  [s-relaxed])


;; Very-Relaxed

(defn s-very-relaxed []
  [s/s-list {:soda {:relaxed :very}}

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/tom.jpg"}]
    [:div.content
     [:div.header "Tom"]
     "Top Contributor"]]

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/christian.jpg"}]
    [:div.content
     [:div.header "Christian Rocha"]
     "Admin"]]

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/matt.jpg"}]
    [:div.content
     [:div.header "Matt"]
     "Top Rated User"]]])

(defcard-doc
  "
### Very Relaxed
"
  (mkdn-pprint-source s-very-relaxed))

(defcard-rg
  [s-very-relaxed])


;; Divided

(defn s-divided []
  [s/s-list {:soda {:divided? true}}

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/tom.jpg"}]
    [:div.content
     [:div.header "Tom"]
     "Top Contributor"]]

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/christian.jpg"}]
    [:div.content
     [:div.header "Christian Rocha"]
     "Admin"]]

   [:div.item
    [s/image {:soda {:avatar? true}
              :src "images/avatar/small/matt.jpg"}]
    [:div.content
     [:div.header "Matt"]
     "Top Rated User"]]])

(defcard-doc
  "
### Divided

A list can show divisions between content
"
  (mkdn-pprint-source s-divided))

(defcard-rg
  [s-divided])


;; Celled

(defn s-celled []
  [s/s-list {:soda {:horizontal? true
                    :celled? true}}
   [:div.item "About Us"]
   [:div.item "Contact"]
   [:div.item "Support"]])

(defcard-doc
  "
### Celled

A list can divide its items into cells
"
  (mkdn-pprint-source s-celled))

(defcard-rg
  [s-celled])


;; Size

(defn s-size []
  [:div
   [s/s-list {:soda {:horizontal? true
                     :size :mini}}
    [:div.item "About Us"]
    [:div.item "Contact"]
    [:div.item "Support"]]

   [s/divider {}]

   [s/s-list {:soda {:horizontal? true
                     :size :tiny}}
    [:div.item "About Us"]
    [:div.item "Contact"]
    [:div.item "Support"]]

   [s/divider {}]

   [s/s-list {:soda {:horizontal? true
                     :size :small}}
    [:div.item "About Us"]
    [:div.item "Contact"]
    [:div.item "Support"]]

   [s/divider {}]

   [s/s-list {:soda {:horizontal? true
                     :size :default}}
    [:div.item "About Us"]
    [:div.item "Contact"]
    [:div.item "Support"]]

   [s/divider {}]

   [s/s-list {:soda {:horizontal? true
                     :size :large}}
    [:div.item "About Us"]
    [:div.item "Contact"]
    [:div.item "Support"]]

   [s/divider {}]

   [s/s-list {:soda {:horizontal? true
                     :size :big}}
    [:div.item "About Us"]
    [:div.item "Contact"]
    [:div.item "Support"]]

   [s/divider {}]

   [s/s-list {:soda {:horizontal? true
                     :size :huge}}
    [:div.item "About Us"]
    [:div.item "Contact"]
    [:div.item "Support"]]

   [s/divider {}]

   [s/s-list {:soda {:horizontal? true
                     :size :massive}}
    [:div.item "About Us"]
    [:div.item "Contact"]
    [:div.item "Support"]]])

(defcard-doc
  "
### Size

A list can vary in size
"
  (mkdn-pprint-source s-size))

(defcard-rg
  [s-size])



;; ====================
;; CONTENT VARIATIONS

(defcard-doc
  "# CONTENT VARIATIONS")


;; Aligned

(defn s-aligned []
   [s/s-list {:soda {:horizontal? true}}
    [:div.item
     [s/image {:soda {:avatar? true}
               :src "images/wireframe/square-image.png"}]
     [:div.top.aligned.content
      "Top Aligned"]]

    [:div.item
     [s/image {:soda {:avatar? true}
               :src "images/wireframe/square-image.png"}]
     [:div.middle.aligned.content
      "Middle Aligned"]]

    [:div.item
     [s/image {:soda {:avatar? true}
               :src "images/wireframe/square-image.png"}]
     [:div.bottom.aligned.content
      "Bottom Aligned"]]])

(defcard-doc
  "
### Vertically Aligned

An element inside a list can be vertically aligned
"
  (mkdn-pprint-source s-aligned))

(defcard-rg
  [s-aligned])


;; Floated

(defn s-floated []
  [:div
   [s/s-list {:soda {:horizontal? true
                     :right-floated? true}}
    [:div.disabled.item {:href "#"}]
    "© GitHub, Inc."
    [:a.item {:href "#"} "Terms"]
    [:a.item {:href "#"} "Privacy"]
    [:a.item {:href "#"} "Contact"]]

   [s/s-list {:soda {:horizontal? true}}
    [:a.item {:href "#"} "About Us"]
    [:a.item {:href "#"} "Jobs"]]])

(defcard-doc
  "
### Floated

An list, or an element inside a list can be floated left or right
"
  (mkdn-pprint-source s-floated))

(defcard-rg
  [s-floated])
