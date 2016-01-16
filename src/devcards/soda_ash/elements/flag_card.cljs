(ns soda-ash.elements.flag-card
  (:require-macros [devcards.core
                    :as dc
                    :refer [defcard-rg defcard-doc mkdn-pprint-source]])
  (:require [reagent.core :as reagent]
            [devcards.core]
            [soda-ash.elements.flag :as flag]
            [soda-ash.elements.card-helpers :as h]
            [soda-ash.element :as s]))



(defcard-doc
"
[back](http://localhost:3449/#!/soda_ash.an_overview_card)

# flag

* **default tag** :i
* **:flag** see [Semantic UI docs](http://semantic-ui.com/elements/flag.html)

---
")


;; Flag

(defn flag []
  [:div
   [s/flag {:soda {:flag :ae}}]
   [s/flag {:soda {:flag :france}}]
   [s/flag {:soda {:flag :myanmar}}]])

(defcard-doc
  "
### Flag

A flag can use the two digit country code, the full name, or a common alias
"
  (mkdn-pprint-source flag))

(defcard-rg
  [flag])
