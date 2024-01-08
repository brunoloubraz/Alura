(defn valor-descontado
  "retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [taxa-de-desconto (/ 10 100)
        desconto         (* valor-bruto taxa-de-desconto)]
    (println "Calculanddo desconto de" desconto)
    (- valor-bruto desconto)))

(valor-descontado 100)

(> 500 100)
(< 500 100)

(if (> 500 100)
  (println "Maior")
  (println "menor ou igual"))

(if (> 50 100)
  (println "Maior")
  (println "menor ou igual"))

(defn valor-descontado
  "retorna o valor com desconto de 10% se o valor bruto for maior que"
  [valor-bruto]
  (if (> valor-bruto 100)
      (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (println "Calculanddo desconto de" desconto)
      (- valor-bruto desconto))
    valor-bruto))

(valor-descontado 1000)