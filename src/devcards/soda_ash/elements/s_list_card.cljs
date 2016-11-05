(ns soda-ash.elements.s-list-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core :as reagent]
   [clojure.string :as string]
   [soda-ash.element :as se]
   [soda-ash.content :as sco]
   [soda-ash.helpers :as h]
   [soda-ash.elements.s-list :as s-list]))


(def list-keys
  (h/list-keys s-list/variations))


(defcard-doc
  (h/devcard-docs s-list/opts))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types s-list/opts))

(defn type-default []
  [se/s-list
   [sco/item "foo"]
   [sco/item "bar"]
   [sco/item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg default
  [type-default])


(defn type-bulleted []
  [se/s-list-bulleted
   [sco/item "Gaining Access"]
   [sco/item "Inviting Friends"]
   [sco/item
    [:div "Benefits"]
    [se/s-list
     [sco/item "Use Anywhere"]
     [sco/item "Rebates"]
     [sco/item "Discounts"]]]
   [sco/item "Warranty"]])

(defcard-doc
  (mkdn-pprint-source type-bulleted))

(defcard-rg bulleted
  [type-bulleted])


(defn type-ordered []
  [se/s-list-ordered
   [sco/item "Gaining Access"]
   [sco/item "Inviting Friends"]
   [sco/item
    [:div "Benefits"]
    [se/s-list
     [sco/item "Use Anywhere"]
     [sco/item "Rebates"]
     [sco/item "Discounts"]]]
   [sco/item "Warranty"]])

(defcard-doc
  (mkdn-pprint-source type-ordered))

(defcard-rg ordered
  [type-ordered])


(defn type-custom []
  [se/s-list-custom
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

(defcard-rg custom
  [type-custom])



(defn type-link-item [local-ratom k]
  (let [active? (= k (:active @local-ratom))
        soda    (when active? :active)
        text    (-> k name string/capitalize)]

    [sco/item-link {:data-soda soda
                    :on-click  #(swap! local-ratom assoc :active k)}
     text]))

(defn type-link []
  (let [local-ratom (reagent/atom {:active :home})]
    (fn []
      (let [active (:active @local-ratom)]
        [se/s-list-link
         [type-link-item local-ratom :home]
         [type-link-item local-ratom :about]
         [type-link-item local-ratom :jobs]
         [type-link-item local-ratom :team]]))))

(defcard-doc
  (mkdn-pprint-source type-link-item))
(defcard-doc
  (mkdn-pprint-source type-link))

(defcard-rg link
  [type-link])



(defn type-bulleted-link []
  (let [local-ratom (reagent/atom {:active :home})]
    (fn []
      (let [active (:active @local-ratom)]
        [se/s-list-bulleted-link
         [type-link-item local-ratom :home]
         [type-link-item local-ratom :about]
         [type-link-item local-ratom :jobs]
         [type-link-item local-ratom :team]]))))

(defcard-doc
  (mkdn-pprint-source type-link-item))
(defcard-doc
  (mkdn-pprint-source type-bulleted-link))

(defcard-rg bulleted-link
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
  [se/s-list {:data-ash [:horizontal]}
   [sco/item "foo"]
   [sco/item "bar"]
   [sco/item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source horizontal))

(defcard-rg horizontal
  [horizontal])


;; --------------------------
;; inverted

(defcard-doc
  "## inverted"
  (list-keys "inverted"))

(defn inverted []
  [se/segment {:data-ash [:inverted]}
   [se/s-list {:data-ash [:inverted]}
    [sco/item "foo"]
    [sco/item "bar"]
    [sco/item "baz"]
    ]])

(defcard-doc
  (mkdn-pprint-source inverted))

(defcard-rg inverted
  [inverted])


;; --------------------------
;; selection

(defcard-doc
  "## selection"
  (list-keys "selection"))

(defn selection []
  [se/s-list {:data-ash [:selection]}
   [sco/item "foo"]
   [sco/item "bar"]
   [sco/item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source selection))

(defcard-rg selection
  [selection])


;; --------------------------
;; animated

(defcard-doc
  "## animated"
  (list-keys "animated"))

(defn animated []
  [se/s-list {:data-ash [:animated]}
   [sco/item "foo"]
   [sco/item "bar"]
   [sco/item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source animated))

(defcard-rg animated
  [animated])


;; --------------------------
;; relaxed

(defcard-doc
  "## relaxed"
  (list-keys "relaxed"))

(defn relaxed []
  [se/s-list {:data-ash [:relaxed]}
   [sco/item "foo"]
   [sco/item "bar"]
   [sco/item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source relaxed))

(defcard-rg relaxed
  [relaxed])


(defn very-relaxed []
  [se/s-list {:data-ash [:very-relaxed]}
   [sco/item "foo"]
   [sco/item "bar"]
   [sco/item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source very-relaxed))

(defcard-rg very-relaxed
  [very-relaxed])


;; --------------------------
;; divided

(defcard-doc
  "## divided"
  (list-keys "divided"))

(defn divided []
  [se/s-list {:data-ash [:divided]}
   [sco/item "foo"]
   [sco/item "bar"]
   [sco/item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source divided))

(defcard-rg divided
  [divided])


;; --------------------------
;; celled

(defcard-doc
  "## celled"
  (list-keys "celled"))

(defn celled []
  [se/s-list {:data-ash [:celled]}
   [sco/item "foo"]
   [sco/item "bar"]
   [sco/item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source celled))

(defcard-rg celled
  [celled])


;; --------------------------
;; size

(defcard-doc
  "## size"
  (list-keys "size"))

(defn size []
  [se/s-list {:data-ash [:mini]}
   [sco/item "foo"]
   [sco/item "bar"]
   [sco/item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source size))

(defcard-rg size
  [:div
   [se/header-small "Mini"]
   [size]

   [se/header-small "Tiny"]
   [se/s-list {:data-ash [:tiny]}
    [sco/item "foo"]
    [sco/item "bar"]
    [sco/item "baz"]]

   [se/header-small "Small"]
   [se/s-list {:data-ash [:small]}
    [sco/item "foo"]
    [sco/item "bar"]
    [sco/item "baz"]]

   [se/header-small "Default"]
   [se/s-list
    [sco/item "foo"]
    [sco/item "bar"]
    [sco/item "baz"]]

   [se/header-small "Large"]
   [se/s-list {:data-ash [:large]}
    [sco/item "foo"]
    [sco/item "bar"]
    [sco/item "baz"]]

   [se/header-small "Big"]
   [se/s-list {:data-ash [:big]}
    [sco/item "foo"]
    [sco/item "bar"]
    [sco/item "baz"]]

   [se/header-small "Huge"]
   [se/s-list {:data-ash [:huge]}
    [sco/item "foo"]
    [sco/item "bar"]
    [sco/item "baz"]]

   [se/header-small "Massive"]
   [se/s-list {:data-ash [:massive]}
    [sco/item "foo"]
    [sco/item "bar"]
    [sco/item "baz"]]
   ])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Content

(defcard-doc
  "
---
# Content")


;; ---------------------------
;; item

(defcard-doc
  "## item")

(defn content-item []
  [se/s-list
   [sco/item "foo"]
   [sco/item "bar"]
   [sco/item "baz"]
   ])

(defcard-doc
  (mkdn-pprint-source content-item))

(defcard-rg item
  [content-item])


;; ---------------------------
;; icon

(defcard-doc
  "## icon")

(defn content-icon []
  [se/s-list
   [sco/item
    [se/icon-star]
    [sco/content "This is a star"]]

   [sco/item
    [se/icon-plus]
    [sco/content "This is a plus"]]])

(defcard-doc
  (mkdn-pprint-source content-icon))

(defcard-rg icon
  [content-icon])


;; ---------------------------
;; image

(defcard-doc
  "## image")

(defn content-image []
  [se/s-list
   [sco/item
    [se/image {:data-ash [:avatar]
               :src "/images/gadfly.png"}]
    [sco/content
     [sco/header
      "Gadfly361"]
     [sco/description
      "I know that I know nothing."]]]


   [sco/item
    [se/image {:data-ash [:avatar]
               :src "/images/rachel.png"}]
    [sco/content
     [sco/header
      "Rachel"]
     [sco/description
      "Some awesome description."]]]])

(defcard-doc
  (mkdn-pprint-source content-image))

(defcard-rg image
  [content-image])


;; ---------------------------
;; link

(defcard-doc
  "## link")

(defn content-link []
  [se/s-list
   [sco/item-link "What is a FAQ?"]
   [sco/item-link "Who is our user?"]
   [sco/item-link "Where is our office located?"]])

(defcard-doc
  (mkdn-pprint-source content-link))

(defcard-rg link
  [content-link])


;; ---------------------------
;; description

(defcard-doc
  "## description")

(defn content-description []
  [se/s-list
   [sco/item
    [se/image {:data-ash [:avatar]
               :src "/images/gadfly.png"}]
    [sco/content
     [sco/header
      "Gadfly361"]
     [sco/description
      "I know that I know nothing."]]]


   [sco/item
    [se/image {:data-ash [:avatar]
               :src "/images/rachel.png"}]
    [sco/content
     [sco/header
      "Rachel"]
     [sco/description
      "Some awesome description."]]]])

(defcard-doc
  (mkdn-pprint-source content-description))

(defcard-rg description
  [content-description])
