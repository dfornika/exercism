(ns reverse-string)

(defn reverse' [s]
  (loop [reversed '()
         s s]
    (if (empty? s)
      reversed
      (recur (conj reversed (last s)) (butlast s)))))

(defn reverse-string [s]
  (reduce str "" (reverse' s)))

(comment
  (butlast "hello")
  (reverse' "hello")
  (rseq (vec "hello"))
  (reverse "hello")
  (reverse-string "hello")
  (reverse-string "I")
  )
