(ns soda-ash.elements.rail-card
  (:require-macros [devcards.core
                    :as dc
                    :refer [defcard-rg defcard-doc mkdn-pprint-source]])
  (:require [reagent.core :as reagent]
            [devcards.core]
            [soda-ash.elements.card-helpers :as h]
            [soda-ash.element :as s]))



(defcard-doc
"
[back](#!/soda_ash.an_overview_card)

# rail

* **base class** ui rail
* **default tag** :div
* **:type** :left | :right | *INTERNAL* :left-internal | :right-internal | *DIVIDING* :left-dividing | :right-dividing
* **variations** :attached? | :close

where

* **:close** :default | :very

### Notes

#### When to Use

Rails display optional accompanying content outside of the main viewport of your website. Sites often use rails with sticky content to fix additional—often optional—content to your viewport as you scroll through the page.

Semantic's default rail is 300px wide, just large enough to fit many common ad unit sizes, and just wide enough for a sub-navigation menu or a prominent call-to-action.

#### Adjusting Sizes

Railed content will most likely require arbitrary breakpoints that are specific to your site's content, to ensure they do not exceed the horizontal width of a user's browser.

Rails are generally used beside long, single-column containers with long-form content like blog posts, articles, or user profiles. Generally your main text container width should be set between around 600-800px depending on your font size to optimize line length for readability.

This set-up means most tablet browsers can only accomodate a single rail. Ultrabooks and lower resolution computers two small rails, and larger monitors, usually two full-sized rails. The specifics of this implementation is left up to you in your project.

#### Regarding the Examples Below

The following examples **do not** use any breakpoints, so some railed content may appear outside your browser's viewport on smaller screens.

---
")


;; Rail

(defn rail []
  [s/segment {}
   [s/rail {:soda {:type :left}}
    [s/segment {}
     "Left Rail Content"]]

   [s/rail {:soda {:type :right}}
    [s/segment {}
     "Right Rail Content"]]

   [h/fake-content]])

(defcard-doc
  "
### Rail

A rail can be presented on the left or right side of a container
"
  (mkdn-pprint-source rail))

(defcard-rg
  [rail])


;; Internal Rail

(defn internal-rail []
  [s/segment {}
   [s/rail {:soda {:type :left-internal}}
    [s/segment {}
     "Left Rail Content"]]

   [s/rail {:soda {:type :right-internal}}
    [s/segment {}
     "Right Rail Content"]]

   [h/fake-content]])

(defcard-doc
  "
### Internal

A rail can attach itself to the inside of a container
"
  (mkdn-pprint-source internal-rail))

(defcard-rg
  [internal-rail])


;; Dividing Rail

 (defn dividing-rail []
  [s/segment {}
   [s/rail {:soda {:type :left-dividing}}
    [s/segment {:soda {:type :default}}
     "Left Rail Content"]]

   [s/rail {:soda {:type :right-dividing}}
    [s/segment {}
     "Right Rail Content"]]

   [h/fake-content]])

(defcard-doc
  "
### Dividing

A rail can create a division between itself and a container
"
  (mkdn-pprint-source dividing-rail))

(defcard-rg
  [dividing-rail])


;; Attached

 (defn attached []
  [s/segment {}
   [s/rail {:soda {:type :left
                   :attached? true}}
    [s/segment {}
     "Left Rail Content"]]

   [s/rail {:soda {:type :right
                   :attached? true}}
    [s/segment {}
     "Right Rail Content"]]

   [h/fake-content]])

(defcard-doc
  "
### Attached

A rail can appear attached to the main viewport
"
  (mkdn-pprint-source attached))

(defcard-rg
  [attached])


;; Close

 (defn close []
  [s/segment {}
   [s/rail {:soda {:type :left
                   :close :default}}
    [s/segment {}
     "Left Rail Content"]]

   [s/rail {:soda {:type :right
                   :close :default}}
    [s/segment {}
     "Right Rail Content"]]

   [h/fake-content]])

(defcard-doc
  "
### Close

A rail can appear closer to the main viewport
"
  (mkdn-pprint-source close))

(defcard-rg
  [close])


;; Very-Close

 (defn very-close []
  [s/segment {}
   [s/rail {:soda {:type :left
                   :close :very}}
    [s/segment {}
     "Left Rail Content"]]

   [s/rail {:soda {:type :right
                   :close :very}}
    [s/segment {}
     "Right Rail Content"]]

   [h/fake-content]])

(defcard-doc
  "
### Very Close
"
  (mkdn-pprint-source very-close))

(defcard-rg
  [very-close])
