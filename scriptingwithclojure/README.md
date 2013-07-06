Clojure and JSR-223
=======================

This example demonstrates how to use Clojure as a scripting language
in the Java scripting language mechanism (JSR 223). 
We'll use the clojure-jsr223 jar to register Clojure as a language.
Our client code will then demonstrate running a .clj script file
through the framework, associating the clj extension with Clojure.

The utility of scripting depends on binding useful variables to the engine.
This makes your apps objects readily available to user-written scripts.
In our example, we bind `namesList` and use it in two different scripts.

Most JDK's ship with a javascript language. 
We've included some clojure and javascript script files.

See `App.java`,`run` and the `example.*` scripts.

1. mvn package
2. ./run example.js
3. ./run example.clj


References and Links
----------------------

* Use the clojure-jsr223 jar and your favorite clojure jar
   * https://code.google.com/p/clojure-jsr223/issues/detail?id=1

JSR 223 background article
* http://www.oracle.com/technetwork/articles/javase/scripting-140262.html


