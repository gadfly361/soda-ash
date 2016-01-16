# soda-ash

Soda-ash is an interface between clojurescript's [reagent](https://github.com/reagent-project/reagent) and [Semantic UI](http://semantic-ui.com/).

Semantic UI is awesome. However, at its core, you are concatenating
ordered classes into a string.  Soda-ash bubbles Semantic UI's classes
out of this regex-hell and softens them into clojurescript's familiar,
powerful, and unordered hash-map.

## Docs

TODO: add link to live docs.

## Usage

Put the following in the `:dependencies` vector of your *project.clj*

```
[soda-ash "0.1.0-alpha"] ;; this isn't on clojars yet
```

Then require soda-ash in your namespace.

```
(ns foo.bar
  (:require [soda-ash.element :as s]))
```

## Development

### Devcards

```
lein clean
lein figwheel devcards
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

### Tests

```
lein clean
lein doo phantom test once
```

The above command assumes that you have [phantomjs](https://www.npmjs.com/package/phantomjs) installed.

### Todo List

* add tests for soda->class
* add tests for :add-class
* add tests for :default type
* button content
* button groups
* icon groups
* image groups
* label groups
* segment groups
* reveal rotate

# License

Copyright © 2016 Matthew Jaoudi

Distributed under the The MIT License (MIT).
