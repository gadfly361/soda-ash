(ns soda-ash.elements.button-test
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
  (let [_ (reagent/render [s/button {}] c)
        node (sel1 c [:button])
        class (h/get-class node)]
    (is (= "ui button" class))))


(deftest soda-add-class
  (let [_ (reagent/render [s/button {:soda {:add-class "gadfly"}}] c)
        node (sel1 c [:button])
        class (h/get-class node)]
    (is (= "ui gadfly button" class)
        ":add-class should add a class between ui and button")))


(def soda
  {:type :animated
   :circular? true
   :compact? true
   :fluid? true
   :toggle? true
   :attached :top
   :color :orange
   :consequence :positive
   :size :massive
   :social :twitter
   :state :loading})

(defn check-classes [class]
  (doto class
    (h/check-class #"animated")
    (h/check-class #"circular")
    (h/check-class #"compact")
    (h/check-class #"fluid")
    (h/check-class #"toggle")
    (h/check-class #"attached")
    (h/check-class #"orange")
    (h/check-class #"positive")
    (h/check-class #"massive")
    (h/check-class #"twitter")
    (h/check-class #"loading")))


(deftest with-soda
  (let [_ (reagent/render [s/button {:soda soda}] c)
        node (sel1 c [:button])
        class (h/get-class node)]
    (check-classes class)))


(deftest with-soda-with-ratom
  (let [ratom (reagent/atom {})
        _ (reagent/render [s/button {:soda (merge
                                            {:ratom ratom
                                             :path :foo}
                                            soda)}] c)
        node (sel1 c [:button])
        class (h/get-class node)
        ratom-soda (get-in @ratom [:foo :soda])]
    (check-classes class)

    (h/check-soda soda ratom-soda)))


(deftest buttons-with-soda
  (let [_ (reagent/render [s/buttons {:soda soda}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (check-classes class)))


(deftest buttons-with-soda-with-ratom
  (let [ratom (reagent/atom {})
        _ (reagent/render [s/buttons {:soda (merge
                                             {:ratom ratom
                                              :path :foo}
                                             soda)}] c)
        node (sel1 c [:div])
        class (h/get-class node)
        ratom-soda (get-in @ratom [:foo :soda])]
    (check-classes class)

    (h/check-soda soda ratom-soda)))
