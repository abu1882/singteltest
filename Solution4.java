
public class Solution4 {
	public static void main(String[] args) {
		Parrot parrot = new Parrot();
		parrot.setNeibour(new Dog ());
		System.out.println(parrot.talk());
		parrot.setNeibour(new Cat ());
		System.out.println(parrot.talk());
		parrot.setNeibour(new Rooster ());
		System.out.println(parrot.talk());
	}
	
	Parrot parrot = new Parrot ();
	
	public void setDogNeibour () {
		parrot.setNeibour(new Dog());
	}
	public void setCatNeibour () {
		parrot.setNeibour(new Cat());
	}
	public void setRoosterNeibour () {
		parrot.setNeibour(new Rooster());
	}
	
	public String talk () {
		return parrot.talk();
	}
}



class Dog extends Animal implements Talker {
	String talk = "Woof, woof";
	public String talk () {
		return talk; 
	}	
}

class Cat extends Animal implements Talker {
	String talk = "Meow";
	public String talk () {
		return talk; 
	}
}

class Parrot extends Bird implements Talker {
	private Talker neibour = null; 
	public String talk (){
	   return neibour.talk();
	}

	public Talker getNeibour() {
		return neibour;
	}

	public void setNeibour(Talker neibour) {
		this.neibour = neibour;
	}
}