(ns soda-ash.elements.input-test
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
  (let [_ (reagent/render [s/input {}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (is (= "ui input" class))))


(def soda
  {:state :focus
   :action :left
   :fluid? true
   :icon :left
   :inverted? true
   :labeled :left-corner
   :transparent? true
   :size :massive
   })

(defn check-classes [class]
  (doto class
    (h/check-class #"focus")
    (h/check-class #"left action")
    (h/check-class #"fluid")
    (h/check-class #"left icon")
    (h/check-class #"inverted")
    (h/check-class #"left corner labeled")
    (h/check-class #"transparent")
    (h/check-class #"massive")))


(deftest with-soda
  (let [_ (reagent/render [s/input {:soda soda}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (check-classes class)))


(deftest with-soda-with-ratom
  (let [ratom (reagent/atom {})
        _ (reagent/render [s/input {:soda (merge
                                          {:ratom ratom
                                           :path :foo}
                                          soda)}] c)
        node (sel1 c [:div])
        class (h/get-class node)
        ratom-soda (get-in @ratom [:foo :soda])]
    (check-classes class)

    (h/check-soda soda ratom-soda)))
