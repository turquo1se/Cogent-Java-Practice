package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EMP e = new EMP(101, "allen");
		String fileName = "A://Cogent University/testFile";
		
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(e);
			System.out.println(e);
			out.close();
			file.close();
		} 
		catch(Exception error) {
			System.out.println("error "+ error.getMessage());
		}
		

	}

}
