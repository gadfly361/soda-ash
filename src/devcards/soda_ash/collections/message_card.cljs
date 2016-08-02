(ns soda-ash.collections.message-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [cljsjs.semantic-ui]
   [reagent.core :as reagent]
   [soda-ash.element :as se]
   [soda-ash.collection :as sc]
   [soda-ash.content :as sco]
   [soda-ash.helpers :as h]
   [soda-ash.collections.message :as message]))


(def list-keys
  (h/list-keys message/variations))


(defcard-doc
  (h/devcard-docs message/opts))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types message/opts))

(defn type-default []
  [sc/message
   "message"])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])


(defn type-icon []
  [sc/message-icon
   [se/icon-inbox]
   [sco/content
    [sco/header "Have you heard about our mailing list?"]
    [:p "Get the best new in your e-mail every day."]]])

(defcard-doc
  (mkdn-pprint-source type-icon))

(defcard-rg
  [type-icon])


(defn type-list []
  [sc/message
   [sco/header "A message can include a list"]
   [se/s-list
    [sco/item "item 1"]
    [sco/item "item 2"]]])

(defcard-doc
  (mkdn-pprint-source type-list))

(defcard-rg
  [type-list])


(defn close-render []
  [se/icon-close])

(defn close-did-mount [this]
  (-> (js/$ (reagent/dom-node this))
      (.on "click" (fn [_]
                     (-> (js/$ (reagent/dom-node this))
                         (.closest ".message")
                         (.transition "fade"))))))

(defn close []
  (reagent/create-class
   {:reagent-render close-render
    :component-did-mount close-did-mount}))

(defn type-dismissable []
  [sc/message
   [close]
   [sco/header "A message can be dismissable"]
   [:p "Try it out!"]])

(defcard-doc
  (mkdn-pprint-source close-render))
(defcard-doc
  (mkdn-pprint-source close-did-mount))
(defcard-doc
  (mkdn-pprint-source close))
(defcard-doc
  (mkdn-pprint-source type-dismissable))

(defcard-rg
  [type-dismissable])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; State

(defcard-doc
  "
---
# State"
  (list-keys "states"))


(defn state-hidden []
  [sc/message {:soda :hidden}
   [:p "You can't see me"]])

(defcard-doc
  (mkdn-pprint-source state-hidden))

(defcard-rg
  [state-hidden])


(defn state-visible []
  [sc/message {:soda :visible}
   [:p "You can always see me"]])

(defcard-doc
  (mkdn-pprint-source state-visible))

(defcard-rg
  [state-visible])


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variation

(defcard-doc
  "
---
# Variation")

;; ---------------------------
;; size

(defcard-doc
  "## floating"
  (list-keys "floating"))

(defn variation-floating []
  [sc/message {:ash [:floating]}
   [:p "A message can float above the content that it is related to"]])

(defcard-doc
  (mkdn-pprint-source variation-floating))

(defcard-rg
  [variation-floating])


;; ---------------------------
;; compact

(defcard-doc
  "## compact"
  (list-keys "compact"))

(defn variation-compact []
  [sc/message {:ash [:compact]}
   [:p "A message can only take up the width of its content."]])

(defcard-doc
  (mkdn-pprint-source variation-compact))

(defcard-rg
  [variation-compact])


;; ---------------------------
;; attached

(defcard-doc
  "## attached"
  (list-keys "attached"))

(defn variation-attached []
  [:div
  [sc/message {:ash [:attached]}
   [:p "A message can be attached on the top"]]

   [se/segment {:ash [:attached]}
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]

   [sc/message {:ash [:bottom-attached]}
    [:p "A message can be attached on the bottom"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-attached))

(defcard-rg
  [variation-attached])


;; ---------------------------
;; context

(defcard-doc
  "## context"
  (list-keys "context"))

(defn variation-warning []
  [sc/message {:ash [:warning]}
   "This is the warning context"])

(defcard-doc
  (mkdn-pprint-source variation-warning))

(defcard-rg
  [variation-warning])


(defn variation-info []
  [sc/message {:ash [:info]}
   "This is the info context"])

(defcard-doc
  (mkdn-pprint-source variation-info))

(defcard-rg
  [variation-info])


(defn variation-positive []
  [sc/message {:ash [:positive]}
   "This is the positive context"])

(defcard-doc
  (mkdn-pprint-source variation-positive))

(defcard-rg
  [variation-positive])


(defn variation-success []
  [sc/message {:ash [:success]}
   "This is the success context"])

(defcard-doc
  (mkdn-pprint-source variation-success))

(defcard-rg
  [variation-success])


(defn variation-negative []
  [sc/message {:ash [:negative]}
   "This is the negative context"])

(defcard-doc
  (mkdn-pprint-source variation-negative))

(defcard-rg
  [variation-negative])


(defn variation-error []
  [sc/message {:ash [:error]}
   "This is the error context"])

(defcard-doc
  (mkdn-pprint-source variation-error))

(defcard-rg
  [variation-error])


;; ---------------------------
;; colored

(defcard-doc
  "## colored"
  (list-keys "colored"))

(defn variation-colored-red []
  [sc/message {:ash [:red]}
   "red"])

(defn variation-colored [color]
  [sc/message {:ash [color]}
   (name color)])

(defcard-doc
  (mkdn-pprint-source variation-colored-red))

(defcard-rg
  [:div
   [variation-colored-red]
   [variation-colored :orange]
   [variation-colored :yellow]
   [variation-colored :olive]
   [variation-colored :green]
   [variation-colored :teal]
   [variation-colored :blue]
   [variation-colored :violet]
   [variation-colored :purple]
   [variation-colored :pink]
   [variation-colored :brown]
   [variation-colored :black]
   ])


;; ---------------------------
;; size

(defcard-doc
  "## size"
  (list-keys "size"))

(defn variation-size-mini []
  [sc/message {:ash [:mini]}
   "mini"])

(defn variation-size [size]
  [sc/message {:ash [size]}
   (name size)])

(defcard-doc
  (mkdn-pprint-source variation-size-mini))

(defcard-rg
  [:div
   [variation-size-mini]
   [variation-size :tiny]
   [variation-size :small]
   [sc/message "default"]
   [variation-size :large]
   [variation-size :big]
   [variation-size :huge]
   [variation-size :massive]
   ])
