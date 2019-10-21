import javax.swing.JOptionPane;

public class CharacterTest 
{
	public static void main(String[] args)
	{
		String input;
		char ch;
		
		input = JOptionPane.showInputDialog("Enter a single character.");
		
		ch = input.charAt(0);
		
		if (Character.isLetter(ch))
		{
			JOptionPane.showMessageDialog(null, "That is a letter.");
		}
		
		if (Character.isDigit(ch))
		{
			JOptionPane.showMessageDialog(null, "That is a digit.");
		}
		
		if (Character.isLowerCase(ch))
		{
			JOptionPane.showMessageDialog(null, "That is a lower case.");
		}
		
		if (Character.isUpperCase(ch))
		{
			JOptionPane.showMessageDialog(null, "That is a upper case.");
		}
		
		if (Character.isSpaceChar(ch))
		{
			JOptionPane.showMessageDialog(null, "That is a space.");
		}
		
		if (Character.isLetterOrDigit(ch))
		{
			JOptionPane.showMessageDialog(null, "That is a letter or a digit.");
		}
		
	}
}
