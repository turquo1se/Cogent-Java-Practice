package mapDemo;

public class Test {

	public String toString() {
		return "Test";
		
	}
	
	@Override
	public void finalize() {
		System.out.println("Finalize");
	}
}
