(ns self-test-code.core-test
  (:require [clojure.test :refer :all]
            [self-test-code.core :refer :all]))

(deftest taxa-de-entrega-test
  (testing "Dado um valor abaixo de 100 reais, então a taxa de entrega será de 15 reais"
    (is (= 15 (taxa-de-entrega 1)))
    (is (= 15 (taxa-de-entrega 100))))
  (testing "Dado um valor entre 100 e 200 reais, então a taxa de entrega será de 5 reais"
    (is (= 5 (taxa-de-entrega 100.01))))
    (is (= 5 (taxa-de-entrega 200)))
  (testing "Dado um valor acima de 200 reais, então a taxa de entrega será gratuita"
    (is (= 0 (taxa-de-entrega 200.01)))))

