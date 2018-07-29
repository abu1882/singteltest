
public class Solution5 {
	public static void main(String[] args) {
		Fish fish = new Fish();
		System.out.println(fish.swim());
		System.out.println(fish.walk());
		System.out.println(fish.sing());
		
		SharkFish shark = new SharkFish ();
		System.out.println(shark.getColor());
		System.out.println(shark.getSize());
		System.out.println(shark.makeJokes);
		
		ClownFish clown = new ClownFish ();
		System.out.println(clown.getColor());
		System.out.println(clown.getSize());
		System.out.println(clown.isEatOtherFish());
		
		Dolphin dolphin = new Dolphin ();
		System.out.println(dolphin.swim());
	}
	
	public Fish fish = new Fish ();
	public String FishSwim () {
		return fish.swim();
	}
	public String FishWalk () {
		return fish.walk();
	}
	public String FishSing () {
		return fish.sing();
	}
	
	SharkFish shark = new SharkFish ();
	ClownFish clown = new ClownFish ();
	Dolphin dolphin = new Dolphin ();
	
	
	public String GetSharkFishColor () {
		return shark.getColor();
	}
	public String GetClownFishColor () {
		return clown.getColor();
	}
	public String GetClownFishSize () {
		return clown.getSize();
	}
	public String GetSharkFishSize () {
		return shark.getSize();
	}
	
	public boolean doSharkMakeJokes () {
		return shark.makeJokes;
	}
	
	public boolean doClownEatOtherFish () 
	{
	    return clown.isEatOtherFish();
	}
	
	public String dolphinSwim () {
		return dolphin.swim();
	}
	
}

	interface NoSinger extends Singer {
		default public String sing () {
			String whatIamDoing = "i cannot Sing";
			return whatIamDoing;
		}
	}
	
	interface NoWalker extends Walker {
		default public String walk () {
			String whatIamDoing = "i cannot Walk";
			return whatIamDoing;
		}
	}
	
	interface Swimer {
		default public String swim () {
			String whatIamDoing = "i am Swiming";
			return whatIamDoing;
		}
	}
	
	interface NoSwimer {
		default public String swim () {
			String whatIamDoing = "Sorry, i cannot Swim";
			return whatIamDoing;
		}
	}
	
	class Fish implements NoSinger, NoWalker, Swimer {
		String size;
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		String color;
	}

	class SharkFish extends Fish {
		final boolean makeJokes = true;
		public SharkFish () {
			this.size = "large";
			this.color = "grey";
		}
		public boolean isMakeJokes() {
			return makeJokes;
		}
		
	}
	class ClownFish extends Fish {
		private final boolean eatOtherFish = true;
		public boolean isEatOtherFish() {
			return eatOtherFish;
		}
		public ClownFish () {
			this.size = "small";
			this.color = "orange";
		}
	}
	
	class Dolphin implements Swimer {
		
	}