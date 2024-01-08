(ns estoque.aula6)

(def precos [30, 700, 1000, 370])

(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "retorna o valor com desconto de 10% se o valor bruto for maior que"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println precos)
(println "map" (map valor-descontado precos))
(println (range 10))
(println (filter even? (range 10)))
(println (filter odd? (range 10)))

(def numbers (filter even? (map valor-descontado precos)))
(println numbers)

(println "vetor" precos)
(println "filter" (filter aplica-desconto? precos))
(println "map apos o filter" (map valor-descontado (filter aplica-desconto? precos)))

(println (reduce + precos))

(defn minha-soma
  [valor-1 valor-2]
  (println "somando" valor-1 valor-2)
  (+ valor-1 valor-2))

(println (reduce minha-soma precos))
(println (reduce minha-soma (range 10)))
(println (reduce minha-soma [15]))

(println (reduce minha-soma 0 precos))
(println (reduce minha-soma 0 (range 10)))



