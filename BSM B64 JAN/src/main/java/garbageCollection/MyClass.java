package garbageCollection;

class A {
	
}

public class MyClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//MyClass mc = new MyClass();
		//mc = null; // it will go for garbage collection
		
		A a = new A();
		
		a = null;
		
		System.gc();
		Thread.sleep(50000);
		System.out.println("Finish");

	}
	
	@Override
	public void finalize() {
		System.out.println("removed");
	}

}
// Garbage collection
// A a1 = new A();
// a1 = null
// no reference will be pointed to the A object created
// A object memory will be released 