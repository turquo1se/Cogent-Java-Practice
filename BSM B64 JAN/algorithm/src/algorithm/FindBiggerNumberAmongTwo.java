package algorithm;

public class FindBiggerNumberAmongTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = -1; 
		int x2 = 9;
		
		
		int ans = FindBiggerNumberAmongTwo.BiggerNum(x1, x2);
		
		System.out.println(ans);
		

	}
	
	static int BiggerNum(int x1, int x2) {
		if (x1 >= x2) {
			return x1;
		}
		else {
			return x2;
		}
	}
	
	

}
