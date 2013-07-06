HINT:  No function matches the given name and argument types. You might need to add explicit type casts.
clojuredb=# select sqlj.install_jar('file:///vagrant/ssclojure-0.1.0-SNAPSHOT.jar','ssclojure',true);
 install_jar
-------------

(1 row)

clojuredb=# select sqlj.set_classpath('clojuredb','ssclojure');
ERROR:  java.sql.SQLException: No such schema: clojuredb
clojuredb=# \ds
No relations found.
clojuredb=# \dS
clojuredb=# \?
clojuredb=# \dn
  List of schemas
  Name  |  Owner
--------+----------
 public | postgres
 sqlj   | postgres
(2 rows)

clojuredb=# select sqlj.set_classpath('clojuredb','ssclojure');
ERROR:  java.sql.SQLException: No such schema: clojuredb
clojuredb=# \dd
         Object descriptions
 Schema | Name | Object | Description
--------+------+--------+-------------
(0 rows)

clojuredb=# \l
                               List of databases
     Name      |  Owner   | Encoding  | Collate | Ctype |   Access privileges
---------------+----------+-----------+---------+-------+-----------------------
 clojuredb     | postgres | UTF8      | C       | C     | =T/postgres          +
               |          |           |         |       | postgres=CTc/postgres+
               |          |           |         |       | clojuser=CTc/postgres
 postgres      | postgres | SQL_ASCII | C       | C     |
 template0     | postgres | SQL_ASCII | C       | C     | =c/postgres          +
               |          |           |         |       | postgres=CTc/postgres
 template1     | postgres | SQL_ASCII | C       | C     | =c/postgres          +
               |          |           |         |       | postgres=CTc/postgres
 template_java | postgres | SQL_ASCII | C       | C     |
(5 rows)

clojuredb=# select sqlj.set_classpath('clojuredb','ssclojure');
ERROR:  java.sql.SQLException: No such schema: clojuredb
clojuredb=# select sqlj.get_classpath('clojuredb');
 get_classpath
---------------

(1 row)

clojuredb=# select sqlj.get_classpath('clojuredxxb');
 get_classpath
---------------

(1 row)

clojuredb=# select sqlj.set_classpath('clojuredb','ssclojure');
ERROR:  java.sql.SQLException: No such schema: clojuredb
clojuredb=# select sqlj.set_classpath('public','ssclojure');
 set_classpath
---------------

(1 row)

clojuredb=# select sqlj.get_classpath('clojuredxxb');
 get_classpath
---------------

(1 row)

clojuredb=# select sqlj.get_classpath('public');
 get_classpath
---------------
 ssclojure
(1 row)

clojuredb=# CREATE FUNCTION mydb.hello(varchar) RETURNS varchar AS 'ssclojure.PrettyCool.hello' LANGUAGE java;
ERROR:  schema "mydb" does not exist
clojuredb=# CREATE FUNCTION hello(varchar) RETURNS varchar AS 'ssclojure.PrettyCool.hello' LANGUAGE java;
CREATE FUNCTION
clojuredb=# select hello('whoop');
ERROR:  Unable to find static method ssclojure.PrettyCool.hello with signature (Ljava/lang/String;)Ljava/lang/String;
clojuredb=# select sqlj.replace_jar('file:///vagrant/ssclojure-0.1.0-SNAPSHOT.jar','ssclojure',true);
 replace_jar
-------------

(1 row)

clojuredb=# select hello('whoop');
ERROR:  Unable to find static method ssclojure.PrettyCool.hello with signature (Ljava/lang/String;)Ljava/lang/String;
clojuredb=# CREATE FUNCTION hello(varchar) RETURNS varchar AS 'ssclojure.PrettyCool.hellos' LANGUAGE java;
ERROR:  function "hello" already exists with same argument types
clojuredb=# drop function hello(varchar);
DROP FUNCTION
clojuredb=# CREATE FUNCTION hello(varchar) RETURNS varchar AS 'ssclojure.PrettyCool.hellos' LANGUAGE java;
CREATE FUNCTION
clojuredb=# select hello('whoop');
ERROR:  java.lang.NoClassDefFoundError: clojure.lang.RT
clojuredb=# select sqlj.install_jar('file:///vagrant/clojure-1.5.1.jar','clojure',true);
 install_jar
-------------

(1 row)

clojuredb=# select sqlj.set_classpath('public','ssclojure:clojure');
 set_classpath
---------------

(1 row)

clojuredb=# select sqlj.get_classpath('public');
   get_classpath
-------------------
 ssclojure:clojure
(1 row)

clojuredb=# select hello('whoop');
ERROR:  java.lang.ExceptionInInitializerError
clojuredb=# select hello('whoop');
ERROR:  java.lang.NoClassDefFoundError: clojure.lang.RT
clojuredb=# select sqlj.get_classpath('public');
   get_classpath
-------------------
 ssclojure:clojure
(1 row)

clojuredb=#
