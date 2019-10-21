import javax.swing.JOptionPane;

public class CustomerNumber {

	public static void main(String[] args) {

		String input;
		input = JOptionPane.showInputDialog("Enter a customer number in the forat LLLNNNN"
				+ "(L means letter and N means number).");
		
		if(isValid(input))
		{
			JOptionPane.showMessageDialog(null, "That is a valid Customer.");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "That is not the proper format"
					+ " for customer number.");
		}
	}

	public static boolean isValid(String custNumber)
	{
		boolean valid = true;
		
		if(custNumber.length() != 7)
		{
			valid = false;
		}
		
		int i = 0;
		
		while(valid && i < 3)
		{
			if (Character.isLetter(custNumber.charAt(i)) == false)
			{
				valid = false;
			}	
			
			i++;
		}
		
		while(valid && i < 7)
		{
			if (Character.isDigit(custNumber.charAt(i)) == false)
			{
				valid = false;
			}	
			
			i++;
		}
			
			return valid;
	}
}
