(ns soda-ash.views.cards
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "cards")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default])


(def variations
  [(create-group
    {:group-name   "fluid"
     :group-vector (vector
                    :fluid)})

   (create-group
     {:group-name   "count"
      :group-vector (vector
                     :one
                     :two
                     :three
                     :four
                     :five
                     :six
                     :seven
                     :eight
                     :nine
                     :ten)})

   (create-group
    {:group-name   "stackable"
     :group-vector (vector
                    :stackable)})

   (create-group
    {:group-name   "doubling"
     :group-vector (vector
                    :doubling)})
   ])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :variations variations})


(defcomp "default" opts)
