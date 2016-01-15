(ns soda-ash.elements.helpers-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [soda-ash.elements.helpers :as h]))



;; errors


(deftest throw-error
  (is (thrown-with-msg? js/Error.
                        #"Soda-ash :foo :bar doesn't exist for baz element"
                        (h/throw-error :foo :bar "baz"))))


(deftest throw-type-error
  (is (thrown-with-msg? js/Error.
                        #"Soda-ash :type :bar doesn't exist for baz element"
                        (h/throw-type-error :bar "baz"))))



;; class


(deftest value->class
  (is (= "foo" (h/value->class :foo)))
  (is (= "foo bar" (h/value->class :foo-bar))))


(deftest type->class
  (is (= "foo" (h/type->class :foo #{:foo} "baz")))
  (is (thrown-with-msg? js/Error.
                        #"Soda-ash :type :foo doesn't exist for baz element"
                        (h/type->class :foo #{:bar} "baz"))))


(deftest bool->class
  (is (= "foo" (h/bool->class :foo? true)))
  (is (nil? (h/bool->class :foo? false)))

  (is (= "foo bar" (h/bool->class :foo-bar? true)))
  (is (nil? (h/bool->class :foo-bar? false))))


(deftest mod->class
  (is (= "foo" (h/mod->class :foo :default)))
  (is (= "bar foo" (h/mod->class :foo :bar))))


(deftest opt->class
  (is (= "foo" (h/opt->class :foo)))
  (is (= "foo bar" (h/opt->class :foo-bar))))


(deftest special->class
  (let [special-map   {:aligned {:right "right aligned"
                                 :left "left aligned"
                                 :justified "justified"
                                 :center "center aligned"}}]
    (is (= "right aligned" (h/special->class :aligned
                                             :right
                                             special-map
                                             "baz")))
    (is (thrown-with-msg? js/Error.
                          #"Soda-ash :aligned :bad-option doesn't exist for baz element"
                          (h/special->class :aligned
                                            :bad-option
                                            special-map
                                            "baz")))))


(deftest class
  (is (= "foo" (h/class false nil "foo")))
  (is (= "ui foo" (h/class true nil "foo")))
  (is (= "ui bar foo" (h/class true "bar" "foo")))
  (is (= "bar foo" (h/class false "bar" "foo")))
  (is (= "ui bar baz foo" (h/class true "bar baz" "foo"))))



;; sanitize


(deftest sanitize-soda
  (is (nil? (h/sanitize-soda nil)))
  (is (= {} (h/sanitize-soda {})))
  (is (= {:foo :bar} (h/sanitize-soda {:foo :bar})))
  (is (= {:foo :bar
          :baz :quux} (h/sanitize-soda {:foo :bar
                                        :baz :quux
                                        :tag :div
                                        :ratom :foo-ratom
                                        :path :foo-path}))))


(deftest sanitize-attrs
  (is (nil? (h/sanitize-attrs nil)))
  (is (= {} (h/sanitize-attrs {})))
  (is (= {:foo :bar} (h/sanitize-attrs {:foo :bar})))
  (is (= {:foo :bar
          :baz :quux} (h/sanitize-attrs {:foo :bar
                                         :baz :quux
                                         :soda {:alpha :beta}}))))
