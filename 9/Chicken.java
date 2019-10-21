
public class Chicken extends Animal implements Edible {

	@Override
	public String howToEat() {
		return "Chicken: chicken curry.";
	}

	@Override
	public String sound() {
		return "Chicken: Cock-a-doodle.";
	}

}
