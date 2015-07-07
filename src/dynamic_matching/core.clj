(ns dynamic-matching.core
  (:require [clojure.core.match :refer [match]]
            [clojure.edn :as edn]))

(defmacro with-match [data]
  `(fn [x# y#]
     (match [x# y#]
       ~@(for [d data]
           `~d))))

#_(let [data (edn/read-string (slurp "matching_config.edn"))]
  (macroexpand-1 '(with-match [[true true] 1 [true false] 2])))

#_(let [data (edn/read-string (slurp "matching_config.edn"))]
  ((with-match data) true true))
