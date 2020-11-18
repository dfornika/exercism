(ns hamming)

(defn distance [strand1 strand2]
  "Count the number of differences between strand1 and strand2.
   Returns nil if lengths of strand1 and strand2 are not equal."
  (if (= (count strand1) (count strand2))
    (count (filter false? (map = strand1 strand2)))
    nil))

(comment
  (distance "" "")
  (filter false? (map #(apply = %) (map vector "ACCAGGG" "ACTAGCG")))
  (map * [1 2 3] [4 5 6])
  (map = "ACCAGGG" "ACTATGG")
  (distance "ACCAGGG" "ACTATGG")
  )
