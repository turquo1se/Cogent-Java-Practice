package set2;

import java.util.ArrayList;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int test = 123456;
		int test1 = 123321;
		System.out.println(Q3.checkPalindrome(test));
		System.out.println(Q3.checkPalindrome(test1));
	}
	
	static Boolean checkPalindrome(int num) {
		
		String numString = String.valueOf(num);
		
		String rev = new StringBuilder(numString).reverse().toString();
		
		System.out.println(numString +" "+ rev);
		
		return numString.equals(rev);
		
		

	}

}
