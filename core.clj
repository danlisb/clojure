(ns disciplinas.core
  (:require [clojure.string :refer [upper-case join]]))

; Desafio: precisamos criar uma função que dada um vetor de disciplinas e discentes, deve:
; - Filtrar a lista para exibir disciplinas restantes (que sejam do semestre atual ou superior)
; - Transformar nome da disciplina para maiúsculo e descartar demais informações
; - Criar uma String concatenando o nome de todas as disciplinas filtradas
; Exemplo de entrada:
; [{:nome "Estrutura de Dados" :semestre 2}
; {:nome "Algoritmos" :semestre 1}
; {:nome "Inteligência Artificial" :semestre 3}] 2
; Saída esperada: "ESTRUTURA DE DADOS, INTELIGÊNCIA ARTIFICIAL"

(defn disciplinas
  []
  [{:nome "Estrutura de Dados" :semestre 2}
   {:nome "Algoritmos" :semestre 1}
   {:nome "Inteligência Artificial" :semestre 3}])

(disciplinas)

(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (join ", "(map upper-case (map :nome (filter #(>= (:semestre %) semestre-atual) disciplinas)))))

; reescrevendo a função anterior com threading last
(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (->> disciplinas
       (filter #(>= (:semestre %) semestre-atual))
       (map :nome)
       (map upper-case)
       (join ", ")))

(nomes-disciplinas-restantes (disciplinas) 2)
