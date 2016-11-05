(ns soda-ash.elements.label-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.content :as sco]
   [soda-ash.helpers :as h]
   [soda-ash.elements.label :as label]
   ))


(def list-keys
  (h/list-keys label/variations))

(defcard-doc
  (h/devcard-docs label/opts))

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
# Types"
  (h/list-types label/opts))


(defcard-doc
  "**Label**"
  "A label")

(defn type-default []
  [se/label
   [se/icon-mail]
   "label"])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg default
  [type-default])



(defcard-doc
  "**Image**"
  "A label can be formatted to emphasize an image")

(defn type-image []
  [se/label-image
   [se/image {:src "images/ubuntu.png"}]
   "label-image"])

(defcard-doc
  (mkdn-pprint-source type-image))

(defcard-rg image
  [type-image])



(defcard-doc
  "**Pointing**"
  "A label can point to content next to it")

(defn type-pointing []
  [:div
   [se/input {:data-ash [:fluid]}
    [:input {:type "text"}]]
   [se/label-pointing
    "label-pointing"]])

(defcard-doc
  (mkdn-pprint-source type-pointing))

(defcard-rg pointing
  [type-pointing])


(defn type-pointing-below []
  [:div
   [se/label-pointing-below
    "label-pointing-below"]
   [se/input {:data-ash [:fluid]}
    [:input {:type "text"}]]])

(defcard-doc
  (mkdn-pprint-source type-pointing-below))

(defcard-rg pointing-below
  [type-pointing-below])


(defn type-left-pointing []
  [:div
   [se/input
    [:input {:type "text"}]]
   [se/label-left-pointing
    "label-left-pointing"]])

(defcard-doc
  (mkdn-pprint-source type-left-pointing))

(defcard-rg left-pointing
  [type-left-pointing])


(defn type-right-pointing []
  [:div
   [se/label-right-pointing
    "label-right-pointing"]
   [se/input
    [:input {:type "text"}]]])

(defcard-doc
  (mkdn-pprint-source type-right-pointing))

(defcard-rg right-pointing
  [type-right-pointing])



(defcard-doc
  "**Corner**"
  "A label can position itself in the corner of an element."
  "*Note: A corner label must be positioned inside a container with
  `:position \"relative\"` to display properly. If a container is
  rounded you will need to add `:overflow \"hidden\"` to the container
  to produce a rounded label.*")

(defn type-left-corner []
  [:div {:style {:position "relative"}} ;; <-required
   [se/label-left-corner
    [se/icon-star]]
   [se/image {:data-ash [:medium]
              :src "images/ubuntu.png"}]])

(defcard-doc
  (mkdn-pprint-source type-left-corner))

(defcard-rg left-corner
  [type-left-corner])


(defn type-right-corner []
  [:div {:style {:position "relative"
                 :display  "inline-block"}}
   [se/image {:data-ash [:medium]
              :src "images/ubuntu.png"}]
   [se/label-right-corner
    [se/icon-star]]])

(defcard-doc
  (mkdn-pprint-source type-right-corner))

(defcard-rg right-corner
  [type-right-corner])



(defcard-doc
  "**Tag**"
  "A label can appear as a tag")

(defn type-tag []
  [:div
   [se/input
    [:input {:type "text"}]]
   [se/label-tag
    "label-tag"]])

(defcard-doc
  (mkdn-pprint-source type-tag))

(defcard-rg tag
  [type-tag])



(defcard-doc
  "**Ribbon**"
  "A label can appear as a ribbon attaching itself to an element")

(defn type-ribbon []
  [se/segment
   [se/label-ribbon {:data-ash [:blue]}
    "label-ribbon"]
   [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   ])

(defcard-doc
  (mkdn-pprint-source type-ribbon))

(defcard-rg ribbon
  [type-ribbon])


(defn type-right-ribbon []
  [se/segment
   [se/label-right-ribbon {:data-ash [:blue]}
    "label-right-ribbon"]
   [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   ])

(defcard-doc
  (mkdn-pprint-source type-right-ribbon))

(defcard-rg right-ribbon
  [type-right-ribbon])



(defcard-doc
  "**Attached**"
  "A label can attach to a content segment")

(defn type-top-attached []
  [se/segment
   [se/label-top-attached {:data-ash [:blue]}
    "label-top-attached"]
   [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   ])

(defcard-doc
  (mkdn-pprint-source type-top-attached))

(defcard-rg top-attached
  [type-top-attached])


(defn type-bottom-attached []
  [se/segment
   [se/label-bottom-attached {:data-ash [:blue]}
    "label-bottom-attached"]
   [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   ])

(defcard-doc
  (mkdn-pprint-source type-bottom-attached))

(defcard-rg bottom-attached
  [type-bottom-attached])


(defn type-top-right-attached []
  [se/segment
   [se/label-top-right-attached {:data-ash [:blue]}
    "label-top-right-attached"]
   [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   ])

(defcard-doc
  (mkdn-pprint-source type-top-right-attached))

(defcard-rg top-right-attached
  [type-top-right-attached])


(defn type-top-left-attached []
  [se/segment
   [se/label-top-left-attached {:data-ash [:blue]}
    "label-top-left-attached"]
   [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   ])

(defcard-doc
  (mkdn-pprint-source type-top-left-attached))

(defcard-rg top-left-attached
  [type-top-left-attached])


(defn type-bottom-right-attached []
  [se/segment
   [se/label-bottom-right-attached {:data-ash [:blue]}
    "label-bottom-right-attached"]
   [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   ])

(defcard-doc
  (mkdn-pprint-source type-bottom-right-attached))

(defcard-rg bottom-right-attached
  [type-bottom-right-attached])


(defn type-bottom-left-attached []
  [se/segment
   [se/label-bottom-left-attached {:data-ash [:blue]}
    "label-bottom-left-attached"]
   [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   ])

(defcard-doc
  (mkdn-pprint-source type-bottom-left-attached))

(defcard-rg bottom-left-attached
  [type-bottom-left-attached])



(defcard-doc
  "**Horizontal**"
  "A horizontal label is formatted to label content along-side it
  horizontally")

(defn type-horizontal []
  [:div
   [se/label-horizontal {:data-ash [:blue]}
    "label-horizontal"]
   "foo bar"
   ])

(defcard-doc
  (mkdn-pprint-source type-horizontal))

(defcard-rg horizontal
  [type-horizontal])



(defcard-doc
  "**Floating**"
  "A label can float above another element")

;; TODO: update when menu is ready
(defn type-floating []
  [:div.ui.compact.menu
   [sco/item-link
    [se/icon-mail]
    [se/label-floating {:data-ash [:red]}
     "22"]]
   [sco/item-link
    [se/icon-users]
    [se/label-floating {:data-ash [:teal]}
     "12"]]])

(defcard-doc
  (mkdn-pprint-source type-floating))

(defcard-rg floating
  [type-floating])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")

(defcard-doc
  "**Circular**"
  "A label can be circular"
  (list-keys "circular"))

(defn circular []
  [se/label {:data-ash [:circular
                   :green]}
   "1"])

(defcard-doc
  (mkdn-pprint-source circular))

(defcard-rg circular
  [circular])


(defn empty-circular []
  [se/label {:data-ash [:empty-circular
                   :green]}])

(defcard-doc
  (mkdn-pprint-source empty-circular))

(defcard-rg empty-circular
  [empty-circular])



(defcard-doc
  "**Basic**"
  "A label can reduce its complexity"
  (list-keys "basic"))

(defn basic []
  [se/label {:data-ash [:basic
                   :green]}
   "basic"])

(defcard-doc
  (mkdn-pprint-source basic))

(defcard-rg basic
  [basic])



(defcard-doc
  "**Colored**"
  "A label can have different colors"
  (list-keys "colored"))

(defn colored []
  [se/label {:data-ash [:red]}
   "red"])

(defcard-doc
  (mkdn-pprint-source colored))

(defcard-rg colored
  [:div
   [colored]
   [se/label {:data-ash [:orange]} "orange"]
   [se/label {:data-ash [:yellow]} "yellow"]
   [se/label {:data-ash [:olive]} "olive"]
   [se/label {:data-ash [:green]} "green"]
   [se/label {:data-ash [:teal]} "teal"]
   [se/label {:data-ash [:blue]} "blue"]
   [se/label {:data-ash [:violet]} "violet"]
   [se/label {:data-ash [:purple]} "purple"]
   [se/label {:data-ash [:pink]} "pink"]
   [se/label {:data-ash [:brown]} "brown"]
   [se/label {:data-ash [:grey]} "grey"]
   [se/label {:data-ash [:black]} "black"]])



(defcard-doc
  "**Size**"
  "A label can vary in size"
  (list-keys "size"))

(defn size []
  [se/label {:data-ash [:mini]}
   "mini"])

(defcard-doc
  (mkdn-pprint-source size))

(defcard-rg size
  [:div
   [size]
   [se/label {:data-ash [:tiny]} "tiny"]
   [se/label {:data-ash [:small]} "small"]
   [se/label {:data-ash [:medium]} "medium"]
   [se/label {:data-ash [:large]} "large"]
   [se/label {:data-ash [:big]} "big"]
   [se/label {:data-ash [:huge]} "huge"]
   [se/label {:data-ash [:massive]} "massive"]])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Contant

(defcard-doc
  "
---
# Content")


(defcard-doc
  "**Detail**"
  "A label can contain a detail")

(defn content-detail []
  [se/label
   "Dogs"
   [sco/detail
    "214"]])

(defcard-doc
  (mkdn-pprint-source content-detail))

(defcard-rg detail
  [content-detail])



(defcard-doc
  "**Icon**"
  "A label can include an icon")

(defn content-icon []
  [se/label
   [se/icon-star]
   "star"])

(defcard-doc
  (mkdn-pprint-source content-icon))

(defcard-rg icon
  [content-icon])



(defcard-doc
  "**Image**"
  "A label can include an image")

(defn content-image []
  [se/label
   [se/image {:data-ash [:avatar
                    :right-spaced]
              :src "images/gadfly.png"}]
   "Gadfly361"])

(defcard-doc
  (mkdn-pprint-source content-image))

(defcard-rg image
  [content-image])



(defcard-doc
  "**Link**"
  "A label can be a link or contain an item that links")

(defn content-link []
  [se/label
   [se/icon-mail]
   [sco/detail-link "View Mail"]
   ])

(defcard-doc
  (mkdn-pprint-source content-link))

(defcard-rg link
  [content-link])

;; Note: Currently not supporting label with an a tag
