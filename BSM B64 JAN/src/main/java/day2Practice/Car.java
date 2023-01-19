package day2Practice;

public class Car extends Vehicle{
	
	Car() {
		super("car", "A");
		System.out.println("Car Constructor");
		carStatic();
	}
	
	static void carStatic() {
		System.out.println("I'm a static method");
	}

}
