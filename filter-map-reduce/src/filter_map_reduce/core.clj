(ns filter-map-reduce.core)

;;Imagine que tenhamos um vetor de números onde cada número representa o
;; ano que a estudante está.
;; Exemplo: [5 6 6] ; Temos 1 estudante no quinto ano e 2 no sexto.

;; DESAFIO 1: crie uma função que recebe este vetor como entrada e retorna a
;; quantidade de estudantes que estão no quinto ano.

;; [5 5 6 7 8 6 5 5] -> [5 5 5 5] -> 4

;; modo 1
(defn esta-no-quinto-ano?
  [ano]
  (= ano 5)) ;; caso o ano seja igual a 5, retorna true

(defn quantidade-estudantes-no-quinto-ano
  [estudantes]
  (count (filter esta-no-quinto-ano? estudantes)))

;; modo 2
(defn quantidade-estudantes-no-quinto-ano-dois
  [estudantes]
  (count (filter #(= 5 %) estudantes)))

;; modo 3
(defn quantidade-estudantes-no-quinto-ano-tres
  [estudantes]
  (count (filter (fn [ano] (= 5 ano)) estudantes)))

(quantidade-estudantes-no-quinto-ano [5 6 7 5])
(quantidade-estudantes-no-quinto-ano-dois [5 6 7 5 5])
(quantidade-estudantes-no-quinto-ano-tres [5])

;; DESAFIO 2: crie uma função que recebe um vetor de idades e retorna a soma
;; Ex: (soma-das-idades [5 10 5]) ; deve retornar 20

;;[5 10 5] -> [5+10+5] -> [20]

(defn soma-das-idades
  [idades]
  (reduce + idades))

(soma-das-idades [5 10 5])

;; DESAFIO 3: crie uma função que recebe um vetor de nomes e retorne o
;; tamanho médio dos nomes
;; Ex: (tamanho-medio-dos-nomes ["Marcio" "João"]) ; deve retornar 5

;; ["Marcio" "João"] -> (6 4) -> 10 -> 5

(defn tamanho-medio-dos-nomes
  [nomes]
  (/ (reduce + (map count nomes)) (count nomes)))

(tamanho-medio-dos-nomes ["Marcio" "João"])

;; DESAFIO final: Crie uma função que recebe um vetor de nomes e retorne o
;; tamanho médio dos nomes, mas deve-se ignorar nomes com 3 ou menos caracteres.

;; ["Daniel" "Rafael"] -> (6 6) -> 12 -> 6
;; ["Ana" "Pedro"] -> (3 5) -> 5 -> 5/2