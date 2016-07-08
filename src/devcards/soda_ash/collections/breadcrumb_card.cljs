(ns soda-ash.collections.breadcrumb-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.core :as sa]
   [soda-ash.helpers :as h]
   [soda-ash.collections.breadcrumb :as breadcrumb]
   [soda-ash.collections.breadcrumb-section :as breadcrumb-section]))


(def list-keys
  (h/list-keys breadcrumb/groups))


(defcard-doc
  "# SUMMARY"
  "## Types"
  "breadcrumb"

  "## Variations (*ash*)"
  "### Size"
  (list-keys "size")

  "## Content"
  "### divider"
  "Use .divider class. Or use sa/icon with :divider in ash array"
  "### section"
  "Use sa/breadcrumb-section"
  "### link"
  "Use sa/breadcrumb-section-link"
  )


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  "breadcrumb")

(defn type-default []
  [sa/breadcrumb
   [sa/breadcrumb-section
    "Home"]
   [:div.divider "/"]

   [sa/breadcrumb-section
    "Store"]
   [:div.divider "/"]

   [sa/breadcrumb-section
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
  [sa/breadcrumb {:ash [:mini]}
   [sa/breadcrumb-section
    "mini"]
   [:div.divider "/"]

   [sa/breadcrumb-section
    "Store"]
   [:div.divider "/"]

   [sa/breadcrumb-section
    {:soda :active}
    "T-Shirt"]])

(defn variation-size [size]
  [:div
   [sa/breadcrumb {:ash [size]}
    [sa/breadcrumb-section
     (name size)]
    [:div.divider "/"]

    [sa/breadcrumb-section
     "Store"]
    [:div.divider "/"]

    [sa/breadcrumb-section
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
    [sa/breadcrumb
     [sa/breadcrumb-section
      "default"]
     [:div.divider "/"]

     [sa/breadcrumb-section
      "Store"]
     [:div.divider "/"]

     [sa/breadcrumb-section
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
  "## divider"
  "Use .divider class")

(defn content-divider []
  [sa/breadcrumb
   [sa/breadcrumb-section
    "Home"]
   [:div.divider "/"] ;; <-- .divider

   [sa/breadcrumb-section
    "Store"]
   [:div.divider "/"]

   [sa/breadcrumb-section
    {:soda :active}
    "T-Shirt"]
   ])

(defcard-doc
  (mkdn-pprint-source content-divider))

(defcard-rg
  [content-divider])


(defn content-divider-icon []
  [sa/breadcrumb
   [sa/breadcrumb-section
    "Home"]
   [sa/icon-angle-right
    {:ash [:divider]}] ;; <-- :divider

   [sa/breadcrumb-section
    "Store"]
   [sa/icon-angle-right
    {:ash [:divider]}]

   [sa/breadcrumb-section
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
  "## section"
  "Use sa/breadcrumb-section")

(defn content-section []
  [sa/breadcrumb
   [sa/breadcrumb-section ;; <-- breadcrumb-section
    "Home"]
   [sa/icon-angle-right
    {:ash [:divider]}]

   [sa/breadcrumb-section
    "Store"]
   [sa/icon-angle-right
    {:ash [:divider]}]

   [sa/breadcrumb-section
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
  "## link"
  "Use sa/breadcrumb-section-link")

(defn content-link []
  [sa/breadcrumb
    [sa/breadcrumb-section-link
     "Home"]
   [sa/icon-angle-right
    {:ash [:divider]}]

   [sa/breadcrumb-section-link
    "Store"]
   [sa/icon-angle-right
    {:ash [:divider]}]

   [sa/breadcrumb-section-link
    {:soda :active} ;; <-- note, can be :active
    "T-Shirt"]
   ])

(defcard-doc
  (mkdn-pprint-source content-link))

(defcard-rg
  [content-link])
