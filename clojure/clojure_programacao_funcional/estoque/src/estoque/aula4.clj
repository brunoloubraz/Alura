(ns estoque.aula4)

(defn mais-caro-que-100?
  [valor-bruto]
  (println "deixando claro invocacao de mais-caro-que-100?")
  (> valor-bruto 100))

(defn valor-descontado
  "retorna o valor com desconto de 10% se o valor bruto for maior que"
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println "Função como parâmetro")
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))

(defn mais-caro-que-100? [valor-bruto] (> valor-bruto 100))

(println "Função sem nome, anônima")
(fn [valor-bruto] (> valor-bruto 100))

(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))

(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 100))
(println (valor-descontado (fn [v] (> v 100)) 1000))
(println (valor-descontado (fn [v] (> v 100)) 100))
(println (valor-descontado #(> %1 100) 1000))
(println (valor-descontado #(> %1 100) 100))
(println (valor-descontado #(> % 100) 1000))
(println (valor-descontado #(> % 100) 100))

(def mais-caro-que-100? (fn [valor-bruto] (> valor-bruto 100)))
(def mais-caro-que-100? #(> % 100))
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))

(def numeros (range 1 6)) ; cria uma sequência de números de 1 a 5
(defn dobrar [x] (* x 2)) ; define uma função que dobra um número
(def numeros_dobrados (map dobrar numeros))
(println numeros_dobrados)

(println (type numeros_dobrados))