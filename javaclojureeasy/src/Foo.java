import clojure.lang.RT;
import clojure.lang.Var;
import clojure.lang.LazySeq;

public class Foo {
    public static void main(String[] args) throws Exception {
	// Load the Clojure script 
        // as a side effect, initializes the runtime.
        // load appends .clj, looking for foons.clj.
	RT.load("foons");

	// Get a reference to the foo function.
	Var foo = RT.var("foons","foofunc");

	// Call it!
	Object result = foo.invoke("Hi","there");

	System.out.println("result is a " + result.getClass());
        System.out.println("result value is " + result);

	LazySeq seq = (LazySeq) result;
        for(Object o : seq) {
	    System.out.println("" + o);
	}
    }
}

