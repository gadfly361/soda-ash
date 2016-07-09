(ns soda-ash.views.ad-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.core :as sa]
   [soda-ash.helpers :as h]
   [soda-ash.views.ad :as ad]))


(def list-keys
  (h/list-keys ad/groups))


(defcard-doc
  "# SUMMARY"
  "## Types"
  (h/list-types ad/types "ad" false)

  "## Variations (*ash*)"
  "### Centered"
  (list-keys "centered")
  "### Test"
  (list-keys "test")
  )



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types ad/types "ad" false)
  )

(defn type-mobile-leaderboard []
  [sa/ad-mobile-leaderboard {:ash [:test]}
   [:p "mobile-leaderboard"]])

(defcard-doc
  (mkdn-pprint-source type-mobile-leaderboard))

(defcard-rg
  [type-mobile-leaderboard])


(defn type-mobile-banner []
  [sa/ad-mobile-banner {:ash [:test]}
   [:p "mobile-banner"]])

(defcard-doc
  (mkdn-pprint-source type-mobile-banner))

(defcard-rg
  [type-mobile-banner])


(defn type-small-rectangle []
  [sa/ad-small-rectangle {:ash [:test]}
   [:p "small-rectangle"]])

(defcard-doc
  (mkdn-pprint-source type-small-rectangle))

(defcard-rg
  [type-small-rectangle])


(defn type-medium-rectangle []
  [sa/ad-medium-rectangle {:ash [:test]}
   [:p "medium-rectangle"]])

(defcard-doc
  (mkdn-pprint-source type-medium-rectangle))

(defcard-rg
  [type-medium-rectangle])


(defn type-large-rectangle []
  [sa/ad-large-rectangle {:ash [:test]}
   [:p "large-rectangle"]])

(defcard-doc
  (mkdn-pprint-source type-large-rectangle))

(defcard-rg
  [type-large-rectangle])


(defn type-vertical-rectangle []
  [sa/ad-vertical-rectangle {:ash [:test]}
   [:p "vertical-rectangle"]])

(defcard-doc
  (mkdn-pprint-source type-vertical-rectangle))

(defcard-rg
  [type-vertical-rectangle])


(defn type-button []
  [sa/ad-button {:ash [:test]}
   [:p "button"]])

(defcard-doc
  (mkdn-pprint-source type-button))

(defcard-rg
  [type-button])


(defn type-square-button []
  [sa/ad-square-button {:ash [:test]}
   [:p "square-button"]])

(defcard-doc
  (mkdn-pprint-source type-square-button))

(defcard-rg
  [type-square-button])


(defn type-small-button []
  [sa/ad-small-button {:ash [:test]}
   [:p "small-button"]])

(defcard-doc
  (mkdn-pprint-source type-small-button))

(defcard-rg
  [type-small-button])


(defn type-skyscraper []
  [sa/ad-skyscraper {:ash [:test]}
   [:p "skyscraper"]])

(defcard-doc
  (mkdn-pprint-source type-skyscraper))

(defcard-rg
  [type-skyscraper])


(defn type-wide-skyscraper []
  [sa/ad-wide-skyscraper {:ash [:test]}
   [:p "wide-skyscraper"]])

(defcard-doc
  (mkdn-pprint-source type-wide-skyscraper))

(defcard-rg
  [type-wide-skyscraper])


(defn type-banner []
  [sa/ad-banner {:ash [:test]}
   [:p "banner"]])

(defcard-doc
  (mkdn-pprint-source type-banner))

(defcard-rg
  [type-banner])


(defn type-vertical-banner []
  [sa/ad-vertical-banner {:ash [:test]}
   [:p "vertical-banner"]])

(defcard-doc
  (mkdn-pprint-source type-vertical-banner))

(defcard-rg
  [type-vertical-banner])


(defn type-top-banner []
  [sa/ad-top-banner {:ash [:test]}
   [:p "top-banner"]])

(defcard-doc
  (mkdn-pprint-source type-top-banner))

(defcard-rg
  [type-top-banner])


(defn type-half-banner []
  [sa/ad-half-banner {:ash [:test]}
   [:p "half-banner"]])

(defcard-doc
  (mkdn-pprint-source type-half-banner))

(defcard-rg
  [type-half-banner])


(defn type-leaderboard []
  [sa/ad-leaderboard {:ash [:test]}
   [:p "leaderboard"]])

(defcard-doc
  (mkdn-pprint-source type-leaderboard))

(defcard-rg
  [type-leaderboard])


(defn type-large-leaderboard []
  [sa/ad-large-leaderboard {:ash [:test]}
   [:p "large-leaderboard"]])

(defcard-doc
  (mkdn-pprint-source type-large-leaderboard))

(defcard-rg
  [type-large-leaderboard])


(defn type-billboard []
  [sa/ad-billboard {:ash [:test]}
   [:p "billboard"]])

(defcard-doc
  (mkdn-pprint-source type-billboard))

(defcard-rg
  [type-billboard])


(defn type-panorama []
  [sa/ad-panorama {:ash [:test]}
   [:p "panorama"]])

(defcard-doc
  (mkdn-pprint-source type-panorama))

(defcard-rg
  [type-panorama])


(defn type-netboard []
  [sa/ad-netboard {:ash [:test]}
   [:p "netboard"]])

(defcard-doc
  (mkdn-pprint-source type-netboard))

(defcard-rg
  [type-netboard])


(defn type-half-page []
  [sa/ad-half-page {:ash [:test]}
   [:p "half-page"]])

(defcard-doc
  (mkdn-pprint-source type-half-page))

(defcard-rg
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
  [sa/ad-button {:ash [:centered
                       :test]}
   [:p "centered"]])

(defcard-doc
  (mkdn-pprint-source variation-centered))

(defcard-rg
  [variation-centered])


;; ---------------------------
;; test

(defcard-doc
  "## test"
  (list-keys "test"))

(defn variation-test []
  [sa/ad-button {:ash [:test]} ;; <-- :test
   [:p "test"]])

(defcard-doc
  (mkdn-pprint-source variation-test))

(defcard-rg
  [variation-test])
