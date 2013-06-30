(ns org.austinclojuremeetup.clojureimpl.clojservice
  (:gen-class :implements [org.austinclojuremeetup.trad.api.TradService]))

(defn -convert [this objects]
  (println "this is a " (type this) " " this)
  (map #(str "<#" (type %) " " % ">" ) objects))
