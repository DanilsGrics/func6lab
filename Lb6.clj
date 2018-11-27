;#38
;fn - function, [& ...] - all parameters,
;reduce - takes two args and performs function for all arguments (%) here (returns biggest because of if),
;#(...) - inline function, first - first item, rest - rest, but first
(fn maxValue [& parameters]
  (reduce #(if (> % %2) % %2) (first parameters) (rest parameters)))

;#27
;= - looks if 1arg == 2arg, seq - simply returns collection, reverse - returns reversed collection
(fn [word] (= (seq word) (reverse word)))

