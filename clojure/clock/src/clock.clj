(ns clock)

(defn clock->string [clock]
  (let [{:keys [hours minutes]} clock
        hours-padded (format "%02d" hours)
        minutes-padded (format "%02d" minutes)]
    (str hours-padded ":" minutes-padded)))

(defn clock->minutes-past-midnight [clock]
  (let[{:keys [hours minutes]} clock]
    (+ (* hours 60) minutes)))

(defn minutes-past-midnight->clock [minutes-past-midnight]
  (let [hours-past-midnight (mod (quot (mod minutes-past-midnight 1440) 60) 24)
        minutes-past-the-hour (mod minutes-past-midnight 60)]
    {:hours hours-past-midnight
     :minutes minutes-past-the-hour}))

(defn clock [hours minutes]
  (let [minutes-past-midnight (+ (* hours 60) minutes)]
    (minutes-past-midnight->clock minutes-past-midnight)))

(defn add-time [input-clock minutes-to-add]
  (let [start-minutes-past-midnight (clock->minutes-past-midnight input-clock)
        new-minutes-past-midnight (+ start-minutes-past-midnight minutes-to-add)]
    (minutes-past-midnight->clock new-minutes-past-midnight)))

