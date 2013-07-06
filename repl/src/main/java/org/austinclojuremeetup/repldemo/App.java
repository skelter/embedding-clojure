package org.austinclojuremeetup.repldemo;

import clojure.main;
import clojure.lang.RT;
import java.util.*;

/**
 * Let's repl!
 *
 */
public class App 
{
    public static void main( String[] givenargs )
    {

	RT.var("user","namesList",buildNamesList());
        main.main(givenargs);
	System.out.println("Have a great day!");
    }

    public static Collection<String> buildNamesList() {
	List<String> namesList = new ArrayList<String>();
	namesList.add("Stephanie");
	namesList.add("Samantha");
        namesList.add("Normella");
	return namesList;
    }
}
