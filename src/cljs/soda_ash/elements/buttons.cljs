(ns soda-ash.elements.buttons
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "buttons")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default])


(def variations
  [(create-group
    {:group-name   "vertical"
     :group-vector (vector
                    :vertical)})

   (create-group
    {:group-name   "icon"
     :group-vector (vector
                    :icon
                    :labeled-icon)})

   (create-group
    {:group-name   "width"
     :group-vector (vector
                    :two
                    :three
                    :four
                    :five
                    :six
                    :seven
                    :eight
                    :nine
                    :ten
                    :eleven
                    :twelve)})

   (create-group
    {:group-name   "size"
     :group-vector (vector
                    :mini
                    :tiny
                    :small
                    :medium
                    :large
                    :big
                    :huge
                    :massive)})


   (create-group
    {:group-name   "colored"
     :group-vector (vector
                    :red
                    :orange
                    :yellow
                    :olive
                    :green
                    :teal
                    :blue
                    :violet
                    :purple
                    :pink
                    :brown
                    :grey
                    :black)})

   (create-group
    {:group-name   "basic"
     :group-vector (vector
                    :basic)})
   ])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :variations variations})


(defcomp "default" opts)
