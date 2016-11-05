(ns soda-ash.views.ad
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "ad")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default ;; TODO: check this
   :mobile-leaderboard
   :mobile-banner

   :small-rectangle
   :medium-rectangle
   :large-rectangle
   :vertical-rectangle

   :button
   :square-button
   :small-button

   :skyscraper
   :wide-skyscraper

   :banner
   :vertical-banner
   :top-banner
   :half-banner

   :leaderboard
   :large-leaderboard
   :billboard

   :panorama

   :netboard

   :half-page])


(def variations
  [(create-group
    {:group-name   "centered"
     :group-vector (vector
                    :centered)})

   (create-group
    {:group-name   "test"
     :group-vector (vector
                    :test)})
   ])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :variations variations})


(defcomp "default" opts)
(defcomp "mobile-leaderboard" (assoc opts :type :mobile-leaderboard))
(defcomp "mobile-banner" (assoc opts :type :mobile-banner))
(defcomp "small-rectangle" (assoc opts :type :small-rectangle))
(defcomp "medium-rectangle" (assoc opts :type :medium-rectangle))
(defcomp "large-rectangle" (assoc opts :type :large-rectangle))
(defcomp "vertical-rectangle" (assoc opts :type :vertical-rectangle))
(defcomp "button" (assoc opts :type :button))
(defcomp "square-button" (assoc opts :type :square-button))
(defcomp "small-button" (assoc opts :type :small-button))
(defcomp "skyscraper" (assoc opts :type :skyscraper))
(defcomp "wide-skyscraper" (assoc opts :type :wide-skyscraper))
(defcomp "banner" (assoc opts :type :banner))
(defcomp "vertical-banner" (assoc opts :type :vertical-banner))
(defcomp "top-banner" (assoc opts :type :top-banner))
(defcomp "half-banner" (assoc opts :type :half-banner))
(defcomp "leaderboard" (assoc opts :type :leaderboard))
(defcomp "large-leaderboard" (assoc opts :type :large-leaderboard))
(defcomp "billboard" (assoc opts :type :billboard))
(defcomp "panorama" (assoc opts :type :panorama))
(defcomp "netboard" (assoc opts :type :netboard))
(defcomp "half-page" (assoc opts :type :half-page))
