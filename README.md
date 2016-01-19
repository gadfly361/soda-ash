# soda-ash

[![Build Status](https://travis-ci.org/gadfly361/soda-ash.svg?branch=master)](https://travis-ci.org/gadfly361/soda-ash)

Soda-ash is an interface between clojurescript's [reagent](https://github.com/reagent-project/reagent) and [Semantic UI](http://semantic-ui.com/).

Semantic UI is awesome ... however, at its core, you are concatenating
ordered classes into a string.  Soda-ash bubbles Semantic UI's classes
out of this regex-hell and softens them into clojurescript's familiar,
powerful, and unordered hash-map.  Furthermore, soda-ash allows you to
place this hash-map inside a reagent atom at your desired path.  This
means you can swap! Semantic UI classes and have your component
reactively update.

## Docs

The
**[documentation](http://soda-ash.s3-website-us-east-1.amazonaws.com/#!/soda_ash.an_overview_card)**
has *lots* of devcard examples.

If you have questions, I can usually be found hanging out in the
[clojurians](http://clojurians.net/) #reagent slack channel (my handle
is [@gadfly361](https://twitter.com/gadfly361)).

## Usage

Put the following in the `:dependencies` vector of your *project.clj*

```
[soda-ash "0.1.0-beta"]
```

Then require soda-ash in your namespace.

```
(ns foo.bar
  (:require [soda-ash.element :as s]))
```

Finally, add Semantic UI to your index.html file:

```
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.css">
```

## Roadmap

Next up, Collections.

## Development

### Devcards

```
lein clean
lein figwheel devcards
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

---

To build a minified version:

```
lein clean
lein cljsbuild once hostedcards
```

Then open *resources/public/index.html*

### Tests

```
lein clean
lein doo phantom test once
```

The above command assumes that you have [phantomjs](https://www.npmjs.com/package/phantomjs) installed.

# License

Copyright © 2016 Matthew Jaoudi

Distributed under the The MIT License (MIT).
