
public class Duck extends Animal implements Edible {

	@Override
	public String howToEat() {
		return "Duck: fry it";
	}

	@Override
	public String sound() {
		return "Duck: Quack";
	}

}
