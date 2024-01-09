(ns estoque.codewars4)

(defn remove-bang [s]
  (doseq [c s]
    (when (not= c \!)
      c)))

(println (remove-bang "H!i!!!!"))