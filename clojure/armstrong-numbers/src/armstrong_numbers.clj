(ns armstrong-numbers)

;; adapted from: https://stackoverflow.com/a/29930186
(defn digits [num]
  (loop [result '()
         num num]
    (if (pos? num)
      (recur (conj result (rem num 10))
             (quot num 10))
      result)))

(defn armstrong? [num]
  (let [num-digits (count (str num))
        digits (digits num)
        digits-raised (map #(.pow (biginteger %) num-digits) digits)
        sum-of-powers (reduce + digits-raised)]
    (= num sum-of-powers)))

(comment
  (digits 153)
  (count (str 153))
  (sum-of-exponents 3 1 5)
  (Math/pow 5 3)
  (map #(.pow (biginteger %) (count (str 21897142587612075))) (digits 21897142587612075))
  (armstrong? 153)
  (armstrong? 21897142587612075)
  )
