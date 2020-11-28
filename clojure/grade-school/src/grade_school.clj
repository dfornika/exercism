(ns grade-school)

(defn grade [school grade]
  (if (school grade)
    (school grade)
    []))

(defn add [school name grade]
  (update-in school [grade] (comp vec conj) name))

(defn sorted [school]
  (into (sorted-map) (for [[grade names] school] [grade (sort names)])))


(comment
  (def school {2 ["Aimee"]})
  (update-in school [2] (comp vec conj) "Aimee")
  (add school "Aimee " 2)
  (grade school 2)
  ()
  )
