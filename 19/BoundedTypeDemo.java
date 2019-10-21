
public class BoundedTypeDemo 
{
	public static void main(String[] args) 
	{
		Double x = new Double(5.0);
		Integer y = new Integer(10);
		
		System.out.println("Same value? " + isEqual( x, y ));
	}
	
	public static <E extends Number> boolean isEqual( E num1, E num2) 
	{
		return num1.doubleValue() == num2.doubleValue();
	}

}
