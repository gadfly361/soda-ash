(ns soda-ash.elements.input-card
  (:require-macros [devcards.core
                    :as dc
                    :refer [defcard-rg defcard-doc mkdn-pprint-source]])
  (:require [reagent.core :as reagent]
            [devcards.core]
            [soda-ash.elements.input :as input]
            [soda-ash.elements.card-helpers :as h]
            [soda-ash.element :as s]))



(defcard-doc
"
[back](#!/soda_ash.an_overview_card)

# input

* **default tag** :div
* **:state** :focus | :loading | :disabled | :error
* **variations**
    :action | :fluid? | :icon | :inverted? | :labeled | :transparent? |
    :size

where

* **:action** :default | :left
* **:icon** :default | :left
* **:labeled** :default | :right | :left-corner | :corner
* **size**
    :mini | :tiny | :small | :large | :big | :huge | :massive

---
")


;; Input

(defn input []
  [s/input {}
   [:input {:type "text"
            :placeholder "Search..."}]])

(defcard-doc
  "
### Input

A standard input
"
  (mkdn-pprint-source input))

(defcard-rg
  [input])



;; ====================
;; STATES

(defcard-doc
"# STATES")


;; Focus

(defn focus []
  [s/input {:soda {:state :focus}}
   [:input {:type "text"
            :placeholder "Search..."}]])

(defcard-doc
  "
### Focus

An input field can show a user is currently interacting with it
"
  (mkdn-pprint-source focus))

(defcard-rg
  [focus])


;; Loading

(defn loading []
  [s/input {:soda {:icon :left
                   :state :loading}}
   [:input {:type "text"
            :placeholder "Search..."}]
   [s/icon {:soda {:icon :search}}]])

(defcard-doc
  "
### Loading

An icon input field can show that it is currently loading data

Notes:

* Loading inputs automatically modify the input's icon on loading state to show loading indication
"
  (mkdn-pprint-source loading))

(defcard-rg
  [loading])


;; Disabled

(defn disabled []
  [s/input {:soda {:state :disabled}}
   [:input {:type "text"
            :placeholder "Search..."}]])

(defcard-doc
  "
### Disabled

An input field can show that it is disabled
"
  (mkdn-pprint-source disabled))

(defcard-rg
  [disabled])


;; Error

(defn error []
  [s/input {:soda {:state :error}}
   [:input {:type "text"
            :placeholder "Search..."}]])

(defcard-doc
  "
### Error

An input field can show the data contains errors
"
  (mkdn-pprint-source error))

(defcard-rg
  [error])



;; ====================
;; VARIATIONS

(defcard-doc
"# VARIATIONS")


;; Icon

(defn icon []
  [:div
   [s/input {:soda {:icon :default}}
    [:input {:type "text"
             :placeholder "Search..."}]
    [s/icon {:soda {:icon :search}}]]

   [s/divider {}]

   [s/input {:soda {:icon :left}}
    [:input {:type "text"
             :placeholder "Search users..."}]
    [s/icon {:soda {:icon :users}}]]])

(defcard-doc
  "
### Icon

An input can be formatted with an icon

Notes:

* Input icons do not receive pointer-events unless a link icon is used.
"
  (mkdn-pprint-source icon))

(defcard-rg
  [icon])


;; Labeled

(defn labeled []
  [s/input {:soda {:labeled :default}}
   [s/label {} "http://"]
   [:input {:type "text" :placeholder "mysite.com"}]])

(defcard-doc
  "
### Labeled

An input can be formatted with a label
"
  (mkdn-pprint-source labeled))

(defcard-rg
  [labeled])


;; Labeled-right

(defn labeled-right []
  [s/input {:soda {:labeled :right}}
   [:input {:type "text" :placeholder "Enter weight.."}]
   [s/label {:soda {:basic? true}} "kg"]])

(defcard-doc
  (mkdn-pprint-source labeled-right))

(defcard-rg
  [labeled-right])


;; Labeled-right2

(defn labeled-right2 []
  [s/input {:soda {:labeled :right}}
   [s/label {} "$"]
   [:input {:type "text" :placeholder "Amount"}]
   [s/label {:soda {:basic? true}} ".00"]
])

(defcard-doc
  (mkdn-pprint-source labeled-right2))

(defcard-rg
  [labeled-right2])


;; Labeled-right-icon-left

(defn labeled-right-icon-left []
  [s/input {:soda {:labeled :right
                   :icon :left}}
   [s/icon {:soda {:icon :tags}}]
   [:input {:type "text" :placeholder "Enter tags"}]
   [s/label {:soda {:tag :a
                    :type :tag}} "Add Tag"]])

(defcard-doc
  (mkdn-pprint-source labeled-right-icon-left))

(defcard-rg
  [labeled-right-icon-left])


;; Labeled-left-corner

(defn labeled-left-corner []
  [s/input {:soda {:labeled :left-corner}}
   [:input {:type "text" :placeholder "Search"}]
   [s/label {:soda {:type :left-corner}}
    [s/icon {:soda {:icon :asterisk}}]]])

(defcard-doc
  (mkdn-pprint-source labeled-left-corner))

(defcard-rg
  [labeled-left-corner])


;; Labeled-right-corner

(defn labeled-right-corner []
  [s/input {:soda {:labeled :corner}}
   [:input {:type "text" :placeholder "Search"}]
   [s/label {:soda {:type :right-corner}}
    [s/icon {:soda {:icon :asterisk}}]]])

(defcard-doc
  (mkdn-pprint-source labeled-right-corner))

(defcard-rg
  [labeled-right-corner])


;; action

(defn action []
  [s/input {:soda {:action :default}}
   [:input {:type "text" :placeholder "Search"}]
   [s/button {:on-click #(js/console.log "clicked!")}
    "Search"]])

(defcard-doc
  "
### Action

An input can be formatted to alert the user to an action they may perform
"
  (mkdn-pprint-source action))

(defcard-rg
  [action])


;; left-action

(defn left-action []
  [s/input {:soda {:action :left}}
   [s/button {:soda {:type :labeled-icon
                     :color :teal}
              :on-click #(js/console.log "clicked!")}
    [s/icon {:soda {:icon :cart}}]
    "Checkout"]
   [:input {:type "text" :value "52.03"}]])

(defcard-doc
  (mkdn-pprint-source left-action))

(defcard-rg
  [left-action])


;; transparent

(defn transparent []
  [s/input {:soda {:transparent? true}}
   [:input {:type "text" :placeholder "Search..."}]])

(defcard-doc
  "
### Transparent

A transparent input has no background
"
  (mkdn-pprint-source transparent))

(defcard-rg
  [transparent])


;; inverted

(defn inverted []
  [s/segment {:soda {:inverted? true}}
   [s/input {:soda {:inverted? true}}
    [:input {:type "text" :placeholder "Search..."}]]])

(defcard-doc
  "
### Inverted

An input can be formatted to appear on dark backgrounds
"
  (mkdn-pprint-source inverted))

(defcard-rg
  [inverted])


;; fluid

(defn fluid []
  [s/input {:soda {:fluid? true}}
   [:input {:type "text" :placeholder "Search..."}]])

(defcard-doc
  "
### Fluid

An input can take the size of its container
"
  (mkdn-pprint-source fluid))

(defcard-rg
  [fluid])


;; size

(defn size []
  [:div
   [s/input {:soda {:size :mini}}
    [:input {:type "text" :placeholder "Search mini..."}]]

   [s/divider {:soda {:hidden? true}}]
   [s/input {:soda {:size :small}}
    [:input {:type "text" :placeholder "Search small..."}]]

   [s/divider {:soda {:hidden? true}}]
   [s/input {:soda {:size :large}}
    [:input {:type "text" :placeholder "Search large..."}]]

   [s/divider {:soda {:hidden? true}}]
   [s/input {:soda {:size :big}}
    [:input {:type "text" :placeholder "Search big..."}]]

   [s/divider {:soda {:hidden? true}}]
   [s/input {:soda {:size :huge}}
    [:input {:type "text" :placeholder "Search huge..."}]]

   [s/divider {:soda {:hidden? true}}]
   [s/input {:soda {:size :massive}}
    [:input {:type "text" :placeholder "Search massive..."}]]
   ])

(defcard-doc
  "
### Size

An input can vary in size

Notes:

* Inputs will automatically size themselves unless you manually declare a width
"
  (mkdn-pprint-source size))

(defcard-rg
  [size])
