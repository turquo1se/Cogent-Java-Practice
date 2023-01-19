package synchronization;

public class TestDeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String resource1 = "Allen";
		final String resource2 = "Black";
		
		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: locked by " + resource1);
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
					
					synchronized (resource2) {
						System.out.println("Thread 1: locked By " + resource2 + " actually finished");
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 2: locked by " + resource1);
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
					
					synchronized (resource2) {
						System.out.println("Thread 2: locked By " + resource2 +  " actually finished");
					
				}
			}
		}
	};
	
	t1.start();
	t2.start();

	}
}
