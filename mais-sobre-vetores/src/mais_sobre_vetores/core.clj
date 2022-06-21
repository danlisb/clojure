(ns mais-sobre-vetores.core)

(conj ["Batata" "Arroz" "Feijão"] "Bife");Retorna um vetor
(pop ["Batata" "Arroz" "Feijão" "Bife"]);Retorna um vetor
(conj [] "Banana");Retorna um vetor
(conj nil "Banana");Retorna uma lista
(conj (conj nil "Bife") "Arroz");Retorna uma lista
(conj [1 2 3] nil);Retorna um vetor
(pop nil);Retorna nil
(get [] 0)


(defn desistir-ultima-compra
  [compras]
  (pop compras))

(desistir-ultima-compra ["Batata" "Arroz" "Feijão"])


(defn imprime-primeiro-nome
  [nomes]
  (get nomes 0 "Desconhecido"));se não achar o primeiro termo, retorna "Desconhecido"

(imprime-primeiro-nome ["Daniel" "Rafael" "Maria" "Pedro"])


(defn imprime-segundo-nome
  [nomes]
  (get nomes 1 "Desconhecido"));se não achar o segundo termo, retorna "Desconhecido"

(imprime-segundo-nome ["Marcio"])


(defn imprime-terceiro-nome
  [nomes]
  (get nomes 2 "Desconhecido"));se não achar o terceiro termo, retorna "Desconhecido"

(imprime-terceiro-nome ["Marcio" "Gustavo" "Isabela" "Larissa"])


(defn substituir-primeiro-nome
  [nomes novo-primeiro-nome]
  (assoc nomes 0 novo-primeiro-nome));troca o primeiro termo[0] do "nomes" de lugar com o termo "novo-primeiro-nome"

(substituir-primeiro-nome ["Daniel" "Rafael" "José" "Rick"] "Maria")