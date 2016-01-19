(ns soda-ash.elements.segment-test
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
  (let [_ (reagent/render [s/segment {}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (is (= "ui segment" class))))


(def soda
  {:type :raised
   :state :loading
   :aligned :left
   :attached :left
   :basic? true
   :circular? true
   :clearing? true
   :color :olive
   :compact? true
   :emphasis :secondary
   :floated :right
   :inverted? true
   :padded :very})

(defn check-classes [class]
  (doto class
    (h/check-class #"raised")
    (h/check-class #"loading")
    (h/check-class #"left aligned")
    (h/check-class #"left attached")
    (h/check-class #"basic")
    (h/check-class #"circular")
    (h/check-class #"clearing")
    (h/check-class #"olive")
    (h/check-class #"compact")
    (h/check-class #"secondary")
    (h/check-class #"right floated")
    (h/check-class #"inverted")
    (h/check-class #"very padded")))


(deftest with-soda
  (let [_ (reagent/render [s/segment {:soda soda}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (check-classes class)))


(deftest with-soda-with-ratom
  (let [ratom (reagent/atom {})
        _ (reagent/render [s/segment {:soda (merge
                                             {:ratom ratom
                                              :path :foo}
                                             soda)}] c)
        node (sel1 c [:div])
        class (h/get-class node)
        ratom-soda (get-in @ratom [:foo :soda])]
    (check-classes class)

    (h/check-soda soda ratom-soda)))


(deftest group-with-soda-with-ratom
  (let [ratom (reagent/atom {})
        _ (reagent/render [s/segments {:soda (merge
                                              {:ratom ratom
                                               :path :foo}
                                              soda)}] c)
        node (sel1 c [:div])
        class (h/get-class node)
        ratom-soda (get-in @ratom [:foo :soda])]
    (check-classes class)

    (h/check-soda soda ratom-soda)))
