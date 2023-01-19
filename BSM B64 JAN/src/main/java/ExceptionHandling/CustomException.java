package ExceptionHandling;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// how to create custom exception?
		// why create custom exception?
		int i = 10/0;
		int age = 17;
		if (age < 18) {
			// System.out.println("Person can not get DL");
			throw new AgeNoLessThan18("Person can not get DL");
		} else {
			System.out.println("Person can get DL");
		}
		
		System.out.println("inserting data to DB");
		System.out.println("Finish");

	}

}
