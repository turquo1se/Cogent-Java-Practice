package ExceptionHandling;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 obj = new Test2();
		
		System.out.println(1);
		System.out.println(obj.test());
		System.out.println(2);
	}

}

class Test2 {
	
	static int test() {
		try {
			return 10;
		} catch (Exception e) {
			return 20;
		} finally {
			return 30;
		}
		// return 40;
	}
	
}
