(ns estoque.codewars3)
;https://www.codewars.com/kata/5715eaedb436cf5606000381/train/clojure

(defn positive-sum [xs]
  (reduce + (filter #(> % 0) xs)))

(println (positive-sum [1 2 3 4 5]))

(def sum-of-squares #(+ (* %1 %1) (* %2 %2)))

(println (sum-of-squares 3 4)) ; Imprime 25
