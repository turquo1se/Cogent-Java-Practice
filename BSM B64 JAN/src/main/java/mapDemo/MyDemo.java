package mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m = new HashMap();
		m.put(1,  "1");
		m.put(2,  "Hello");
		m.put(5,  "demo");
		m.put("1",  100);
		System.out.println(m);
		// order not preserved, value can be duplicate, key cannot

		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("1", 1);
		m1.put("2", 2);
		m1.put("3", 3);
		m1.put("1", 100);
		m1.put(null, null);
		System.out.println(m1);
		
		System.out.println(Objects.hash("1"+2));
		System.out.println(Objects.hash("1"+2));
	}

}
