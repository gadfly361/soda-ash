(ns soda-ash.an-overview-card
  (:require-macros [devcards.core :refer [defcard-doc]])
  (:require [devcards.core]))


(defcard-doc
  "
# Soda-ash

Soda-ash is an interface between clojurescript's [reagent](https://github.com/reagent-project/reagent) and [Semantic UI](http://semantic-ui.com/).

## Elements

* [divider](http://localhost:3449/#!/soda_ash.elements.divider_card)
* [flag](http://localhost:3449/#!/soda_ash.elements.flag_card)
* [header](http://localhost:3449/#!/soda_ash.elements.header_card)
* [icon](http://localhost:3449/#!/soda_ash.elements.icon_card)
* [image](http://localhost:3449/#!/soda_ash.elements.image_card)
* [label](http://localhost:3449/#!/soda_ash.elements.label_card)
* [loader](http://localhost:3449/#!/soda_ash.elements.loader_card)
* [segment](http://localhost:3449/#!/soda_ash.elements.segment_card)

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
