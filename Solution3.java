
public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Talker chicken = new Chicken (); 
		Talker rooster = new Rooster ();
		System.out.println(chicken.talk());
		System.out.println(rooster.talk());
	}
	
	public String chickenTalk () {
		return chicken.talk();
	}
	public String roosterTalk () {
		return rooster.talk();
	}
	
	Talker chicken = new Chicken (); 
	Talker rooster = new Rooster ();
}

class Rooster extends Bird implements Talker{
	public String talk () {
		String whatIamTalking = "Cock-a-doodle-doo";
		return whatIamTalking;
		} 	
}