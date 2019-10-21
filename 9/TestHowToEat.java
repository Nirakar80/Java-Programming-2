
public class TestHowToEat {

	public static void main(String[] args) {
		
		Edible edible;
		
		edible = new Apple();
		System.out.println(edible.howToEat());
		
		edible = new Orange();
		System.out.println(edible.howToEat());
		
		edible = new Chicken();
		System.out.println(edible.howToEat());
		
		edible = new Duck();
		System.out.println(edible.howToEat());

		edible = new Grape();
		System.out.println(edible.howToEat());
	}
	
}
