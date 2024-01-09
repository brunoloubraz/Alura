(ns estoque.codewars1)
; https://www.codewars.com/kata/5601409514fc93442500010b/train/clojure
(defn better_than_average [class_points your_points]
  (> your_points (/ (reduce + class_points) (count class_points))))

(println (better_than_average [100 100] 75))
