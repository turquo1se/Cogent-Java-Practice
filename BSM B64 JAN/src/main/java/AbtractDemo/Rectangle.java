package AbtractDemo;

public class Rectangle extends Figure { // if extends abstract class, you will have to override abstract methods, 
										// concrete methods are optional

	Rectangle() {
		System.out.println("Rectangle");
	}
	
	
	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle area");
		
	}

}
