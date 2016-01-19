(ns soda-ash.elements.step-test
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
  (let [_ (reagent/render [s/step {}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (is (= "step" class))))


(def soda
  {:type :link
   :state :completed})

(defn check-classes [class]
  (doto class
    (h/check-class #"link")
    (h/check-class #"completed")))


(deftest with-soda
  (let [_ (reagent/render [s/step {:soda soda}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (check-classes class)))


(deftest with-soda-with-ratom
  (let [ratom (reagent/atom {})
        _ (reagent/render [s/step {:soda (merge
                                             {:ratom ratom
                                              :path :foo}
                                             soda)}] c)
        node (sel1 c [:div])
        class (h/get-class node)
        ratom-soda (get-in @ratom [:foo :soda])]
    (check-classes class)

    (h/check-soda soda ratom-soda)))



(deftest group-no-soda
  (let [_ (reagent/render [s/steps {}] c)
        node (sel1 c [:div])
        class (h/get-class node)]
    (is (= "ui steps" class))))


(def soda2
  {:type :tablet-stackable
   :fluid? true
   :attached :top
   :divided :two
   :size :large})

(defn check-classes2 [class]
  (doto class
    (h/check-class #"tablet stackable")
    (h/check-class #"fluid")
    (h/check-class #"top attached")
    (h/check-class #"two")
    (h/check-class #"large")))

(deftest group-with-soda-with-ratom
  (let [ratom (reagent/atom {})
        _ (reagent/render [s/steps {:soda (merge
                                           {:ratom ratom
                                            :path :foo}
                                           soda2
                                           )}] c)
        node (sel1 c [:div])
        class (h/get-class node)
        ratom-soda (get-in @ratom [:foo :soda])]
    (check-classes2 class)

    (h/check-soda soda2 ratom-soda)))
