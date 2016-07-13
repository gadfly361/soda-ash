(ns soda-ash.collections.breadcrumb-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.collection :as sc]
   [soda-ash.content :as sco]
   [soda-ash.helpers :as h]
   [soda-ash.collections.breadcrumb :as breadcrumb]))


(def list-keys
  (h/list-keys breadcrumb/variations))


(defcard-doc
  (h/devcard-docs breadcrumb/opts))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types breadcrumb/opts))

(defn type-default []
  [sc/breadcrumb
   [sco/section
    "Home"]
   [sco/divider "/"]

   [sco/section
    "Store"]
   [sco/divider "/"]

   [sco/section
    {:soda :active}
    "T-Shirt"]
   ])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variation

(defcard-doc
  "
---
# Variation")

;; ---------------------------
;; size

(defcard-doc
  "## size"
  (list-keys "size"))

(defn variation-size-mini []
  [sc/breadcrumb {:ash [:mini]}
   [sco/section
    "mini"]
   [sco/divider "/"]

   [sco/section
    "Store"]
   [sco/divider "/"]

   [sco/section
    {:soda :active}
    "T-Shirt"]])

(defn variation-size [size]
  [:div
   [sc/breadcrumb {:ash [size]}
   [sco/section
     (name size)]
    [sco/divider "/"]

   [sco/section
     "Store"]
    [sco/divider "/"]

   [sco/section
     {:soda :active}
     "T-Shirt"]]])

(defcard-doc
  (mkdn-pprint-source variation-size))

(defcard-rg
  [:div
   [variation-size-mini]
   [variation-size :tiny]
   [variation-size :small]

   [:div
    [sc/breadcrumb
   [sco/section
      "default"]
     [sco/divider "/"]

   [sco/section
      "Store"]
     [sco/divider "/"]

   [sco/section
      {:soda :active}
      "T-Shirt"]]]

   [variation-size :large]
   [variation-size :big]
   [variation-size :huge]
   [variation-size :massive]
   ])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Content

(defcard-doc
  "
---
# Content")

;; ---------------------------
;; divider

(defcard-doc
  "## divider")

(defn content-divider []
  [sc/breadcrumb
   [sco/section
    "Home"]
   [sco/divider "/"]

   [sco/section
    "Store"]
   [sco/divider "/"]

   [sco/section
    {:soda :active}
    "T-Shirt"]
   ])

(defcard-doc
  (mkdn-pprint-source content-divider))

(defcard-rg
  [content-divider])


(defn content-divider-icon []
  [sc/breadcrumb
   [sco/section
    "Home"]
   [se/icon-angle-right
    {:ash [:divider]}]

   [sco/section
    "Store"]
   [se/icon-angle-right
    {:ash [:divider]}]

   [sco/section
    {:soda :active}
    "T-Shirt"]
   ])

(defcard-doc
  (mkdn-pprint-source content-divider-icon))

(defcard-rg
  [content-divider-icon])


;; ---------------------------
;; section

(defcard-doc
  "## section")

(defn content-section []
  [sc/breadcrumb
   [sco/section
    "Home"]
   [se/icon-angle-right
    {:ash [:divider]}]

   [sco/section
    "Store"]
   [se/icon-angle-right
    {:ash [:divider]}]

   [sco/section
    {:soda :active} ;; <-- note, can be :active
    "T-Shirt"]
   ])

(defcard-doc
  (mkdn-pprint-source content-section))

(defcard-rg
  [content-section])


;; ---------------------------
;; section

(defcard-doc
  "## link")

(defn content-link []
  [sc/breadcrumb
   [sco/section-link
     "Home"]
   [se/icon-angle-right
    {:ash [:divider]}]

   [sco/section-link
    "Store"]
   [se/icon-angle-right
    {:ash [:divider]}]

   [sco/section-link
    {:soda :active} ;; <-- note, can be :active
    "T-Shirt"]
   ])

(defcard-doc
  (mkdn-pprint-source content-link))

(defcard-rg
  [content-link])
