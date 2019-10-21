
public class PowerCalculator 
{
	public static int power(int base, int number)
	{
		int result = 1;
		
		for (int i = 1; i <= number; i ++)
		{
			result = result * base;
			System.out.println("i = " + i + ", result = "+ result);
		}
		return result;
	}
	
	public static int recursivePower(int base, int number)
	{
		int result;
		
		if (number == 0)
			result = 1;
		else 
			result = base * recursivePower(base, number - 1);
		
		return result;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("power(2,5) = " + power( 2, 5));
		System.out.println("recursivePower(2,5) = " + recursivePower(2,5));
	}

}

