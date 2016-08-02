(ns soda-ash.views.statistic-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.view :as sv]
   [soda-ash.helpers :as h]
   [soda-ash.content :as sco]
   [soda-ash.views.statistic :as statistic]
   [soda-ash.views.statistics :as statistics]))


(def list-keys
  (h/list-keys statistic/variations))

(def list-statistics-keys
  (h/list-keys statistics/variations))


(defcard-doc
  (h/devcard-docs statistic/opts))

(defcard-doc
  (h/devcard-docs statistics/opts))


(def colors
  [:red :orange :yellow :olive :green :teal
   :blue :violet :purple :pink :brown :grey
   :black])


(def sizes
  [:mini
   :tiny
   :small
   :medium
   :large
   :huge])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; STATISTIC
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Statistic Types"
  (h/list-types statistic/opts))

(defn type-default []
  [sv/statistic
   [sco/value "5,550"]
   [sco/label "Downloads"]
   ])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg
  [type-default])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Statistic Variations")

(defcard-doc
  "## colored"
  (list-keys "colored"))

(defn variation-colored-red []
  [sv/statistic {:ash [:red]}
   [sco/value "5,550"]
   [sco/label "red"]
   ])

(defn variation-colored [color]
  [sv/statistic {:ash [color]}
   [sco/value "5,550"]
   [sco/label (name color)]])

(defcard-doc
  (mkdn-pprint-source variation-colored))

(defcard-rg
  [:div
   [variation-colored-red]
   (for [color (drop 1 colors)]
     ^{:key color}
     [variation-colored color])
   ])


(defcard-doc
  "## horizontal"
  (list-keys "horizontal"))

(defn variation-horizontal []
  [se/segment
   [sv/statistic {:ash [:horizontal]}
    [sco/value "5,550"]
    [sco/label "horizontal"]
    ]])

(defcard-doc
  (mkdn-pprint-source variation-horizontal))

(defcard-rg
  [variation-horizontal])


(defcard-doc
  "## inverted"
  (list-keys "inverted"))

(defn variation-inverted []
  [se/segment {:ash [:inverted]}
   [sv/statistic {:ash [:inverted
                        :blue]}
    [sco/value "5,550"]
    [sco/label "inverted"]
    ]])

(defcard-doc
  (mkdn-pprint-source variation-inverted))

(defcard-rg
  [variation-inverted])


(defcard-doc
  "## floated"
  (list-keys "floated"))

(defn variation-floated []
  [:div
   [sv/statistic {:ash [:left-floated
                        :small]}
    [sco/value "5,550"]
    [sco/label "left-floated"]]

   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."

   [sv/statistic {:ash [:right-floated
                        :small]}
    [sco/value "5,550"]
    [sco/label "rigt-floated"]]

   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source variation-floated))

(defcard-rg
  [variation-floated])


(defcard-doc
  "## size"
  (list-keys "size"))

(defn variation-size-mini []
  [sv/statistic {:ash [:mini]}
   [sco/value "5,550"]
   [sco/label "mini"]
   ])

(defn variation-size [size]
  [sv/statistic {:ash [size]}
   [sco/value "5,550"]
   [sco/label (name size)]])

(defcard-doc
  (mkdn-pprint-source variation-size))

(defcard-rg
  [:div
   [variation-size-mini]
   (for [color (drop 1 sizes)]
     ^{:key color}
     [variation-size color])])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; STATISTICS
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Statistics Types"
  (h/list-types statistics/opts))

(defn type-statistics-default []
  [sv/statistics
   [sco/statistic
    [sco/value "5,550"]
    [sco/label "Downloads"]]
   [sco/statistic {:ash [:blue]}
    [sco/value "5,550"]
    [sco/label "Downloads"]]
   ])

(defcard-doc
  (mkdn-pprint-source type-statistics-default))

(defcard-rg
  [type-statistics-default])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Statistics Variations")

(defcard-doc
  "## colored"
  (list-keys "colored"))

(defn statistics-variation-colored-red []
  [sv/statistics {:ash [:red]}
   [sco/statistic
    [sco/value "5,550"]
    [sco/label "Downloads"]]
   [sco/statistic
    [sco/value "5,550"]
    [sco/label "Downloads"]]
   ])

(defcard-doc
  (mkdn-pprint-source statistics-variation-colored-red))

(defcard-rg
  [statistics-variation-colored-red])


(defcard-doc
  "## horizontal"
  (list-keys "horizontal"))

(defn statistics-variation-horizontal []
  [sv/statistics {:ash [:horizontal]}
   [sco/statistic
    [sco/value "5,550"]
    [sco/label "Downloads"]]
   [sco/statistic
    [sco/value "5,550"]
    [sco/label "Downloads"]]
   ])

(defcard-doc
  (mkdn-pprint-source statistics-variation-horizontal))

(defcard-rg
  [statistics-variation-horizontal])


(defcard-doc
  "## inverted"
  (list-keys "inverted"))

(defn statistics-variation-inverted []
  [se/segment {:ash [:inverted]}
   [sv/statistics {:ash [:inverted
                         :blue]}
    [sco/statistic
     [sco/value "5,550"]
     [sco/label "Downloads"]]
    [sco/statistic
     [sco/value "5,550"]
     [sco/label "Downloads"]]
    ]])

(defcard-doc
  (mkdn-pprint-source statistics-variation-inverted))

(defcard-rg
  [statistics-variation-inverted])


(defcard-doc
  "## size"
  (list-keys "size"))

(defn statistics-variation-size []
  [sv/statistics {:ash [:mini]}
   [sco/statistic
    [sco/value "5,550"]
    [sco/label "Downloads"]]
   [sco/statistic
    [sco/value "5,550"]
    [sco/label "Downloads"]]
   ])

(defcard-doc
  (mkdn-pprint-source statistics-variation-size))

(defcard-rg
  [statistics-variation-size])
