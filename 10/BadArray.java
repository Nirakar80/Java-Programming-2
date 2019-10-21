
public class BadArray 
{

	public static void main(String[] args) 
	{
		int[] numbers = { 1, 2, 3 };
		try
		{
			for ( int i = 0; i <= 3; i++)
			{
			System.out.println(numbers[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("There is nothing stored in index 3.");
		}
	}

}
