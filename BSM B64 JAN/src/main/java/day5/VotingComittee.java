package day5;

public class VotingComittee {
	
	
	
	

	boolean ageChecker(int x) {
		if (x < 18) {
			throw new AgeRestrictionException("Too young");
		} 
		return true;
	}

}
