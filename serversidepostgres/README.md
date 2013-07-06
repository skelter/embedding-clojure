Embedding Clojure in PostgreSQL
===============================

Work In Progress
----------------

This example isn't quite working yet, but it's close :).

```sql
clojuredb=# CREATE FUNCTION hello(varchar) RETURNS varchar AS 'ssclojure.PrettyCool.hellos' LANGUAGE javaU;
CREATE FUNCTION
clojuredb=# select hello('whoop');
ERROR:  java.lang.ExceptionInInitializerError
clojuredb=# select hello('whoop');
ERROR:  java.lang.NoClassDefFoundError: clojure.lang.RT
clojuredb=#
```

This example needs a PostgreSQL server with PLJava that we can upload
jars to.  This can be done with PostgreSQL server on your dev machine, 
or it is easy enough to spin up a cloud server or a Vagrant server. 
See [machines](./machines) for some help on setting up a disposable 
PostgreSQL server.




Links
-----

* Slides giving general roadmap 
  http://www.slideshare.net/petereisentraut/postgresql-and-pljava
* SQLJ/PLJAVA Tutorial
  http://www.adempiere.com/SQLJ_/_PLJAVA_Tutorial 
* Installing PL/java by Bear Giles
  http://www.javacodegeeks.com/2012/10/introduction-to-postgresql-pljava.html
* puppetlabs postgresql 
  https://github.com/puppetlabs/puppetlabs-postgresql
