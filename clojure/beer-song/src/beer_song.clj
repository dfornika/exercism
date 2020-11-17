(ns beer-song)

(defn verse
  "Returns the nth verse of the song."
  [num]
  (cond (= 0 num)
        (str "No more bottles of beer on the wall, no more bottles of beer.\n"
             "Go to the store and buy some more, 99 bottles of beer on the wall.\n")
        (= 1 num)
        (str num " bottle of beer on the wall, " num " bottle of beer.\n"
             "Take it down and pass it around, no more bottles of beer on the wall.\n")
        (= 2 num)
        (str num " bottles of beer on the wall, " num " bottles of beer.\n"
             "Take one down and pass it around, " (dec num) " bottle of beer on the wall.\n")
        :else
        (str num " bottles of beer on the wall, " num " bottles of beer.\n"
             "Take one down and pass it around, " (dec num) " bottles of beer on the wall.\n")))

(defn sing
    "Given a start and an optional end, returns all verses in this interval. If
  end is not given, the whole song from start is sung."
  ([start]
   (sing start 0))
  ([start end]
   (loop [song ""
          num-bottles start]
     (if (<= num-bottles end)
       (str song (verse end))
       (recur (str song (verse num-bottles) "\n") (dec num-bottles))))))

(comment
  (verse 5)
  (verse 0)
  (sing 1)
  (sing 0)
  (sing 3 0)
  (sing 3 1)
  )
