(ns soda-ash.core
  (:require-macros
   [soda-ash.macros :refer [export-semantic-ui-react-components]])
  (:require
   [cljsjs.semantic-ui-react]
   [reagent.core]))


(export-semantic-ui-react-components)
