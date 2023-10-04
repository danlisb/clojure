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

(nomes-disciplinas-restantes (disciplinas) 2)

; Rascunhos
; {:nome "Estrutura de Dados", :semestre 2} -> "Estrutura de Dados"
(:nome {:nome "Estrutura de Dados", :semestre 2})

(map :nome [{:nome "Estrutura de Dados" :semestre 2} {:nome "Inteligência Artificial" :semestre 3}])
; "Estrutura de Dados" -> "ESTRUTURA DE DADOS"
(clojure.string/upper-case "Estrutura de Dados")

(map clojure.string/upper-case ["Estrutura de Dados", "Inteligência Artificial"])

(clojure.string/join ", " ["ESTRUTURA DE DADOS" "INTELIGÊNCIA ARTIFICIAL"])