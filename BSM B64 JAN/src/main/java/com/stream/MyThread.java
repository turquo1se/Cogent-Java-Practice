package com.stream;
import java.util.function.*;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r =()-> {
			for(int i =0; i<10; i++) {
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		Function<Integer, Integer> a =(x) -> x*x;
		System.out.println(a.apply(10));
		
		BiFunction<Integer, Integer, Integer> f1 = (x, y) -> x + y; //bifunction
		System.out.println(f1.apply(10,10 ));
	}

}
