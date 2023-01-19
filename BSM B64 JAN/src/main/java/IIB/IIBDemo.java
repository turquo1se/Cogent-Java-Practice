package IIB;

public class IIBDemo {
	
	static {
		System.out.println("IIBDemo static");
	}
	
	IIBDemo(){
		// Calling order:
		// 1st Super()
		// 2nd IIB
		// 3rd Body of constructor
		
		System.out.println("IIB Constructor");
	}
	
	{
		System.out.println("IIB");
	}

}
