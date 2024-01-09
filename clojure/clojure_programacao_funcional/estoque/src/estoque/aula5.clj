(ns estoque.aula5)

(def precos [30, 700, 1000])

(println (precos 0))
(println (get precos 2))
(println (get precos 20))
;(println (precos 20))
(println "Valor padrão 0" (get precos 17 0))
(println "Valor padrão 0, mas existe" (get precos 2 0))

(println (conj precos 5))
(println precos)

(println (inc 5))
(println (update precos 0 inc))
(println (update precos 1 dec))
(println precos)

(defn soma-1
  [valor]
  (println "estou somando um em " valor)
  (+ valor 1))

(println (update precos 0 soma-1))

(defn soma-3
  [valor]
  (println "estou somando um em " valor)
  (+ valor 3))

(println (update precos 0 soma-3))