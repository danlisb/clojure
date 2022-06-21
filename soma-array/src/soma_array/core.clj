(ns soma-array.core)

(defn simple-array-sum
  [ar]
  (reduce + ar))

(simple-array-sum [1 2 3])