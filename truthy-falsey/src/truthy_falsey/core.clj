(ns truthy-falsey.core)

;(and "Daniel" 20); retornará 20
;(and nil 20); retornará nil
;(and "Daniel" nil); retornará nil

(defn parametros-preenchidos
  [nome idade]
  (if (and nome idade)
    (println "Estão preenchidos")
    (println "Não estão preenchidos")))

(parametros-preenchidos "Daniel" 20)
