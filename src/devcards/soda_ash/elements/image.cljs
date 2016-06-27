(ns soda-ash.elements.image-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.core :as sa]
   [soda-ash.helpers :as h]
   [soda-ash.elements.image :as image]))


(def list-keys
  (h/list-keys image/groups))


(defcard-doc
  "# SUMMARY"

  "## States (*soda*)"
  (list-keys "states")

  "## Variations (*ash*)"
  "### avatar"
  (list-keys "avatar")
  "### bordered"
  (list-keys "bordered")
  "### fluid"
  (list-keys "fluid")
  "### rounded"
  (list-keys "rounded")
  "### circular"
  (list-keys "circular")
  "### aligned"
  (list-keys "aligned")
  "### centered"
  (list-keys "centered")
  "### spaced"
  (list-keys "spaced")
  "### floated"
  (list-keys "floated")
  "### size"
  (list-keys "size")
  )



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types")

(defn type-default []
  [sa/image {:ash [:small]
             :src "/images/gadfly.png"}])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])


(defn type-link []
  [:a {:href   "https://twitter.com/gadfly361"
       :target "_blank"}
   [sa/image {:ash [:small]
              :src "/images/gadfly.png"}]])

(defcard-doc
  (mkdn-pprint-source type-link))

(defcard-rg
  [type-link])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# States"
  (list-keys "states"))

(defn state-hidden []
  [sa/image {:soda :hidden
             :ash  [:small]
             :src  "/images/gadfly.png"}])

(defcard-doc
  (mkdn-pprint-source state-hidden))

(defcard-rg
  [state-hidden])


(defn state-disabled []
  [sa/image {:soda :disabled
             :ash  [:small]
             :src  "/images/gadfly.png"}])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg
  [state-disabled])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")

;; --------------------------
;; avatar

(defcard-doc
  "## avatar"
  (list-keys "avatar"))

(defn avatar []
  [sa/image {:ash [:avatar]
             :src "/images/gadfly.png"}])

(defcard-doc
  (mkdn-pprint-source avatar))

(defcard-rg
  [avatar])


;; --------------------------
;; bordered

(defcard-doc
  "## bordered"
  (list-keys "bordered"))

(defn bordered []
  [sa/image {:ash [:small
                   :bordered]
             :src "/images/gadfly.png"}])

(defcard-doc
  (mkdn-pprint-source bordered))

(defcard-rg
  [bordered])


;; --------------------------
;; fluid

(defcard-doc
  "## fluid"
  (list-keys "fluid"))

(defn fluid []
  [:div
   ;; NORMAL
   [sa/image {:src "/images/ubuntu.png"}]

   [:div {:style {:margin-top "20px"}}]

   ;; FLUID (can take up the width of its container)
   [sa/image {:ash [:fluid]
          :src "/images/ubuntu.png"}]
   ])

(defcard-doc
  (mkdn-pprint-source fluid))

(defcard-rg
  [fluid])


;; --------------------------
;; rounded

(defcard-doc
  "## rounded"
  (list-keys "rounded"))

(defn rounded []
  [sa/image {:ash [:small
                   :rounded]
             :src "/images/ubuntu.png"}])

(defcard-doc
  (mkdn-pprint-source rounded))

(defcard-rg
  [rounded])


;; --------------------------
;; circular

(defcard-doc
  "## circular"
  (list-keys "circular"))

(defn circular []
  [sa/image {:ash [:small
                   :circular]
             :src "/images/ubuntu.png"}])

(defcard-doc
  (mkdn-pprint-source circular))

(defcard-rg
  [circular])


;; --------------------------
;; aligned

(defcard-doc
  "## aligned"
  (list-keys "aligned"))

(defn aligned []
  [:div
    [sa/image {:ash [:small
                    :top-aligned]
           :src "/images/ubuntu.png"}]
   "Top Aligned"

   [sa/divider]

    [sa/image {:ash [:small
                    :middle-aligned]
           :src "/images/ubuntu.png"}]
   "Middle Aligned"

   [sa/divider]

    [sa/image {:ash [:small
                    :bottom-aligned]
           :src "/images/ubuntu.png"}]
   "Bottom Aligned"
   ])

(defcard-doc
  (mkdn-pprint-source aligned))

(defcard-rg
  [aligned])


;; --------------------------
;; centered

(defcard-doc
  "## centered"
  (list-keys "centered"))

(defn centered []
  [:div
   [sa/image {:ash [:small
                    :centered]
              :src "/images/ubuntu.png"}]])

(defcard-doc
  (mkdn-pprint-source centered))

(defcard-rg
  [centered])


;; --------------------------
;; spaced

(defcard-doc
  "## spaced"
  (list-keys "spaced"))

(defn spaced []
  [:div
   [sa/image {:ash [:tiny
                    :spaced]
              :src "/images/ubuntu.png"}]

   "foo bar baz"

   [sa/image {:ash [:tiny
                    :spaced]
              :src "/images/ubuntu.png"}]

   "foo bar baz"

   [sa/image {:ash [:tiny
                    :spaced]
              :src "/images/ubuntu.png"}]

   ])

(defcard-doc
  (mkdn-pprint-source spaced))

(defcard-rg
  [spaced])


;; --------------------------
;; floated

(defcard-doc
  "## floated"
  (list-keys "floated"))

(defn floated []
  [:div
   [sa/image {:ash [:small
                    :left-floated]
              :src "/images/ubuntu.png"}]

   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [sa/image {:ash [:small
                    :right-floated]
              :src "/images/ubuntu.png"}]

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

(defcard-rg
  [floated])


;; --------------------------
;; size

(defcard-doc
  "## size"
  (list-keys "size"))

(defn size []
  [:div
   [sa/image {:ash [:mini]
              :src "/images/ubuntu.png"}]])

(defcard-doc
  (mkdn-pprint-source size))

(defcard-rg
  [:div
   "mini"
   [size]
   "tiny"
   [sa/image {:ash [:tiny]
              :src "/images/ubuntu.png"}]
   "small"
   [sa/image {:ash [:small]
              :src "/images/ubuntu.png"}]
   "medium"
   [sa/image {:ash [:medium]
              :src "/images/ubuntu.png"}]
   "large"
   [sa/image {:ash [:large]
              :src "/images/ubuntu.png"}]
   "big"
   [sa/image {:ash [:big]
              :src "/images/ubuntu.png"}]
   "huge"
   [sa/image {:ash [:huge]
              :src "/images/ubuntu.png"}]
   "massive"
   [sa/image {:ash [:massive]
              :src "/images/ubuntu.png"}]
   ])
