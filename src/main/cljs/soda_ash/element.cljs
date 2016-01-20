(ns soda-ash.element
  (:require
   [soda-ash.elements.button :as button]
   [soda-ash.elements.buttons :as buttons]
   [soda-ash.elements.container :as container]
   [soda-ash.elements.divider :as divider]
   [soda-ash.elements.flag :as flag]
   [soda-ash.elements.header :as header]
   [soda-ash.elements.icon :as icon]
   [soda-ash.elements.icons :as icons]
   [soda-ash.elements.image :as image]
   [soda-ash.elements.images :as images]
   [soda-ash.elements.input :as input]
   [soda-ash.elements.label :as label]
   [soda-ash.elements.labels :as labels]
   [soda-ash.elements.loader :as loader]
   [soda-ash.elements.rail :as rail]
   [soda-ash.elements.reveal :as reveal]
   [soda-ash.elements.segment :as segment]
   [soda-ash.elements.segments :as segments]
   [soda-ash.elements.s-list :as s-list]
   [soda-ash.elements.step :as step]
   [soda-ash.elements.steps :as steps]))


(def button button/element)
(def buttons buttons/element)

(def container container/element)

(def divider divider/element)

(def flag flag/element)

(def header header/element)

(def icon icon/element)
(def icons icons/element)

(def image image/element)
(def images images/element)

(def input input/element)

(def label label/element)
(def labels labels/element)

(def loader loader/element)

(def rail rail/element)

(def reveal reveal/element)

(def segment segment/element)
(def segments segments/element)

(def s-list s-list/element)

(def step step/element)
(def steps steps/element)
