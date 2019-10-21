import javax.swing.JOptionPane;

public class SocSecProcessor 
{

	public static void main(String[] args) 	{
		String choice;
		
		do
		{
			String firstname = JOptionPane.showInputDialog("Enter your name: ");
			String ssn = JOptionPane.showInputDialog("Enter your Social Security Number: ");
		
			try
			{
				if (isValid(ssn))
				{
					JOptionPane.showMessageDialog(null, "Name: " + firstname + "\nSSN: " + ssn + "\nThe SSN is a valid one.");
				}
			}
			catch (SocSecException e)
			{
				JOptionPane.showMessageDialog(null, "Name: " + firstname + "\nSSN: " + ssn + "\n" + e.getMessage());
			}
		
			choice = JOptionPane.showInputDialog("Do you want to enter again?(Y/N)");
			
		} while (choice.toUpperCase().charAt(0) != 'N');
		
		
	}

	public static boolean isValid(String SSN) throws SocSecException
	{
		boolean result = false;
		
		if (SSN.length() == 11)
		{
			result= true;
		}
		else
		{
			result = false;
			throw new SocSecException("The number of characters is not equal to 11.");
		}
		
		if (result && SSN.charAt(3) =='-' && SSN.charAt(6) == '-' )
		{
			result = true;
		}
		else
		{
			result = false;
			throw new SocSecException("The dashes are not in the right place.");
		}
		
		for ( int i = 0; i < SSN.length(); i++)
		{
			char a = SSN.charAt(i);
			
			if ( a != SSN.charAt(3) && a != SSN.charAt(6))
			{
				if (a != SSN.charAt(3) && a != SSN.charAt(6) &&  Character.isDigit(a))
				{
					result = true;
				}
				else
				{
					result = false;
					throw new SocSecException("There is a character that is not digit or '-'.");
				}
			}
		}
		
		return result;
	}
}
