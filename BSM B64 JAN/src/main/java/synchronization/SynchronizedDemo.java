package synchronization;

class MyThread extends Thread {
	Display d;
	String name;
	
	MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display d = new Display();
		MyThread t1 = new MyThread(d, "YS");
		MyThread t2 = new MyThread(d, "Babu");
		t1.start();
		t2.start();
	}

}
