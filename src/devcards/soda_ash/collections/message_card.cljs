(ns soda-ash.collections.message-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
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

(defcard-rg default
  [type-default])


(defn type-icon []
  [sc/message-icon
   [se/icon-inbox]
   [sco/content
    [sco/header "Have you heard about our mailing list?"]
    [:p "Get the best new in your e-mail every day."]]])

(defcard-doc
  (mkdn-pprint-source type-icon))

(defcard-rg icon
  [type-icon])


(defn type-list []
  [sc/message
   [sco/header "A message can include a list"]
   [se/s-list
    [sco/item "item 1"]
    [sco/item "item 2"]]])

(defcard-doc
  (mkdn-pprint-source type-list))

(defcard-rg list
  [type-list])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; State

(defcard-doc
  "
---
# State"
  (list-keys "states"))


(defn state-hidden []
  [sc/message {:data-soda :hidden}
   [:p "You can't see me"]])

(defcard-doc
  (mkdn-pprint-source state-hidden))

(defcard-rg hidden
  [state-hidden])


(defn state-visible []
  [sc/message {:data-soda :visible}
   [:p "You can always see me"]])

(defcard-doc
  (mkdn-pprint-source state-visible))

(defcard-rg visible
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
  [sc/message {:data-ash [:floating]}
   [:p "A message can float above the content that it is related to"]])

(defcard-doc
  (mkdn-pprint-source variation-floating))

(defcard-rg floating
  [variation-floating])


;; ---------------------------
;; compact

(defcard-doc
  "## compact"
  (list-keys "compact"))

(defn variation-compact []
  [sc/message {:data-ash [:compact]}
   [:p "A message can only take up the width of its content."]])

(defcard-doc
  (mkdn-pprint-source variation-compact))

(defcard-rg compact
  [variation-compact])


;; ---------------------------
;; attached

(defcard-doc
  "## attached"
  (list-keys "attached"))

(defn variation-attached []
  [:div
  [sc/message {:data-ash [:attached]}
   [:p "A message can be attached on the top"]]

   [se/segment {:data-ash [:attached]}
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]

   [sc/message {:data-ash [:bottom-attached]}
    [:p "A message can be attached on the bottom"]]
   ])

(defcard-doc
  (mkdn-pprint-source variation-attached))

(defcard-rg attached
  [variation-attached])


;; ---------------------------
;; context

(defcard-doc
  "## context"
  (list-keys "context"))

(defn variation-warning []
  [sc/message {:data-ash [:warning]}
   "This is the warning context"])

(defcard-doc
  (mkdn-pprint-source variation-warning))

(defcard-rg warning
  [variation-warning])


(defn variation-info []
  [sc/message {:data-ash [:info]}
   "This is the info context"])

(defcard-doc
  (mkdn-pprint-source variation-info))

(defcard-rg info
  [variation-info])


(defn variation-positive []
  [sc/message {:data-ash [:positive]}
   "This is the positive context"])

(defcard-doc
  (mkdn-pprint-source variation-positive))

(defcard-rg positive
  [variation-positive])


(defn variation-success []
  [sc/message {:data-ash [:success]}
   "This is the success context"])

(defcard-doc
  (mkdn-pprint-source variation-success))

(defcard-rg success
  [variation-success])


(defn variation-negative []
  [sc/message {:data-ash [:negative]}
   "This is the negative context"])

(defcard-doc
  (mkdn-pprint-source variation-negative))

(defcard-rg negative
  [variation-negative])


(defn variation-error []
  [sc/message {:data-ash [:error]}
   "This is the error context"])

(defcard-doc
  (mkdn-pprint-source variation-error))

(defcard-rg error
  [variation-error])


;; ---------------------------
;; colored

(defcard-doc
  "## colored"
  (list-keys "colored"))

(defn variation-colored-red []
  [sc/message {:data-ash [:red]}
   "red"])

(defn variation-colored [color]
  [sc/message {:data-ash [color]}
   (name color)])

(defcard-doc
  (mkdn-pprint-source variation-colored-red))

(defcard-rg colored
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
  [sc/message {:data-ash [:mini]}
   "mini"])

(defn variation-size [size]
  [sc/message {:data-ash [size]}
   (name size)])

(defcard-doc
  (mkdn-pprint-source variation-size-mini))

(defcard-rg size
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
