(ns estoque.codewars2)
(defn even-or-odd [number]
  (if (zero? (mod number 2))
    "Even"
    "Odd"))

(println (even-or-odd 20))