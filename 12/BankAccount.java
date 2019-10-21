
public class BankAccount 
{
	private double balance;
	
	public BankAccount()
	{
		balance =0.0;
	}
	
	public BankAccount(double startBalance) throws NegativeBalanceException
	{
		if (startBalance < 0)
		{
			throw new NegativeBalanceException(startBalance);
		}
		balance = startBalance;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	
}
