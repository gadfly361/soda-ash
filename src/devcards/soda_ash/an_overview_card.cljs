(ns soda-ash.an-overview-card
  (:require-macros [devcards.core :refer [defcard-doc
                                          defcard-rg
                                          mkdn-pprint-source]])
  (:require [devcards.core]
            [devcards.util.edn-renderer :as edn]
            [reagent.core :as reagent]
            [soda-ash.element :as s]))



;; avatar example


(defn avatar-no-soda []
  [:a.ui.basic.teal.label
   [:img.ui.right.spaced.avatar.image
    {:src "images/avatar/small/elliot.jpg"}
    "Elliot"]])

(defn avatar-with-soda []
  [s/label {:soda {:tag :a
                   :basic? true
                   :color :teal}}
   [s/image {:soda {:spaced :right
                    :avatar? true}
             :src "images/avatar/small/elliot.jpg"}]
   "Elliot"])



;; dynamic example


(defn wrap-element [ratom element]
  [:div
   (if (vector? element) element [element])
   [:div [:strong "Element State"]]
   (edn/html-edn @ratom)])

(defonce app-state (reagent/atom {}))

(defn option-btn [k v]
  (let [current-v (get-in @app-state [:foo :bar :soda k])]
    [:button {:on-click #(swap! app-state assoc-in [:foo :bar :soda k] v)
              :style {:background-color (when (= current-v v)
                                          "grey")}}
     (name v)]))

(def colors
  [:red :orange :yellow :olive
   :green :teal :blue :violet
   :purple :pink :brown :grey
   :black])

(def sizes
  [:mini :tiny :small :large
   :big :huge :massive])

(def icons
  [:area-chart :bar-chart :camera-retro
   :newspaper :film :line-chart
   :photo :pie-chart :sound])

(defn icon []
  [s/icon {:soda {:ratom app-state
                  :path [:foo :bar]
                  :icon :sound
                  :color :violet
                  :size :large}}])



;; docs


(defcard-doc
  "
# Soda-ash (version 0.1.0-beta)

Soda-ash is an interface between clojurescript's [reagent](https://github.com/reagent-project/reagent) and [Semantic UI](http://semantic-ui.com/).

--- **[github repo](https://github.com/gadfly361/soda-ash)** ---


## [FAQs](#!/soda_ash.a_faq_card)

## Elements

* [button](#!/soda_ash.elements.button_card)
* [container](#!/soda_ash.elements.container_card)
* [divider](#!/soda_ash.elements.divider_card)
* [flag](#!/soda_ash.elements.flag_card)
* [header](#!/soda_ash.elements.header_card)
* [icon](#!/soda_ash.elements.icon_card)
* [image](#!/soda_ash.elements.image_card)
* [input](#!/soda_ash.elements.input_card)
* [label](#!/soda_ash.elements.label_card)
* [list](#!/soda_ash.elements.list_card)
* [loader](#!/soda_ash.elements.loader_card)
* [rail](#!/soda_ash.elements.rail_card)
* [reveal](#!/soda_ash.elements.reveal_card)
* [segment](#!/soda_ash.elements.segment_card)
* [step](#!/soda_ash.elements.step_card)

## Why use soda-ash?

Semantic UI is awesome ... however, at its core, you are concatenating
ordered classes into a string.  Soda-ash bubbles Semantic UI's classes
out of this regex-hell and softens them into clojurescript's familiar,
powerful, and unordered hash-map.

What was once this:
"

(mkdn-pprint-source avatar-no-soda)

"Becomes this:"

  (mkdn-pprint-source avatar-with-soda))

(defcard-rg
  [s/label {:soda {:tag :a
                   :basic? true
                   :color :teal}}
   [s/image {:soda {:spaced :right
                    :avatar? true}
             :src "images/avatar/small/elliot.jpg"}]
   "Elliot"])



(defcard-doc
"`:soda` is a new attribute that is *added* to the normal attibute
map, and **replaces the `:class` attribute.  `:soda` takes a hash-map
of unordered key-value pairs.  Now you are able to take full advantage
of the hash-map data structure ... assoc, dissoc, merge etc.

Finally, soda-ash allows you to place your `:soda` inside a reagent
atom at your desired path.  This means you can swap! Semantic UI
classes and have your component reactively update.
"
  (mkdn-pprint-source app-state)

  (mkdn-pprint-source icon))

(defcard-rg
  [:div
   [wrap-element app-state
    [icon]]
   [:div "Color: "
    (for [color colors]
      ^{:key color}
      [option-btn :color color])]

   [:div "Size: "
    (for [size sizes]
      ^{:key size}
      [option-btn :size size])]
   [:div "Icon: "
    (for [icon icons]
      ^{:key icon}
      [option-btn :icon icon])]])



(defcard-doc
    "
## Usage

Put the following in the `:dependencies` vector of your *project.clj*

```
[soda-ash \"0.1.0-beta\"]
```

Then require soda-ash in your namespace.

```
(ns foo.bar
  (:require [soda-ash.element :as s]))
```

Finally, add Semantic UI to your index.html file:

```
<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.css\">
```
")
