package mapDemo;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public class MyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Test, String> m = new WeakHashMap<Test, String>();
		Test t = new Test();
		
		m.put(t,  "Hello");
		
		System.out.println(m);
		
		t = new Test();
		
		System.gc();
		
		System.out.println(m);

	}
	// in weak hash map, garbage collection will dominate over the weak hashmap. While in hashmap, hashmap dominate over garbage collection
	
	// 

}
