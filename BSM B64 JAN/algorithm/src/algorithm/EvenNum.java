package algorithm;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans = EvenNum.Even(9);
		System.out.println(ans);
	}
	
	static boolean Even(int x) {
		return (x % 2) == 0;
	}

}
