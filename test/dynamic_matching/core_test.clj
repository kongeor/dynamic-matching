(ns dynamic-matching.core-test
  (:require [clojure.test :refer :all]
            [clojure.edn :as edn]
            [dynamic-matching.core :refer :all]))

(deftest with-match-test
  (let [;data (edn/read-string (slurp "matching_config.edn"))
        ]
    (testing "with-match"
      (is (= 1
             ((with-match [[true true] 1 [true false] 2]) true true)))
      #_(is (= 2
             ((with-match data) true false)))
      #_(is (= 3
             ((with-match data) false true))))))
