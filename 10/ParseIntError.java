import java.text.ParseException;

public class ParseIntError 
{

	public static void main(String[] args) 
	{
		String str = "abcde";
		int number;

		try
		{
			number = Integer.parseInt(str);
		}
		catch (NumberFormatException e)
		{
			System.out.println("The variable 'str' contains alphabets.");
			System.out.println("Conveersion error: " + e.getMessage());
		}
	}

}
