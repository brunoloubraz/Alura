;; (defn valor-descontado1
;;   "retorna o valor com desconto de 10%"
;;   [valor-bruto]
;;   (def desconto 0.10)
;;   (* valor-bruto (- 1 desconto)))

;; (valor-descontado1 100)
;; desconto

(defn valor-descontado
  "retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [desconto 0.10]
    (println "Calculanddo desconto de" desconto)
    (* valor-bruto (- 1 desconto))))

(valor-descontado 100)