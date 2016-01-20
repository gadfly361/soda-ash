(ns soda-ash.elements.container-card
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

# container

* **default tag** :div
* **:type** :default | :text
* **variations** :aligned | :fluid?

where

* **:aligned** :left | :right | :justified | :center

Notes:

The devcards have their own width, so some of the options like :fluid? aren't presented well.

---
")



;; ====================
;; TYPES

(defcard-doc
"# TYPES")


;; Container

(defn container []
  [s/container {:soda {:type :default}}
   [h/fake-content]])

(defcard-doc
  "
### Container

A standard container
"
  (mkdn-pprint-source container))

(defcard-rg
  [container])


;; Text-Container

(defn text-container []
  [s/container {:soda {:type :text}}
   [h/fake-content]])

(defcard-doc
  "
### Text Container

A container can reduce its maximum width to more naturally accomodate a single column of text

Notes:

* A text container is a simpler markup alternative to using a grid with a single column, and is designed to have a reasonable maximum width for displaying flowing text
"
  (mkdn-pprint-source text-container))

(defcard-rg
  [text-container])


;; ====================
;; VARIATIONS

(defcard-doc
"# VARIATIONS")


;; Aligned

(defn aligned []
  [:div
   [s/container {:soda {:aligned :left}}
    "Left Aligned"]

   [s/container {:soda {:aligned :center}}
    "Center Aligned"]

   [s/container {:soda {:aligned :right}}
    "Right Aligned"]

   [s/container {:soda {:aligned :justified}}
    [h/fake-content]]])

(defcard-doc
  "
### Text Alignment

A container can specify its text alignment
"
  (mkdn-pprint-source aligned))

(defcard-rg
  [aligned])


;; Fluid

(defn fluid []
  [s/container {:soda {:fluid? true}}
   [h/fake-content]])

(defcard-doc
  "
### Text Alignment

A fluid container has no maximum width
"
  (mkdn-pprint-source fluid))

(defcard-rg
  [fluid])
