package factory_pattern;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ShapeFactory sf = new ShapeFactory();
			
			Shape s = sf.getShape("circle");
			s.draw();
			
			Shape s1 = sf.getShape("reactangle");
			s1.draw();
			
			Shape s2 = sf.getShape("square");
			s2.draw();
		}
		catch(Exception e) {
			System.out.println("Error " + e.getMessage());
		}
 
	}

}
