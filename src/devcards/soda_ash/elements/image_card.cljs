(ns soda-ash.elements.image-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.helpers :as h]
   [soda-ash.elements.image :as image]))


(def list-keys
  (h/list-keys image/variations))

(defcard-doc
  (h/devcard-docs image/opts))

(defcard-doc
  "Require the following:
   ```
  [soda-ash.element :as se]
  ```")



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Image Types"
  (h/list-types image/opts))

(defcard-doc
  "**Image**"
  "An image")

(defn type-default []
  [se/image {:data-ash [:small]
             :src "images/gadfly.png"}])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg default
  [type-default])



(defcard-doc
  "**Image Link**"
  "An image can be formatted to link to other content")

(defn type-link []
  [:a {:href   "https://twitter.com/gadfly361"
       :target "_blank"}
   [se/image {:data-ash [:small]
              :src "images/gadfly.png"}]])

(defcard-doc
  (mkdn-pprint-source type-link))

(defcard-rg link
  [type-link])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# Image States"
  (list-keys "states"))

(defcard-doc
  "**Hidden**"
  "An image can be hidden")

(defn state-hidden []
  [se/image {:data-soda :hidden
             :data-ash  [:small]
             :src  "images/gadfly.png"}])

(defcard-doc
  (mkdn-pprint-source state-hidden))

(defcard-rg hidden
  [state-hidden])



(defcard-doc
  "**Disabled**"
  "An image can show that it is disabled and cannot be selected")

(defn state-disabled []
  [se/image {:data-soda :disabled
             :data-ash  [:small]
             :src  "images/gadfly.png"}])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg disabled
  [state-disabled])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Image Variations")

(defcard-doc
  "**Avatar**"
  "An image may be formatted to appear inline with text as an avatar"
  (list-keys "avatar"))

(defn avatar []
  [:div
   [se/image {:data-ash [:avatar]
              :src      "images/gadfly.png"}]
   [:span "Gadfly361"]])

(defcard-doc
  (mkdn-pprint-source avatar))

(defcard-rg avatar
  [avatar])



(defcard-doc
  "**Bordered**"
  "An image may include a border to emphasize the edges of white or
  transparent content"
  (list-keys "bordered"))

(defn bordered []
  [se/image {:data-ash [:small
                   :bordered]
             :src "images/gadfly.png"}])

(defcard-doc
  (mkdn-pprint-source bordered))

(defcard-rg bordered
  [bordered])



(defcard-doc
  "**Fluid**"
  "An image can take up the width of its container"
  (list-keys "fluid"))

(defn fluid []
  [:div
   ;; NORMAL
   [se/image {:src "images/ubuntu.png"}]

   [:div {:style {:margin-top "20px"}}]

   ;; FLUID (can take up the width of its container)
   [se/image {:data-ash [:fluid]
          :src "images/ubuntu.png"}]
   ])

(defcard-doc
  (mkdn-pprint-source fluid))

(defcard-rg fluid
  [fluid])



(defcard-doc
  "**Rounded**"
  "An image may appear rounded"
  (list-keys "rounded"))

(defn rounded []
  [se/image {:data-ash [:small
                   :rounded]
             :src "images/ubuntu.png"}])

(defcard-doc
  (mkdn-pprint-source rounded))

(defcard-rg rounded
  [rounded])



(defcard-doc
  "**Circular**"
  "An image may appear circular"
  (list-keys "circular"))

(defn circular []
  [se/image {:data-ash [:small
                   :circular]
             :src "images/ubuntu.png"}])

(defcard-doc
  (mkdn-pprint-source circular))

(defcard-rg circular
  [circular])



(defcard-doc
  "**Aligned**"
  "An image can specify its alignment"
  (list-keys "aligned"))

(defn aligned []
  [:div
    [se/image {:data-ash [:small
                    :top-aligned]
           :src "images/ubuntu.png"}]
   "Top Aligned"

   [se/divider]

    [se/image {:data-ash [:small
                    :middle-aligned]
           :src "images/ubuntu.png"}]
   "Middle Aligned"

   [se/divider]

    [se/image {:data-ash [:small
                    :bottom-aligned]
           :src "images/ubuntu.png"}]
   "Bottom Aligned"
   ])

(defcard-doc
  (mkdn-pprint-source aligned))

(defcard-rg aligned
  [aligned])



(defcard-doc
  "**Centered**"
  "An image can appear centered in a content block"
  (list-keys "centered"))

(defn centered []
  [:div
   [se/image {:data-ash [:small
                    :centered]
              :src "images/ubuntu.png"}]])

(defcard-doc
  (mkdn-pprint-source centered))

(defcard-rg centered
  [centered])



(defcard-doc
  "**Spaced**"
  "An image can specify that it needs an additional spacing to
  separate it from nearby content"
  (list-keys "spaced"))

(defn spaced []
  [:div
   [se/image {:data-ash [:mini
                    :right-spaced]
              :src "images/ubuntu.png"}]

   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/image {:data-ash [:mini
                    :spaced]
              :src "images/ubuntu.png"}]

   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/image {:data-ash [:mini
                    :left-spaced]
              :src "images/ubuntu.png"}]

   ])

(defcard-doc
  (mkdn-pprint-source spaced))

(defcard-rg spaced
  [spaced])



(defcard-doc
  "**Floated**"
  "An image can sit to the left or right of other content"
  (list-keys "floated"))

(defn floated []
  [:div
   [se/image {:data-ash [:small
                    :left-floated]
              :src "images/ubuntu.png"}]

   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [se/image {:data-ash [:small
                    :right-floated]
              :src "images/ubuntu.png"}]

   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source floated))

(defcard-rg floated
  [floated])



(defcard-doc
  "**Size**"
  "An image may appear at different sizes"
  (list-keys "size"))

(defn size []
  [:div
   [se/image {:data-ash [:mini]
              :src "images/ubuntu.png"}]])

(defcard-doc
  (mkdn-pprint-source size))

(defcard-rg size
  [:div
   "mini"
   [size]
   "tiny"
   [se/image {:data-ash [:tiny]
              :src "images/ubuntu.png"}]
   "small"
   [se/image {:data-ash [:small]
              :src "images/ubuntu.png"}]
   "medium"
   [se/image {:data-ash [:medium]
              :src "images/ubuntu.png"}]
   "large"
   [se/image {:data-ash [:large]
              :src "images/ubuntu.png"}]
   "big"
   [se/image {:data-ash [:big]
              :src "images/ubuntu.png"}]
   "huge"
   [se/image {:data-ash [:huge]
              :src "images/ubuntu.png"}]
   "massive"
   [se/image {:data-ash [:massive]
              :src "images/ubuntu.png"}]
   ])
