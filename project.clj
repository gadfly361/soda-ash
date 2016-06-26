(defproject soda-ash "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.51"]
                 [reagent "0.5.1"]
                 [binaryage/devtools "0.6.1"]
                 [devcards "0.2.0-8" :exclusions [cljsjs/react]]]
  :url "https://github.com/gadfly361/soda-ash"
  :license {:name "MIT"}
  :scm {:name "git"
        :url  "https://github.com/gadfly361/soda-ash"}

  :min-lein-version "2.5.3"

  :test-refresh
  {:growl true
   :watch-dirs ["src/devcards" "src/cljs" "src/cljc"]}

  :source-paths ["src/clj" "src/cljc" "src/cljs"]

  :test-paths ["src/clj" "src/cljc"]

  :plugins [[lein-cljsbuild "1.1.3"]]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]

  :figwheel {:css-dirs ["resources/public/css"]}


  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :profiles
  {:dev
   {:dependencies [[figwheel-sidecar "0.5.4-3"]
                   [com.cemerick/piggieback "0.2.1"]]

    :plugins [[lein-figwheel "0.5.4-3"]
              [lein-auto "0.1.2"]
              [cider/cider-nrepl "0.13.0-SNAPSHOT"]]}}

  :cljsbuild
  {:builds
   [{:id           "devcards"
     :source-paths ["src/devcards" "src/cljs" "src/cljc"]
     :figwheel     {:devcards true }
     :compiler     {:main                 "soda-ash.core-card"
                    :asset-path           "js/compiled/devcards_out"
                    :output-to            "resources/public/js/compiled/devcards.js"
                    :output-dir           "resources/public/js/compiled/devcards_out"
                    :source-map-timestamp true }}

    {:id           "hostedcards"
     :source-paths ["src/devcards" "src/cljs" "src/cljc"]
     :compiler     {:main            "soda-ash.core-card"
                    :devcards        true
                    :asset-path      "js/compiled/devcards_out"
                    :output-to       "resources/public/js/compiled/devcards.js"
                    :optimizations   :advanced
                    :closure-defines {goog.DEBUG false}}}]})
