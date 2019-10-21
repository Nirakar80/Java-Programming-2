import java.util.Random;

public class Die 
{
	private final int MIN_SIDES = 4;
	private int sides;
	private int value;
	
	public Die(int numsides)
	{
		if(numsides < MIN_SIDES)
		{
			throw new IllegalArgumentException("The die must have atleast " + MIN_SIDES + " sides.");
		}
		sides = numsides;
		roll();
	}
	
	public void roll()
	{
		Random rand = new Random();
		value = rand.nextInt(sides) + 1;
	}

	public int getSides()
	{
		return sides;
	}

	public int getValue() 
	{
		return value;
	}
	
		
}
