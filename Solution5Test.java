

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution5Test {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Solution5 sol = new Solution5();
		assertEquals ("i cannot Walk", sol.FishWalk());
		assertEquals ("i cannot Sing", sol.FishSing());
		assertEquals ("i am Swiming", sol.FishSwim());
		
		assertEquals ("i am Swiming", sol.dolphinSwim());
		
		assertEquals ("grey", sol.GetSharkFishColor());
		assertEquals ("orange", sol.GetClownFishColor());
		
		assertEquals ("large", sol.GetSharkFishSize());
		assertEquals ("small", sol.GetClownFishSize());
		
		assertEquals (true, sol.doClownEatOtherFish());
		assertEquals (true, sol.doSharkMakeJokes());
		
		assertEquals ("i am Walking", sol.FishWalk());
		assertEquals ("i am Singing", sol.FishSing());
		assertEquals ("i am Swiming", sol.FishSwim());
		
		assertEquals ("i am Swiming", sol.dolphinSwim());
		
		assertEquals ("orange", sol.GetSharkFishColor());
		assertEquals ("grey", sol.GetClownFishColor());
		
		assertEquals ("small", sol.GetSharkFishSize());
		assertEquals ("large", sol.GetClownFishSize());
		
		assertEquals (false, sol.doClownEatOtherFish());
		assertEquals (false, sol.doSharkMakeJokes());
		
		
	}
}
