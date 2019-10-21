
public class Sound {

	public static void main(String[] args) {
		
		Animal animal;
		
		animal = new Tiger();
		System.out.println(animal.sound());
		
		animal = new Chicken();
		System.out.println(animal.sound());
		
		animal = new Duck();
		System.out.println(animal.sound());
		
	}

}
