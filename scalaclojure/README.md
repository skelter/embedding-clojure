Calling Clojure from Scala
===========================

This example in Scala follows the usual pattern of
using clojure.lang.RT to load a clojure resource,
get hold of some def'd vars and invoke them.

See App.scala.

To run

1. mvn package
2. ./run


Future
--------
We could improve this example by passing some collections back and forth.

Broader Perspective
--------------------
June 6, 2013 

The Austin Clojure Meetup member that requested this example
mentioned that their consultant ran into issues calling Clojure
from Scala once upon a time.
It seems to work in this light-weight example,
so maybe the issues have been fixed.  It may also be that we
weren't doing enough kung fu to run into the problem.

During the prep for this example it looks like there's been some
improvements in both Scala and Clojure's implementation;
there are older conversations out on the web about some classloader
problems.

The web also had some grumbling about Scala collections not playing
nice with Java and Clojure collections.
