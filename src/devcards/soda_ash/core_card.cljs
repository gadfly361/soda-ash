(ns soda-ash.core-card
  (:require-macros
   [devcards.core :as dc])
  (:require
   ;; elements
   [soda-ash.elements.button-card]
   [soda-ash.elements.container-card]
   [soda-ash.elements.divider-card]
   [soda-ash.elements.flag-card]
   [soda-ash.elements.header-card]
   [soda-ash.elements.icon-card]
   [soda-ash.elements.image-card]
   [soda-ash.elements.input-card]
   [soda-ash.elements.label-card]
   [soda-ash.elements.loader-card]
   [soda-ash.elements.rail-card]
   [soda-ash.elements.reveal-card]
   [soda-ash.elements.segment-card]
   [soda-ash.elements.s-list-card]
   [soda-ash.elements.step-card]

   ;; collections
   [soda-ash.collections.breadcrumb-card]
   ))


(dc/start-devcard-ui!)
