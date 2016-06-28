(ns soda-ash.helpers-test
  (:require
   [soda-ash.helpers :as target]
   [clojure.test :as t :refer [deftest is testing]]))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Class

(deftest keyword->class

  (is (nil? (target/keyword->class nil))
      "Should return nil if class is nil")

  (is (= (target/keyword->class "")
         "")
      "Should return empty string if class is an empty string")

  (is (= (target/keyword->class :foobar)
         "foobar")
      "Should convert keyword to string")

  (is (= (target/keyword->class :foo-bar)
         "foo bar")
      "Should convert dash to space")

  (is (= (target/keyword->class "foobar")
         "foobar")
      "Should accept strings")

  (is (= (target/keyword->class "foo-bar")
         "foo bar")
      "Should accept strings with dashes and convert dashes to spaces")

  (is (= (target/keyword->class 'foobar)
         "foobar")
      "Should accept symbols")

  (is (= (target/keyword->class 'foo-bar)
         "foo bar")
      "Should accept symbols with dashes and convert dashes to spaces")
  )



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Ash

(deftest ash->set
  (is (= (target/ash->set  nil)
         #{})
      "Should return empty set if ash is nil")

  (testing "Should return set with keyword"
    (is (= (target/ash->set [:foo])
           #{:foo}))

    (is (= (target/ash->set ["foo"])
           #{:foo})))


  (testing "Should return set with keyword, keeping dashes in tact"
    (is (= (target/ash->set [:foo-bar])
           #{:foo-bar}))

    (is (= (target/ash->set ["foo-bar"])
           #{:foo-bar})))

  (is (thrown-with-msg?
       IllegalArgumentException
       #"\*\*\[Soda-ash\] `foo bar` cannot contain whitespace\*\*"
       (target/ash->set ["foo bar"])))

  (is (= (target/ash->set [:foo :bar :baz])
         (sorted-set :foo :bar :baz))
      "Should return set with all keywords")
  )


(deftest ash-set->intersection
  (is (thrown-with-msg?
       IllegalArgumentException
       #"\*\*\[Soda ash\] When using `button`, the `size` group can only use one of these --> :medium, :small\*\*"
       (target/ash-set->intersection {:ui-name      "button"
                                      :group-name   "size"
                                      :group-vector [:small :medium :large]
                                      :only-one?    true}
                                     #{:small :medium})))


  (is (= (target/ash-set->intersection {:ui-name      "button"
                                        :group-name   "size"
                                        :group-vector [:small :medium :large]
                                        :only-one?    true}
                                       #{:small})
         #{:small}))

  (is (= (target/ash-set->intersection {:ui-name      "button"
                                        :group-name   "size"
                                        :group-vector [:small :medium :large]
                                        :only-one?    true}
                                       #{:small :foobar})
         #{:small}))

  (is (= (target/ash-set->intersection {:ui-name      "button"
                                        :group-name   "size"
                                        :group-vector [:small :medium :large]
                                        :only-one?    true}
                                       #{})
         #{}))
  )



(deftest ash->intersections
  (is (= (target/ash->intersections
          [{:ui-name      "button"
            :group-name   "size"
            :group-vector [:small :medium :large]
            :only-one?    true}]

          nil)

         []))


  (is (= (target/ash->intersections
          [{:ui-name      "button"
            :group-name   "size"
            :group-vector [:small :medium :large]
            :only-one?    true}]

          [])

         []))


  (is (= (target/ash->intersections
          [{:ui-name      "button"
            :group-name   "size"
            :group-vector [:small :medium :large]
            :only-one?    true}]

          [:foo])

         []))


  (is (= (target/ash->intersections
          [{:ui-name      "button"
            :group-name   "size"
            :group-vector [:small :medium :large]
            :only-one?    true}

           {:ui-name      "button"
            :group-name   "color"
            :group-vector [:red :blue :green]
            :only-one?    true}]

          [:small :red])

         [#{:small} #{:red}]))


  (is (thrown-with-msg?
       IllegalArgumentException
       #"\[Soda ash\] When using `button`, the `size` group can only use one of these --> :medium, :small"
       (target/ash->intersections
        [{:ui-name      "button"
          :group-name   "size"
          :group-vector [:small :medium :large]
          :only-one?    true}]
        [:small :medium])))
  )


(deftest intersections->class
  (is (= (target/intersections->class [#{:small} #{:red}])
         "red small")))



(deftest ash->class

  (is (nil? (target/ash->class
             [{:ui-name      "button"
               :group-name   "size"
               :group-vector [:small :medium :large]
               :only-one?    true}]

             []))
      "Should return nil if no class")


  (is (nil? (target/ash->class
             [{:ui-name      "button"
               :group-name   "size"
               :group-vector [:small :medium :large]
               :only-one?    true}]

             [:foo]))
      ;; TODO: Maybe should throw warning if this happens
      "Should return nil if ash doesn't match with anything")


  (is (= (target/ash->class
          [{:ui-name      "button"
            :group-name   "size"
            :group-vector [:small :medium :large]
            :only-one?    true}

           {:ui-name      "button"
            :group-name   "color"
            :group-vector [:red :blue :green]
            :only-one?    true}]

          [:small :red])

         "red small"))

  )
