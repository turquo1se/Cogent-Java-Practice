
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// parent class reference will holds child class object
		// but reverse is not possible
		Overriding1 o2 = new Overriding2(); // overriding, up casting
		
		Overriding2 o1 = new Overriding2(); // inheritance
		
		Overriding2 o3 = new Overriding1(); // not possible
		
		Overriding2 o3 = (Overriding2)new Overriding1(); // down casting
		
		o2.test(); // can only call overrided methods
		
		o2.test1(); // can not call methods only in child class
		
		//rule of overriding
		// methods signature should be same
		// Signature (access modifier, return type, name, parameters)
		// Visibility can not decrease but can increase( default -> public ok, public -> default no )
		// up casting 
	}

}
