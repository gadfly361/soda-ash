(ns soda-ash.elements.list-test
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
  (let [_ (reagent/render [s/s-list {}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (is (= "ui list" class))))


(def soda
  {:type :bulleted
   :aligned :top
   :animated? true
   :celled? true
   :divided? true
   :horizontal? true
   :inverted? true
   :right-floated? true
   :relaxed :default
   :selection? true
   :size :massive})

(defn check-classes [class]
  (doto class
    (h/check-class #"bulleted")
    (h/check-class #"top aligned")
    (h/check-class #"animated")
    (h/check-class #"celled")
    (h/check-class #"divided")
    (h/check-class #"horizontal")
    (h/check-class #"inverted")
    (h/check-class #"right floated")
    (h/check-class #"relaxed")
    (h/check-class #"selection")
    (h/check-class #"massive")))


(deftest with-soda
  (let [_ (reagent/render [s/s-list {:soda soda}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (check-classes class)))


(deftest with-soda-with-ratom
  (let [ratom (reagent/atom {})
        _ (reagent/render [s/s-list {:soda (merge
                                          {:ratom ratom
                                           :path :foo}
                                          soda)}] c)
        node (sel1 c [:div])
        class (h/get-class node)
        ratom-soda (get-in @ratom [:foo :soda])]
    (check-classes class)

    (h/check-soda soda ratom-soda)))
