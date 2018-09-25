package model;

public class VotingLogic {
	
	public String eligibleVoter(Voter voter) {
		String eligible;
			
		if (voter.getDOBYear() >= 2000 ) {
			eligible = "No";
		} else {
			eligible = "Yes";
		}
		return eligible;
	}

	public int yearsEligible(Voter voter) {
		int yearsEligible;
		
		if (voter.getDOBYear() <= 2000 ) {
			int years = voter.getDOBYear();
			yearsEligible = 2000 - years;
		} else {
			yearsEligible = 0;
		}
		return yearsEligible;
	}
	
	public boolean firstTimeVoter(Voter voter) {
		boolean firstTime;
		
		if (voter.getDOBYear() <= 2000) {
			firstTime = true;
		} else {
			firstTime = false;
		}
		return firstTime;
	}
}