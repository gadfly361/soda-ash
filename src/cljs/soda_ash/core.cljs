(ns soda-ash.core
  (:require
   [soda-ash.helpers :as h]
   [soda-ash.elements.button :as button]
   ))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; button

(def button' button/class)
(def button button/component)

(def button-primary' button/class-primary)
(def button-primary button/component-primary)

(def button-secondary' button/class-secondary)
(def button-secondary button/component-secondary)

(def button-animated' button/class-animated)
(def button-animated button/component-animated)

(def button-vertical-animated' button/class-vertical-animated)
(def button-vertical-animated button/component-vertical-animated)

(def button-animated-fade' button/class-animated-fade)
(def button-animated-fade button/component-animated-fade)

(def button-labeled' button/class-labeled)
(def button-labeled button/component-labeled)

(def button-left-labeled' button/class-left-labeled)
(def button-left-labeled button/component-left-labeled)

(def button-icon' button/class-icon)
(def button-icon button/component-icon)

(def button-labeled-icon' button/class-labeled-icon)
(def button-labeled-icon button/component-labeled-icon)

(def button-right-labeled-icon' button/class-right-labeled-icon)
(def button-right-labeled-icon button/component-right-labeled-icon)

(def button-basic' button/class-basic)
(def button-basic button/component-basic)

(def button-inverted' button/class-inverted)
(def button-inverted button/component-inverted)

(def button-inverted-basic' button/class-inverted-basic)
(def button-inverted-basic button/component-inverted-basic)
