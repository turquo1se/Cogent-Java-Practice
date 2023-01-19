package day4;

import java.util.*;

public class Car extends Vehicle {

	private static final int a = 0;

	@Override
	protected void process(int x) {
		// TODO Auto-generated method stub
		 try {
			 ArrayList<Integer> arrL = new ArrayList<Integer>();
			 arrL.add(x);
			 arrL.remove(2);
			 
//			 String str = null;
//			 System.out.println(str.length());
			 
			 
		 } catch(ArrayIndexOutOfBoundsException | Exception e) {
			 System.out.println("Index out of bound error " + e.getMessage());
			 
		 } catch(Exception e) {
			 System.out.println("Error " + e.getMessage());
		 }
		
		
	}
	
	int perform(int x) {
		
		try {
			int a = 10;
			
			return a/x;
			
		} catch(ArithmeticException e) {
			
			System.out.println("Arrithmetic Error: "+ e.getMessage());
		}
		return 0;
		
	}
	
	

}
