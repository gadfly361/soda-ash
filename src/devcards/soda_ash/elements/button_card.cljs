(ns soda-ash.elements.button-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core :as reagent]
   [soda-ash.element :as se]
   [soda-ash.content :as sco]
   [soda-ash.helpers :as h]
   [soda-ash.elements.button :as button]
   [soda-ash.elements.buttons :as buttons]))



(def list-state-keys
  (h/list-keys button/states))

(def list-variation-keys
  (h/list-keys button/variations))


(defcard-doc
  (h/devcard-docs button/opts))


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
# Button Types"
  (h/list-types button/opts))



(defcard-doc
  "**Button**"
  "A default button")

(defn type-default []
  [se/button "default"])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg default
  [type-default])



(defcard-doc
  "**Emphasis**"
  "A button can be formatted to show different levels of emphasis")

(defn type-primary []
  [se/button-primary
   "primary"])

(defcard-doc
  (mkdn-pprint-source type-primary))

(defcard-rg primary
  [type-primary])


(defn type-secondary []
  [se/button-secondary "secondary"])

(defcard-doc
  (mkdn-pprint-source type-secondary))

(defcard-rg secondary
  [type-secondary])



(defcard-doc
  "**Animated**"
  "A button can animate to show hidden content")

(defn type-animated []
  [se/button-animated
   [sco/content-visible "Next"]
   [sco/content-hidden
    [se/icon-arrow-right]]])

(defcard-doc
  (mkdn-pprint-source type-animated))

(defcard-rg animated
  [type-animated])


(defn type-vertical-animated []
  [se/button-vertical-animated
   [sco/content-hidden "Shop"]
   [sco/content-visible
    [se/icon-shop]]])

(defcard-doc
  (mkdn-pprint-source type-vertical-animated))

(defcard-rg vertical-animated
  [type-vertical-animated])


(defn type-animated-fade []
  [se/button-animated-fade
   [sco/content-visible
    "Sign up for a Pro account"]
   [sco/content-hidden
    "12.99 a month"]])

(defcard-doc
  (mkdn-pprint-source type-animated-fade))

(defcard-rg animated-fade
  [type-animated-fade])



(defcard-doc
  "**Labeled**"
  "A button can appear alongside a label")

(defn type-labeled []
  [se/button-labeled
   [se/button
    [se/icon-heart]
    "button"]
   [se/label "label"]])

(defcard-doc
  (mkdn-pprint-source type-labeled))

(defcard-rg labeled
  [type-labeled])


(defn type-left-labeled []
  [se/button-left-labeled
   [se/label
    "label"]
   [se/button
    [se/icon-heart]
    "button"]])

(defcard-doc
  (mkdn-pprint-source type-left-labeled))

(defcard-rg left-labeled
  [type-left-labeled])



(defcard-doc
  "**Icon**"
  "A button can have only an icon")

(defn type-icon []
  [se/button-icon
   [se/icon-cloud]])

(defcard-doc
  (mkdn-pprint-source type-icon))

(defcard-rg icon
  [type-icon])



(defcard-doc
  "**Labeled icon**"
  "A button can use an icon as label")

(defn type-labeled-icon []
  [se/button-labeled-icon
   [se/icon-heart]
   "button"])

(defcard-doc
  (mkdn-pprint-source type-labeled-icon))

(defcard-rg labeled-icon
  [type-labeled-icon])


(defn type-right-labeled-icon []
  [se/button-right-labeled-icon
   [se/icon-heart]
   "button"])

(defcard-doc
  (mkdn-pprint-source type-right-labeled-icon))

(defcard-rg right-labeled-icon
  [type-right-labeled-icon])



(defcard-doc
  "**Basic**"
  "A basic button is less pronounced")

(defn type-basic []
  [se/button-basic
   "basic"])

(defcard-doc
  (mkdn-pprint-source type-basic))

(defcard-rg basic
  [type-basic])


(defn type-primary-basic []
  [se/button-primary-basic
   "primary basic"])

(defcard-doc
  (mkdn-pprint-source type-primary-basic))

(defcard-rg primary-basic
  [type-primary-basic])


(defn type-secondary-basic []
  [se/button-secondary-basic
   "secondary basic"])

(defcard-doc
  (mkdn-pprint-source type-secondary-basic))

(defcard-rg secondary-basic
  [type-secondary-basic])



(defcard-doc
  "**Inverted**"
  "A button can be formatted to appear on dark background")

(defn type-inverted []
  [se/segment {:data-ash [:inverted]}
   [se/button-inverted {:data-ash [:red]}
    "inverted"]])

(defcard-doc
  (mkdn-pprint-source type-inverted))

(defcard-rg inverted
  [type-inverted])


(defn type-inverted-basic []
  [se/segment {:data-ash [:inverted]}
   [se/button-inverted-basic {:data-ash [:red]}
    "inverted-basic"]])

(defcard-doc
  (mkdn-pprint-source type-inverted-basic))

(defcard-rg inverted-basic
  [type-inverted-basic])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# Button States"
  (list-state-keys "states"))


(defn state-active []
  [se/button {:data-soda :active
              :data-ash  [:blue]}
   "active"])

(defcard-doc
  (mkdn-pprint-source state-active))

(defcard-rg active
  [state-active])


(defn state-disabled []
  [se/button {:data-soda :disabled
              :data-ash  [:blue]}
   "disabled"])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg disabled
  [state-disabled])


(defn state-loading []
  [se/button {:data-soda :loading
              :data-ash  [:blue]}
   "loading"])

(defcard-doc
  (mkdn-pprint-source state-loading))

(defcard-rg loading
  [state-loading])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Button Variations")



(defcard-doc
  "**Social**"
  "A button can be formatted to link to a social website"
  (list-variation-keys "social"))

(defn social-facebook []
  [se/button {:data-ash [:facebook]}
   [se/icon-facebook]
   "Facebook"])

(defcard-doc
  (mkdn-pprint-source social-facebook))

(defcard-rg social
  [:div
   [social-facebook]
   [se/button {:data-ash [:twitter]}
    [se/icon-twitter]
    "Twitter"]
   [se/button {:data-ash [:google-plus]}
    [se/icon-google-plus]
    "Google Plus"]
   [se/button {:data-ash [:vk]}
    [se/icon-vk]
    "VK"]
   [se/button {:data-ash [:linkedin]}
    [se/icon-linkedin]
    "LinkedIn"]
   [se/button {:data-ash [:instagram]}
    [se/icon-instagram]
    "Instagram"]
   [se/button {:data-ash [:youtube]}
    [se/icon-youtube]
    "YouTube"]
   ])



(defcard-doc
  "**Size**"
  "A button can have different sizes"
  (list-variation-keys "size"))

(defn size-mini []
  [se/button {:data-ash [:mini]}
   "mini"])

(defcard-doc
  (mkdn-pprint-source size-mini))

(defcard-rg size
  [:div
   [size-mini]
   [se/button {:data-ash [:tiny]} "tiny"]
   [se/button {:data-ash [:small]} "small"]
   [se/button {:data-ash [:medium]} "medium"]
   [se/button {:data-ash [:large]} "large"]
   [se/button {:data-ash [:big]} "big"]
   [se/button {:data-ash [:huge]} "huge"]
   [se/button {:data-ash [:massive]} "massive"]
   ])



(defcard-doc
  "**Floated**"
  "A button can be aligned to the left or right of its container"
  (list-variation-keys "floated"))


(defn right-floated []
  [se/button {:data-ash [:right-floated]}
   "right-floated"])

(defcard-doc
  (mkdn-pprint-source right-floated))

(defcard-rg right-floated
  [right-floated])


(defn left-floated []
  [se/button {:data-ash [:left-floated]}
   "left-floated"])

(defcard-doc
  (mkdn-pprint-source left-floated))

(defcard-rg left-floated
  [left-floated])



(defcard-doc
  "**Colored**"
  "A button can have different colors"
  (list-variation-keys "colored"))

(defn colored-red []
  [se/button {:data-ash [:red]}
   "red"])

(defcard-doc
  (mkdn-pprint-source colored-red))

(defcard-rg colored
  [:div
   [colored-red]
   [se/button {:data-ash [:orange]} "orange"]
   [se/button {:data-ash [:yellow]} "yellow"]
   [se/button {:data-ash [:olive]} "olive"]
   [se/button {:data-ash [:green]} "green"]
   [se/button {:data-ash [:teal]} "teal"]
   [se/button {:data-ash [:blue]} "blue"]
   [se/button {:data-ash [:violet]} "violet"]
   [se/button {:data-ash [:purple]} "purple"]
   [se/button {:data-ash [:pink]} "pink"]
   [se/button {:data-ash [:brown]} "brown"]
   [se/button {:data-ash [:grey]} "grey"]
   [se/button {:data-ash [:black]} "black"]
   ])



(defcard-doc
  "**Compact**"
  "A button can reduce its padding to fit into tighter spaces"
  (list-variation-keys "compact"))

(defn compact []
  [se/button {:data-ash [:compact]}
   "compact"])

(defcard-doc
  (mkdn-pprint-source compact))

(defcard-rg compact
  [:div
   [compact]
   [se/button "normal"]])



(defcard-doc
  "**Toggle**"
  "A button can be formatted to toggle on and off"
  (list-variation-keys "toggle"))

(defn toggle []
  (let [local-state      (reagent/atom {:data-soda nil})
        on-click-handler (fn []
                           (swap! local-state update :data-soda
                                  #(if (= :active %) nil :active)))
        text             (fn [soda]
                           (if (= :active soda)
                             "toggled on" "toggled off"))]
    (fn []
      (let [soda (:data-soda @local-state)]
        [se/button {:data-soda soda
                    :data-ash  [:toggle]
                    :on-click  on-click-handler}
         (text soda)]))))

(defcard-doc
  (mkdn-pprint-source toggle))

(defcard-rg toggle
  [toggle])



(defcard-doc
  "**Consequence**"
  "A button can hint towards a positive or negative consequence"
  (list-variation-keys "consequence"))

(defn consequence []
  [:div
   [se/button {:data-ash [:positive]}
    "positive"]

   [se/button {:data-ash [:negative]}
    "negative"]])

(defcard-doc
  (mkdn-pprint-source consequence))

(defcard-rg consequence
  [consequence])



(defcard-doc
  "**Fluid**"
  "A button can take the width of its container"
  (list-variation-keys "fluid"))

(defn fluid []
  [se/button {:data-ash [:fluid]}
   "fluid"])

(defcard-doc
  (mkdn-pprint-source fluid))

(defcard-rg fluid
  [fluid])



(defcard-doc
  "**Circular**"
  "A button can be circular"
  (list-variation-keys "circular"))

(defn circular []
  [se/button {:data-ash [:circular]}
   "circular"])

(defcard-doc
  (mkdn-pprint-source circular))

(defcard-rg circular
  [circular])



(defcard-doc
  "**Vertically attached**"
  "A button can be attached to the top or bottom of other content"
  (list-variation-keys "vertically-attached"))

(defn vertically-attached-top []
  [se/button {:data-ash [:top-attached]}
   "top-attached"])

(defcard-doc
  (mkdn-pprint-source vertically-attached-top))

(defcard-rg vertically-attached-top
  [vertically-attached-top])


(defn vertically-attached-bottom []
  [se/button {:data-ash [:bottom-attached]}
   "bottom-attached"])

(defcard-doc
  (mkdn-pprint-source vertically-attached-bottom))

(defcard-rg vertically-attached-bottom
  [vertically-attached-bottom])



(defcard-doc
  "**horizontally attached**"
  "A button can be attached to the left or right of other content"
  (list-variation-keys "horizontally-attached"))

(defn horizontally-attached-top []
  [se/button {:data-ash [:left-attached]}
   "left-attached"])

(defcard-doc
  (mkdn-pprint-source horizontally-attached-top))

(defcard-rg horizontally-attached-top
  [horizontally-attached-top])


(defn horizontally-attached-bottom []
  [se/button {:data-ash [:right-attached]}
   "right-attached"])

(defcard-doc
  (mkdn-pprint-source horizontally-attached-bottom))

(defcard-rg horizontally-attached-bottom
  [horizontally-attached-bottom])
