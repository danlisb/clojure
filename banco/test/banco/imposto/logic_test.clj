(ns banco.imposto.logic-test
  (:require [clojure.test :refer :all]
            [banco.imposto.logic :refer [imposto-retido-fonte]]))

;; Solicitação do Cliente:
;; Valores abaixo de mil reais não tem imposto retido na fonte.
;; Acima disso pagam 10% de imposto.

(deftest imposto-retido-fonte-test
  (testing "Dado um valor abaixo de 1000 reais então não deve ter imposto retido."
    (is (= 0 (imposto-retido-fonte 1.00))))
    (is (= 0 (imposto-retido-fonte 999.99))))
  (testing "Dado um valor acima ou igual a 1000 reais, então deve ser pago 10% de imposto."
    (is (= 100.00 (imposto-retido-fonte 1000.00))))