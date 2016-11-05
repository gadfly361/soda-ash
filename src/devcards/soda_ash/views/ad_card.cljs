(ns soda-ash.views.ad-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.view :as sv]
   [soda-ash.helpers :as h]
   [soda-ash.views.ad :as ad]))


(def list-keys
  (h/list-keys ad/variations))


(defcard-doc
  (h/devcard-docs ad/opts))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types ad/opts))

(defn type-mobile-leaderboard []
  [sv/ad-mobile-leaderboard {:data-ash [:test]}
   [:p "mobile-leaderboard"]])

(defcard-doc
  (mkdn-pprint-source type-mobile-leaderboard))

(defcard-rg mobile-leaderboard
  [type-mobile-leaderboard])


(defn type-mobile-banner []
  [sv/ad-mobile-banner {:data-ash [:test]}
   [:p "mobile-banner"]])

(defcard-doc
  (mkdn-pprint-source type-mobile-banner))

(defcard-rg mobile-banner
  [type-mobile-banner])


(defn type-small-rectangle []
  [sv/ad-small-rectangle {:data-ash [:test]}
   [:p "small-rectangle"]])

(defcard-doc
  (mkdn-pprint-source type-small-rectangle))

(defcard-rg small-rectangle
  [type-small-rectangle])


(defn type-medium-rectangle []
  [sv/ad-medium-rectangle {:data-ash [:test]}
   [:p "medium-rectangle"]])

(defcard-doc
  (mkdn-pprint-source type-medium-rectangle))

(defcard-rg medium-rectangle
  [type-medium-rectangle])


(defn type-large-rectangle []
  [sv/ad-large-rectangle {:data-ash [:test]}
   [:p "large-rectangle"]])

(defcard-doc
  (mkdn-pprint-source type-large-rectangle))

(defcard-rg large-rectangle
  [type-large-rectangle])


(defn type-vertical-rectangle []
  [sv/ad-vertical-rectangle {:data-ash [:test]}
   [:p "vertical-rectangle"]])

(defcard-doc
  (mkdn-pprint-source type-vertical-rectangle))

(defcard-rg vertical-rectangle
  [type-vertical-rectangle])


(defn type-button []
  [sv/ad-button {:data-ash [:test]}
   [:p "button"]])

(defcard-doc
  (mkdn-pprint-source type-button))

(defcard-rg button
  [type-button])


(defn type-square-button []
  [sv/ad-square-button {:data-ash [:test]}
   [:p "square-button"]])

(defcard-doc
  (mkdn-pprint-source type-square-button))

(defcard-rg square-button
  [type-square-button])


(defn type-small-button []
  [sv/ad-small-button {:data-ash [:test]}
   [:p "small-button"]])

(defcard-doc
  (mkdn-pprint-source type-small-button))

(defcard-rg small-button
  [type-small-button])


(defn type-skyscraper []
  [sv/ad-skyscraper {:data-ash [:test]}
   [:p "skyscraper"]])

(defcard-doc
  (mkdn-pprint-source type-skyscraper))

(defcard-rg skyscraper
  [type-skyscraper])


(defn type-wide-skyscraper []
  [sv/ad-wide-skyscraper {:data-ash [:test]}
   [:p "wide-skyscraper"]])

(defcard-doc
  (mkdn-pprint-source type-wide-skyscraper))

(defcard-rg wide-skyscraper
  [type-wide-skyscraper])


(defn type-banner []
  [sv/ad-banner {:data-ash [:test]}
   [:p "banner"]])

(defcard-doc
  (mkdn-pprint-source type-banner))

(defcard-rg banner
  [type-banner])


(defn type-vertical-banner []
  [sv/ad-vertical-banner {:data-ash [:test]}
   [:p "vertical-banner"]])

(defcard-doc
  (mkdn-pprint-source type-vertical-banner))

(defcard-rg vertical-banner
  [type-vertical-banner])


(defn type-top-banner []
  [sv/ad-top-banner {:data-ash [:test]}
   [:p "top-banner"]])

(defcard-doc
  (mkdn-pprint-source type-top-banner))

(defcard-rg top-banner
  [type-top-banner])


(defn type-half-banner []
  [sv/ad-half-banner {:data-ash [:test]}
   [:p "half-banner"]])

(defcard-doc
  (mkdn-pprint-source type-half-banner))

(defcard-rg half-banner
  [type-half-banner])


(defn type-leaderboard []
  [sv/ad-leaderboard {:data-ash [:test]}
   [:p "leaderboard"]])

(defcard-doc
  (mkdn-pprint-source type-leaderboard))

(defcard-rg leaderboard
  [type-leaderboard])


(defn type-large-leaderboard []
  [sv/ad-large-leaderboard {:data-ash [:test]}
   [:p "large-leaderboard"]])

(defcard-doc
  (mkdn-pprint-source type-large-leaderboard))

(defcard-rg large-leaderboard
  [type-large-leaderboard])


(defn type-billboard []
  [sv/ad-billboard {:data-ash [:test]}
   [:p "billboard"]])

(defcard-doc
  (mkdn-pprint-source type-billboard))

(defcard-rg billboard
  [type-billboard])


(defn type-panorama []
  [sv/ad-panorama {:data-ash [:test]}
   [:p "panorama"]])

(defcard-doc
  (mkdn-pprint-source type-panorama))

(defcard-rg panorama
  [type-panorama])


(defn type-netboard []
  [sv/ad-netboard {:data-ash [:test]}
   [:p "netboard"]])

(defcard-doc
  (mkdn-pprint-source type-netboard))

(defcard-rg netboard
  [type-netboard])


(defn type-half-page []
  [sv/ad-half-page {:data-ash [:test]}
   [:p "half-page"]])

(defcard-doc
  (mkdn-pprint-source type-half-page))

(defcard-rg half-page
  [type-half-page])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")

;; ---------------------------
;; centered

(defcard-doc
  "## centered"
  (list-keys "centered"))

(defn variation-centered []
  [sv/ad-button {:data-ash [:centered
                       :test]}
   [:p "centered"]])

(defcard-doc
  (mkdn-pprint-source variation-centered))

(defcard-rg centered
  [variation-centered])


;; ---------------------------
;; test

(defcard-doc
  "## test"
  (list-keys "test"))

(defn variation-test []
  [sv/ad-button {:data-ash [:test]} ;; <-- :test
   [:p "test"]])

(defcard-doc
  (mkdn-pprint-source variation-test))

(defcard-rg test
  [variation-test])
