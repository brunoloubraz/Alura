(ns estoque.aula7)

(def estoque { "Mochila" 10,  "Camiseta" 5})
(println estoque)

(def estoque { "Mochila" 10,
              "Camiseta" 5,
              "Blusa" 25
              "Calça" 13})
(println estoque)

(println "Temos" (count estoque) "elementos")
(println "Chaves são:" (keys estoque))
(println "Valores são:" (vals estoque))

;keyword
; :mochila

(def estoque {:mochila 10
              :camiseta 5})

(println estoque)

(println (assoc estoque :cadeira 3))
(println "Original" estoque)
(println (assoc estoque :mochila 1))
(println "Original" estoque)
(println (update estoque :mochila inc))
(println (update estoque :mochila #(- % 3)))

(println (dissoc estoque :mochila))


