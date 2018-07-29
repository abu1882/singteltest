

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution4Test {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Solution4 sol = new Solution4();
		sol.setDogNeibour();
		assertEquals ("Woof, woof", sol.talk());
		sol.setCatNeibour();
		assertEquals ("Meow",sol.talk());
		sol.setRoosterNeibour();
		assertEquals ("Cock-a-doodle-doo",sol.talk());
		
		
		sol.setDogNeibour();
		assertEquals ("MeowWoof, woof", sol.talk());
		sol.setCatNeibour();
		assertEquals ("Woof, woof",sol.talk());
		sol.setRoosterNeibour();
		assertEquals ("Cock-a-doodle-doo Cock-a-doodle-doo",sol.talk());
		
	}
}
