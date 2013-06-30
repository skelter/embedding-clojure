(ns org.austinclojuremeetup.clojureimpl.clojservice
  (:gen-class :implements [org.austinclojuremeetup.trad.api.TradService]))

(defn -convert [objects]
  (map #(str "<#" (type %) " " % ">" ) objects))
