(ns collatz-conjecture)

(defn next-num [num]
  (if (even? num)
    (/ num 2)
    (inc (* 3 num ))))

(defn collatz [num]
  (if (not (pos-int? num))
    (throw (Exception. "Input must be positive integer"))
    (loop [counter 0
           num num]
      (if (= num 1)
        counter
        (recur (inc counter) (next-num num))))))

(comment
  (next-num 1)
  (next-num 2)
  (next-num 3)
  (collatz 0)
  (collatz 1)
  (collatz 12)
  (collatz 16)
  (collatz 1000000)
  )
