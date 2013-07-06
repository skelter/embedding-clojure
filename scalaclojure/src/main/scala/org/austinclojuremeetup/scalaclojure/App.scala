package org.austinclojuremeetup.scalaclojure

import clojure.lang.RT;
import clojure.lang.Compiler;
import java.io.StringReader;

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
    RT.load("setup")
    Compiler.load(new StringReader("(ns user) (defn clojurefunc [col] (apply str col))"))
    val cf = RT.`var`("user","clojurefunc")
    val result = cf.invoke(args)
    println( "Result: " + result)
  }

}
