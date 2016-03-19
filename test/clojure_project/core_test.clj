(ns clojure-project.core-test
  (:require [clojure.test :refer :all]
            [clojure-project.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest b-test
  (testing "foo function."
    (foo tom)))
