package multiThread;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 m = new MyThread2();
		Thread t =new Thread(m);
		t.start();
		for(int i = 6; i <= 10; i++) {
			System.out.println(i);
		}

	}

}

class MyThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		
	}
	
}
