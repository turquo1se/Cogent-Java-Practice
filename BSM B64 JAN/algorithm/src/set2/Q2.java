package set2;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "abcdef";
		
		Q2.printReverse(test);

	}
	
	public static void printReverse(String str) {
		for (int i = str.length(); i > 0; i--) {
			System.out.print(str.substring(i-1,i));
		}
		
		
	}

}
