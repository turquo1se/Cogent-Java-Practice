package designPattern;

public class Employee1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e1 = Employee1.getInstance();
		Employee1 e2 = Employee1.getInstance();
		Employee1 e3 = Employee1.getInstance();
		Employee1 e4 = Employee1.getInstance();
		Employee1 e5 = Employee1.getInstance();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(e5.hashCode());
	}

}

// Singleton -- We can only create one object of a single class

// Rules of singleton class
// 1. constructor must be private
// 2. We have to create static method which will return its own class
// 3. We check, if object is null, then create object, else return the same
// 