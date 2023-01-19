package ExceptionHandling;

public class MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str = null;
		//System.out.println(str.length());
		try {
			int arr[] = {6,5,4,3,2,1};
			
			// System.out.println(arr[10]);
			int y = test();
			System.out.println(y);
			
			
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Finish");
		}
		
	}
	
	public static int test() {
		try {
			String str = null;
			System.out.println(str.length());
			return 10;
			
		} catch (Exception e) {
			return 20;
			
		} finally {
			return 100;
		}
	}

}

// Exception -- kind of bug/logical issue which will terminate the code anbormally
// Exception comes when user gives wrong input/ may be developer missed something on the code

// compile time error -- syntax error which will catch by compiler
// Exception -- it is check by JVM 

// Exception handling

// try {} -- we write a code, which will generate exception
// catch() {} -- we write the error message we want to display, when exception occur
// throw 
// throws
// finally {} -- we write a code which we want to execute in all cases(Exception occur or not)


