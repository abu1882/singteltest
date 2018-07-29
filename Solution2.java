
public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new Duck ();
		System.out.println(duck.talk());
		Chicken chicken = new Chicken ();
		System.out.println(chicken.talk());
		System.out.println(chicken.fly());
	}
	
	Chicken chicken = new Chicken ();
	Duck duck = new Duck ();
	public String duckTalk () {
		return duck.talk();
	}
	
	public String chickenTalk () {
		return chicken.talk();
	}

	public String chickenFly () {
		return chicken.fly();
	}
}

interface Talker {
	default public String talk () {
		String whatIamTalking = "Quack, quack";
		return whatIamTalking;
	}
	
//	default public String talk (String whatIamTalking) {
//		return whatIamTalking;
//	}
	
}

interface NoFlyer extends Flyer {
	default public String fly () {
		String whatIamDoing = "i cannot fly";
		return whatIamDoing;
	}	
}

class Duck extends Bird implements Talker{
	public String talk () {
		String whatIamTalking = "Quack, quack";
		return whatIamTalking;
	} 	
}

class Chicken extends Bird implements Talker, NoFlyer {
	public String talk () {
		String whatIamTalking = "Cluck, cluck";
		return whatIamTalking;
	}
	
	public String fly () {
		//String whatIcanDo = "I cannot fly, my wings are clipped";
		return NoFlyer.super.fly();
		
	}
}