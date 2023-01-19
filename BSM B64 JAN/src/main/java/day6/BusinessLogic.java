package day6;

import java.util.ArrayList;
import java.util.TreeSet;

public class BusinessLogic {
	
	public ArrayList<Employee> process(ArrayList<Employee> al, Employee... es){
		
		for (Employee e: es) {
			al.add(e);
		}
		
		return al;
	}
	
	public TreeSet<Employee> process(TreeSet<Employee> tree, Employee... es) {
		for (Employee e: es) {
			tree.add(e);
		}
		
		return tree;
	}

}
