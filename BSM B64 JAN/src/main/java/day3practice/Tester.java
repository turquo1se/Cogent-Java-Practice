package day3practice;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine m1 = new Radio();
		Electronics e1 = new Radio();
		Radio r1 = new Radio();
		
		e1.start();
		System.out.println(e1.ic);
		
		m1.volumeController();
		m1.engineProcess();
	
		r1.start();
		r1.volumeController();
		r1.engineProcess();
		

	}

}
