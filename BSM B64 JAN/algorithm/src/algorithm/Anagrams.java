package algorithm;

import java.util.HashMap;
import java.util.Hashtable;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static boolean Anagram(String s1, String s2) {
		
		HashMap hm = new HashMap();
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		for(int i = 0; i < s1.length(); i++) {
			hm.merge(s1.indexOf(i), 1, (a, b) -> a + b);
			
		}
		
		for(int i = 0; i < s2.length(); i++) {
			hm.merge(s1.indexOf(i), -1, (a, b) -> a + b);
		}
		
	}

}
