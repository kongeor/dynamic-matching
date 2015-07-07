(ns dynamic-matching.core-test
  (:require [clojure.test :refer :all]
            [dynamic-matching.core :refer :all]))

(deftest with-match-test
  (testing "with-match"
    (is (= 1
           ((with-match) true true)))
    (is (= 2
           ((with-match) true false)))
    (is (= 3
           ((with-match) false true)))))
