package org.austinclojuremeetup.scriptingwithclojure;

import java.util.*;
import javax.script.*;
import java.io.FileReader;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	showEngines();
	if (args.length > 0) {
	    runScript(args);
	}
    }
	
    static ScriptEngineManager mgr = new ScriptEngineManager();

    private static void showEngines() {
	// from http://stackoverflow.com/questions/11838369/where-can-i-find-a-list-of-available-jsr-223-scripting-languages
        List<ScriptEngineFactory> factories = mgr.getEngineFactories();

        for (ScriptEngineFactory factory : factories) {

            System.out.println("ScriptEngineFactory Info");

            String engName = factory.getEngineName();
            String engVersion = factory.getEngineVersion();
            String langName = factory.getLanguageName();
            String langVersion = factory.getLanguageVersion();

            System.out.printf("\tScript Engine: %s (%s)\n", engName, engVersion);

            List<String> engNames = factory.getNames();
            for(String name : engNames) {
                System.out.printf("\tEngine Alias: %s\n", name);
            }

            System.out.printf("\tLanguage: %s (%s)\n", langName, langVersion);

        }
    }

    private static void runScript(String[] args) {
	String filename = args[0];
	String extension = extension(filename);
	ScriptEngine engine = mgr.getEngineByExtension(extension);
	engine.put("namesList",createSomeNamesList());
	try {
	    engine.eval(new FileReader(filename));
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    private static String extension(String filename) {
	int index = filename.lastIndexOf(".") + 1;
	String extension =  filename.substring(index);
	return extension;
    }

    private static List<String> createSomeNamesList() {
	List<String> namesList = new ArrayList<String>();
	namesList.add("Sam");
	namesList.add("Norm");
	namesList.add("Jill");
	namesList.add("Steve");
	return namesList;
    }
}
