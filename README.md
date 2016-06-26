# soda-ash

Soda-ash is an interface between clojurescript's [reagent](https://github.com/reagent-project/reagent) and [Semantic UI](http://semantic-ui.com/).

Semantic UI is awesome ... however, at its core, you are concatenating
ordered classes into a string.  Soda-ash bubbles Semantic UI's classes
out of this regex-hell and softens them into clojurescript's familiar
and powerful collection abstraction.

## Docs

The
**[documentation](http://soda-ash.s3-website-us-east-1.amazonaws.com/#!/soda_ash.an_overview_card)**
has *lots* of devcard examples.

If you have questions, I can usually be found hanging out in the
[clojurians](http://clojurians.net/) #reagent slack channel (my handle
is [@gadfly361](https://twitter.com/gadfly361)).

## Development Mode

### cljs-devtools

To enable:

1. Open Chrome's DevTools,`Ctrl-Shift-i`
2. Open "Settings", `F1`
3. Check "Enable custom formatters" under the "Console" section
4. close and re-open DevTools

### Start Cider from Emacs:

Put this in your Emacs config file:

```
(setq cider-cljs-lein-repl "(do (use 'figwheel-sidecar.repl-api) (start-figwheel!) (cljs-repl))")
```

Navigate to a clojurescript file and start a figwheel REPL with `cider-jack-in-clojurescript` or (`C-c M-J`)

### Run application:

```
lein clean
lein figwheel devcards
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

### Run tests:

```
lein test
```

Or

```
lein auto test
```

## Production Build

```
lein clean
lein cljsbuild once hostedcards
```
