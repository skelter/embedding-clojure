Embedding a Clojure REPL
===========================

In this example we will embed a Clojure REPL in our green-screen Java app.

There seem to be two different approaches mentioned out there:

1. Host the REPL directly in the app.
2. Host the REPL over local socket connections.

We'll host it directly here, since we'll have stdout and stdin.  If we were in a GUI
we might need to take a look at using those socket connections.

Our REPL will not be as luxurious as lein's, but let's see what we can do.
We'll bind a collection of strings to `namesList`.

Most of the functionality is provided by `clojure.main/main`.
`clojure.main/repl` is worth a read just to see its capabilities.



Running the Example
--------------------

1. mvn package
2. run

References and Links
--------------------

* clojure/main is where most of the action is
  * https://github.com/clojure/clojure/blob/master/src/clj/clojure/main.clj
  * http://clojure.github.io/clojure/clojure.main-api.html#clojure.main/repl
