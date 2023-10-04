(ns disciplinas.core)

(defn transforma
  [pessoa]
  (update (assoc pessoa :cor-cabelo :cinza) :idade inc))

(transforma {:nome "Socrates" :idade 39})

; refazendo a função anterior com threading first
(defn transforma*
  [pessoa]
  (-> pessoa
      (assoc :cor-cabelo :cinza)
      (update :idade inc)))

(transforma* {:nome "Socrates" :idade 39})
