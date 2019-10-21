import java.util.Scanner;

public class DieExceptionDemo 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter a number of sides for your die:");
		int sideNum = in.nextInt();
		
		try
		{
			Die die = new Die(sideNum);
			System.out.println("Initial value of the die: " + die.getValue());
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("ERROR: " + e.getMessage());
		}
	}

}
