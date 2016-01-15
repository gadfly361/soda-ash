(ns soda-ash.elements.header-test
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
  (let [_ (reagent/render [s/header {}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (is (= "ui header" class))))


(deftest with-soda
  (let [_ (reagent/render [s/header {:soda {:type :tiny
                                            :block? true
                                            :dividing? true
                                            :inverted? true
                                            :state :disabled
                                            :attached :top
                                            :floated :left
                                            :color :teal}}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (doto class
      (h/check-class #"tiny")
      (h/check-class #"block")
      (h/check-class #"disabled")
      (h/check-class #"dividing")
      (h/check-class #"inverted")
      (h/check-class #"top attached")
      (h/check-class #"left floated")
      (h/check-class #"teal"))))
