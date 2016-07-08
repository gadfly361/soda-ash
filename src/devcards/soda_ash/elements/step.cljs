(ns soda-ash.elements.step-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.core :as sa]
   [soda-ash.helpers :as h]
   [soda-ash.elements.step :as step]
   [soda-ash.elements.steps :as steps]))


(def list-keys
  (h/list-keys step/groups))

(def list-steps-keys
  (h/list-keys steps/groups))


(defcard-doc
  "# SUMMARY OF STEP"
  "## Types"
  (h/list-types step/types "step" true)

  "## States (*soda*)"
  (list-keys "states")

  "## Content"
  "### description"
  "Use .title & .description classes"
  "### icon"
  "Use sa/icon"
  "### link"
  "Use sa/step-link"
  )

(defcard-doc
  "# SUMMARY OF STEPS"
  "## Types"
  (h/list-types steps/types "steps" true)

  "## Variations (*ash*)"
  "### Stackable"
  (list-steps-keys "stackable")
  "### Fluid"
  (list-steps-keys "fluid")
  "### Attached"
  (list-steps-keys "attached")
  "### Divided"
  (list-steps-keys "divided")
  "### Size"
  (list-steps-keys "size")
  )



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Step
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Step Types

(defcard-doc
  "
---
# Step Types"
  (h/list-types step/types "step" true)
  )

(defn type-default []
  [sa/steps
   [sa/step "Step"]])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])


(defn type-link []
  [sa/steps
   [sa/step-link
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
  [sa/steps
   [sa/step {:soda :active}
    "Step"]])

(defcard-doc
  (mkdn-pprint-source state-active))

(defcard-rg
  [state-active])


(defn state-completed []
  [sa/steps-ordered
   [sa/step {:soda :completed}
    "Step"]])

(defcard-doc
  (mkdn-pprint-source state-completed))

(defcard-rg
  [state-completed])


(defn state-disabled []
  [sa/steps
   [sa/step {:soda :disabled}
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
  "## description"
  "Use .title & .description classes")

(defn content-description []
  [sa/steps
   [sa/step
    [:div.title
     "Shipping"]
    [:div.description
     "Choose your shipping options"]]])

(defcard-doc
  (mkdn-pprint-source content-description))

(defcard-rg
  [content-description])


;; ---------------------------
;; icon

(defcard-doc
  "## icon"
  "Use sa/icon")

(defn content-icon []
  [sa/steps
   [sa/step
    [sa/icon-mail]
    "Step 2"]])

(defcard-doc
  (mkdn-pprint-source content-icon))

(defcard-rg
  [content-icon])


;; ---------------------------
;; link

(defcard-doc
  "## link"
  "Use sa/step-link")

(defn content-link []
  [sa/steps
   [sa/step-link ;; <-- sa/step-link
    [sa/icon-mail]
    [:div.content ;; <-- need .content here
     [:div.title "Shipping"]
     [:div.description "Choose your mailing options"]]]])

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
  (h/list-types steps/types "steps" true)
  )

(defn steps-default []
  [sa/steps
   [sa/step "Step 1"]
   [sa/step "Step 2"]])

(defcard-doc
  (mkdn-pprint-source steps-default))

(defcard-rg
  [steps-default])


(defn steps-ordered []
  [sa/steps-ordered
   [sa/step "Step 1"]
   [sa/step "Step 2"]])

(defcard-doc
  (mkdn-pprint-source steps-ordered))

(defcard-rg
  [steps-ordered])


(defn steps-vertical []
  [sa/steps-vertical
   [sa/step "Step 1"]
   [sa/step "Step 2"]])

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
  [sa/steps {:ash [:tablet-stackable]}
   [sa/step "Step 1"]
   [sa/step "Step 2"]
   [sa/step "Step 3"]])

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
  [sa/steps {:ash [:fluid]}
   [sa/step "Step 1"]
   [sa/step "Step 2"]
   [sa/step "Step 3"]])

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
   [sa/steps {:ash [:attached]}
    [sa/step "Step 1"]
    [sa/step "Step 2"]
    [sa/step "Step 3"]]

   [sa/segment {:ash [:attached]}
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]

   [sa/steps {:ash [:bottom-attached]}
    [sa/step "Step 1"]
    [sa/step "Step 2"]
    [sa/step "Step 3"]]
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
   [sa/steps {:ash [:two]}
    [sa/step "Step 1"]
    [sa/step "Step 2"]]])

(defn steps-divided [n]
  (let [divide ({2 :two
                 3 :three
                 4 :four
                 5 :five
                 6 :six
                 7 :seven
                 8 :eight} n)]
    [:div [:br]
     [sa/steps {:ash [divide]}
      (for [n' (range 1 (+ 1 n))]
        ^{:key n'}
        [sa/step (str "Step " n')])]]))

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
   [sa/steps {:ash [:mini]}
    [sa/step "mini"]
    [sa/step "foo"]
    [sa/step "bar"]]])

(defn steps-size [size]
  [:div [:br]
   [sa/steps {:ash [size]}
    [sa/step (name size)]
    [sa/step "foo"]
    [sa/step "bar"]]])

(defcard-doc
  (mkdn-pprint-source steps-size-mini))

(defcard-rg
  [:div
   [steps-size-mini]
   [steps-size :tiny]
   [steps-size :small]
   [:div [:br]
    [sa/steps
     [sa/step "default"]
     [sa/step "foo"]
     [sa/step "bar"]]]
   [steps-size :large]
   [steps-size :big]
   [steps-size :huge]
   [steps-size :massive]
   ])
