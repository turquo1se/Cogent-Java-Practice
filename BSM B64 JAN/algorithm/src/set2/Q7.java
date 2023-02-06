package set2;

import java.util.Random;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int generateRandomNumber(int lowerBound, int upperBound) {
		  Random random = new Random();
		  return lowerBound + random.nextInt(upperBound - lowerBound + 1);
		}

}
