(ns soda-ash.elements.s-list
  (:require [soda-ash.elements.template :as t]))


;; Meta

(def e-name "list")

(def default-tag :div)

(def ui? true)


;; Variations

(def type-set
  #{:bulleted
    :bulleted-link
    :link
    :ordered
    :ordered-link
    })

(def bool-set
  #{:animated?
    :celled?
    :divided?
    :horizontal?
    :inverted?
    :right-floated?
    :selection?
    })

(def mod-set
  #{:aligned ;; top | middle | bottom
    :relaxed ;; default | very
    })

(def opt-set
  #{:size ;; default | mini | tiny | small | large | big | huge | massive
    })


(def element
  (t/element {:e-name e-name
              :default-tag default-tag
              :ui? ui?
              :type-set type-set
              :bool-set bool-set
              :mod-set mod-set
              :opt-set opt-set}))
