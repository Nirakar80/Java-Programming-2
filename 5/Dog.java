
public class Dog
{
	private String breed;
	private String color;
	private String name;
	private int age;
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		return "Breed: " + breed + "Color: " + color
				+ "Name: " + name + "Age: " + age;
	}
	
	public boolean equals(Dog object)
	{
		if(breed.equals(object.getBreed()) && 
				color.equals(object.getColor()) &&
				name.equals(object.getName()) &&
				age == object.getAge())
			return true;
		else
			return false;
	}
	
	public Dog copy()
	{
		Dog copyDog = new Dog();
		copyDog.setAge(age);
		copyDog.setBreed(breed);
		copyDog.setColor(color);
		copyDog.setName(name);
		return copyDog;
	}
}
