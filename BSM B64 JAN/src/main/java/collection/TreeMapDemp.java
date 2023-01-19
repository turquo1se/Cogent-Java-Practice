package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m = new TreeMap();
		
		m.put("hello", 1);
		m.put("welcome", 2);
		m.put("abc", 34);
		System.out.println(m);

	}

}
// identity hash map - compare key according to reference, removed after jdk 11

