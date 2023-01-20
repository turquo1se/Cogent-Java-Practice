package com.java8.lambda;

public class MyClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// My1 m = new MyClass();
		// m.test();
		
		My1 m1 = () -> {System.out.println("MyClass Test"); //using lambda expression, 
		                System.out.println("MyClass Test1"); //and lambda expression is a feature of functional interface
		                };
		                
		My2 m2 = (x) -> {System.out.println("MyClass Test" + x); //using lambda expression with parameter 
		                 System.out.println("MyClass Test1");    //and lambda expression is a feature of functional interface
		                };        
	    My3 m3 = (x, y) -> x * y;
	    
	    
	    My3 m4 = (x, y) -> {
	    	MyClass m = new MyClass();
	    	
	    	m.P1();
	    	
	    	return x * y;
	    };
	    
		m1.test();
		
		m1.test1();
		
		m2.test(10);
		
		m4.test(5, 10);
		
		System.out.println(m3.test(10, 20));
		

		
		
	}
	void P1() {
		System.out.println("P1");
	}

	// previous approach
//	@Override
//	public void test() {
//		// TODO Auto-generated method stub
//		System.out.println("MyClass Test");
//	}

}
// syntax -- () -> body of the method -- when lambda has one line of code
// multiple line of code -- () -> {}