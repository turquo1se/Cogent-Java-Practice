package algorithm;

import java.util.Arrays;

public class FindBiggerNumAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1 = 4;
		int x2 = 2;
		int x3 = 3;
		
		int ans = FindBiggerNumAmongThree.Biggest(x1, x2, x3);
		
		System.out.println(ans);

	}
	
	static int Biggest(int x1, int x2, int x3) {
		int temp = FindBiggerNumberAmongTwo.BiggerNum(x1, x2);
		int ans = FindBiggerNumberAmongTwo.BiggerNum(temp, x3);
		
		return ans;
	}

}
