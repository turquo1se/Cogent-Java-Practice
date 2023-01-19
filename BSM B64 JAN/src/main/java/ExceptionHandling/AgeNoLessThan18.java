package ExceptionHandling;

public class AgeNoLessThan18 extends RuntimeException { // Exception is by default checked exception

	AgeNoLessThan18(String str) {
		super(str);
	}
}
