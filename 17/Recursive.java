
public class Recursive
{
	public static void message(int n)
	{
		if ( n > 0)
		{
			System.out.println("This is a recursive message. n = " + n);
			message(n-1);
		}
	}
	
	public static void main(String[] args) 
	{
		message(5);
	}

}
