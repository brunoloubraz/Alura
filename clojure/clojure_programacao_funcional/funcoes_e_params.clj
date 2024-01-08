(ns estoque.aula)

(defn imprime-mensagem []
  (println "---------------------")
  (println "Bem vindo ao estoque!"))

(imprime-mensagem)

(defn aplica-desconto [valor-bruto]
  "retorna o valor descontado que é 90% do valor bruto"
  (* valor-bruto 0.9))

(aplica-desconto 100)

(defn valor-descontado
  "retorna o valor com desconto de 10%"
  [valor-bruto]
  (* valor-bruto (- 1 0.10)))

(valor-descontado 10)


(defn valor-descontado
  "retorna o valor com desconto de 10%"
  [valor-bruto]
  (def desconto 0.10)
  (* valor-bruto (- 1 desconto)))

(defn valor-descontado
  "retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [desconto 0.10]
    (println "Calculando desconto de " desconto)
    (* valor-bruto (- 1 desconto))))

(valor-descontado 10)


(defn valor-descontado
  "retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [desconto (/ 10 100)]
    (println "Calculando desconto de " desconto)
    (* valor-bruto (- 1 desconto))))

(valor-descontado 10)