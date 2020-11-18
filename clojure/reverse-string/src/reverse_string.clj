(ns reverse-string)

(defn reverse' [s]
  (into '() s))

(defn reverse-string [s]
  (reduce str "" (reverse' s)))

(comment
  (butlast "hello")
  (reverse' "hello")
  (rseq (vec "hello"))
  (reverse "hello")
  (reverse-string "hello")
  (reverse-string "I")
  (into '() "hello")
  )
