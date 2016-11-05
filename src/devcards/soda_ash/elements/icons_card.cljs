(ns soda-ash.elements.icons-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.helpers :as h]
   [soda-ash.elements.icons :as icons]))


(def list-icons-keys
  (h/list-keys icons/variations))

(defcard-doc
  (h/devcard-docs icons/opts))

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
# Icons Types"
  (h/list-types icons/opts))


(defcard-doc
  "**Icons**"
  "Several icons can be used together as a group")

(defn type-icons []
  [se/icons {:data-ash [:huge]}
   [se/icon-sun {:data-soda :loading
                 :data-ash  [:big]}]
   [se/icon-user]])

(defcard-doc
  (mkdn-pprint-source type-icons))

(defcard-rg icons
  [:div
   [type-icons]])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Icons Variations")

(defcard-doc
  "**Size**"
  "Icon groups can vary in size"
  (list-icons-keys "size"))

(defn icons-size-mini []
  [se/icons {:data-ash [:mini]}
   [se/icon-twitter]
   [se/icon-plus {:data-ash [:inverted
                             :corner]}]])

(defn icons-size [size]
  [se/icons {:data-ash [size]}
   [se/icon-twitter]
   [se/icon-plus {:data-ash [:inverted
                             :corner]}]])

(defcard-doc
  (mkdn-pprint-source icons-size-mini))

(defcard-rg size
  [:div
   [icons-size-mini]
   [icons-size :tiny]
   [icons-size :small]

   [se/icons
    [se/icon-twitter]
    [se/icon-plus {:data-ash [:inverted
                              :corner]}]]

   [icons-size :large]
   [icons-size :big]
   [icons-size :huge]
   [icons-size :massive]
   ])
