Writing a Jar for Use by Java
==============================
Also known as 'the hard way'.

In this example, we will use Clojure to fulfill an API 
specified by a Java interface.  This is not the best case
of where Clojure will shine as we are going to conform to Java's 
API traditions.

We will use the gen-class attributes of a namespace to direct 
the Clojure compiler to generate a Java class for the name space,
and give it directions on some methods.  We will also tell Leiningen
to do some ahead-of-time compiling.


