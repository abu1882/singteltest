

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution2Test {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Solution2 sol = new Solution2();
		assertEquals ("i cannot fly", sol.chickenFly());
		assertEquals ("Cluck, cluck",sol.chickenTalk());
		assertEquals ("Quack, quack",sol.duckTalk());
		
		assertEquals ("i am flying", sol.chickenFly());
		assertEquals ("Cluck, cluck, cluck,",sol.chickenTalk());
		assertEquals ("Quack, quack, quack",sol.duckTalk());
		
		
		assertEquals ("i am able to fly", sol.chickenFly());
		assertEquals ("Cluck",sol.chickenTalk());
		assertEquals ("Quack",sol.duckTalk());
	}
}
