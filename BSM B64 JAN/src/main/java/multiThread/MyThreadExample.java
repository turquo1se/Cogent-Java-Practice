package multiThread;

public class MyThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t = new Test1();
		t.start(); // if call run(),  it will run with normal 
		for(int i = 0; i <= 50; i++) {
			System.out.println("a");
		}

	}

}

//class Test{
//	void calculate() {
//		for(int i = 0; i<=5; i++) {
//			
//			try {
//				Thread.sleep(1000);
//			}
//			catch(Exception e) {
//				System.out.println(e.getMessage());
//			}
//			
//			System.out.println(i);
//		}
//	}
//}

class Test1 extends Thread{
	
	
	public void run() {
		for(int i = 0; i<=50; i++) {
			
			System.out.println("b");
		}
	}
	
	@Override
	public synchronized void start() { // if override start() method, calls start() will not initiate run() method
		System.out.println("Start Method");
	}
}

// Thread -- light weight process
// light weight(smallest part of the process which can not further divide)
// process -- I(input)/O(output) -- methods
// 1 thread per class
// Priority 1 - 10, normal priority = 5
