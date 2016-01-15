(ns soda-ash.elements.header-card
  (:require-macros [devcards.core
                    :as dc
                    :refer [defcard-rg defcard-doc mkdn-pprint-source]])
  (:require [reagent.core :as reagent]
            [devcards.core]
            [soda-ash.elements.header :as header]
            [soda-ash.element :as s]))


(defcard-doc
"
# header
")


(defcard-rg
  [s/header {:soda {:type :tiny}}
   "hello world"])
