import javax.swing.JOptionPane;

public class PersonSearch {

	public static void main(String[] args) {
		
		String[] people = {"Cutshaw, Will", "Davis, George", "Davis, Jenny", "Russert, Phil",
				"Russell, Cindy", "Smathers, Holy", "Smith, Brad", "Williams, Jean"};
		
		String input;
		input = JOptionPane.showInputDialog("Enter the first few characters of last name.");
		
		String output = input.substring(0, 1).toUpperCase() + input.substring(1); 
		
		JOptionPane.showMessageDialog(null, "Here are the names that match.");
		for(String person : people)
		{
			if (person.startsWith(output))
			{
				JOptionPane.showMessageDialog(null, person);
			}
		}
	}
}


