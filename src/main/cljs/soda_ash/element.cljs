(ns soda-ash.element
  (:require
   [soda-ash.elements.container :as container]
   [soda-ash.elements.divider :as divider]
   [soda-ash.elements.flag :as flag]
   [soda-ash.elements.header :as header]
   [soda-ash.elements.icon :as icon]
   [soda-ash.elements.image :as image]
   [soda-ash.elements.label :as label]
   [soda-ash.elements.loader :as loader]
   [soda-ash.elements.reveal :as reveal]
   [soda-ash.elements.segment :as segment]))


(def container container/element)

(def divider divider/element)

(def flag flag/element)

(def header header/element)

(def icon icon/element)

(def image image/element)

(def label label/element)

(def loader loader/element)

(def reveal reveal/element)

(def segment segment/element)
