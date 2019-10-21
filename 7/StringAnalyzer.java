import javax.swing.*;
public class StringAnalyzer {

	public static void main(String[] args) {
		
		String input;
		char[] array;
		int letters = 0;
		int digits = 0;
		int whitespaces = 1;
		int specialCharacters = 0;
		
		input = JOptionPane.showInputDialog("Enter a sentence: ");
		
		array = input.toCharArray();
		
		for (int i = 0; i < array.length; i++) 
		{
			if (Character.isLetter(array[i]))
				letters++;
			else if (Character.isDigit(array[i]))
				digits++;
			else if (Character.isWhitespace(array[i]))
				{
				if (Character.isWhitespace(array[i-1]))
					whitespaces--;
				else
					whitespaces++;
				}
			else 
				specialCharacters++;
			
		}
		
		JOptionPane.showMessageDialog(null,"The sentence contains "+letters+" letters, "
				+ digits + " digits, " 
				+ whitespaces + " whitespaces, and "
				+ specialCharacters + " special characters.");
	}

}
