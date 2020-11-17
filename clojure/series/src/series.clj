(ns series)

(defn slice [string length]
  (cond (> length (count string))
        nil
        (zero? length)
        ["" ""]
        :else
        (let [slice (reduce str "" (take length string))
              rest (reduce str "" (drop 1 string))]
          [slice rest])))

(defn slices [string length]
  (cond (> length (count string))
        []
        (zero? length)
        [""]
        :else
        (loop [coll []
               s string]
          (if (not (slice s length))
            coll
            (recur (conj coll (first (slice s length))) (second (slice s length)))))))

(comment
  (take 3 "123")
  (slices "123" 1000)
  (slices "123" 0)
  (slices "12345" 3)
  (slice "12345" 3)
  (slices "hello" 2)
  )
