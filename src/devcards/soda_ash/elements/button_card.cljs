(ns soda-ash.elements.button-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core :refer-macros [deftest]]
   [reagent.core :as reagent]
   [soda-ash.core :as sa]
   [soda-ash.elements.button :as button]
   [clojure.string :as string]))


(defn list-keys [group-name]
  (->> button/groups
       (filter #(= group-name
                   (:group-name %)))
       first
       :group-set
       (string/join ", ")))


(defcard-doc
  "# SUMMARY
   ## Types"
  (list-keys "types")
  "## States (*soda*)"
  (list-keys "states")
  "## Variations (*ash*)"
  "### Social"
  (list-keys "social")
  "### Size"
  (list-keys "size")
  "### Floated"
  (list-keys "floated")
  "### Colored"
  (list-keys "colored")
  "### Compact"
  (list-keys "compact")
  "### Toggle"
  (list-keys "toggle")
  "### Consequence"
  (list-keys "consequence")
  "### Fluid"
  (list-keys "fluid")
  "### Circular"
  (list-keys "circular")
  "### Vertically Attached"
  (list-keys "vertically attached")
  "### Horizontally Attached"
  (list-keys "horizontally attached"))


(defcard-doc
  "
---
# Types"
  (list-keys "types"))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defn type-default []
  [sa/button "default"])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])


(defn type-primary []
  [sa/button-primary "primary"])

(defcard-doc
  (mkdn-pprint-source type-primary))

(defcard-rg
  [type-primary])


(defn type-secondary []
  [sa/button-secondary "secondary"])

(defcard-doc
  (mkdn-pprint-source type-secondary))

(defcard-rg
  [type-secondary])


;; TODO: FIX
(defn type-animated []
  [sa/button-animated "animated"])

(defcard-doc
  (mkdn-pprint-source type-animated))

(defcard-rg
  [type-animated])


;; TODO: FIX
(defn type-vertical-animated []
  [sa/button-vertical-animated "vertical-animated"])

(defcard-doc
  (mkdn-pprint-source type-vertical-animated))

(defcard-rg
  [type-vertical-animated])


;; TODO: FIX
(defn type-animated-fade []
  [sa/button-animated-fade "animated-fade"])

(defcard-doc
  (mkdn-pprint-source type-animated-fade))

(defcard-rg
  [type-animated-fade])


;; TODO: FIX
(defn type-labeled []
  [sa/button-labeled "labeled"])

(defcard-doc
  (mkdn-pprint-source type-labeled))

(defcard-rg
  [type-labeled])


;; TODO: FIX
(defn type-left-labeled []
  [sa/button-left-labeled "left-labeled"])

(defcard-doc
  (mkdn-pprint-source type-left-labeled))

(defcard-rg
  [type-left-labeled])


;; TODO: FIX
(defn type-icon []
  [sa/button-icon "icon"])

(defcard-doc
  (mkdn-pprint-source type-icon))

(defcard-rg
  [type-icon])


;; TODO: FIX
(defn type-labeled-icon []
  [sa/button-labeled-icon "labeled-icon"])

(defcard-doc
  (mkdn-pprint-source type-labeled-icon))

(defcard-rg
  [type-labeled-icon])


;; TODO: FIX
(defn type-right-labeled-icon []
  [sa/button-right-labeled-icon "right-labeled-icon"])

(defcard-doc
  (mkdn-pprint-source type-right-labeled-icon))

(defcard-rg
  [type-right-labeled-icon])


;; TODO: FIX
(defn type-basic []
  [sa/button-basic "basic"])

(defcard-doc
  (mkdn-pprint-source type-basic))

(defcard-rg
  [type-basic])


;; TODO: FIX
(defn type-inverted []
  [sa/button-inverted "inverted"])

(defcard-doc
  (mkdn-pprint-source type-inverted))

(defcard-rg
  [type-inverted])


;; TODO: FIX
(defn type-inverted-basic []
  [sa/button-inverted-basic "inverted-basic"])

(defcard-doc
  (mkdn-pprint-source type-inverted-basic))

(defcard-rg
  [type-inverted-basic])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# States"
  (list-keys "states"))


(defn state-active []
  [sa/button {:soda :active
              :ash [:blue]}
   "active"])

(defcard-doc
  (mkdn-pprint-source state-active))

(defcard-rg
  [state-active])


(defn state-disabled []
  [sa/button {:soda :disabled
              :ash [:blue]}
   "disabled"])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg
  [state-disabled])


(defn state-loading []
  [sa/button {:soda :loading
              :ash [:blue]}
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
# Variations")


;; ---------------------------
;; Social

(defcard-doc
  "## Social"
  (list-keys "social"))


(defn social-facebook []
  [sa/button {:ash [:facebook]}
   "facebook"])

(defcard-doc
  (mkdn-pprint-source social-facebook))

(defcard-rg
  [:div
   [social-facebook]
   [sa/button {:ash [:twitter]}
    "twitter"]
   [sa/button {:ash [:google-plus]}
    "google-plus"]
   [sa/button {:ash [:vk]}
    "vk"]
   [sa/button {:ash [:linkedin]}
    "linkedin"]
   [sa/button {:ash [:instagram]}
    "instagram"]
   [sa/button {:ash [:youtube]}
    "youtube"]
   ])




;; ---------------------------
;; Size

(defcard-doc
  "## size"
  (list-keys "size"))

(defn size-mini []
  [sa/button {:ash [:mini]}
   "mini"])

(defcard-doc
  (mkdn-pprint-source size-mini))

(defcard-rg
  [:div
   [size-mini]
   [sa/button {:ash [:tiny]} "tiny"]
   [sa/button {:ash [:small]} "small"]
   [sa/button {:ash [:medium]} "medium"]
   [sa/button {:ash [:large]} "large"]
   [sa/button {:ash [:big]} "big"]
   [sa/button {:ash [:huge]} "huge"]
   [sa/button {:ash [:massive]} "massive"]
   ])


;; ---------------------------
;; Floated

(defcard-doc
  "## floated"
  (list-keys "floated"))


(defn right-floated []
  [sa/button {:ash [:right-floated]}
   "right-floated"])

(defcard-doc
  (mkdn-pprint-source right-floated))

(defcard-rg
  [right-floated])


(defn left-floated []
  [sa/button {:ash [:left-floated]}
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
  [sa/button {:ash [:red]}
   "red"])

(defcard-doc
  (mkdn-pprint-source colored-red))

(defcard-rg
  [:div
   [colored-red]
   [sa/button {:ash [:orange]} "orange"]
   [sa/button {:ash [:yellow]} "yellow"]
   [sa/button {:ash [:olive]} "olive"]
   [sa/button {:ash [:green]} "green"]
   [sa/button {:ash [:teal]} "teal"]
   [sa/button {:ash [:blue]} "blue"]
   [sa/button {:ash [:violet]} "violet"]
   [sa/button {:ash [:purple]} "purple"]
   [sa/button {:ash [:pink]} "pink"]
   [sa/button {:ash [:brown]} "brown"]
   [sa/button {:ash [:grey]} "grey"]
   [sa/button {:ash [:black]} "black"]
   ])


;; ---------------------------
;; Compact

(defcard-doc
  "## compact"
  (list-keys "compact"))

(defn compact []
  [sa/button {:ash [:compact]}
   "compact"])

(defcard-doc
  (mkdn-pprint-source compact))

(defcard-rg
  [:div
   [compact]
   [sa/button "normal"]])


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
        [sa/button {:soda     soda
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
  [sa/button {:ash [:negative]}
   "negative"])

(defcard-doc
  (mkdn-pprint-source consequence-negative))

(defcard-rg
  [:div
   [consequence-negative]
   [sa/button {:ash [:positive]} "positive"]])



;; ---------------------------
;; Fluid

(defcard-doc
  "## fluid"
  (list-keys "fluid"))

(defn fluid []
  [sa/button {:ash [:fluid]}
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
  [sa/button {:ash [:circular]}
   "circular"])

(defcard-doc
  (mkdn-pprint-source circular))

(defcard-rg
  [circular])


;; ---------------------------
;; Vertically-Attached

(defcard-doc
  "## vertically-attached"
  (list-keys "vertically-attached"))

;; TODO: fix
(defn vertically-attached-top []
  [sa/button {:ash [:top-attached]}
   "top-attached"])

(defcard-doc
  (mkdn-pprint-source vertically-attached-top))

(defcard-rg
  [vertically-attached-top])


;; TODO: fix
(defn vertically-attached-bottom []
  [sa/button {:ash [:bottom-attached]}
   "bottom-attached"])

(defcard-doc
  (mkdn-pprint-source vertically-attached-bottom))

(defcard-rg
  [vertically-attached-bottom])


;; ---------------------------
;; Horizontally-Attached

(defcard-doc
  "## horizontally-attached"
  (list-keys "horizontally-attached"))

;; TODO: fix
(defn horizontally-attached-top []
  [sa/button {:ash [:left-attached]}
   "left-attached"])

(defcard-doc
  (mkdn-pprint-source horizontally-attached-top))

(defcard-rg
  [horizontally-attached-top])


;; TODO: fix
(defn horizontally-attached-bottom []
  [sa/button {:ash [:right-attached]}
   "right-attached"])

(defcard-doc
  (mkdn-pprint-source horizontally-attached-bottom))

(defcard-rg
  [horizontally-attached-bottom])
