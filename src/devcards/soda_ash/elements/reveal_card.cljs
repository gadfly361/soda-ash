(ns soda-ash.elements.reveal-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.core :as sa]
   [soda-ash.helpers :as h]
   [soda-ash.elements.reveal :as reveal]))


(def list-keys
  (h/list-keys reveal/groups))


(defcard-doc
  "# SUMMARY"
  "## Types"
  (h/list-types reveal/types "reveal" false)

  "## States (*soda*)"
  (list-keys "states")

  "## Variations (*ash*)"
  "### Instant"
  (list-keys "instant")
  )



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types reveal/types "reveal" false)
  )

(defn type-fade []
  [sa/reveal-fade
   [:div.visible.content
    [sa/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [:div.hidden.content
    [sa/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-fade))

(defcard-rg
  [type-fade])


(defn type-move []
  [sa/reveal-move
   [:div.visible.content
    [sa/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [:div.hidden.content
    [sa/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-move))

(defcard-rg
  [type-move])


(defn type-move-right []
  [sa/reveal-move-right
   [:div.visible.content
    [sa/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [:div.hidden.content
    [sa/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-move-right))

(defcard-rg
  [type-move-right])


(defn type-move-up []
  [sa/reveal-move-up
   [:div.visible.content
    [sa/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [:div.hidden.content
    [sa/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-move-up))

(defcard-rg
  [type-move-up])


(defn type-move-down []
  [sa/reveal-move-down
   [:div.visible.content
    [sa/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [:div.hidden.content
    [sa/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-move-down))

(defcard-rg
  [type-move-down])


(defn type-rotate []
  [sa/reveal-rotate
   [:div.visible.content
    [sa/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [:div.hidden.content
    [sa/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source type-rotate))

(defcard-rg
  [type-rotate])


(defn type-rotate-left []
  [sa/reveal-rotate-left
   [:div.visible.content
    [sa/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [:div.hidden.content
    [sa/image {:src "/images/gadfly.png"
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
  [sa/reveal-rotate-left {:soda :active}
   [:div.visible.content
    [sa/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [:div.hidden.content
    [sa/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source state-active))

(defcard-rg
  [state-active])


(defn state-disabled []
  [sa/reveal-rotate-left {:soda :disabled}
   [:div.visible.content
    [sa/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [:div.hidden.content
    [sa/image {:src "/images/gadfly.png"
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
  [sa/reveal-move {:ash [:instant]}
   [:div.visible.content
    [sa/image {:src "/images/square-image.png"
               :ash [:small]}]]
   [:div.hidden.content
    [sa/image {:src "/images/gadfly.png"
               :ash [:small]}]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-instant))

(defcard-rg
  [variation-instant])
