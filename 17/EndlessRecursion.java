
public class EndlessRecursion 
{
	public static void message()
	{
		System.out.println("This is a recursive method.");
		message();
	}
	
	public static void main(String[] args)
	{
		message();
	}

}
