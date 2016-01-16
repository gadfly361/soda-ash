(ns soda-ash.elements.image-card
  (:require-macros [devcards.core
                    :as dc
                    :refer [defcard-rg defcard-doc mkdn-pprint-source]])
  (:require [reagent.core :as reagent]
            [devcards.core]
            [soda-ash.elements.image :as image]
            [soda-ash.elements.card-helpers :as h]
            [soda-ash.element :as s]))



(defcard-doc
  "
[back](http://localhost:3449/#!/soda_ash.an_overview_card)

# image

* **default tag** :img
* **:state** :hidden | :disabled
* **variations**
    :aligned | :avatar? | :bordered? | :centered? |
    :circular? | :floated | :fluid? | :rounded? | :size |
    :spaced | :state

where

* **:aligned** :top | :middle | :bottom
* **:floated** :left | :right
* **:size** :mini | :tiny | :small | :medium | :large | :big | :huge | :massive
* **:spaced** :default | :left | :right
* **:state** :default | :hidden | :disabled

---
")



;; ====================
;; TYPES

(defcard-doc
  "# TYPES")


;; Image

(defn image []
  [s/image {:soda {:size :small}
            :src "/images/wireframe/image.png"}])

(defcard-doc
  "
### Image

An image
"
  (mkdn-pprint-source image))

(defcard-rg
  [image])


;; Image-Link

(defn image-link []
  [:a {:href "http://google.com"
       :target "_blank"}
   [s/image {:soda {:size :medium}
             :src "/images/wireframe/image.png"}]])

(defcard-doc
  "
### Image Link

An image can be formatted to link to other content
"
  (mkdn-pprint-source image-link))

(defcard-rg
  [image-link])



;; ====================
;; STATES

(defcard-doc
  "# STATES")


;; hidden

(defn hidden []
  [s/image {:soda {:state :hidden}
            :src "/images/wireframe/image.png"}])

(defcard-doc
  "
### Hidden

An image can be hidden
"
  (mkdn-pprint-source hidden))

(defcard-rg
  [hidden])


;; disabled

(defn disabled []
  [s/image {:soda {:state :disabled
                   :size :medium}
            :src "/images/wireframe/image.png"}])

(defcard-doc
  "
### Disabled

An image can show that it is disabled and cannot be selected
"
  (mkdn-pprint-source disabled))

(defcard-rg
  [disabled])



;; ====================
;; VARIATIONS

(defcard-doc
  "# VARIATIONS")


;; avatar

(defn avatar []
  [:div
  [s/image {:soda {:avatar? true}
            :src "/images/wireframe/image.png"}]
   "Username"])

(defcard-doc
  "
### Avatar

An image may be formatted to appear inline with text as an avatar
"
  (mkdn-pprint-source avatar))

(defcard-rg
  [avatar])


;; bordered

(defn bordered []
  [s/image {:soda {:bordered? true
                   :size :medium}
            :src "/images/wireframe/white-image.png"}])

(defcard-doc
  "
### Bordered

An image may include a border to emphasize the edges of white or transparent content
"
  (mkdn-pprint-source bordered))

(defcard-rg
  [bordered])


;; fluid

(defn fluid []
  [s/image {:soda {:fluid? true}
            :src "/images/wireframe/image.png"}])

(defcard-doc
  "
### Fluid

An image can take up the width of its container
"
  (mkdn-pprint-source fluid))

(defcard-rg
  [fluid])


;; rounded

(defn rounded []
  [s/image {:soda {:rounded? true
                   :size :medium}
            :src "/images/wireframe/image.png"}])

(defcard-doc
  "
### Rounded

An image may appear rounded
"
  (mkdn-pprint-source rounded))

(defcard-rg
  [rounded])


;; circular

(defn circular []
  [s/image {:soda {:circular? true
                   :size :medium}
            :src "/images/wireframe/square-image.png"}])

(defcard-doc
  "
### Circular

An image may appear circular
"
  (mkdn-pprint-source circular))

(defcard-rg
  [circular])


;; aligned

(defn aligned []
  [:div
    [s/image {:soda {:aligned :top
                     :size :tiny}
              :src "/images/wireframe/square-image.png"}]
    "Top Aligned"

   [s/divider {:soda {:type :default}}]

    [s/image {:soda {:aligned :middle
                     :size :tiny}
              :src "/images/wireframe/square-image.png"}]
    "Middle Aligned"

   [s/divider {:soda {:type :default}}]

    [s/image {:soda {:aligned :bottom
                     :size :tiny}
              :src "/images/wireframe/square-image.png"}]
    "Bottom Aligned"])

(defcard-doc
  "
### Vertically Aligned

An image can specify its vertical alignment
"
  (mkdn-pprint-source aligned))

(defcard-rg
  [aligned])


;; centered

(defn centered []
  [s/segment {:soda {:type :default}}
   [s/image {:soda {:centered? true
                    :size :medium}
             :src "/images/wireframe/square-image.png"}]
   [h/fake-content]])

(defcard-doc
  "
### Centered

An image can appear centered in a content block
"
  (mkdn-pprint-source centered))

(defcard-rg
  [centered])


;; spaced

(defn spaced []
  [s/segment {:soda {:type :default}}
   [s/image {:soda {:spaced :right
                    :size :mini}
             :src "/images/wireframe/square-image.png"}]

   "foo bar baz"

   [s/image {:soda {:spaced :default
                    :size :mini}
             :src "/images/wireframe/square-image.png"}]

   "foo bar baz"

   [s/image {:soda {:spaced :left
                    :size :mini}
             :src "/images/wireframe/square-image.png"}]
   ])

(defcard-doc
  "
### Spaced

An image can appear spaced in a content block
"
  (mkdn-pprint-source spaced))

(defcard-rg
  [spaced])


;; floated

(defn floated []
  [s/segment {:soda {:type :default}}
   [s/image {:soda {:floated :left
                    :size :small}
             :src "/images/wireframe/square-image.png"}]
   [h/fake-content]
   [h/fake-content]

   [s/image {:soda {:floated :right
                    :size :small}
             :src "/images/wireframe/square-image.png"}]
   [h/fake-content]
   [h/fake-content]
   ])

(defcard-doc
  "
### Floated

An image can appear floated in a content block
"
  (mkdn-pprint-source floated))

(defcard-rg
  [floated])


;; size

(defn size []
  [:div
   [s/image {:soda {:size :mini}
             :src "/images/wireframe/square-image.png"}]
   [s/image {:soda {:size :tiny}
             :src "/images/wireframe/square-image.png"}]
   [s/image {:soda {:size :small}
             :src "/images/wireframe/square-image.png"}]
   [s/image {:soda {:size :medium}
             :src "/images/wireframe/square-image.png"}]
   [s/image {:soda {:size :large}
             :src "/images/wireframe/square-image.png"}]
   [s/image {:soda {:size :big}
             :src "/images/wireframe/square-image.png"}]
   [s/image {:soda {:size :huge}
             :src "/images/wireframe/square-image.png"}]
   [s/image {:soda {:size :massive}
             :src "/images/wireframe/square-image.png"}]])

(defcard-doc
  "
### Size

An image can appear size in a content block
"
  (mkdn-pprint-source size))

(defcard-rg
  [size])
