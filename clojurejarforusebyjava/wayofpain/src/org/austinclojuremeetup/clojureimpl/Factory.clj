(ns org.austinclojuremeetup.clojureimpl.Factory
  (:use [org.austinclojuremeetup.clojureimpl.clojservice])
  ;; TradService is the Java service API interface
  ;; tell gen-class we want createService to be static and describe its signature
  (:gen-class :methods [#^{:static true} [createService  [] org.austinclojuremeetup.trad.api.TradService]])) 

;;Mainly we are just demoing how to create a static method here.
;;The ugliness of creating a new class usually isn't practical.

(defn -createService []
  (org.austinclojuremeetup.clojureimpl.clojservice.))


