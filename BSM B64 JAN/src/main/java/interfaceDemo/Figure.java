package interfaceDemo;

public interface Figure {
	
	int x = 10; // final variable, cant be changed

	void area(); // methods in interface are public and abstracted by default
				 // before JDK 8.n you can not have public concrete methods
	
	default void area1() { // default is ok
		
	}
	
}
