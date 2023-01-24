package algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list1 = new int[] {3, 6, 2, 8, 11};
		int[] ans = SecondMinMax.second(list1);
		System.out.println(ans[0] + " " +ans[1]);
	}
	
	static int[] second(int[] ints) {
		
		int length = ints.length;
		List temp = Arrays.asList(ints);
		Arrays.sort(ints);
		
		int[] ans = new int[] {ints[1], ints[length-2]};
		return ans;
		
	}

}
