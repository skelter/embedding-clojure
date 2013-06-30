(ns foons)

(defn foofunc "Return a sequence of the args wrapped by angle brackets" 
  [& args]
  (map #(str "<" % "/>") args)) ;; heh..map returns a lazy seq
 