(defproject soda-ash "0.1.0-alpha2"
  :description "Soda-ash is an interface between clojurescript's reagent
                and Semantic UI"
  :url "https://github.com/gadfly361/soda-ash"
  :license {:name "MIT"}
  :scm {:name "git"
        :url "https://github.com/gadfly361/soda-ash"}
  :dependencies
  [[org.clojure/clojure "1.7.0"]
   [org.clojure/clojurescript "1.7.170"]
   [reagent "0.5.1" :exclusions [cljsjs/react]]
   [devcards "0.2.0-8" :exclusions [cljsjs/react]]
   [cljsjs/react-with-addons "0.13.3-0"]
   [cljs-react-test "0.1.3-SNAPSHOT"]
   [prismatic/dommy "1.1.0"]]

  :min-lein-version "2.5.3"

  :source-paths ["src/main/cljs"] ;; needed for clojars

  :plugins
  [[lein-cljsbuild "1.1.1"]
   [lein-figwheel "0.5.0-2"]
   [lein-doo "0.1.6"]]

  :clean-targets ^{:protect false}
  ["resources/public/js/compiled" "target"]

  :cljsbuild
  {:builds
   [{:id "devcards"
     :source-paths ["src/devcards" "src/main/cljs"]
     :figwheel {:devcards true }
     :compiler {:main "soda-ash.core-card"
                :asset-path "js/compiled/devcards_out"
                :output-to  "resources/public/js/compiled/devcards.js"
                :output-dir "resources/public/js/compiled/devcards_out"
                :source-map-timestamp true }}

    {:id "hostedcards"
     :source-paths ["src/devcards" "src/main/cljs"]
     :compiler {:main "soda-ash.core-card"
                :devcards true
                :asset-path "js/compiled/devcards_out"
                :output-to  "resources/public/js/compiled/devcards.js"
                :optimizations :advanced}}

    {:id "test"
     :source-paths ["src/main/cljs" "src/test/cljs"]
     :compiler {:output-to "resources/public/js/compiled/test.js"
                :main soda-ash.runner
                :optimizations :none}}]})
