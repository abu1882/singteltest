interface Singer {
	default public String sing () {
		String whatIamDoing = "i am singing";
		return whatIamDoing;
	} 
}

interface Walker {
	default public String walk () {
		String whatIamDoing = "i am walking";
		return whatIamDoing;
	}
}

interface Flyer {
	default public String fly () {
		String whatIamDoing = "i am flying";
		return whatIamDoing;
	}
}

public class Solution {
	
	public Bird bird = new Bird ();
	
	public String birdWalk () {
		return bird.walk();
	}
	public String birdFly () {
		return bird.fly();
	}
	public String birdSing () {
		return bird.sing();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird ();
		System.out.println(bird.walk());
		System.out.println(bird.fly());
		System.out.println(bird.sing());		
	}

}

class Animal implements Walker {	
	
}

class Bird implements Walker, Flyer, Singer {

}