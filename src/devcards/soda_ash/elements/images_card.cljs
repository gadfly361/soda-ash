(ns soda-ash.elements.images-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.helpers :as h]
   [soda-ash.elements.images :as images]))



(def list-images-keys
  (h/list-keys images/variations))

(defcard-doc
  (h/devcard-docs images/opts))

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
# Images Types"
  (h/list-types images/opts))

(defcard-doc
  "**Images**"
  "Images can be grouped together")

(defn type-images []
  [se/images
   [se/image {:data-ash [:small]
              :src "images/ubuntu.png"}]
   [se/image {:data-ash [:small]
              :src "images/ubuntu.png"}]])

(defcard-doc
  (mkdn-pprint-source type-images))

(defcard-rg images
  [type-images])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Images Variations")


(defcard-doc
  "**Size**"
  "A group of images can be formatted to have the same size"
  (list-images-keys "size"))

(defn images-mini []
  [:div "mini"
   [se/images {:data-ash [:mini]}
    [se/image {:src "images/ubuntu.png"}]
    [se/image {:src "images/ubuntu.png"}]]])

(defn images-size [size]
  [:div (name size)
   [se/images {:data-ash [size]}
    [se/image {:src "images/ubuntu.png"}]
    [se/image {:src "images/ubuntu.png"}]]])

(defcard-doc
  (mkdn-pprint-source images-mini))

(defcard-rg size
  [:div
   [images-mini]
   [images-size :tiny]
   [images-size :small]
   [images-size :medium]
   [images-size :large]
   [images-size :big]
   [images-size :huge]
   [images-size :massive]
   ])
