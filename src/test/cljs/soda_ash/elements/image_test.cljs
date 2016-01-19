(ns soda-ash.elements.image-test
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
  (let [_ (reagent/render [s/image {}] c)
        node (sel1 c [:img])
        class (h/get-class node)]
    (is (= "ui image" class))))


(def soda
  {:state :disabled
   :aligned :top
   :avatar? true
   :bordered? true
   :centered? true
   :circular? true
   :floated :left
   :fluid? true
   :rounded? true
   :size :tiny
   :spaced :left})

(defn check-classes [class]
  (doto class
    (h/check-class #"disabled")
    (h/check-class #"top aligned")
    (h/check-class #"avatar")
    (h/check-class #"bordered")
    (h/check-class #"centered")
    (h/check-class #"circular")
    (h/check-class #"left floated")
    (h/check-class #"fluid")
    (h/check-class #"rounded")
    (h/check-class #"tiny")
    (h/check-class #"left spaced")))


(deftest with-soda
  (let [_ (reagent/render [s/image {:soda soda}] c)
        node (sel1 c [:img])
        class (h/get-class node)]
    (check-classes class)))


(deftest with-soda-with-ratom
  (let [ratom (reagent/atom {})
        _ (reagent/render [s/image {:soda (merge
                                           {:ratom ratom
                                            :path :foo}
                                           soda)}] c)
        node (sel1 c [:img])
        class (h/get-class node)
        ratom-soda (get-in @ratom [:foo :soda])]
    (check-classes class)

    (h/check-soda soda ratom-soda)))


(deftest group-soda-with-ratom
  (let [ratom (reagent/atom {})
        _ (reagent/render [s/images {:soda (merge
                                            {:ratom ratom
                                             :path :foo}
                                            soda)}] c)
        node (sel1 c [:div])
        class (h/get-class node)
        ratom-soda (get-in @ratom [:foo :soda])]
    (check-classes class)

    (h/check-soda soda ratom-soda)))
