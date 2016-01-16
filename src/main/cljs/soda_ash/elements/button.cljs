(ns soda-ash.elements.button
  (:require [soda-ash.elements.template :as t]
            [clojure.set :as set]))


;; Meta

(def e-name "button")

(def default-tag :button)

(def ui? true)


;; Variations + States

(def animated-types
  #{:animated
    :vertical-animated
    :animated-fade})

(def basic-type
  #{:basic})

(def emphasis-types
  #{:primary
    :secondary})

(def icon-type
  #{:icon})

(def inverted-type
  #{:inverted})

(def inverted-basic-type
  #{:inverted-basic})

(def labeled-types
  #{:labeled
    :left-labeled})

(def labeled-icon-types
  #{:labeled-icon
    :right-labeled-icon})

(def type-set
  (set/union
   animated-types
   basic-type
   emphasis-types
   icon-type
   inverted-type
   inverted-basic-type
   labeled-types
   labeled-icon-types))

(def bool-set
  #{:circular? :compact? :fluid? :toggle?
    })

(def mod-set
  #{:attached ;; top | bottom | left | right
    :floated ;; left | right
    })

(def opt-set
  #{:color
    :consequence ;; positive | negative
    :size
    :social ;; :facebook | :twitter | :google-plus | :vk | :linkedin | :instagram | :youtube
    :state ;; default | active | disabled | loading
    })


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set type-set
              :bool-set bool-set
              :mod-set mod-set
              :opt-set opt-set}))
