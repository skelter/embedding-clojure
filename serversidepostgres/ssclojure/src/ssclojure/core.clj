(ns ssclojure.core)

(defn withTags
  "Returns tags wrapped collection"
  [coll]
  (doall (map #(str "<" (type %) ">" (str %) "</>") coll)))

(defn hello ^String [x]
  (str "Hello, " x))

