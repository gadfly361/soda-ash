(ns soda-ash.elements.divider-test
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
  (let [_ (reagent/render [s/divider {}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (is (= "ui divider" class))))


(def soda
  {:type :vertical
   :clearing? true
   :fitted? true
   :hidden? true
   :inverted? true
   :section? true})

(defn check-classes [class]
  (doto class
    (h/check-class #"vertical")
    (h/check-class #"clearing")
    (h/check-class #"fitted")
    (h/check-class #"hidden")
    (h/check-class #"inverted")
    (h/check-class #"section")))


(deftest with-soda
  (let [_ (reagent/render [s/divider {:soda soda}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (check-classes class)))


(deftest with-soda-with-ratom
  (let [ratom (reagent/atom {})
        _ (reagent/render [s/divider {:soda (merge
                                             {:ratom ratom
                                              :path :foo}
                                             soda)}] c)
        node (sel1 c [:div])
        class (h/get-class node)
        ratom-soda (get-in @ratom [:foo :soda])]
    (check-classes class)

    (h/check-soda soda ratom-soda)))
