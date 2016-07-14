(ns soda-ash.views.cards
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "cards"
          :only-one? true}
         m))


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
  {:tag     :div
   :ui?     true
   :ui-name "cards"
   :types types
   :variations  variations})


(defcomp "default" opts)
