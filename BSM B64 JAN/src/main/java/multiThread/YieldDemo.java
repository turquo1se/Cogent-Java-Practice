package multiThread;

class MyThread7 extends Thread{
	public void run() {
		for (int i = 0; i < 5; i ++) {
			System.out.println("Child Thread");
			//Thread.yield();// static method, so we can call w/o using object
		}
	}
}

public class YieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread7 t = new MyThread7();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
			Thread.yield();
		}

	}

}
// yield -- it forcefully send a thread from running state to runnable state.