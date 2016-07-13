(ns soda-ash.elements.step-card
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
   [soda-ash.elements.step :as step]
   [soda-ash.elements.steps :as steps]))


(def list-keys
  (h/list-keys step/states))

(def list-steps-keys
  (h/list-keys steps/variations))


(defcard-doc
  (h/devcard-docs step/opts))

(defcard-doc
  (h/devcard-docs steps/opts))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Step
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Step Types

(defcard-doc
  "
---
# Step Types"
  (h/list-types step/opts))

(defn type-default []
  [se/steps
   [se/step "Step"]])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])


(defn type-link []
  [se/steps
   [se/step-link
    "Step"]])

(defcard-doc
  (mkdn-pprint-source type-link))

(defcard-rg
  [type-link])


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Step States

(defcard-doc
  "
---
# Step States"
  (list-keys "states"))

(defn state-active []
  [se/steps
   [se/step {:soda :active}
    "Step"]])

(defcard-doc
  (mkdn-pprint-source state-active))

(defcard-rg
  [state-active])


(defn state-completed []
  [se/steps-ordered
   [se/step {:soda :completed}
    "Step"]])

(defcard-doc
  (mkdn-pprint-source state-completed))

(defcard-rg
  [state-completed])


(defn state-disabled []
  [se/steps
   [se/step {:soda :disabled}
    "Step"]])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg
  [state-disabled])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Step Content

(defcard-doc
  "
---
# Step Content")


;; ---------------------------
;; description

(defcard-doc
  "## description")

(defn content-description []
  [se/steps
   [se/step
    [sco/title
     "Shipping"]
    [sco/description
     "Choose your shipping options"]]])

(defcard-doc
  (mkdn-pprint-source content-description))

(defcard-rg
  [content-description])


;; ---------------------------
;; icon

(defcard-doc
  "## icon")

(defn content-icon []
  [se/steps
   [se/step
    [se/icon-mail]
    "Step 2"]])

(defcard-doc
  (mkdn-pprint-source content-icon))

(defcard-rg
  [content-icon])


;; ---------------------------
;; link

(defcard-doc
  "## link")

(defn content-link []
  [se/steps
   [se/step-link
    [se/icon-mail]
    [sco/content
     [sco/title "Shipping"]
     [sco/description "Choose your mailing options"]]]])

(defcard-doc
  (mkdn-pprint-source content-link))

(defcard-rg
  [content-link])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Steps
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Steps Types

(defcard-doc
  "
---
# Steps Types"
  (h/list-types steps/opts))

(defn steps-default []
  [se/steps
   [se/step "Step 1"]
   [se/step "Step 2"]])

(defcard-doc
  (mkdn-pprint-source steps-default))

(defcard-rg
  [steps-default])


(defn steps-ordered []
  [se/steps-ordered
   [se/step "Step 1"]
   [se/step "Step 2"]])

(defcard-doc
  (mkdn-pprint-source steps-ordered))

(defcard-rg
  [steps-ordered])


(defn steps-vertical []
  [se/steps-vertical
   [se/step "Step 1"]
   [se/step "Step 2"]])

(defcard-doc
  (mkdn-pprint-source steps-vertical))

(defcard-rg
  [steps-vertical])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Steps Variations

(defcard-doc
  "
---
# Steps Variations")

;; ---------------------------
;; Stackable

(defcard-doc
  "## Stackable"
  (list-steps-keys "stackable"))

(defn steps-stackable []
  [se/steps {:ash [:tablet-stackable]}
   [se/step "Step 1"]
   [se/step "Step 2"]
   [se/step "Step 3"]])

(defcard-doc
  (mkdn-pprint-source steps-stackable))

(defcard-rg
  [steps-stackable])


;; ---------------------------
;; Fluid

(defcard-doc
  "## Fluid"
  (list-steps-keys "fluid"))

(defn steps-fluid []
  [se/steps {:ash [:fluid]}
   [se/step "Step 1"]
   [se/step "Step 2"]
   [se/step "Step 3"]])

(defcard-doc
  (mkdn-pprint-source steps-fluid))

(defcard-rg
  [steps-fluid])


;; ---------------------------
;; Attached

(defcard-doc
  "## Attached"
  (list-steps-keys "attached"))

(defn steps-attached []
  [:div
   [se/steps {:ash [:attached]}
    [se/step "Step 1"]
    [se/step "Step 2"]
    [se/step "Step 3"]]

   [se/segment {:ash [:attached]}
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]

   [se/steps {:ash [:bottom-attached]}
    [se/step "Step 1"]
    [se/step "Step 2"]
    [se/step "Step 3"]]
   ])

(defcard-doc
  (mkdn-pprint-source steps-attached))

(defcard-rg
  [steps-attached])


;; ---------------------------
;; Divided

(defcard-doc
  "## Divided"
  (list-steps-keys "divided"))

(defn steps-divided-two []
  [:div
   [se/steps {:ash [:two]}
    [se/step "Step 1"]
    [se/step "Step 2"]]])

(defn steps-divided [n]
  (let [divide ({2 :two
                 3 :three
                 4 :four
                 5 :five
                 6 :six
                 7 :seven
                 8 :eight} n)]
    [:div [:br]
     [se/steps {:ash [divide]}
      (for [n' (range 1 (+ 1 n))]
        ^{:key n'}
        [se/step (str "Step " n')])]]))

(defcard-doc
  (mkdn-pprint-source steps-divided-two))

(defcard-rg
  [:div
   [steps-divided-two]
   (for [n (range 3 9)]
     ^{:key n}
     [steps-divided n])])


;; ---------------------------
;; Size

(defcard-doc
  "## Size"
  (list-steps-keys "size"))

(defn steps-size-mini []
  [:div
   [se/steps {:ash [:mini]}
    [se/step "mini"]
    [se/step "foo"]
    [se/step "bar"]]])

(defn steps-size [size]
  [:div [:br]
   [se/steps {:ash [size]}
    [se/step (name size)]
    [se/step "foo"]
    [se/step "bar"]]])

(defcard-doc
  (mkdn-pprint-source steps-size-mini))

(defcard-rg
  [:div
   [steps-size-mini]
   [steps-size :tiny]
   [steps-size :small]
   [:div [:br]
    [se/steps
     [se/step "default"]
     [se/step "foo"]
     [se/step "bar"]]]
   [steps-size :large]
   [steps-size :big]
   [steps-size :huge]
   [steps-size :massive]
   ])
