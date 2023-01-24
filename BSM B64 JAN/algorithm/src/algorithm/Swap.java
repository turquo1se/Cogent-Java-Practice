package algorithm;

public class Swap {
	
	
	public static void main(String args[]) {
		int x1 = 10;
		int x2 = 0;
		
		Swap.SwapNumbers(x1, x2);
		
		Swap.SwapNoExtra(x1, x2);
		
		
	}
	
	static void SwapNumbers(int x1, int x2) {
		int temp;
		temp = x1;
		x1 = x2;
		x2 = temp;
		System.out.println("x1=" + x1 + " x2=" + x2);
	}
	
	static void SwapNoExtra(int x1, int x2) {

		x1 = x1 + x2;
		 

		x2 = x1 - x2;
		 

		x1 = x1 - x2;
		
		System.out.println("x1=" + x1 + " x2=" + x2);
	}

}
