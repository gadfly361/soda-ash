(ns soda-ash.elements.s-list
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? true)
(def ui-name "list")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default
   :bulleted
   :ordered
   :custom
   :link
   :bulleted-link])


(def variations
  [(create-group
    {:group-name   "horizontal"
     :group-vector (vector
                    :horizontal)})

   (create-group
    {:group-name   "inverted"
     :group-vector (vector
                    :inverted)})

   (create-group
    {:group-name   "selection"
     :group-vector (vector
                    :selection)})

   (create-group
    {:group-name   "animated"
     :group-vector (vector
                    :animated)})

   (create-group
    {:group-name   "relaxed"
     :group-vector (vector
                    :relaxed
                    :very-relaxed)})

   (create-group
    {:group-name   "divided"
     :group-vector (vector
                    :divided)})

   (create-group
    {:group-name   "celled"
     :group-vector (vector
                    :celled)})

   (create-group
    {:group-name   "size"
     :group-vector (vector
                    :mini
                    :tiny
                    :small
                    ;;
                    :large
                    :big
                    :huge
                    :massive)})
   ])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :variations variations})


(defcomp "default" opts)
(defcomp "bulleted" (assoc opts :type :bulleted))
(defcomp "ordered" (assoc opts :type :ordered))
(defcomp "custom" (assoc opts :type :custom :tag :ol))
(defcomp "link" (assoc opts :type :link))
(defcomp "bulleted-link" (assoc opts :type :bulleted-link))
