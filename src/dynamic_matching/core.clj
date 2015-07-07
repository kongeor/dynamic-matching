(ns dynamic-matching.core
  (:require [clojure.core.match :refer [match]]))

(defmacro with-match []
  `(fn [x# y#]
     (match [x# y#]
       [true true ] 1
       [true false] 2
       [~'_    ~'_    ] 3)))

(macroexpand-1 '(with-match))

((with-match) true true)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
