package ExceptionHandling;

public class MyException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try {
//			Class.forName("Com.demoA");
//		} catch (ClassNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
		
		MyException1 m1 = new MyException1();
		
		// m1.test();
		// m1.test1(); // test1 must be try and catch or throws
		
		// Throw - it is used to raise the exception
//		String str = null;
//		if(str == null) {
//			throw new NullPointerException("null value");
//		}
//		System.out.println(str);
//		
		try {
			String str = null;
			str.length();
		} catch (Exception e) {
			System.out.println("aaa"+e.getMessage());
		}
		System.out.println("Finish");

		
		

	}
	
	void test() {
		try {
		Class.forName("Com.demoA");
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	void test1() throws Exception {
		
	}

}
// Throw or try and catch to handle exceptions


