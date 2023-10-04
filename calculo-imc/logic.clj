(ns calculo-imc.logic)

; dado um peso e altura de uma pessoa, retorne seu imc (índice de massa corporal)
; imc = (peso / (altura^2))
; abaixo de 18,5: peso baixo
; entre 18,5 e 24,9: peso ideal
; entre 24,9: acima do peso ideal

(defn valor-imc [peso altura]
  (/ peso (* altura altura)))

(defn indicador-imc [peso altura]
  (let [resultado-calculo-imc (valor-imc peso altura)]
    (if (< resultado-calculo-imc 18.5)
      :peso-baixo
      (if (< resultado-calculo-imc 24.9)
        :peso-ideal
        :peso-acima))))

(indicador-imc 10 1.20) ; peso-baixo
(indicador-imc 70 1.70) ; peso-ideal
(indicador-imc 100 1.50) ; peso-acima
