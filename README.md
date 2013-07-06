Embedding Clojure In Your App
=============================

Sometime in the Fall of 2012 or Spring 2013 I volunteered to do a presentation on Embedding Clojure.
Embedding Clojure in what?
"Well all kinds of things...let's see what we can do."
It looks like we'll be doing this on July 8, 2013 at the Austin Clojure Meetup,
so I better get the examples ready to go.

Contents
------------
* [Calling Clojure as suggested](./javaclojureeasy)
* [Using Clojure to make a library jar for use in Java](./clojurejarforusebyjava) the hard way
* [Clojure as a JSR-223 scripting language](./scriptingwithclojure)
* [Scala calling Clojure](./scalaclojure)
* [Embedding a Clojure REPL](./repl)


Proposed Examples
-----------------
* Clojure-Powered annotations
* Clojure streamed down the wire
* Clojure in a PostgreSQL database ([WIP](./serversidepostgres))
* Clojure on a raspberryPi
* Clojure compiled down to LLVM on a device

Contributors
--------------
* [Steve Suehs](http://github.com/skelter)

Additionally, the information here is compiled from the sweat and tears of
others who posted to the internet for our collective benefit.

Links & References
-------------------
* The hard way, my first try based on Java preconceptions.
  Works in OSGi environment.  
  http://java.dzone.com/articles/java-clojure-interop-calling

* This is the way the clojure team (Stu,...) suggest.
  * http://java.dzone.com/articles/java-clojure-interop
  * http://en.wikibooks.org/wiki/Clojure_Programming/Tutorials_and_Tips#Invoking_Clojure_from_Java
  
* Java validation annotation, but the validations are in clojure.
  http://skife.org/2009/07/05/embedding_clojure.html

* Calling Clojure from Scala
  http://stackoverflow.com/questions/2181774/calling-clojure-from-java
  

