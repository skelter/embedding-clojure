(ns example)

(println "hello, world")

(println user/namesList)

(apply println (map #(str "<" % "> ") user/namesList))
