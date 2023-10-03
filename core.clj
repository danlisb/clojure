(ns hello-world.core)

{}                                                          ; mapa vazio

; : indica keyword (utilizar sempre um por padrão e o mapa precisa ter um par de valores)

{:nome "Daniel"
 :sobrenome "Lisboa"
 :idade 12}

; carrinho de compras
(defn compras
  []
{:tomate {:quantidade 2 :preco 5} ; mapa de mapa
 :arroz {:quantidade 1 :preco 4}
 :feijao {:quantidade 2 :preco 10}})

(compras)

; como recuperar as informações?
(get (compras) :tomate) ; modo 1 usando get
((compras) :tomate) ; modo 2 usando mapa (tomar cuidado com retorno null)
(:tomate (compras)) ; modo 3 usando keyword (mais recomendado)

(:preco (:tomate (compras)))
(:quantidade (:tomate (compras)))
(:salada (compras) {:quantidade 0, :preco 0}) ; se não encontrar, retorna 0