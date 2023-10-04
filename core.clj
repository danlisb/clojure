(ns mais-sobre-mapas.core)

; operações de vetores
(conj [1 2 3] 4) ; [1 2 3 4]
(conj [1 2 3] "Daniel") ; [1 2 3 4 Daniel]
(conj [1 2 3] [4 5]) ; [1 2 3 [4 5]]
(pop [1 2 3]) ; [1 2]
(peek [1 2 3]) ; [3]

(defn compras
  []
  {:tomate {:quantidade 2 :preco 5} ; mapa de mapa
   :arroz {:quantidade 1 :preco 4}
   :feijao {:quantidade 2 :preco 10}})

; cria um novo map (imutável) e adiciona/substitui elementos, no conj é passado 2 maps e no assoc é passado 1 map e 1 key (chave-valor)
(conj (compras) {:alface {:quantidade 2 :preco 5}}) ; pop e peek não funcionam com map
(assoc (compras) :alface {:quantidade 2 :preco 8})

; remove elemento(s) do map
(dissoc (compras) :tomate :arroz)

; função update recebe um map, a chave que queremos atualizar e uma função, só funciona para um map
(update{:nome "Daniel Lisboa" :idade 21} :idade inc)
(inc 39) ; 40

; usamos a função update-in para atualizar map-map ou map-map-map...
(update-in(compras) [:tomate :preco] inc)
(update-in(compras) [:tomate :preco] * 2) ; 2 * preço do tomate
