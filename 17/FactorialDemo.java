import javax.swing.JOptionPane;

public class FactorialDemo 
{
	public static int factorial(int n)
	{
		
		int result = 1;
		if (n > 0)
		{
		result = n *  factorial (n-1);
		}
		
		return result;
	}
	
	public static void main(String[] args) 
	{
		String input;
		int number;
		
		input = JOptionPane.showInputDialog("Enter a non-negative number.");
		number = Integer.parseInt(input);
		
		JOptionPane.showMessageDialog(null, number + "! = " + factorial(number));
	}

}
