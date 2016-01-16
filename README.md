# soda-ash

Soda-ash is an interface between clojurescript's [reagent](https://github.com/reagent-project/reagent) and [Semantic UI](http://semantic-ui.com/).

Semantic UI is awesome, but at its core, you are concatenating ordered
classes as a string.  Soda-ash bubbles the Semantic UI classes out of
the regex-hell of strings and puts them into hash-maps.

## Todo List

* add tests for soda->class
* add tests for :add-class
* add tests for :default type
* icon groups
* image groups
* label groups
* segment groups
* reveal rotate

## Devcards

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
