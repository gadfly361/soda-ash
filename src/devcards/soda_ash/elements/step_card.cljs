(ns soda-ash.elements.step-card
  (:require-macros [devcards.core
                    :as dc
                    :refer [defcard-rg defcard-doc mkdn-pprint-source]])
  (:require [reagent.core :as reagent]
            [devcards.core]
            [soda-ash.elements.card-helpers :as h]
            [soda-ash.element :as s]))



(defcard-doc
"
[back](#!/soda_ash.an_overview_card)

# step

* **base class** step
* **default tag** :div
* **:type** :default | :link
* **:state** :default | :active | :completed | :disabled
* **content** description

# steps
* **base class** ui steps
* **default tag** :div
* **:type** :default :ordered | :vertical | :tablet-stackable
* **variations** :attached | :divided | :fluid? | :size

where

* **:attached** :top | :bottom
* **:divided** :one | :two | ...
* **:size** :default | :small | :large

---
")



;; ====================
;; TYPES

(defcard-doc
  "# TYPES")


;; Step

(defn step []
  [s/steps {}
   [s/step {}
    "Shipping"]])

(defcard-doc
  "
### Step

A single step
"
  (mkdn-pprint-source step))

(defcard-rg
  [step])



;; ====================
;; GROUPS

(defcard-doc
  "# GROUPS")


;; Steps

(defn steps []
  [s/steps {}

   [s/step {}
    [s/icon {:soda {:icon :truck}}]
    [:div.content
     [:div.title "Shipping"]
     [:div.description "Choose your shipping options"]]]

   [s/step {:soda {:state :active}}
    [s/icon {:soda {:icon :payment}}]
    [:div.content
     [:div.title "Billing"]
     [:div.description "Enter billing information"]]]

   [s/step {:soda {:state :disabled}}
    [s/icon {:soda {:icon :info}}]
    [:div.content
     [:div.title "Confirm Order"]]]])

(defcard-doc
  "
### Steps

A set of steps

Notes:

* Responsive Element. Steps will automatically stack on mobile. To make steps automatically stack for tablet use :tablet-stackable?.
"
  (mkdn-pprint-source steps))

(defcard-rg
  [steps])


;; Ordered

(defn ordered []
  [s/steps {:soda {:type :ordered}}

   [s/step {:soda {:state :completed}}
    [:div.content
     [:div.title "Shipping"]
     [:div.description "Choose your shipping options"]]]

   [s/step {:soda {:state :completed}}
    [:div.content
     [:div.title "Billing"]
     [:div.description "Enter billing information"]]]

   [s/step {:soda {:state :active}}
    [:div.content
     [:div.title "Confirm Order"]]]])

(defcard-doc
  "
### Ordered

A step can show a ordered sequence of steps
"
  (mkdn-pprint-source ordered))

(defcard-rg
  [ordered])


;; Vertical

(defn vertical []
  [s/steps {:soda {:type :vertical}}

   [s/step {:soda {:state :completed}}
    [s/icon {:soda {:icon :truck}}]
    [:div.content
     [:div.title "Shipping"]
     [:div.description "Choose your shipping options"]]]

   [s/step {:soda {:state :completed}}
    [s/icon {:soda {:icon :payment}}]
    [:div.content
     [:div.title "Billing"]
     [:div.description "Enter billing information"]]]

   [s/step {:soda {:state :active}}
    [s/icon {:soda {:icon :info}}]
    [:div.content
     [:div.title "Confirm Order"]]]])

(defcard-doc
  "
### Vertical

A step can be displayed stacked vertically
"
  (mkdn-pprint-source vertical))

(defcard-rg
  [vertical])



;; ====================
;; CONTENT

(defcard-doc
  "# CONTENT")


;; Description

(defn description []
  [s/steps {}
   [s/step {}
    [:div.title "Shipping"]
    [:div.description
     "Choose your shipping options"]]])

(defcard-doc
  "
### Description

A step can contain a description
"
  (mkdn-pprint-source description))

(defcard-rg
  [description])


;; Icon

(defn icon []
  [s/steps {}
   [s/step {}
    [s/icon {:soda {:icon :truck}}]
    [:div.content
     [:div.title "Shipping"]
     [:div.description
      "Choose your shipping options"]]]])

(defcard-doc
  "
### Icon

A step can contain a icon
"
  (mkdn-pprint-source icon))

(defcard-rg
  [icon])


;; Link1

(defn link1 []
  [s/steps {}

   [s/step {:soda {:tag :a
                   :state :active}}
    [s/icon {:soda {:icon :truck}}]
    [:div.content
     [:div.title "Shipping"]
     [:div.description
      "Choose your shipping options"]]]

   [s/step {}
    [:div.content
     [:div.title "Billing"]
     [:div.description
      "Enter billing information"]]]])

(defcard-doc
  "
### Link

A step can link
"
  (mkdn-pprint-source link1))

(defcard-rg
  [link1])


;; Link2

(defn link2 []
  [s/steps {}

   [s/step {:soda {:type :link}}
    [s/icon {:soda {:icon :truck}}]
    [:div.content
     [:div.title "Shipping"]
     [:div.description
      "Choose your shipping options"]]]

   [s/step {:soda {:type :link}}
    [:div.content
     [:div.title "Billing"]
     [:div.description
      "Enter billing information"]]]])

(defcard-doc
  "
### Link

A step can link
"
  (mkdn-pprint-source link2))

(defcard-rg
  [link2])



;; ====================
;; STATES

(defcard-doc
  "# STATES")


;; Active

(defn active []
  [s/steps {}
   [s/step {:soda {:state :active}}
    [s/icon {:soda {:icon :payment}}]
    [:div.content
     [:div.title "Billing"]
     [:div.description "Enter billing information"]]]])

(defcard-doc
  "
### Active

A step can be highlighted as active
"
  (mkdn-pprint-source active))

(defcard-rg
  [active])


;; Completed

(defn completed []
  [s/steps {}
   [s/step {:soda {:state :completed}}
    [s/icon {:soda {:icon :payment}}]
    [:div.content
     [:div.title "Billing"]
     [:div.description "Enter billing information"]]]])

(defcard-doc
  "
### Completed

A step can show that a user has completed it
"
  (mkdn-pprint-source completed))

(defcard-rg
  [completed])


;; Disabled

(defn disabled []
  [s/steps {}
   [s/step {:soda {:state :disabled}}
    [s/icon {:soda {:icon :payment}}]
    [:div.content
     [:div.title "Billing"]
     [:div.description "Enter billing information"]]]])

(defcard-doc
  "
### Disabled

A step can show that it cannot be selected
"
  (mkdn-pprint-source disabled))

(defcard-rg
  [disabled])



;; ====================
;; VARIATIONS

(defcard-doc
  "# VARIATIONS")


;; Stackable

(defn stackable []
  [s/steps {:soda {:type :tablet-stackable}}

   [s/step {}
    [s/icon {:soda {:icon :plane}}]
    [:div.content
     [:div.title "Shipping"]
     [:div.description "Choose your shipping options"]]]

   [s/step {:soda {:state :active}}
    [s/icon {:soda {:icon :payment}}]
    [:div.content
     [:div.title "Billing"]
     [:div.description "Enter billing information"]]]

   [s/step {:soda {:state :disabled}}
    [s/icon {:soda {:icon :info}}]
    [:div.content
     [:div.title "Confirm Order"]]]])

(defcard-doc
  "
### Stackable

A step can stack vertically only on smaller screens
"
  (mkdn-pprint-source stackable))

(defcard-rg
  [stackable])


;; Fluid

(defn fluid []
  [:div.ui.two.column.grid

   [:div.column
    [s/steps {:soda {:type :vertical
                     :fluid? true}}

     [s/step {}
      [s/icon {:soda {:icon :plane}}]
      [:div.content
       [:div.title "Shipping"]
       [:div.description "Choose your shipping options"]]]

     [s/step {:soda {:state :active}}
      [s/icon {:soda {:icon :payment}}]
      [:div.content
       [:div.title "Billing"]
       [:div.description "Enter billing information"]]]]]

   [:div.column "The steps take up the entire column width"]])

(defcard-doc
  "
### Fluid

A fluid step takes up the width of its container
"
  (mkdn-pprint-source fluid))

(defcard-rg
  [fluid])


;; Attached

(defn attached []
  [:div
   ;; top
   [s/steps {:soda {:attached :top
                    :divided :three}}

    [s/step {}
     [s/icon {:soda {:icon :plane}}]
     [:div.content
      [:div.title "Shipping"]
      [:div.description "Choose your shipping options"]]]

    [s/step {:soda {:state :active}}
     [s/icon {:soda {:icon :payment}}]
     [:div.content
      [:div.title "Billing"]
      [:div.description "Enter billing information"]]]

    [s/step {:soda {:state :disabled}}
     [s/icon {:soda {:icon :info}}]
     [:div.content
      [:div.title "Confirm Order"]]]]

   ;; body
   [h/fake-content]

   ;; bottom
   [s/steps {:soda {:attached :bottom
                    :divided :three}}

    [s/step {}
     [s/icon {:soda {:icon :plane}}]
     [:div.content
      [:div.title "Shipping"]
      [:div.description "Choose your shipping options"]]]

    [s/step {:soda {:state :active}}
     [s/icon {:soda {:icon :payment}}]
     [:div.content
      [:div.title "Billing"]
      [:div.description "Enter billing information"]]]

    [s/step {:soda {:state :disabled}}
     [s/icon {:soda {:icon :info}}]
     [:div.content
      [:div.title "Confirm Order"]]]]
   ])

(defcard-doc
  "
### Attached

Steps can be attached to other elements
"
  (mkdn-pprint-source attached))

(defcard-rg
  [attached])


;; Divided

(defn divided []
  [s/steps {:soda {:divided :three}}

   [s/step {}
    [s/icon {:soda {:icon :plane}}]
    [:div.content
     [:div.title "Shipping"]
     [:div.description "Choose your shipping options"]]]

   [s/step {:soda {:state :active}}
    [s/icon {:soda {:icon :payment}}]
    [:div.content
     [:div.title "Billing"]
     [:div.description "Enter billing information"]]]

   [s/step {:soda {:state :disabled}}
    [s/icon {:soda {:icon :info}}]
    [:div.content
     [:div.title "Confirm Order"]]]])

(defcard-doc
  "
### Divided

A step can stack vertically only on smaller screens
"
  (mkdn-pprint-source divided))

(defcard-rg
  [divided])


;; Size

(defn size []
  [:div

   ;; small
   [s/steps {:soda {:size :small}}

    [s/step {}
     [s/icon {:soda {:icon :plane}}]
     [:div.content
      [:div.title "Shipping"]
      [:div.description "Choose your shipping options"]]]

    [s/step {:soda {:state :active}}
     [s/icon {:soda {:icon :payment}}]
     [:div.content
      [:div.title "Billing"]
      [:div.description "Enter billing information"]]]]

   ;; default
   [s/steps {:soda {:size :default}}

    [s/step {}
     [s/icon {:soda {:icon :plane}}]
     [:div.content
      [:div.title "Shipping"]
      [:div.description "Choose your shipping options"]]]

    [s/step {:soda {:state :active}}
     [s/icon {:soda {:icon :payment}}]
     [:div.content
      [:div.title "Billing"]
      [:div.description "Enter billing information"]]]]

   ;; large
   [s/steps {:soda {:size :large}}

    [s/step {}
     [s/icon {:soda {:icon :plane}}]
     [:div.content
      [:div.title "Shipping"]
      [:div.description "Choose your shipping options"]]]

    [s/step {:soda {:state :active}}
     [s/icon {:soda {:icon :payment}}]
     [:div.content
      [:div.title "Billing"]
      [:div.description "Enter billing information"]]]]])

(defcard-doc
  "
### Size

Steps can have different sizes
"
  (mkdn-pprint-source size))

(defcard-rg
  [size])
