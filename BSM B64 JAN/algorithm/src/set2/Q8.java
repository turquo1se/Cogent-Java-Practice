package set2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(1);
		temp.add(3);
		temp.add(9);
		temp.add(7);
		temp.add(4);
		
		System.out.println(Q8.biSearch(temp, 7));

	}
	
	public static int biSearch(List<Integer> li, int target) {
		
		Collections.sort(li);
		
		if (li.size() == 0) {
			return -1;
		}
		
		int mid = Math.floorDiv(li.size(), 2);
		
		if (li.size() == 1 && li.get(0) != target) {
			// System.out.println(0);
			return -1;
		}
		
		
		if (target == li.get(mid)) {
			// System.out.println(1);
			return mid;
		}
		if (target < li.get(mid)) {
			return biSearch(li.subList(0, mid), target);
		}
		if (target > li.get(mid)) {
			return biSearch(li.subList(mid+1, li.size()), target);
		}
		return -1;
	}

}
