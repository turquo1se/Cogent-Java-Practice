package set2;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Happy Birthday";
		String rep = "BIRTH";
		System.out.println(Q6.replace(str, rep, 6));

	}
	
	public static String replace(String str, String rep, int index) {
		int len = rep.length();
		String ans = "";
		
		return ans + str.substring(0,index) + rep + str.substring(index+len);
	}

}
