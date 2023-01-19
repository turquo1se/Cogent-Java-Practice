package synchronization;

public class SynchronizedDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread() {
			public void run() { // Anonymous inner class, same as the usage in MyThread12 class example.
				
			}
		};
		
	}

}
class TEST {
	
	void demo() {
		
		
		synchronized() { // you cannot write a method inside a synchronized block
			// synchronized content
			
		}
		// unsynchronized content
	}
}

class MyThread12 {
	public void run() {
		
	}
	
}