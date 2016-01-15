(ns soda-ash.elements.loader-card
  (:require-macros [devcards.core
                    :as dc
                    :refer [defcard-rg defcard-doc mkdn-pprint-source]])
  (:require [reagent.core :as reagent]
            [devcards.core]
            [soda-ash.elements.loader :as loader]
            [soda-ash.elements.card-helpers :as h]
            [soda-ash.element :as s]))



(defcard-doc
"
[back](http://localhost:3449/#!/soda_ash.an_overview_card)

# loader

* **default tag** :i
* **:type** :text
* **variations** :centered? | :inline | :inverted? | :size | :state

where

* **:inline** :default | :small | :large
* **:size** :mini | :small | :medium | :large
* **:state** :indeterminate | :active | :disabled

---
")



;; ====================
;; TYPES

(defcard-doc
"# TYPES")


;; Loader

(defn loader []
  [s/segment {}
   [h/fake-content]
   [:div.ui.active.dimmer
    [s/loader {}]]])

(defcard-doc
  "
### Loader

A loader

Notes:

* Loaders are hidden unless active or inside an active dimmer.
"
  (mkdn-pprint-source loader))

(defcard-rg
  [loader])


;; Text

(defn text []
  [s/segment {}
   [h/fake-content]
   [:div.ui.active.inverted.dimmer
    [s/loader {:soda {:type :text}}
     "Loading"]]])

(defcard-doc
  "
### Text Loader

A loader can contain text
"
  (mkdn-pprint-source text))

(defcard-rg
  [text])



;; ====================
;; STATES

(defcard-doc
  "# STATES")


;; Indeterminate

(defn indeterminate []
  [s/segment {}
   [:div.ui.active.dimmer
    [s/loader {:soda {:type :text
                      :state :indeterminate}}
     "Preparing Files"]]
   [h/fake-content]])

(defcard-doc
  "
### Indeterminate

A loader can show it's unsure of how long a task will take
"
  (mkdn-pprint-source indeterminate))

(defcard-rg
  [indeterminate])


;; Active

(defn active []
  [s/segment {}
   [s/loader {:soda {:state :active}}]
   [h/fake-content]])

(defcard-doc
  "
### Active

A loader can be active or visible

Notes:

* An active dimmer may not be clearly visible without using a ui dimmer
"
  (mkdn-pprint-source active))

(defcard-rg
  [active])


;; Disabled

(defn disabled []
  [s/segment {}
   [s/loader {:soda {:state :disabled}}]
   [h/fake-content]])

(defcard-doc
  "
### Disabled

A loader can be disabled or hidden

Notes:

* An disabled dimmer may not be clearly visible without using a ui dimmer
"
  (mkdn-pprint-source disabled))

(defcard-rg
  [disabled])



;; ====================
;; VARIATIONS

(defcard-doc
"# VARIATIONS")


;; Inline

(defn inline []
  [:div
   [s/loader {:soda {:state :active
                     :inline :small}}]
   [s/loader {:soda {:state :active
                     :inline :default}}]
   [s/loader {:soda {:state :active
                     :inline :large}}]

   ;; centered
   [s/loader {:soda {:state :active
                     :centered? true
                     :inline :small}}]
   [s/loader {:soda {:state :active
                     :centered? true
                     :inline :default}}]
   [s/loader {:soda {:state :active
                     :centered? true
                     :inline :large}}]
   ])

(defcard-doc
  "
### Inline

Loaders can appear inline with content
"
  (mkdn-pprint-source inline))

(defcard-rg
  [inline])



;; Size

(defn size []
  [:div
   [s/segment {}
    [:div.ui.active.dimmer
     [s/loader {:soda {:type :text
                       :size :mini}}
      "Loading"]]
    [h/fake-content]]


   [s/segment {}
    [:div.ui.active.dimmer
     [s/loader {:soda {:type :text
                       :size :small}}
      "Loading"]]
    [h/fake-content]]

   [s/segment {}
    [:div.ui.active.dimmer
     [s/loader {:soda {:type :text
                       :size :medium}}
      "Loading"]]
    [h/fake-content]]


   [s/segment {}
    [:div.ui.active.dimmer
     [s/loader {:soda {:type :text
                       :size :lage}}
      "Loading"]]
    [h/fake-content]]])

(defcard-doc
  "
### Size

Loaders can have different sizes
"
  (mkdn-pprint-source size))

(defcard-rg
  [size])


;; Inverted

(defn inverted []
  [:div
   [s/segment {:soda {:inverted? true}}
    [s/loader {:soda {:state :active
                      :inverted? true}}]
    [h/fake-content]]

   ;; with dimmer
   [s/segment {}
    [:div.ui.active.inverted.dimmer
     [s/loader {}]]
    [h/fake-content]]
   ])

(defcard-doc
  "
### Inverted

Loaders can have their colors inverted.

Notes:

* Loaders will automatically be inverted inside inverted dimmer
"
  (mkdn-pprint-source inverted))

(defcard-rg
  [inverted])
