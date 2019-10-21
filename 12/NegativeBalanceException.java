
public class NegativeBalanceException extends Exception 
{
	public NegativeBalanceException()
	{
		super("Error: Negative Starting Balance.");
	}
	
	public NegativeBalanceException(double amount)
	{
		super("Error: Negative Starting Balance " + amount + ".");
	}
}

