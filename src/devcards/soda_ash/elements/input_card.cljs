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


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; states

(defcard-doc
  "
---
# States"
  (list-keys "states"))

(defn state-focus []
   [se/input {:data-soda :focus}
    [:input {:type        "text"
             :placeholder "Focus..."}]])

(defcard-doc
  (mkdn-pprint-source state-focus))

(defcard-rg focus
  [state-focus])


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


(defn state-disabled []
   [se/input {:data-soda :disabled}
    [:input {:type        "text"
             :placeholder "Disabled..."}]])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg disabled
  [state-disabled])


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


;; ---------------------------
;; Icon

(defcard-doc
  "## Icon"
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


;; ---------------------------
;; Labeled

(defcard-doc
  "## Labeled"
  (list-keys "labeled"))

;; TODO: add label examples when label is ready


;; ---------------------------
;; Action

(defcard-doc
  "## Action"
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


;; ---------------------------
;; Transparent

(defcard-doc
  "## Transparent"
  (list-keys "transparent"))

(defn transparent []
  [se/input {:data-ash [:transparent]}
   [:input {:type        "text"
            :placeholder "Transparent..."}]])

(defcard-doc
  (mkdn-pprint-source transparent))

(defcard-rg transparent
  [transparent])


;; ---------------------------
;; Inverted

(defcard-doc
  "## Inverted"
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


;; ---------------------------
;; Fluid

(defcard-doc
  "## Fluid"
  (list-keys "fluid"))

(defn fluid []
  [se/input {:data-ash [:fluid]}
   [:input {:type        "text"
            :placeholder "Fluid..."}]])

(defcard-doc
  (mkdn-pprint-source fluid))

(defcard-rg fluid
  [fluid])


;; ---------------------------
;; Size

(defcard-doc
  "## Size"
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
