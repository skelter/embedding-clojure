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
	List<String> lines = transformListWithAService(makeSomeObjects());
	for(String line : lines) {
	    System.out.println("\t" + line);
	}
    }

    List<String> transFormListWithAService(List<Object> objects) {
	TradService service = Factory.createService();
	return service.convert(objects);
    }

    private static List<Object> makeSomeObjects() {
        Object[] stuff = {0, 1, 2.17, 2318L, "Hello", "World", "!"};
	return Arrays.asList( stuff); 
    }
}
