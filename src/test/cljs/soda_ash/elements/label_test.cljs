(ns soda-ash.elements.label-test
  (:require [cljs.test :refer-macros [deftest testing is use-fixtures]]
            [cljs-react-test.utils :as tu]
            [dommy.core :as dommy :refer-macros [sel1]]
            [reagent.core :as reagent]
            [soda-ash.element :as s]
            [soda-ash.elements.test-helpers :as h]))


;; Util

(def ^:dynamic c)

(use-fixtures :each (fn [test-fn]
                      (binding [c (tu/new-container!)]
                        (test-fn)
                        (tu/unmount! c))))



;; Tests


(deftest no-soda
  (let [_ (reagent/render [s/label {}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (is (= "ui label" class))))


(def soda
  {:type :top-attached
   :basic? true
   :circular? true
   :color :teal
   :size :massive})

(defn check-classes [class]
  (doto class
    (h/check-class #"top attached")
    (h/check-class #"basic")
    (h/check-class #"circular")
    (h/check-class #"teal")
    (h/check-class #"massive")))


(deftest with-soda
  (let [_ (reagent/render [s/label {:soda soda}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (check-classes class)))


(deftest with-soda-with-ratom
  (let [ratom (reagent/atom {})
        _ (reagent/render [s/label {:soda (merge
                                           {:ratom ratom
                                            :path :foo}
                                           soda)}] c)
        node (sel1 c [:div])
        class (h/get-class node)
        ratom-soda (get-in @ratom [:foo :soda])]
    (check-classes class)

    (h/check-soda soda ratom-soda)))
