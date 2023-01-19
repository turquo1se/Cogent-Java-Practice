
public class Overloading {
	
	Overloading(int x) { // constructor overloading
		
	}
	
	Overloading() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading o = new Overloading();
		o.test(3);
		o.test();

	}
	
	// compile time polymorphism/overloading , same name different in body and parameter
	
	void test(int x) { 
		// number of parameter
		// type of parameter
		// order of parameter
		System.out.println("First test");
	}
	
	void test() {
		System.out.println("Second test");
	}
}
