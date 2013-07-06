Embedding a Clojure REPL
===========================

In this example we will embed a Clojure REPL in our green-screen Java app.

There seem to be two different approaches mentioned out there:

1. Host the REPL directly in the app.
2. Host the REPL over local socket connections.

We'll host it directly here, since we'll have stdout and stdin.  If we were in a GUI
we might need to take a look at using those socket connections.

Our REPL will not be as luxurious as lein's, but let's see what we can do.

Running the Example
--------------------

1. mvn package
2. run

