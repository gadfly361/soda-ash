(ns soda-ash.elements.label-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.core :as sa]
   [soda-ash.helpers :as h]
   [soda-ash.elements.label :as label]
   [soda-ash.elements.labels :as labels]
   ))


(def list-keys
  (h/list-keys label/groups))

(def list-labels-keys
  (h/list-keys labels/groups))


(defcard-doc
  "# SUMMARY FOR LABEL"
  "## Types"
  (h/list-types label/types "label")

  "## Variations (*ash*)"
  "### Circular"
  (list-keys "circular")
  "### Basic"
  (list-keys "basic")
  "### Colored"
  (list-keys "colored")
  "### Size"
  (list-keys "size")

  "## Content"
  "### detail"
  "use .detail class"
  "### icon"
  "use sa/icon"
  "### image"
  "use sa/image"
  "### link"
  "use .detail class on an a tag"
  )

(defcard-doc
  "# SUMMARY FOR LABELS"
  "## Types"
  (h/list-types labels/types "labels")

  "## Variations (*ash*)"
  "### Colored"
  (list-labels-keys "colored")
  "### Size"
  (list-labels-keys "size")
  )



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Label
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Label Types

(defcard-doc
  "
---
# Label Types"
  (h/list-types label/types "label" true)
  )

(defn type-default []
  [sa/label
   [sa/icon-mail]
   "label"])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])


(defn type-image []
  [sa/label-image
   [sa/image {:src "/images/ubuntu.png"}]
   "label-image"])

(defcard-doc
  (mkdn-pprint-source type-image))

(defcard-rg
  [type-image])


(defn type-pointing []
  [:div
   [sa/input {:ash [:fluid]}
    [:input {:type "text"}]]
   [sa/label-pointing
    "label-pointing"]])

(defcard-doc
  (mkdn-pprint-source type-pointing))

(defcard-rg
  [type-pointing])


(defn type-pointing-below []
  [:div
   [sa/label-pointing-below
    "label-pointing-below"]
   [sa/input {:ash [:fluid]}
    [:input {:type "text"}]]])

(defcard-doc
  (mkdn-pprint-source type-pointing-below))

(defcard-rg
  [type-pointing-below])


(defn type-left-pointing []
  [:div
   [sa/input
    [:input {:type "text"}]]
   [sa/label-left-pointing
    "label-left-pointing"]])

(defcard-doc
  (mkdn-pprint-source type-left-pointing))

(defcard-rg
  [type-left-pointing])


(defn type-right-pointing []
  [:div
   [sa/label-right-pointing
    "label-right-pointing"]
   [sa/input
    [:input {:type "text"}]]])

(defcard-doc
  (mkdn-pprint-source type-right-pointing))

(defcard-rg
  [type-right-pointing])


(defn type-left-corner []
  [:div {:style {:position "relative"}}
   [sa/label-left-corner
    [sa/icon-star]]
   [sa/image {:ash [:medium]
              :src "/images/ubuntu.png"}]])

(defcard-doc
  (mkdn-pprint-source type-left-corner))

(defcard-rg
  [type-left-corner])


(defn type-right-corner []
  [:div {:style {:position "relative"
                 :display  "inline-block"}}
   [sa/image {:ash [:medium]
              :src "/images/ubuntu.png"}]
   [sa/label-right-corner
    [sa/icon-star]]])

(defcard-doc
  (mkdn-pprint-source type-right-corner))

(defcard-rg
  [type-right-corner])


(defn type-tag []
  [:div
   [sa/input
    [:input {:type "text"}]]
   [sa/label-tag
    "label-tag"]])

(defcard-doc
  (mkdn-pprint-source type-tag))

(defcard-rg
  [type-tag])



(defn type-ribbon []
  [sa/segment
   [sa/label-ribbon {:ash [:blue]}
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
  [sa/segment
   [sa/label-right-ribbon {:ash [:blue]}
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
  [sa/segment
   [sa/label-top-attached {:ash [:blue]}
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
  [sa/segment
   [sa/label-bottom-attached {:ash [:blue]}
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
  [sa/segment
   [sa/label-top-right-attached {:ash [:blue]}
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
  [sa/segment
   [sa/label-top-left-attached {:ash [:blue]}
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
  [sa/segment
   [sa/label-bottom-right-attached {:ash [:blue]}
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
  [sa/segment
   [sa/label-bottom-left-attached {:ash [:blue]}
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
   [sa/label-horizontal {:ash [:blue]}
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
   [:a.item
    [sa/icon-mail]
    [sa/label-floating {:ash [:red]}
     "22"]]
   [:a.item
    [sa/icon-users]
    [sa/label-floating {:ash [:teal]}
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
  [sa/label {:ash [:circular
                   :green]}
   "1"])

(defcard-doc
  (mkdn-pprint-source circular))

(defcard-rg
  [circular])


(defn empty-circular []
  [sa/label {:ash [:empty-circular
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
  [sa/label {:ash [:basic
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
  [sa/label {:ash [:red]}
   "red"])

(defcard-doc
  (mkdn-pprint-source colored))

(defcard-rg
  [:div
   [colored]
   [sa/label {:ash [:orange]} "orange"]
   [sa/label {:ash [:yellow]} "yellow"]
   [sa/label {:ash [:olive]} "olive"]
   [sa/label {:ash [:green]} "green"]
   [sa/label {:ash [:teal]} "teal"]
   [sa/label {:ash [:blue]} "blue"]
   [sa/label {:ash [:violet]} "violet"]
   [sa/label {:ash [:purple]} "purple"]
   [sa/label {:ash [:pink]} "pink"]
   [sa/label {:ash [:brown]} "brown"]
   [sa/label {:ash [:grey]} "grey"]
   [sa/label {:ash [:black]} "black"]])


;; --------------------------
;; size

(defcard-doc
  "## size"
  (list-keys "size"))

(defn size []
  [sa/label {:ash [:mini]}
   "mini"])

(defcard-doc
  (mkdn-pprint-source size))

(defcard-rg
  [:div
   [size]
   [sa/label {:ash [:tiny]} "tiny"]
   [sa/label {:ash [:small]} "small"]
   [sa/label {:ash [:medium]} "medium"]
   [sa/label {:ash [:large]} "large"]
   [sa/label {:ash [:big]} "big"]
   [sa/label {:ash [:huge]} "huge"]
   [sa/label {:ash [:massive]} "massive"]])


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Label Contant

(defcard-doc
  "
---
# Label Content")


;; ---------------------------
;; detail

(defcard-doc
  "## detail"
  "use .detail class")

(defn content-detail []
  [sa/label
   "Dogs"
   [:div.detail ;; <-- .detail
    "214"]])

(defcard-doc
  (mkdn-pprint-source content-detail))

(defcard-rg
  [content-detail])


;; ---------------------------
;; icon

(defcard-doc
  "## icon"
  "use sa/icon")

(defn content-icon []
  [sa/label
   [sa/icon-star]
   "star"])

(defcard-doc
  (mkdn-pprint-source content-icon))

(defcard-rg
  [content-icon])


;; ---------------------------
;; image

(defcard-doc
  "## image"
  "use sa/image")

(defn content-image []
  [sa/label
   [sa/image {:ash [:avatar
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
  "## link"
  "use .detail class on an a tag")

(defn content-link []
  [sa/label
   [sa/icon-mail]
   [:a.detail "View Mail"] ;; <-- .detail
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
  (h/list-types labels/types "labels" true)
  )

(defn labels-type-default []
  [sa/labels
   [sa/label "foo"]
   [sa/label "bar"]
   [sa/label "baz"]])

(defcard-doc
  (mkdn-pprint-source labels-type-default))

(defcard-rg
  [labels-type-default])


(defn labels-type-tag []
  [sa/labels-tag
   [sa/label "foo"]
   [sa/label "bar"]
   [sa/label "baz"]])

(defcard-doc
  (mkdn-pprint-source labels-type-tag))

(defcard-rg
  [labels-type-tag])


(defn labels-type-circular []
  [sa/labels-circular
   [sa/label "foo"]
   [sa/label "bar"]
   [sa/label "baz"]])

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
  [sa/labels-circular {:ash [:mini]}
   [sa/label "mini"]
   [sa/label "foo"]
   [sa/label "bar"]])

(defn labels-size [size]
  [sa/labels-circular {:ash [size]}
   [sa/label (name size)]
   [sa/label "foo"]
   [sa/label "bar"]])

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
  [sa/labels-circular {:ash [:red]}
   [sa/label "red"]
   [sa/label "foo"]
   [sa/label "bar"]])

(defn labels-colored [colored]
  [sa/labels-circular {:ash [colored]}
   [sa/label (name colored)]
   [sa/label "foo"]
   [sa/label "bar"]])

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
