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
  "Require soda-ash's elements:
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

(defcard-rg
  [type-default])



(defcard-doc
  "**Emphasis**"
  "A button can be formatted to show different levels of emphasis")

(defn type-primary []
  [se/button-primary "primary"])

(defcard-doc
  (mkdn-pprint-source type-primary))

(defcard-rg
  [type-primary])


(defn type-secondary []
  [se/button-secondary "secondary"])

(defcard-doc
  (mkdn-pprint-source type-secondary))

(defcard-rg
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

(defcard-rg
  [type-animated])


(defn type-vertical-animated []
  [se/button-vertical-animated
   [sco/content-hidden "Shop"]
   [sco/content-visible
    [se/icon-shop]]])

(defcard-doc
  (mkdn-pprint-source type-vertical-animated))

(defcard-rg
  [type-vertical-animated])


(defn type-animated-fade []
  [se/button-animated-fade
   [sco/content-visible
    "Sign up for a Pro account"]
   [sco/content-hidden
    "12.99 a month"]])

(defcard-doc
  (mkdn-pprint-source type-animated-fade))

(defcard-rg
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

(defcard-rg
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

(defcard-rg
  [type-left-labeled])



(defcard-doc
  "**Icon**"
  "A button can have only an icon")

(defn type-icon []
  [se/button-icon
   [se/icon-cloud]])

(defcard-doc
  (mkdn-pprint-source type-icon))

(defcard-rg
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

(defcard-rg
  [type-labeled-icon])


(defn type-right-labeled-icon []
  [se/button-right-labeled-icon
   [se/icon-heart]
   "button"])

(defcard-doc
  (mkdn-pprint-source type-right-labeled-icon))

(defcard-rg
  [type-right-labeled-icon])



(defcard-doc
  "**Basic**"
  "A basic button is less pronounced")

(defn type-basic []
  [se/button-basic
   "basic"])

(defcard-doc
  (mkdn-pprint-source type-basic))

(defcard-rg
  [type-basic])


(defn type-primary-basic []
  [se/button-primary-basic
   "primary basic"])

(defcard-doc
  (mkdn-pprint-source type-primary-basic))

(defcard-rg
  [type-primary-basic])


(defn type-secondary-basic []
  [se/button-secondary-basic
   "secondary basic"])

(defcard-doc
  (mkdn-pprint-source type-secondary-basic))

(defcard-rg
  [type-secondary-basic])



(defcard-doc
  "**Inverted**"
  "A button can be formatted to appear on dark background")

(defn type-inverted []
  [se/segment {:ash [:inverted]}
   [se/button-inverted {:ash [:red]}
    "inverted"]])

(defcard-doc
  (mkdn-pprint-source type-inverted))

(defcard-rg
  [type-inverted])


(defn type-inverted-basic []
  [se/segment {:ash [:inverted]}
   [se/button-inverted-basic {:ash [:red]}
    "inverted-basic"]])

(defcard-doc
  (mkdn-pprint-source type-inverted-basic))

(defcard-rg
  [type-inverted-basic])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Content

(defcard-doc
  "
---
# Button Content")

(defcard-doc
  "**Conditionals**"
  "Button groupds can contain conditionals")

(defn content-or []
  [se/buttons
   [se/button "Cancel"]
   [sco/s-or] ;; <-- s-or
   [se/button {:ash [:positive]}
    "Save"]])

(defcard-doc
  (mkdn-pprint-source content-or))

(defcard-rg
  [content-or])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# Button States"
  (list-state-keys "states"))


(defn state-active []
  [se/button {:soda :active
              :ash  [:blue]}
   "active"])

(defcard-doc
  (mkdn-pprint-source state-active))

(defcard-rg
  [state-active])


(defn state-disabled []
  [se/button {:soda :disabled
              :ash  [:blue]}
   "disabled"])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg
  [state-disabled])


(defn state-loading []
  [se/button {:soda :loading
              :ash  [:blue]}
   "loading"])

(defcard-doc
  (mkdn-pprint-source state-loading))

(defcard-rg
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
  [se/button {:ash [:facebook]}
   [se/icon-facebook]
   "Facebook"])

(defcard-doc
  (mkdn-pprint-source social-facebook))

(defcard-rg
  [:div
   [social-facebook]
   [se/button {:ash [:twitter]}
    [se/icon-twitter]
    "Twitter"]
   [se/button {:ash [:google-plus]}
    [se/icon-google-plus]
    "Google Plus"]
   [se/button {:ash [:vk]}
    [se/icon-vk]
    "VK"]
   [se/button {:ash [:linkedin]}
    [se/icon-linkedin]
    "LinkedIn"]
   [se/button {:ash [:instagram]}
    [se/icon-instagram]
    "Instagram"]
   [se/button {:ash [:youtube]}
    [se/icon-youtube]
    "YouTube"]
   ])



(defcard-doc
  "**Size**"
  "A button can have different sizes"
  (list-variation-keys "size"))

(defn size-mini []
  [se/button {:ash [:mini]}
   "mini"])

(defcard-doc
  (mkdn-pprint-source size-mini))

(defcard-rg
  [:div
   [size-mini]
   [se/button {:ash [:tiny]} "tiny"]
   [se/button {:ash [:small]} "small"]
   [se/button {:ash [:medium]} "medium"]
   [se/button {:ash [:large]} "large"]
   [se/button {:ash [:big]} "big"]
   [se/button {:ash [:huge]} "huge"]
   [se/button {:ash [:massive]} "massive"]
   ])



(defcard-doc
  "**Floated**"
  "A button can be aligned to the left or right of its container"
  (list-variation-keys "floated"))


(defn right-floated []
  [se/button {:ash [:right-floated]}
   "right-floated"])

(defcard-doc
  (mkdn-pprint-source right-floated))

(defcard-rg
  [right-floated])


(defn left-floated []
  [se/button {:ash [:left-floated]}
   "left-floated"])

(defcard-doc
  (mkdn-pprint-source left-floated))

(defcard-rg
  [left-floated])



(defcard-doc
  "**Colored**"
  "A button can have different colors"
  (list-variation-keys "colored"))

(defn colored-red []
  [se/button {:ash [:red]}
   "red"])

(defcard-doc
  (mkdn-pprint-source colored-red))

(defcard-rg
  [:div
   [colored-red]
   [se/button {:ash [:orange]} "orange"]
   [se/button {:ash [:yellow]} "yellow"]
   [se/button {:ash [:olive]} "olive"]
   [se/button {:ash [:green]} "green"]
   [se/button {:ash [:teal]} "teal"]
   [se/button {:ash [:blue]} "blue"]
   [se/button {:ash [:violet]} "violet"]
   [se/button {:ash [:purple]} "purple"]
   [se/button {:ash [:pink]} "pink"]
   [se/button {:ash [:brown]} "brown"]
   [se/button {:ash [:grey]} "grey"]
   [se/button {:ash [:black]} "black"]
   ])



(defcard-doc
  "**Compact**"
  "A button can reduce its padding to fit into tighter spaces"
  (list-variation-keys "compact"))

(defn compact []
  [se/button {:ash [:compact]}
   "compact"])

(defcard-doc
  (mkdn-pprint-source compact))

(defcard-rg
  [:div
   [compact]
   [se/button "normal"]])



(defcard-doc
  "**Toggle**"
  "A button can be formatted to toggle on and off"
  (list-variation-keys "toggle"))

(defn toggle []
  (let [local-state      (reagent/atom {:soda nil})
        on-click-handler (fn []
                           (swap! local-state update :soda
                                  #(if (= :active %) nil :active)))
        text             (fn [soda]
                           (if (= :active soda)
                             "toggled on" "toggled off"))]
    (fn []
      (let [soda (:soda @local-state)]
        [se/button {:soda     soda
                    :ash      [:toggle]
                    :on-click on-click-handler}
         (text soda)]))))

(defcard-doc
  (mkdn-pprint-source toggle))

(defcard-rg
  [toggle])



(defcard-doc
  "**Consequence**"
  "A button can hint towards a positive or negative consequence"
  (list-variation-keys "consequence"))

(defn consequence []
  [:div
   [se/button {:ash [:positive]}
    "positive"]

   [se/button {:ash [:negative]}
    "negative"]])

(defcard-doc
  (mkdn-pprint-source consequence))

(defcard-rg
  [consequence])



(defcard-doc
  "**Fluid**"
  "A button can take the width of its container"
  (list-variation-keys "fluid"))

(defn fluid []
  [se/button {:ash [:fluid]}
   "fluid"])

(defcard-doc
  (mkdn-pprint-source fluid))

(defcard-rg
  [fluid])



(defcard-doc
  "**Circular**"
  "A button can be circular"
  (list-variation-keys "circular"))

(defn circular []
  [se/button {:ash [:circular]}
   "circular"])

(defcard-doc
  (mkdn-pprint-source circular))

(defcard-rg
  [circular])



(defcard-doc
  "**Vertically attached**"
  "A button can be attached to the top or bottom of other content"
  (list-variation-keys "vertically-attached"))

(defn vertically-attached-top []
  [se/button {:ash [:top-attached]}
   "top-attached"])

(defcard-doc
  (mkdn-pprint-source vertically-attached-top))

(defcard-rg
  [vertically-attached-top])


(defn vertically-attached-bottom []
  [se/button {:ash [:bottom-attached]}
   "bottom-attached"])

(defcard-doc
  (mkdn-pprint-source vertically-attached-bottom))

(defcard-rg
  [vertically-attached-bottom])



(defcard-doc
  "**horizontally attached**"
  "A button can be attached to the left or right of other content"
  (list-variation-keys "horizontally-attached"))

(defn horizontally-attached-top []
  [se/button {:ash [:left-attached]}
   "left-attached"])

(defcard-doc
  (mkdn-pprint-source horizontally-attached-top))

(defcard-rg
  [horizontally-attached-top])


(defn horizontally-attached-bottom []
  [se/button {:ash [:right-attached]}
   "right-attached"])

(defcard-doc
  (mkdn-pprint-source horizontally-attached-bottom))

(defcard-rg
  [horizontally-attached-bottom])
