package collection;

import java.util.Arrays;
import java.util.List;

public class MessagePassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = Arrays.asList(10,20,30,40,500);
		List msg = test(l);
		System.out.println(msg);
		
		
	}
	
	public static List<String> test(List<Integer> i) {
		List<String> msg = Arrays.asList("Hello", "welcome");
		System.out.println(i);
		
		return msg;
	}
}
