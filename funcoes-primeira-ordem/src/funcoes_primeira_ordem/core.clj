(ns funcoes-primeira-ordem.core)

;; modo 1
(defn imposto-retido
  "O salário abaixo de 1000 reais não tem imposto, acima ou igual a 1000 deve aplicar imposto padrão."
  [salario]
  (let [imposto-padrao 0.2]
    (if (< salario 1000)
      0
      (* salario imposto-padrao))))

(defn consulta-taxa-padrao-por-http
  "Imagine que este código faz uma requisição http para obter a taxa-padrao"
  []
  0.20)

;; modo 2
(defn imposto-retido
  "O salário abaixo de 1000 reais não tem imposto, acima ou igual a 1000 deve aplicar imposto padrão."
  [salario]
  (if (< salario 1000)
    0
    (* salario (consulta-taxa-padrao-por-http))))

;; modo 3
(defn imposto-retido
  "O salário abaixo de 1000 reais não tem imposto, acima ou igual a 1000 deve aplicar imposto padrão."
  [taxa-padrao salario]
  (if (< salario 1000)
    0
    (* salario taxa-padrao)))

(imposto-retido (consulta-taxa-padrao-por-http) 10)

;; modo 4
(defn imposto-retido
  "O salário abaixo de 1000 reais não tem imposto, acima ou igual a 1000 deve aplicar imposto padrão."
  [consulta-taxa-padrao salario]
  (if (< salario 1000)
    0
    (* salario (consulta-taxa-padrao))))

(defn consulta-taxa-padrao-fixa
  []
  0.10)

(imposto-retido consulta-taxa-padrao-fixa 5000)
(imposto-retido consulta-taxa-padrao-por-http 5000)

(defn escolhe-consulta-taxa-padrao
  [ambiente]
  (if (= ambiente :teste)
    consulta-taxa-padrao-fixa
    consulta-taxa-padrao-por-http))

(imposto-retido (escolhe-consulta-taxa-padrao :teste) 1000)
(imposto-retido (escolhe-consulta-taxa-padrao :producao) 1000)

;; funções anônimas
((fn [x] (* 2 x)) 2)
(#(* 2 %) 5)
(#(+ % %) 2)
((fn [x y] (+ x y)) 6 7)
(#(+ %1 %2) 8 9)
#(+ %1 %2)

((constantly 0.2) 1 2 3 4 5 22424 4242 1000000)

(imposto-retido (constantly 0.27) 3000)