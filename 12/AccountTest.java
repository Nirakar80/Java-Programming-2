
public class AccountTest 
{

	public static void main(String[] args) 
	{
			try 
			{
				BankAccount checking = new BankAccount(100.0);
				System.out.println("Checking balance is $" + checking.getBalance());
				
				BankAccount saving = new BankAccount(-100.0);
				System.out.println("Savings balance is $" + saving.getBalance());
			} 
			catch (NegativeBalanceException e) 
			{
				System.out.println(e.getMessage()) ;
			}
		
	}

}
