package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.VotingLogic;
import model.Voter;

public class TestVoterRegistration {
	VotingLogic logic = new VotingLogic();
	Voter voter = new Voter("Joe", 29, 06);

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testEligibleVoterYes() {
		voter.setDOBYear(8000);
		String eligible = logic.eligibleVoter(voter);
		assertEquals("No", eligible, "No");
	}
	
	@Test
	public void testEligibleVoterNo() {
		voter.setDOBYear(1983);
		String eligible = logic.eligibleVoter(voter);
		assertEquals("Yes", eligible, "Yes");
	}
	
	@Test 
	public void testFirstTimeVoterYes() {  
		voter.setDOBYear(1983);  
		assertTrue(logic.firstTimeVoter(voter)); 
	} 

	@Test 
	public void testFirstTimeVoterNo() {  
		voter.setDOBYear(2010);   
		assertFalse(logic.firstTimeVoter(voter)); 
	}

}

