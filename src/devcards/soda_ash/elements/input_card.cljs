(ns soda-ash.elements.input-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.core :as sa]
   [soda-ash.helpers :as h]
   [soda-ash.elements.input :as input]))


(def list-keys
  (h/list-keys input/groups))


(defcard-doc
  "# SUMMARY"

  "## Types"
  (h/list-types nil "input" true)

  "## States (*soda*)"
  (list-keys "states")

  "## Variations (*ash*)"
  "### Icon"
  (list-keys "icon")
  "### Labeled"
  (list-keys "labeled")
  "### Action"
  (list-keys "action")
  "### Transparent"
  (list-keys "transparent")
  "### Inverted"
  (list-keys "inverted")
  "### Fluid"
  (list-keys "fluid")
  "### Size"
  (list-keys "size")
  )


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; states

(defcard-doc
  "
---
# States"
  (list-keys "states"))

(defn state-focus []
   [sa/input {:soda :focus}
    [:input {:type        "text"
             :placeholder "Focus..."}]])

(defcard-doc
  (mkdn-pprint-source state-focus))

(defcard-rg
  [state-focus])


(defn state-loading []
  [sa/input {:soda :loading
             :ash [:left-icon]}
   [sa/icon-search]
    [:input {:type        "text"
             :placeholder "Loading..."}]])

(defcard-doc
  (mkdn-pprint-source state-loading))

(defcard-rg
  [state-loading])


(defn state-disabled []
   [sa/input {:soda :disabled}
    [:input {:type        "text"
             :placeholder "Disabled..."}]])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg
  [state-disabled])


(defn state-error []
  [sa/input {:soda :error}
    [:input {:type        "text"
             :placeholder "Error..."}]])

(defcard-doc
  (mkdn-pprint-source state-error))

(defcard-rg
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
   [sa/input {:ash [:icon]}
    [:input {:type        "text"
             :placeholder "Icon..."}]
    [sa/icon-search]]
   ])

(defcard-doc
  (mkdn-pprint-source icon))

(defcard-rg
  [icon])


(defn left-icon []
  [:div
   [sa/input {:ash [:left-icon]}
    [:input {:type        "text"
             :placeholder "Left Icon..."}]
    [sa/icon-search]]
   ])

(defcard-doc
  (mkdn-pprint-source left-icon))

(defcard-rg
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
  [sa/input {:ash [:action]}
   [:input {:type        "text"
            :placeholder "Action..."}]
   [sa/button {:on-click #(js/alert "clicked!")}
    "Search"]])

(defcard-doc
  (mkdn-pprint-source action))

(defcard-rg
  [action])


(defn left-action []
  [sa/input {:ash [:left-action]}
   [sa/button {:on-click #(js/alert "clicked!")}
    "Search"]
   [:input {:type        "text"
            :placeholder "Left Action..."}]])

(defcard-doc
  (mkdn-pprint-source left-action))

(defcard-rg
  [left-action])


;; ---------------------------
;; Transparent

(defcard-doc
  "## Transparent"
  (list-keys "transparent"))

(defn transparent []
  [sa/input {:ash [:transparent]}
   [:input {:type        "text"
            :placeholder "Transparent..."}]])

(defcard-doc
  (mkdn-pprint-source transparent))

(defcard-rg
  [transparent])


;; ---------------------------
;; Inverted

(defcard-doc
  "## Inverted"
  (list-keys "inverted"))

(defn inverted []
  ;; TODO: update when segments are made
  [:div.ui.inverted.segment
   [sa/input {:ash [:inverted]}
    [:input {:type        "text"
             :placeholder "Inverted..."}]]
   ])

(defcard-doc
  (mkdn-pprint-source inverted))

(defcard-rg
  [inverted])


;; ---------------------------
;; Fluid

(defcard-doc
  "## Fluid"
  (list-keys "fluid"))

(defn fluid []
  [sa/input {:ash [:fluid]}
   [:input {:type        "text"
            :placeholder "Fluid..."}]])

(defcard-doc
  (mkdn-pprint-source fluid))

(defcard-rg
  [fluid])


;; ---------------------------
;; Size

(defcard-doc
  "## Size"
  (list-keys "size"))

(defn size []
  [sa/input {:ash [:mini
                   :fluid]}
   [:input {:type        "text"
            :placeholder "Mini..."}]])

(defcard-doc
  (mkdn-pprint-source size))

(defcard-rg
  [:div
   [size]
   [sa/input {:ash [:small
                    :fluid]}
    [:input {:type        "text"
             :placeholder "Small..."}]]

   [sa/input {:ash [:fluid]}
    [:input {:type        "text"
             :placeholder "Default size..."}]]

   [sa/input {:ash [:large
                    :fluid]}
    [:input {:type        "text"
             :placeholder "Large..."}]]

   [sa/input {:ash [:big
                    :fluid]}
    [:input {:type        "text"
             :placeholder "Big..."}]]

   [sa/input {:ash [:huge
                    :fluid]}
    [:input {:type        "text"
             :placeholder "Huge..."}]]

   [sa/input {:ash [:massive
                    :fluid]}
    [:input {:type        "text"
             :placeholder "Massive..."}]]
   ])
