

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution3Test {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Solution3 sol = new Solution3();
		assertEquals ("Cluck, cluck", sol.chickenTalk());
		assertEquals ("Cock-a-doodle-doo",sol.roosterTalk());
		
		
		assertEquals ("Cluck, cluck, cluck, ", sol.chickenTalk());
		assertEquals ("Cock-a-doodle-doo, Cock-a-doodle-doo, ",sol.roosterTalk());
	}
}
