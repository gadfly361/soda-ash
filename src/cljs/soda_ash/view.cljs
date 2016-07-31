(ns soda-ash.view
  (:require-macros
   [soda-ash.macros :refer [defc]])
  (:require
   [soda-ash.helpers :as h]
   [soda-ash.views.ad :as ad]
   [soda-ash.views.card :as card]
   [soda-ash.views.cards :as cards]
   [soda-ash.views.statistic :as statistic]
   [soda-ash.views.statistics :as statistics]
   ))



;; ad

(defc "ad" "mobile-leaderboard")
(defc "ad" "mobile-banner")
(defc "ad" "small-rectangle")
(defc "ad" "medium-rectangle")
(defc "ad" "large-rectangle")
(defc "ad" "vertical-rectangle")
(defc "ad" "button")
(defc "ad" "square-button")
(defc "ad" "small-button")
(defc "ad" "skyscraper")
(defc "ad" "wide-skyscraper")
(defc "ad" "banner")
(defc "ad" "vertical-banner")
(defc "ad" "top-banner")
(defc "ad" "half-banner")
(defc "ad" "leaderboard")
(defc "ad" "large-leaderboard")
(defc "ad" "billboard")
(defc "ad" "panorama")
(defc "ad" "netboard")
(defc "ad" "half-page")


;; card

(defc "card" nil)


;; cards

(defc "cards" nil)


;; statistic

(defc "statistic" nil)


;; statistics

(defc "statistics" nil)
