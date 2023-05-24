(ns blackjack.game)

(defn new-card []
  "Gerando cartas com números entre 1 à 13"
  (inc (rand-int 13)))