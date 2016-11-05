(ns soda-ash.elements.input-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.helpers :as h]
   [soda-ash.elements.input :as input]))


(def list-keys
  (h/list-keys input/variations))

(defcard-doc
  (h/devcard-docs input/opts))

(defcard-doc
  "Require the following:
   ```
  [soda-ash.element :as se]
  ```")



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types input/opts))

(defcard-doc
  "**Input**"
  "A default input")

(defn type-default []
  [se/input
   [:input {:type "text"
            :placeholder "Default"}]])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg default
  [type-default])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# States"
  (list-keys "states"))


(defcard-doc
  "**Focus**"
  "An input field can show a user is currently interacting with it")

(defn state-focus []
   [se/input {:data-soda :focus}
    [:input {:type        "text"
             :placeholder "Focus..."}]])

(defcard-doc
  (mkdn-pprint-source state-focus))

(defcard-rg focus
  [state-focus])


(defcard-doc
  "**Loading**"
  "An icon input field can show that it is currently loading data")

(defn state-loading []
  [se/input {:data-soda :loading
             :data-ash [:left-icon]}
   [se/icon-search]
    [:input {:type        "text"
             :placeholder "Loading..."}]])

(defcard-doc
  (mkdn-pprint-source state-loading))

(defcard-rg loading
  [state-loading])


(defcard-doc
  "**Disabled**"
  "An input field can show that it is disabled")

(defn state-disabled []
   [se/input {:data-soda :disabled}
    [:input {:type        "text"
             :placeholder "Disabled..."}]])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg disabled
  [state-disabled])


(defcard-doc
  "**Error**"
  "An input field can show the data contains errors")

(defn state-error []
  [se/input {:data-soda :error}
    [:input {:type        "text"
             :placeholder "Error..."}]])

(defcard-doc
  (mkdn-pprint-source state-error))

(defcard-rg error
  [state-error])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")

(defcard-doc
  "**Icon**"
  "An input can be formatted with an icon"
  (list-keys "icon"))

(defn icon []
  [:div
   [se/input {:data-ash [:icon]}
    [:input {:type        "text"
             :placeholder "Icon..."}]
    [se/icon-search]]
   ])

(defcard-doc
  (mkdn-pprint-source icon))

(defcard-rg icon
  [icon])


(defn left-icon []
  [:div
   [se/input {:data-ash [:left-icon]}
    [:input {:type        "text"
             :placeholder "Left Icon..."}]
    [se/icon-search]]
   ])

(defcard-doc
  (mkdn-pprint-source left-icon))

(defcard-rg left-icon
  [left-icon])



(defcard-doc
  "**Labeled**"
  "An input can be formatted with a label"
  (list-keys "labeled"))

(defn labeled []
  [se/input {:data-ash [:labeled]}
   [se/label "http://"]
    [:input {:type        "text"
             :placeholder "mysite.com"}]])

(defcard-doc
  (mkdn-pprint-source labeled))

(defcard-rg labeled
  [labeled])


(defn right-labeled []
  [se/input {:data-ash [:right-labeled]}
   [:input {:type        "text"
            :placeholder "mydomain"}]
   [se/label ".com"]])

(defcard-doc
  (mkdn-pprint-source right-labeled))

(defcard-rg right-labeled
  [right-labeled])



(defcard-doc
  "**Action**"
  "An input can be formatted to alert the user to an action they may
  perform"
  (list-keys "action"))

(defn action []
  [se/input {:data-ash [:action]}
   [:input {:type        "text"
            :placeholder "Action..."}]
   [se/button {:on-click #(js/alert "clicked!")}
    "Search"]])

(defcard-doc
  (mkdn-pprint-source action))

(defcard-rg action
  [action])


(defn left-action []
  [se/input {:data-ash [:left-action]}
   [se/button {:on-click #(js/alert "clicked!")}
    "Search"]
   [:input {:type        "text"
            :placeholder "Left Action..."}]])

(defcard-doc
  (mkdn-pprint-source left-action))

(defcard-rg left-action
  [left-action])



(defcard-doc
  "**Transparent**"
  "A transparent input has no background"
  (list-keys "transparent"))

(defn transparent []
  [se/input {:data-ash [:transparent]}
   [:input {:type        "text"
            :placeholder "Transparent..."}]])

(defcard-doc
  (mkdn-pprint-source transparent))

(defcard-rg transparent
  [transparent])



(defcard-doc
  "**Inverted**"
  "An input can be formatted to appear on dark backgrounds"
  (list-keys "inverted"))

(defn inverted []
  [se/segment {:data-ash [:inverted]}
   [se/input {:data-ash [:inverted]}
    [:input {:type        "text"
             :placeholder "Inverted..."}]]
   ])

(defcard-doc
  (mkdn-pprint-source inverted))

(defcard-rg inverted
  [inverted])



(defcard-doc
  "**Fluid**"
  "An input can take the size of its container"
  (list-keys "fluid"))

(defn fluid []
  [se/input {:data-ash [:fluid]}
   [:input {:type        "text"
            :placeholder "Fluid..."}]])

(defcard-doc
  (mkdn-pprint-source fluid))

(defcard-rg fluid
  [fluid])



(defcard-doc
  "**Size**"
  "An input can vary in size"
  (list-keys "size"))

(defn size []
  [se/input {:data-ash [:mini
                   :fluid]}
   [:input {:type        "text"
            :placeholder "Mini..."}]])

(defcard-doc
  (mkdn-pprint-source size))

(defcard-rg size
  [:div
   [size]
   [se/input {:data-ash [:small
                    :fluid]}
    [:input {:type        "text"
             :placeholder "Small..."}]]

   [se/input {:data-ash [:fluid]}
    [:input {:type        "text"
             :placeholder "Default size..."}]]

   [se/input {:data-ash [:large
                    :fluid]}
    [:input {:type        "text"
             :placeholder "Large..."}]]

   [se/input {:data-ash [:big
                    :fluid]}
    [:input {:type        "text"
             :placeholder "Big..."}]]

   [se/input {:data-ash [:huge
                    :fluid]}
    [:input {:type        "text"
             :placeholder "Huge..."}]]

   [se/input {:data-ash [:massive
                    :fluid]}
    [:input {:type        "text"
             :placeholder "Massive..."}]]
   ])
