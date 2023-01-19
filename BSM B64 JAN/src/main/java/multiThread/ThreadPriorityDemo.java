package multiThread;

class MyThread5 extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child thread");
		}
	}
}

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread5 t =new MyThread5();
		System.out.println(t.getPriority());
		t.setPriority(10);
		t.start();
		
		for (int i = 0; i < 10; i ++) {
			System.out.println("Main thread");
		}
	}

}
