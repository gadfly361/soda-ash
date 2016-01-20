(ns soda-ash.elements.reveal-card
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

# reveal

* **base class** ui reveal
* **default tag** :div
* **:type**
    *FADE* :fade |
    *MOVE* :move | :move-right | :move-up | :move-down |
    <s>*ROTATE* :rotate | :rotate-left</s>
* **content** visible | hidden
* **:state** :default | :active | :disabled
* **variations** :instant?

---
")



;; ====================
;; TYPES

(defcard-doc
"# TYPES")


;; Fade

(defn fade []
  [s/reveal {:soda {:type :fade}}

   [:div.visible.content
    [s/image {:soda {:size :small}
              :src "images/wireframe/square-image.png"}]]

   [:div.hidden.content
    [s/image {:soda {:size :small}
              :src "images/avatar/large/ade.jpg"}]]])

(defcard-doc
  "
### Fade

An element can disappear to reveal content below
"
  (mkdn-pprint-source fade))

(defcard-rg
  [fade])


;; Move

(defn move []
  [s/reveal {:soda {:type :move}}

   [:div.visible.content
    [s/image {:soda {:size :small}
              :src "images/wireframe/square-image.png"}]]

   [:div.hidden.content
    [s/image {:soda {:size :small}
              :src "images/avatar/large/ade.jpg"}]]])

(defcard-doc
  "
### Move

An element can move in a direction to reveal content
"
  (mkdn-pprint-source move))

(defcard-rg
  [move])


;; move right

(defn move-right []
  [s/reveal {:soda {:type :move-right}}

   [:div.visible.content
    [s/image {:soda {:size :small}
              :src "images/wireframe/square-image.png"}]]

   [:div.hidden.content
    [s/image {:soda {:size :small}
              :src "images/avatar/large/ade.jpg"}]]])

(defcard-doc
  (mkdn-pprint-source move-right))

(defcard-rg
  [move-right])


;; move up

(defn move-up []
  [s/reveal {:soda {:type :move-up}}

   [:div.visible.content
    [s/image {:soda {:size :small}
              :src "images/wireframe/square-image.png"}]]

   [:div.hidden.content
    [s/image {:soda {:size :small}
              :src "images/avatar/large/ade.jpg"}]]])

(defcard-doc
  (mkdn-pprint-source move-up))

(defcard-rg
  [move-up])


;; move down

(defn move-down []
  [s/reveal {:soda {:type :move-down}}

   [:div.visible.content
    [s/image {:soda {:size :small}
              :src "images/wireframe/square-image.png"}]]

   [:div.hidden.content
    [s/image {:soda {:size :small}
              :src "images/avatar/large/ade.jpg"}]]])

(defcard-doc
  (mkdn-pprint-source move-down))

(defcard-rg
  [move-down])


(defcard-doc
  "
### Rotate

An element can rotate to reveal content below

**Soda-ash does not support rotate at this time :(**
")



;; ====================
;; CONTENT

(defcard-doc
"# CONTENT")


;; Visible

(defn visible []
  [s/reveal {:soda {:type :fade}}

   [:div.visible.content
    [s/image {:soda {:size :small}
              :src "images/avatar/large/ade.jpg"}]]

   [:div.hidden.content
    [s/image {:soda {:size :small}
              :src "images/wireframe/square-image.png"}]]])

(defcard-doc
  "
### Visible

A reveal may contain content that is visible before interaction

Notes:

* Visible and hidden content should be the same aspect ratio
"
  (mkdn-pprint-source visible))

(defcard-rg
  [visible])


;; Hidden

(defn hidden []
  [s/reveal {:soda {:type :fade}}

   [:div.hidden.content
    [s/image {:soda {:size :small}
              :src "images/avatar/large/ade.jpg"}]]

   [:div.visible.content
    [s/image {:soda {:size :small}
              :src "images/wireframe/square-image.png"}]]])

(defcard-doc
  "
### Hidden

A reveal may contain content that is hidden before user interaction
"
  (mkdn-pprint-source hidden))

(defcard-rg
  [hidden])



;; ====================
;; STATES

(defcard-doc
"# STATES")


;; Active

(defn active []
  [s/reveal {:soda {:type :move
                    :state :active}}

   [:div.hidden.content ;; <-- active overrides this and makes visible
    [s/image {:soda {:size :small}
              :src "images/avatar/large/nan.jpg"}]]

   [:div.visible.content
    [s/image {:soda {:size :small}
              :src "images/wireframe/square-image.png"}]]])

(defcard-doc
  "
### Active

An active reveal displays its hidden content

Notes:

* Adding the class active can allow you to show the hidden contents programatically
"
  (mkdn-pprint-source active))

(defcard-rg
  [active])


;; Disabled

(defn disabled []
  [s/reveal {:soda {:type :move
                    :state :disabled ;; <-- this disables the move reveal
                    }}

   [:div.disabled.content
    [s/image {:soda {:size :small}
              :src "images/avatar/large/nan.jpg"}]]

   [:div.hidden.content
    [s/image {:soda {:size :small}
              :src "images/wireframe/square-image.png"}]]])

(defcard-doc
  "
### Disabled

A disabled reveal will not animate when hovered
"
  (mkdn-pprint-source disabled))

(defcard-rg
  [disabled])



;; ====================
;; VARIATIONS

(defcard-doc
"# VARIATIONS")


;; Instant

(defn instant []
  [s/reveal {:soda {:type :move
                    :instant? true}}

   [:div.hidden.content
    [s/image {:soda {:size :small}
              :src "images/avatar/large/nan.jpg"}]]

   [:div.visible.content
    [s/image {:soda {:size :small}
              :src "images/wireframe/square-image.png"}]]])

(defcard-doc
  "
### Instant

An element can show its content without delay
"
  (mkdn-pprint-source instant))

(defcard-rg
  [instant])
