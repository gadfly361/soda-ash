(ns soda-ash.elements.labels-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.helpers :as h]
   [soda-ash.elements.labels :as labels]
   ))


(def list-labels-keys
  (h/list-keys labels/variations))

(defcard-doc
  (h/devcard-docs labels/opts))


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
  (h/list-types labels/opts))


(defcard-doc
  "**Labels**"
  "Labels can be grouped")

(defn labels-type-default []
  [se/labels
   [se/label "foo"]
   [se/label "bar"]
   [se/label "baz"]])

(defcard-doc
  (mkdn-pprint-source labels-type-default))

(defcard-rg default
  [labels-type-default])



(defcard-doc
  "**Tags**"
  "Labels can share a tag formatting")

(defn labels-type-tag []
  [se/labels-tag
   [se/label "foo"]
   [se/label "bar"]
   [se/label "baz"]])

(defcard-doc
  (mkdn-pprint-source labels-type-tag))

(defcard-rg tag
  [labels-type-tag])



(defcard-doc
  "**Circular**"
  "Labels can share shapes")

(defn labels-type-circular []
  [se/labels-circular
   [se/label "foo"]
   [se/label "bar"]
   [se/label "baz"]])

(defcard-doc
  (mkdn-pprint-source labels-type-circular))

(defcard-rg circular
  [labels-type-circular])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")


(defcard-doc
  "**Size**"
  "Labels can share sizes together"
  (list-labels-keys "size"))

(defn labels-mini []
  [se/labels-circular {:data-ash [:mini]}
   [se/label "mini"]
   [se/label "foo"]
   [se/label "bar"]])

(defn labels-size [size]
  [se/labels-circular {:data-ash [size]}
   [se/label (name size)]
   [se/label "foo"]
   [se/label "bar"]])

(defcard-doc
  (mkdn-pprint-source labels-mini))

(defcard-rg size
  [:div
   [labels-mini]
   [labels-size :tiny]
   [labels-size :small]
   [labels-size :medium]
   [labels-size :large]
   [labels-size :big]
   [labels-size :huge]
   [labels-size :massive]])



(defcard-doc
  "**Colored**"
  "Labels can share colors together"
  (list-labels-keys "colored"))

(defn labels-red []
  [se/labels-circular {:data-ash [:red]}
   [se/label "red"]
   [se/label "foo"]
   [se/label "bar"]])

(defn labels-colored [colored]
  [se/labels-circular {:data-ash [colored]}
   [se/label (name colored)]
   [se/label "foo"]
   [se/label "bar"]])

(defcard-doc
  (mkdn-pprint-source labels-red))

(defcard-rg colored
  [:div
   [labels-red]
   [labels-colored :orange]
   [labels-colored :yellow]
   [labels-colored :olive]
   [labels-colored :green]
   [labels-colored :teal]
   [labels-colored :blue]
   [labels-colored :violet]
   [labels-colored :purple]
   [labels-colored :pink]
   [labels-colored :brown]
   [labels-colored :grey]
   [labels-colored :black]
   ])
