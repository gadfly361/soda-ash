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
   [soda-ash.elements.labels :as labels]
   ))


(def list-keys
  (h/list-keys label/variations))

(def list-labels-keys
  (h/list-keys labels/variations))


(defcard-doc
  (h/devcard-docs label/opts))

(defcard-doc
  (h/devcard-docs labels/opts))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Label
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Label Types

(defcard-doc
  "
---
# Label Types"
  (h/list-types label/opts))

(defn type-default []
  [se/label
   [se/icon-mail]
   "label"])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])


(defn type-image []
  [se/label-image
   [se/image {:src "/images/ubuntu.png"}]
   "label-image"])

(defcard-doc
  (mkdn-pprint-source type-image))

(defcard-rg
  [type-image])


(defn type-pointing []
  [:div
   [se/input {:ash [:fluid]}
    [:input {:type "text"}]]
   [se/label-pointing
    "label-pointing"]])

(defcard-doc
  (mkdn-pprint-source type-pointing))

(defcard-rg
  [type-pointing])


(defn type-pointing-below []
  [:div
   [se/label-pointing-below
    "label-pointing-below"]
   [se/input {:ash [:fluid]}
    [:input {:type "text"}]]])

(defcard-doc
  (mkdn-pprint-source type-pointing-below))

(defcard-rg
  [type-pointing-below])


(defn type-left-pointing []
  [:div
   [se/input
    [:input {:type "text"}]]
   [se/label-left-pointing
    "label-left-pointing"]])

(defcard-doc
  (mkdn-pprint-source type-left-pointing))

(defcard-rg
  [type-left-pointing])


(defn type-right-pointing []
  [:div
   [se/label-right-pointing
    "label-right-pointing"]
   [se/input
    [:input {:type "text"}]]])

(defcard-doc
  (mkdn-pprint-source type-right-pointing))

(defcard-rg
  [type-right-pointing])


(defn type-left-corner []
  [:div {:style {:position "relative"}}
   [se/label-left-corner
    [se/icon-star]]
   [se/image {:ash [:medium]
              :src "/images/ubuntu.png"}]])

(defcard-doc
  (mkdn-pprint-source type-left-corner))

(defcard-rg
  [type-left-corner])


(defn type-right-corner []
  [:div {:style {:position "relative"
                 :display  "inline-block"}}
   [se/image {:ash [:medium]
              :src "/images/ubuntu.png"}]
   [se/label-right-corner
    [se/icon-star]]])

(defcard-doc
  (mkdn-pprint-source type-right-corner))

(defcard-rg
  [type-right-corner])


(defn type-tag []
  [:div
   [se/input
    [:input {:type "text"}]]
   [se/label-tag
    "label-tag"]])

(defcard-doc
  (mkdn-pprint-source type-tag))

(defcard-rg
  [type-tag])



(defn type-ribbon []
  [se/segment
   [se/label-ribbon {:ash [:blue]}
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

(defcard-rg
  [type-ribbon])


(defn type-right-ribbon []
  [se/segment
   [se/label-right-ribbon {:ash [:blue]}
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

(defcard-rg
  [type-right-ribbon])


(defn type-top-attached []
  [se/segment
   [se/label-top-attached {:ash [:blue]}
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

(defcard-rg
  [type-top-attached])


(defn type-bottom-attached []
  [se/segment
   [se/label-bottom-attached {:ash [:blue]}
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

(defcard-rg
  [type-bottom-attached])


(defn type-top-right-attached []
  [se/segment
   [se/label-top-right-attached {:ash [:blue]}
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

(defcard-rg
  [type-top-right-attached])


(defn type-top-left-attached []
  [se/segment
   [se/label-top-left-attached {:ash [:blue]}
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

(defcard-rg
  [type-top-left-attached])


(defn type-bottom-right-attached []
  [se/segment
   [se/label-bottom-right-attached {:ash [:blue]}
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

(defcard-rg
  [type-bottom-right-attached])


(defn type-bottom-left-attached []
  [se/segment
   [se/label-bottom-left-attached {:ash [:blue]}
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

(defcard-rg
  [type-bottom-left-attached])


(defn type-horizontal []
  [:div
   [se/label-horizontal {:ash [:blue]}
    "label-horizontal"]
   "foo bar"
   ])

(defcard-doc
  (mkdn-pprint-source type-horizontal))

(defcard-rg
  [type-horizontal])


;; TODO: update when menu is ready
(defn type-floating []
  [:div.ui.compact.menu
   [sco/item-link
    [se/icon-mail]
    [se/label-floating {:ash [:red]}
     "22"]]
   [sco/item-link
    [se/icon-users]
    [se/label-floating {:ash [:teal]}
     "12"]]])

(defcard-doc
  (mkdn-pprint-source type-floating))

(defcard-rg
  [type-floating])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Label Variations

(defcard-doc
  "
---
# Label Variations")

;; --------------------------
;; circular

(defcard-doc
  "## circular"
  (list-keys "circular"))

(defn circular []
  [se/label {:ash [:circular
                   :green]}
   "1"])

(defcard-doc
  (mkdn-pprint-source circular))

(defcard-rg
  [circular])


(defn empty-circular []
  [se/label {:ash [:empty-circular
                   :green]}])

(defcard-doc
  (mkdn-pprint-source empty-circular))

(defcard-rg
  [empty-circular])


;; --------------------------
;; basic

(defcard-doc
  "## basic"
  (list-keys "basic"))

(defn basic []
  [se/label {:ash [:basic
                   :green]}
   "basic"])

(defcard-doc
  (mkdn-pprint-source basic))

(defcard-rg
  [basic])


;; --------------------------
;; colored

(defcard-doc
  "## colored"
  (list-keys "colored"))

(defn colored []
  [se/label {:ash [:red]}
   "red"])

(defcard-doc
  (mkdn-pprint-source colored))

(defcard-rg
  [:div
   [colored]
   [se/label {:ash [:orange]} "orange"]
   [se/label {:ash [:yellow]} "yellow"]
   [se/label {:ash [:olive]} "olive"]
   [se/label {:ash [:green]} "green"]
   [se/label {:ash [:teal]} "teal"]
   [se/label {:ash [:blue]} "blue"]
   [se/label {:ash [:violet]} "violet"]
   [se/label {:ash [:purple]} "purple"]
   [se/label {:ash [:pink]} "pink"]
   [se/label {:ash [:brown]} "brown"]
   [se/label {:ash [:grey]} "grey"]
   [se/label {:ash [:black]} "black"]])


;; --------------------------
;; size

(defcard-doc
  "## size"
  (list-keys "size"))

(defn size []
  [se/label {:ash [:mini]}
   "mini"])

(defcard-doc
  (mkdn-pprint-source size))

(defcard-rg
  [:div
   [size]
   [se/label {:ash [:tiny]} "tiny"]
   [se/label {:ash [:small]} "small"]
   [se/label {:ash [:medium]} "medium"]
   [se/label {:ash [:large]} "large"]
   [se/label {:ash [:big]} "big"]
   [se/label {:ash [:huge]} "huge"]
   [se/label {:ash [:massive]} "massive"]])


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Label Contant

(defcard-doc
  "
---
# Label Content")


;; ---------------------------
;; detail

(defcard-doc
  "## detail")

(defn content-detail []
  [se/label
   "Dogs"
   [sco/detail
    "214"]])

(defcard-doc
  (mkdn-pprint-source content-detail))

(defcard-rg
  [content-detail])


;; ---------------------------
;; icon

(defcard-doc
  "## icon")

(defn content-icon []
  [se/label
   [se/icon-star]
   "star"])

(defcard-doc
  (mkdn-pprint-source content-icon))

(defcard-rg
  [content-icon])


;; ---------------------------
;; image

(defcard-doc
  "## image")

(defn content-image []
  [se/label
   [se/image {:ash [:avatar
                    :right-spaced]
              :src "/images/gadfly.png"}]
   "Gadfly361"])

(defcard-doc
  (mkdn-pprint-source content-image))

(defcard-rg
  [content-image])


;; ---------------------------
;; link

(defcard-doc
  "## link")

(defn content-link []
  [se/label
   [se/icon-mail]
   [sco/detail-link "View Mail"]
   ])

(defcard-doc
  (mkdn-pprint-source content-link))

(defcard-rg
  [content-link])

;; Note: Currently not supporting label with an a tag



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Labels
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Labels Types

(defcard-doc
  "
---
# Labels Types"
  (h/list-types labels/opts))

(defn labels-type-default []
  [se/labels
   [se/label "foo"]
   [se/label "bar"]
   [se/label "baz"]])

(defcard-doc
  (mkdn-pprint-source labels-type-default))

(defcard-rg
  [labels-type-default])


(defn labels-type-tag []
  [se/labels-tag
   [se/label "foo"]
   [se/label "bar"]
   [se/label "baz"]])

(defcard-doc
  (mkdn-pprint-source labels-type-tag))

(defcard-rg
  [labels-type-tag])


(defn labels-type-circular []
  [se/labels-circular
   [se/label "foo"]
   [se/label "bar"]
   [se/label "baz"]])

(defcard-doc
  (mkdn-pprint-source labels-type-circular))

(defcard-rg
  [labels-type-circular])


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Labels Variations

(defcard-doc
  "
---
# Labels Variations")

;; --------------------------
;; size

(defcard-doc
  "## size"
  (list-labels-keys "size"))

(defn labels-mini []
  [se/labels-circular {:ash [:mini]}
   [se/label "mini"]
   [se/label "foo"]
   [se/label "bar"]])

(defn labels-size [size]
  [se/labels-circular {:ash [size]}
   [se/label (name size)]
   [se/label "foo"]
   [se/label "bar"]])

(defcard-doc
  (mkdn-pprint-source labels-mini))

(defcard-rg
  [:div
   [labels-mini]
   [labels-size :tiny]
   [labels-size :small]
   [labels-size :medium]
   [labels-size :large]
   [labels-size :big]
   [labels-size :huge]
   [labels-size :massive]])



;; --------------------------
;; colored

(defcard-doc
  "## colored"
  (list-labels-keys "colored"))

(defn labels-red []
  [se/labels-circular {:ash [:red]}
   [se/label "red"]
   [se/label "foo"]
   [se/label "bar"]])

(defn labels-colored [colored]
  [se/labels-circular {:ash [colored]}
   [se/label (name colored)]
   [se/label "foo"]
   [se/label "bar"]])

(defcard-doc
  (mkdn-pprint-source labels-red))

(defcard-rg
  [:div
   [labels-red]
   [labels-colored :orange]
   [labels-colored :yellow]
   [labels-colored :olive]
   [labels-colored :green]
   [labels-colored :teal]
   [labels-colored :blue]
   [labels-colored :violet]
   [labels-colored :purple]
   [labels-colored :pink]
   [labels-colored :brown]
   [labels-colored :grey]
   [labels-colored :black]
   ])
