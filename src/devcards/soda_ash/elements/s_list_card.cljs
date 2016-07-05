(ns soda-ash.elements.s-list-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.core :as sa]
   [soda-ash.helpers :as h]
   [soda-ash.elements.s-list :as s-list]))


(def list-keys
  (h/list-keys s-list/groups))


(defcard-doc
  "# SUMMARY"
  "## Types"
  (h/list-types s-list/types "s-list")

  "## Variations (*ash*)"
  "### Horizontal"
  (list-keys "horizontal")
  "### Inverted"
  (list-keys "inverted")
  "### Selection"
  (list-keys "selection")
  "### Animated"
  (list-keys "animated")
  "### Relaxed"
  (list-keys "relaxed")
  "### Divided"
  (list-keys "divided")
  "### Celled"
  (list-keys "celled")
  "### Size"
  (list-keys "size")
  )



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types s-list/types "s-list" true)
  )

(defn type-default []
  [sa/s-list
   [:div.item "foo"]
   [:div.item "bar"]
   [:div.item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])


(defn type-bulleted []
  [sa/s-list-bulleted
   [:div.item "Gaining Access"]
   [:div.item "Inviting Friends"]
   [:div.item
    [:div "Benefits"]
    [sa/s-list
     [:div.item "Use Anywhere"]
     [:div.item "Rebates"]
     [:div.item "Discounts"]]]
   [:div.item "Warranty"]])

(defcard-doc
  (mkdn-pprint-source type-bulleted))

(defcard-rg
  [type-bulleted])


(defn type-ordered []
  [sa/s-list-ordered
   [:div.item "Gaining Access"]
   [:div.item "Inviting Friends"]
   [:div.item
    [:div "Benefits"]
    [sa/s-list
     [:div.item "Use Anywhere"]
     [:div.item "Rebates"]
     [:div.item "Discounts"]]]
   [:div.item "Warranty"]])

(defcard-doc
  (mkdn-pprint-source type-ordered))

(defcard-rg
  [type-ordered])


(defn type-custom []
  [sa/s-list-custom
   [:li {:value "*"} "Gaining Access"]
   [:li {:value "*"} "Inviting Friends"]
   [:li {:value "*"} "Benefits"
    [:ol
     [:li {:value "-"} "Use Anywhere"]
     [:li {:value "-"} "Rebates"]
     [:li {:value "-"} "Discounts"]]]
   [:li {:value "*"} "Warranty"]])

(defcard-doc
  (mkdn-pprint-source type-custom))

(defcard-rg
  [type-custom])


;; TODO: make active clickable
(defn type-link []
  [sa/s-list-link
   [:a.active.item "Home"]
   [:a.item "About"]
   [:a.item "Jobs"]
   [:a.item "Team"]])

(defcard-doc
  (mkdn-pprint-source type-link))

(defcard-rg
  [type-link])


;; TODO: make active clickable
(defn type-bulleted-link []
  [sa/s-list-bulleted-link
   [:a.active.item "Home"]
   [:a.item "About"]
   [:a.item "Jobs"]
   [:a.item "Team"]])

(defcard-doc
  (mkdn-pprint-source type-bulleted-link))

(defcard-rg
  [type-bulleted-link])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")

;; --------------------------
;; horizontal

(defcard-doc
  "## horizontal"
  (list-keys "horizontal"))

(defn horizontal []
  [sa/s-list {:ash [:horizontal]}
   [:div.item "foo"]
   [:div.item "bar"]
   [:div.item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source horizontal))

(defcard-rg
  [horizontal])


;; --------------------------
;; inverted

(defcard-doc
  "## inverted"
  (list-keys "inverted"))

(defn inverted []
  [sa/segment {:ash [:inverted]}
   [sa/s-list {:ash [:inverted]}
    [:div.item "foo"]
    [:div.item "bar"]
    [:div.item "baz"]
    ]])

(defcard-doc
  (mkdn-pprint-source inverted))

(defcard-rg
  [inverted])


;; --------------------------
;; selection

(defcard-doc
  "## selection"
  (list-keys "selection"))

(defn selection []
  [sa/s-list {:ash [:selection]}
   [:div.item "foo"]
   [:div.item "bar"]
   [:div.item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source selection))

(defcard-rg
  [selection])


;; --------------------------
;; animated

(defcard-doc
  "## animated"
  (list-keys "animated"))

(defn animated []
  [sa/s-list {:ash [:animated]}
   [:div.item "foo"]
   [:div.item "bar"]
   [:div.item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source animated))

(defcard-rg
  [animated])


;; --------------------------
;; relaxed

(defcard-doc
  "## relaxed"
  (list-keys "relaxed"))

(defn relaxed []
  [sa/s-list {:ash [:relaxed]}
   [:div.item "foo"]
   [:div.item "bar"]
   [:div.item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source relaxed))

(defcard-rg
  [relaxed])


(defn very-relaxed []
  [sa/s-list {:ash [:very-relaxed]}
   [:div.item "foo"]
   [:div.item "bar"]
   [:div.item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source very-relaxed))

(defcard-rg
  [very-relaxed])


;; --------------------------
;; divided

(defcard-doc
  "## divided"
  (list-keys "divided"))

(defn divided []
  [sa/s-list {:ash [:divided]}
   [:div.item "foo"]
   [:div.item "bar"]
   [:div.item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source divided))

(defcard-rg
  [divided])


;; --------------------------
;; celled

(defcard-doc
  "## celled"
  (list-keys "celled"))

(defn celled []
  [sa/s-list {:ash [:celled]}
   [:div.item "foo"]
   [:div.item "bar"]
   [:div.item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source celled))

(defcard-rg
  [celled])


;; --------------------------
;; size

(defcard-doc
  "## size"
  (list-keys "size"))

(defn size []
  [sa/s-list {:ash [:mini]}
   [:div.item "foo"]
   [:div.item "bar"]
   [:div.item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source size))

(defcard-rg
  [:div
   [sa/header-small "Mini"]
   [size]

   [sa/header-small "Tiny"]
   [sa/s-list {:ash [:tiny]}
    [:div.item "foo"]
    [:div.item "bar"]
    [:div.item "baz"]]

   [sa/header-small "Small"]
   [sa/s-list {:ash [:small]}
    [:div.item "foo"]
    [:div.item "bar"]
    [:div.item "baz"]]

   [sa/header-small "Default"]
   [sa/s-list
    [:div.item "foo"]
    [:div.item "bar"]
    [:div.item "baz"]]

   [sa/header-small "Large"]
   [sa/s-list {:ash [:large]}
    [:div.item "foo"]
    [:div.item "bar"]
    [:div.item "baz"]]

   [sa/header-small "Big"]
   [sa/s-list {:ash [:big]}
    [:div.item "foo"]
    [:div.item "bar"]
    [:div.item "baz"]]

   [sa/header-small "Huge"]
   [sa/s-list {:ash [:huge]}
    [:div.item "foo"]
    [:div.item "bar"]
    [:div.item "baz"]]

   [sa/header-small "Massive"]
   [sa/s-list {:ash [:massive]}
    [:div.item "foo"]
    [:div.item "bar"]
    [:div.item "baz"]]
   ])
