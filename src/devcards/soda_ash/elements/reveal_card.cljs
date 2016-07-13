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



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types reveal/opts))

(defn type-fade []
  [se/reveal-fade
   [sco/content-visible
    [se/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-fade))

(defcard-rg
  [type-fade])


(defn type-move []
  [se/reveal-move
   [sco/content-visible
    [se/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-move))

(defcard-rg
  [type-move])


(defn type-move-right []
  [se/reveal-move-right
   [sco/content-visible
    [se/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-move-right))

(defcard-rg
  [type-move-right])


(defn type-move-up []
  [se/reveal-move-up
   [sco/content-visible
    [se/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-move-up))

(defcard-rg
  [type-move-up])


(defn type-move-down []
  [se/reveal-move-down
   [sco/content-visible
    [se/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-move-down))

(defcard-rg
  [type-move-down])


(defn type-rotate []
  [se/reveal-rotate
   [sco/content-visible
    [se/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-rotate))

(defcard-rg
  [type-rotate])


(defn type-rotate-left []
  [se/reveal-rotate-left
   [sco/content-visible
    [se/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-rotate-left))

(defcard-rg
  [type-rotate-left])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# States"
  (list-keys "states"))

(defn state-active []
  [se/reveal-rotate-left {:soda :active}
   [sco/content-visible
    [se/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source state-active))

(defcard-rg
  [state-active])


(defn state-disabled []
  [se/reveal-rotate-left {:soda :disabled}
   [sco/content-visible
    [se/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

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


(defcard-doc
  "## Variations"
  (list-keys "instant"))

(defn variation-instant []
  [se/reveal-move {:ash [:instant]}
   [sco/content-visible
    [se/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [sco/content-hidden
    [se/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-instant))

(defcard-rg
  [variation-instant])
