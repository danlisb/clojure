(ns calculo-imc.logic-test
  (:require [clojure.test :refer :all]
            [calculo-imc.logic :refer :all]))

(deftest valor-imc-teste
  (testing "Uma pessoa muito magra deve ter IMC baixo"
    (is (= :peso-baixo (indicador-imc 1 2))))
  (testing "Uma pessoa com peso ideal deve ter IMC ideal"
    (is (= :peso-ideal (indicador-imc 70 1.70))))
  (testing "Uma pessoa acima do peso ideal deve ter IMC alto"
    (is (= :peso-acima (indicador-imc 100 1.50)))))

