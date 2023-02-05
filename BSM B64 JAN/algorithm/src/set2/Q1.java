package set2;

import java.util.ArrayList;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "abc";
		
		List<String> ans = Q1.subString(test);
		
		System.out.println(ans);
		

	}
	
	public static List<String> subString(String str) {
		
		List<String> ans = new ArrayList<>();
		
		int len = str.length();
		
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				ans.add(str.substring(i,j));
			}
		}
		
		return ans;
	}

}
