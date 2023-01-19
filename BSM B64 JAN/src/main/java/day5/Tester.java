package day5;

public class Tester {
	
	// static VotingComittee vc = new VotingComittee();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VotingComittee vc = new VotingComittee();
		
		try {
			
			vc.ageChecker(8);			
			
		} catch(AgeRestrictionException e) {
			System.out.println(e.getMessage());
		}
		// vc.ageChecker(18);
	}

}
