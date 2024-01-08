(def pedido {
             :mochila { :quantidade 2
                       :preco 80}
             :camiseta {
                        :quantidade 3
                        :preco 40}})

(println pedido)
(def pedido (assoc pedido :chaveiro { :quantidade 1
                          :preço 10}))
(println pedido)
(println (pedido :mochila))
(println (get pedido :mochila))
(println (get pedido :cadeira))
(println (get pedido :cadeira {} ))

(println (:cadeira pedido))
(println (:cadeira pedido {}))

(println (:quantidade (:mochila pedido)))

;Threading
(println (update-in pedido [:mochila, :quantidade] inc))
(println (-> pedido
             :mochila
             :quantidade))

(-> pedido
    :mochila
    :quantidade
    println)

