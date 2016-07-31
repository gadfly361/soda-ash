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


(def list-keys
  (h/list-keys button/variations))

(def list-buttons-keys
  (h/list-keys buttons/variations))


(defcard-doc
  (h/devcard-docs button/opts))

(defcard-doc
  (h/devcard-docs buttons/opts))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; BUTTON
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Button Types"
  (h/list-types button/opts))

(defn type-default []
  [se/button "default"])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])


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
   [se/label-right-pointing
    "label"]
   [se/button
    [se/icon-heart]
    "button"]])

(defcard-doc
  (mkdn-pprint-source type-left-labeled))

(defcard-rg
  [type-left-labeled])


(defn type-icon []
  [se/button-icon
   [se/icon-cloud]])

(defcard-doc
  (mkdn-pprint-source type-icon))

(defcard-rg
  [type-icon])


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


(defn type-inverted []
  [se/segment {:ash [:inverted]}
   [se/button-inverted {:ash [:red]}
    "inverted"]])

(defcard-doc
  (mkdn-pprint-source type-inverted))

(defcard-rg
  [type-inverted])


(defn type-basic []
  [se/button-basic {:ash [:red]}
   "basic"])

(defcard-doc
  (mkdn-pprint-source type-basic))

(defcard-rg
  [type-basic])


(defn type-primary-basic []
  [se/button-primary-basic {:ash [:red]}
   "primary-basic"])

(defcard-doc
  (mkdn-pprint-source type-primary-basic))

(defcard-rg
  [type-primary-basic])


(defn type-secondary-basic []
  [se/button-secondary-basic {:ash [:red]}
   "secondary-basic"])

(defcard-doc
  (mkdn-pprint-source type-secondary-basic))

(defcard-rg
  [type-secondary-basic])


(defn type-inverted-basic []
  [se/segment {:ash [:inverted]}
   [se/button-inverted-basic {:ash [:red]}
    "inverted-basic"]])

(defcard-doc
  (mkdn-pprint-source type-inverted-basic))

(defcard-rg
  [type-inverted-basic])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# Button States"
  (list-keys "states"))


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


;; ---------------------------
;; Social

(defcard-doc
  "## Social"
  (list-keys "social"))


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


;; ---------------------------
;; Size

(defcard-doc
  "## size"
  (list-keys "size"))

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


;; ---------------------------
;; Floated

(defcard-doc
  "## floated"
  (list-keys "floated"))


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


;; ---------------------------
;; Colored

(defcard-doc
  "## colored"
  (list-keys "colored"))

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


;; ---------------------------
;; Compact

(defcard-doc
  "## compact"
  (list-keys "compact"))

(defn compact []
  [se/button {:ash [:compact]}
   "compact"])

(defcard-doc
  (mkdn-pprint-source compact))

(defcard-rg
  [:div
   [compact]
   [se/button "normal"]])


;; ---------------------------
;; Toggle

(defcard-doc
  "## toggle"
  (list-keys "toggle"))

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


;; ---------------------------
;; Consequence

(defcard-doc
  "## consequence"
  (list-keys "consequence"))

(defn consequence-negative []
  [se/button {:ash [:negative]}
   "negative"])

(defcard-doc
  (mkdn-pprint-source consequence-negative))

(defcard-rg
  [:div
   [consequence-negative]
   [se/button {:ash [:positive]} "positive"]])



;; ---------------------------
;; Fluid

(defcard-doc
  "## fluid"
  (list-keys "fluid"))

(defn fluid []
  [se/button {:ash [:fluid]}
   "fluid"])

(defcard-doc
  (mkdn-pprint-source fluid))

(defcard-rg
  [fluid])


;; ---------------------------
;; Circular

(defcard-doc
  "## circular"
  (list-keys "circular"))

(defn circular []
  [se/button {:ash [:circular]}
   "circular"])

(defcard-doc
  (mkdn-pprint-source circular))

(defcard-rg
  [circular])


;; ---------------------------
;; Vertically Attached

(defcard-doc
  "## vertically attached"
  (list-keys "vertically attached"))

;; TODO: fix
(defn vertically-attached-top []
  [se/button {:ash [:top-attached]}
   "top-attached"])

(defcard-doc
  (mkdn-pprint-source vertically-attached-top))

(defcard-rg
  [vertically-attached-top])


;; TODO: fix
(defn vertically-attached-bottom []
  [se/button {:ash [:bottom-attached]}
   "bottom-attached"])

(defcard-doc
  (mkdn-pprint-source vertically-attached-bottom))

(defcard-rg
  [vertically-attached-bottom])


;; ---------------------------
;; Horizontally Attached

(defcard-doc
  "## horizontally attached"
  (list-keys "horizontally attached"))

;; TODO: fix
(defn horizontally-attached-top []
  [se/button {:ash [:left-attached]}
   "left-attached"])

(defcard-doc
  (mkdn-pprint-source horizontally-attached-top))

(defcard-rg
  [horizontally-attached-top])


;; TODO: fix
(defn horizontally-attached-bottom []
  [se/button {:ash [:right-attached]}
   "right-attached"])

(defcard-doc
  (mkdn-pprint-source horizontally-attached-bottom))

(defcard-rg
  [horizontally-attached-bottom])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Content

(defcard-doc
  "
---
# Button Content"
  "## Conditionals")

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
;; BUTTONS
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Buttons Types"
  "buttons")

(defn type-buttons []
  [se/buttons
   [se/button "button 1"]
   [se/button "button 2"]])

(defcard-doc
  (mkdn-pprint-source type-buttons))

(defcard-rg
  [type-buttons])


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Buttons Variations")


;; ---------------------------
;; Vertical

(defcard-doc
  "## vertical"
  (list-buttons-keys "vertical"))

(defn buttons-vertical []
  [:div
   [se/buttons {:ash [:vertical]}
    [se/button "Foo"]
    [se/button "Bar"]
    [se/button "Baz"]]])

(defcard-doc
  (mkdn-pprint-source buttons-vertical))

(defcard-rg
   [buttons-vertical])


;; ---------------------------
;; Icon

(defcard-doc
  "## icon"
  (list-buttons-keys "icon"))

(defn buttons-icon []
  [se/buttons {:ash [:icon]}
   [se/button
    [se/icon-star]]
   [se/button
    [se/icon-alarm]]
   [se/button
    [se/icon-arrow-up]]])

(defcard-doc
  (mkdn-pprint-source buttons-icon))

(defcard-rg
  [buttons-icon])


(defn buttons-labeled-icon []
  [se/buttons {:ash [:labeled-icon]}
   [se/button
    [se/icon-star]
    "Star"]
   [se/button
    [se/icon-alarm]
    "Alarm"]
   [se/button
    [se/icon-arrow-up]
    "Arrow up"]])

(defcard-doc
  (mkdn-pprint-source buttons-labeled-icon))

(defcard-rg
  [buttons-labeled-icon])


;; ---------------------------
;; Width

(defcard-doc
  "## width"
  (list-buttons-keys "width"))

(defn buttons-width-two []
  [se/buttons {:ash [:two]}
   [se/button {:ash [:red]}
    "one"]
   [se/button {:ash [:orange]}
    "two"]])


(defn buttons-width [width]
  (let [widths  [[:one :red]
                 [:two :orange]
                 [:three :yellow]
                 [:four :olive]
                 [:five :green]
                 [:six :teal]
                 [:seven :blue]
                 [:eight :violet]
                 [:nine :purple]
                 [:ten :pink]
                 [:eleven :brown]
                 [:twelve :grey]]
        widths' (take width widths)
        width'  (-> widths'
                    last
                    first)]
    (fn []
      [:div [:br]
       [se/buttons {:ash [width']}
        (for [[n color] widths']
          ^{:key n}
          [se/button {:ash [color]}
           (name n)])]])))

(defcard-doc
  (mkdn-pprint-source buttons-width-two))

(defcard-rg
  [:div
   [buttons-width-two]
   (for [n (range 3 13)]
     ^{:key n}
     [buttons-width n])
   ])


;; ---------------------------
;; Size

(defcard-doc
  "## size"
  (list-buttons-keys "size"))

(defn buttons-size-mini []
  [:div
   [se/buttons {:ash [:mini]}
    [se/button "Mini"]
    [se/button "Foo"]
    [se/button "Bar"]]])

(defn buttons-size [size]
  [:div
   [:br]
   [se/buttons {:ash [size]}
    [se/button (name size)]
    [se/button "Foo"]
    [se/button "Bar"]]])

(defcard-doc
  (mkdn-pprint-source buttons-size-mini))

(defcard-rg
  [:div
   [buttons-size-mini]
   [buttons-size :tiny]
   [buttons-size :small]
   [buttons-size :medium]
   [buttons-size :large]
   [buttons-size :big]
   [buttons-size :huge]
   [buttons-size :massive]
   ])


;; ---------------------------
;; Colored

(defcard-doc
  "## colored"
  (list-buttons-keys "colored"))

(defn buttons-colored-red []
  [:div
   [se/buttons {:ash [:red]}
    [se/button "Red"]
    [se/button "Foo"]
    [se/button "Bar"]]])

(defn buttons-colored [colored]
  [:div
   [:br]
   [se/buttons {:ash [colored]}
    [se/button (name colored)]
    [se/button "Foo"]
    [se/button "Bar"]]])

(defcard-doc
  (mkdn-pprint-source buttons-colored-red))

(def colors
  [:red
   :orange
   :yellow
   :olive
   :green
   :teal
   :blue
   :violet
   :purple
   :pink
   :brown
   :grey
   :black])

(defcard-rg
  [:div
   [buttons-colored-red]
   (for [color (drop 1 colors)]
     ^{:key color}
     [buttons-colored color])
   ])


;; ---------------------------
;; Basic

(defcard-doc
  "## basic"
  (list-buttons-keys "basic"))

(defn buttons-basic []
  [se/buttons {:ash [:basic]}
   [se/button "basic"]
   [se/button "foo"]
   [se/button "bar"]])

(defcard-doc
  (mkdn-pprint-source buttons-basic))

(defcard-rg
  [buttons-basic])
