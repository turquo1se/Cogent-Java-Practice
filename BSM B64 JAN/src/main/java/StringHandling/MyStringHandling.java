package StringHandling;

public class MyStringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello"; // string literal
//		String str1 = "Hello";
		
//		String str2 = new String("Hello"); // string object
//		String str3 = new String("Hello");
//		
//		System.out.println(str.hashCode());
//		System.out.println(str1.hashCode());
		
		// mutable and immutable
		
		String str3 = str.concat("abc");
		System.out.println(str); // Hello
		System.out.println(str3); //helloabc
		
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb1 = sb.append("abc");
		System.out.println(sb); // Helloabc
		System.out.println(sb1); //Helloabc
		
		String s1 = "abc tech";
		System.out.println(s1.startsWith("abc"));
		System.out.println(s1.startsWith("123"));
		System.out.println(s1.endsWith("te"));
		System.out.println("done");
		
		System.out.println("==============================");
		
		String st1 = " abc xyz ";
		st1.trim();
		System.out.println(st1.length());
		st1 = st1.trim();
		System.out.println(st1.trim().length());
		

	}

}
