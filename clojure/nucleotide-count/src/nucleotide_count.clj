(ns nucleotide-count)

(defn count-of-nucleotide-in-strand [nucleotide strand]
  (if (contains? #{\A \C \G \T} nucleotide)
    (reduce #(if (= %2 nucleotide) (inc %) %) 0 strand)
    (throw (Exception. "Illegal character for nucleotide."))))


(defn nucleotide-counts [strand]
  (let [num-a (count-of-nucleotide-in-strand \A strand)
        num-c (count-of-nucleotide-in-strand \C strand)
        num-g (count-of-nucleotide-in-strand \G strand)
        num-t (count-of-nucleotide-in-strand \T strand)]
    {\A num-a
     \C num-c
     \G num-g
     \T num-t}))

(comment
  (reduce #(if (= %2 \C) (inc %)) 0 "CCCCC")
  (count-of-nucleotide-in-strand \A "")
  (count-of-nucleotide-in-strand \X "GACT")
  (count-of-nucleotide-in-strand \C "CCCC")
  (count-of-nucleotide-in-strand \A "CTAGCGATGCTACTGCTAG")
  (nucleotide-counts "ACACACA")
  (map identity "CTGATGCATA")
  )
