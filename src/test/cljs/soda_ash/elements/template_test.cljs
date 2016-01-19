(ns soda-ash.elements.template-test
  (:require [cljs.test :refer-macros [deftest testing is use-fixtures]]
            [cljs-react-test.utils :as tu]
            [dommy.core :as dommy :refer-macros [sel1]]
            [reagent.core :as reagent]
            [soda-ash.elements.template :as t]
            [soda-ash.elements.test-helpers :as h]))


;; Util

(def ^:dynamic c)

(use-fixtures :each (fn [test-fn]
                      (binding [c (tu/new-container!)]
                        (test-fn)
                        (tu/unmount! c))))



;; Tests


(deftest template
  (testing "base case"
    (let [_ (reagent/render [(t/element
                              {:e-name "foo"
                               :default-tag :div})
                             {}] c)
          node (sel1 c [:div])
          class (h/get-class node)]
      (is (= "ui foo" class))))

  (testing "ui?"
    (testing "create element with ui? false"
      (let [_ (reagent/render [(t/element
                                {:e-name "foo"
                                 :default-tag :div
                                 :ui? false})
                             {}] c)
            node (sel1 c [:div])
            class (h/get-class node)]
        (is (= "foo" class))))))
