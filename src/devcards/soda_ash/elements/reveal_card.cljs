(ns soda-ash.elements.reveal-card
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
   [soda-ash.elements.reveal :as reveal]))


(def list-keys
  (h/list-keys reveal/variations))

(defcard-doc
  (h/devcard-docs reveal/opts))

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
  (h/list-types reveal/opts))


(defcard-doc
  "**Fade**"
  "An element can disappear to reveal content below")

(defn type-fade []
  [se/reveal-fade
   [sco/content-visible
    [se/image {:src "images/square-image.png"
               :data-ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "images/gadfly.png"
               :data-ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-fade))

(defcard-rg fade
  [type-fade])



(defcard-doc
  "**Move**"
  "An element can move in a direction to reveal content")

(defn type-move []
  [se/reveal-move
   [sco/content-visible
    [se/image {:src "images/square-image.png"
               :data-ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "images/gadfly.png"
               :data-ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-move))

(defcard-rg move
  [type-move])


(defn type-move-right []
  [se/reveal-move-right
   [sco/content-visible
    [se/image {:src "images/square-image.png"
               :data-ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "images/gadfly.png"
               :data-ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-move-right))

(defcard-rg move-right
  [type-move-right])


(defn type-move-up []
  [se/reveal-move-up
   [sco/content-visible
    [se/image {:src "images/square-image.png"
               :data-ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "images/gadfly.png"
               :data-ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-move-up))

(defcard-rg move-up
  [type-move-up])


(defn type-move-down []
  [se/reveal-move-down
   [sco/content-visible
    [se/image {:src "images/square-image.png"
               :data-ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "images/gadfly.png"
               :data-ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-move-down))

(defcard-rg move-down
  [type-move-down])



(defcard-doc
  "**Rotate**"
  "An element can rotate to reveal content below")

(defn type-rotate []
  [se/reveal-rotate
   [sco/content-visible
    [se/image {:src "images/square-image.png"
               :data-ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "images/gadfly.png"
               :data-ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-rotate))

(defcard-rg rotate
  [type-rotate])


(defn type-rotate-left []
  [se/reveal-rotate-left
   [sco/content-visible
    [se/image {:src "images/square-image.png"
               :data-ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "images/gadfly.png"
               :data-ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-rotate-left))

(defcard-rg rotate-left
  [type-rotate-left])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# States"
  (list-keys "states"))

(defcard-doc
  "**Active**"
  "An active reveal displays its hidden content")

(defn state-active []
  [se/reveal-rotate-left {:data-soda :active}
   [sco/content-visible
    [se/image {:src "images/square-image.png"
               :data-ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "images/gadfly.png"
               :data-ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source state-active))

(defcard-rg active
  [state-active])



(defcard-doc
  "**Disabled**"
  "A disabled reveal will not animate when hovered")

(defn state-disabled []
  [se/reveal-rotate-left {:data-soda :disabled}
   [sco/content-visible
    [se/image {:src "images/square-image.png"
               :data-ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "images/gadfly.png"
               :data-ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg disabled
  [state-disabled])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")


(defcard-doc
  "**Instant**"
  "An element can show its content without delay"
  (list-keys "instant"))

(defn variation-instant []
  [se/reveal-move {:data-ash [:instant]}
   [sco/content-visible
    [se/image {:src "images/square-image.png"
               :data-ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "images/gadfly.png"
               :data-ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-instant))

(defcard-rg instant
  [variation-instant])
