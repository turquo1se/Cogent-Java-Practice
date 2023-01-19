package designPattern;

public class Employee1 {
	
	private int id;
	private String name;
	private static Employee1 e1; // null as of now
	
	private Employee1() {
		
	}
	
	public static Employee1 getInstance() { // Rules no.2, static method returning type itself
		
		if (e1 == null) {
			e1 = new Employee1();
		}
		
		return e1;
	}

}
