(ns soda-ash.contents.content
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def tag :div)
(def ui? false)
(def ui-name "content")

(defn create-group [m]
  (merge {:ui-name ui-name} m))


(def types
  [:default
   :extra
   :hidden
   :visible])


(def variations
  [;; for items
   (create-group
    {:group-name   "aligned"
     :group-vector (vector
                    ;;
                    :middle-aligned
                    :bottom-aligned)})])


(def opts
  {:tag        tag
   :ui?        ui?
   :ui-name    ui-name
   :types      types
   :variations variations})


(defcomp "default" opts)
(defcomp "extra" (assoc opts :type :extra))
(defcomp "hidden" (assoc opts :type :hidden))
(defcomp "visible" (assoc opts :type :visible))
