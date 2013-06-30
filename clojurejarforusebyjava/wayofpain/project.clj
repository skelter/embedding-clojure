(defproject org.austinclojuremeetup.api/clojureimpl "0.1.0-SNAPSHOT"
  :description "Demo Clojure implementation of Java idioms"
  :url "http://github.com/skelter/embedding-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.austinclojuremeetup/traditionalapi "1.0-SNAPSHOT"]]
  :aot [wayofpain.core])
