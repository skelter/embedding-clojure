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

Why JSR-223 Scripting?
----------------------

If you just want to run Clojure files at run time, there are much easier
ways to do it than using `ScriptEngineManager`.  The advantage of writing to
the script engine framework of JSR-223 is that you can support multiple
scripting languages: javascript, groovy, bean shell, clojure, ruby, AppleScript.
Your end-users can script your app in a language they might already know!

Thank You!
----------
Special thanks to the [Philip Frank](https://github.com/pmf/clojure-jsr223) together.

References and Links
----------------------

* Use the clojure-jsr223 jar and your favorite clojure jar
   * https://code.google.com/p/clojure-jsr223/issues/detail?id=1

JSR 223 background article
* http://www.oracle.com/technetwork/articles/javase/scripting-140262.html


