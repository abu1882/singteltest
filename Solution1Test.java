

import static org.junit.Assert.*;

import org.junit.Test;


public class Solution1Test {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Solution sol = new Solution();
		assertEquals ("i am flying", sol.birdFly());
		assertEquals ("i am singing",sol.birdSing());
		assertEquals ("i am walking",sol.birdWalk());
	}

}
