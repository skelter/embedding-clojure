package org.austinclojuremeetup.javamain;

import java.util.List;
import java.util.Arrays;
import org.austinclojuremeetup.trad.api.TradService;
import org.austinclojuremeetup.clojureimpl.Factory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	List<Object> objects = makeSomeObjects();
	TradService service = Factory.createService();
	List<String> lines = service.convert(objects);
	for(String line : lines) {
	    System.out.println("\t" + line);
	}
    }

    private static List<Object> makeSomeObjects() {
        Object[] stuff = {0, 1, 2.17, 2318L, "Hello", "World", "!"};
	return Arrays.asList( stuff); 
    }
}
