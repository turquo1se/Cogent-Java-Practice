package multiThread;

class MyThread9 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i ++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		MyThread9 t = new MyThread9();
		t.start();
		
		for (int i = 0; i < 10; i++) {
			t.join();
			System.out.println("main thread");
			}
		
		}
	}


