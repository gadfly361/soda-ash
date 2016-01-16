(ns soda-ash.an-overview-card
  (:require-macros [devcards.core :refer [defcard-doc defcard-rg]])
  (:require [devcards.core]
            [devcards.util.edn-renderer :as edn]
            [reagent.core :as reagent]
            [soda-ash.element :as s]))

(defcard-doc
  "
# Soda-ash

Soda-ash is an interface between clojurescript's [reagent](https://github.com/reagent-project/reagent) and [Semantic UI](http://semantic-ui.com/).

--- **[github repo](https://github.com/gadfly361/soda-ash)** ---

## Elements

* [button](http://localhost:3449/#!/soda_ash.elements.button_card)
* [container](http://localhost:3449/#!/soda_ash.elements.container_card)
* [divider](http://localhost:3449/#!/soda_ash.elements.divider_card)
* [flag](http://localhost:3449/#!/soda_ash.elements.flag_card)
* [header](http://localhost:3449/#!/soda_ash.elements.header_card)
* [icon](http://localhost:3449/#!/soda_ash.elements.icon_card)
* [image](http://localhost:3449/#!/soda_ash.elements.image_card)
* [label](http://localhost:3449/#!/soda_ash.elements.label_card)
* [loader](http://localhost:3449/#!/soda_ash.elements.loader_card)
* [reveal](http://localhost:3449/#!/soda_ash.elements.reveal_card)
* [segment](http://localhost:3449/#!/soda_ash.elements.segment_card)

## Why use soda-ash?

Semantic UI is awesome ... however, at its core, you are concatenating
ordered classes into a string.  Soda-ash bubbles Semantic UI's classes
out of this regex-hell and softens them into clojurescript's familiar,
powerful, and unordered hash-map.

What was once this:

```clojure
[:a.ui.basic.teal.label
  [:img.ui.right.spaced.avatar.image
    {:src \"/images/avatar/small/elliot.jpg\"}
    \"Elliot\"]]
```

Becomes this:

```clojure
[s/label {:soda {:tag :a
                 :basic? true
                 :color :teal}}
   [s/image {:soda {:spaced :right
                    :avatar? true}
             :src \"/images/avatar/small/elliot.jpg\"}]
   \"Elliot\"]
```")

(defcard-rg
  [s/label {:soda {:tag :a
                   :basic? true
                   :color :teal}}
   [s/image {:soda {:spaced :right
                    :avatar? true}
             :src "/images/avatar/small/elliot.jpg"}]
   "Elliot"])

(defcard-doc
"`:soda` is a new attribute that is *added* to the normal attibute map.
`:soda` takes a hash-map of unordered key-value pairs.  Now you
are able to take full advantage of the hash-map data structure
... assoc, dissoc, merge etc.

Finally, soda-ash allows you to place your `:soda` inside a reagent
atom at your desired path.  This means you can swap! Semantic UI
classes and have your component reactively update.

```
(def app-state (reagent/atom {}))

(defn [icon]
 [s/icon {:soda {:ratom app-state
                 :path [:foo :bar]
                 :icon :users
                 :color :blue}}])
```
")

(defn wrap-element [ratom element]
  [:div
   (if (vector? element) element [element])
   [:div [:strong "Element State"]]
   (edn/html-edn @ratom)])

(def app-state (reagent/atom {}))

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

(defcard-rg
  [:div
   [wrap-element app-state
    [s/icon {:soda {:ratom app-state
                    :path [:foo :bar]
                    :icon :sound
                    :color :violet
                    :size :large}}]]
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
[soda-ash \"0.1.0-alpha\"]
```

Then require soda-ash in your namespace.

```
(ns foo.bar
  (:require [soda-ash.element :as s]))
```

")
