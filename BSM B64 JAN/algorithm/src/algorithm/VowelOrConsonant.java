package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans = VowelOrConsonant.Vowel("a");
		String ans1 = VowelOrConsonant.Vowel("b");
		
		System.out.println(ans+" "+ans1);

	}
	
	static String Vowel(String s) {
		
		//List[] vowel = new Arrays.asList("a", "e", "i", "o", "u");
		
		String[] vowel = new String[] {"a", "e", "i", "o", "u"};
		List<String> vowel_list = Arrays.asList(vowel);

		
		if (vowel_list.contains(s)) {
			return "vowel";
		}
		else {
			return "Consonant";
		}
	}

}
