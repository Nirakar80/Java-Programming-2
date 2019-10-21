import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DogDemo 
{	
	enum Breed {} 
	enum Color { BLACK, WHITE, GREY, BROWN, MIX}

	public static void main(String[] args) 
	{
		String Breed = (String) JOptionPane.showInputDialog(null,
				"Choose a Breed", "The Dog Breed you want",
				JOptionPane.QUESTION_MESSAGE, null,
				DogBreed.breeds(), DogBreed.breeds()[0] ); 
		
		String Color = (String) JOptionPane.showInputDialog(null,
				" Choose a Color", "The Dog Color you want", 
				JOptionPane.QUESTION_MESSAGE, null,
				DogColor.colors(), DogColor.colors()[1]);
		
		String Name = JOptionPane.showInputDialog(null, 
				"What is your Dog's name?");
		
		String sAge = JOptionPane.showInputDialog(null,
				"What is your Dog's age?");
		
		int Age = Integer.parseInt(sAge);
		
		
		Dog dog = new Dog();
		dog.setBreed(Breed);
		dog.setColor(Color);
		dog.setName(Name);
		dog.setAge(Age);
				
		JOptionPane jopt = new JOptionPane();
	    String result;
	    result = "Breed: " + dog.getBreed()
		+"   Color: " + dog.getColor() +  "   Name: " + dog.getName()
		+"   Age: " + dog.getAge();
	    JLabel resLabel = new JLabel(result);
	    resLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
	    jopt.showMessageDialog( null, resLabel, "Results",
	    		JOptionPane.PLAIN_MESSAGE );
	
	}
	

}
