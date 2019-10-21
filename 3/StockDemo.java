
public class StockDemo 
{

	public static void main(String[] args) 
	{
		Stock xyzCompany = new Stock();
		xyzCompany.setSymbol("XYZ");
		xyzCompany.setSharePrice(9.62);
		
		System.out.println(xyzCompany);
		
		Stock Company2 = new Stock();
		Company2.setSymbol("XYZ");
		Company2.setSharePrice(9.62);
		
		Stock Company3 = xyzCompany.copy();
		
		if ( xyzCompany == Company2)
		{
			System.out.println("Both objects are same.");
		}
		else
		{
			System.out.println("Not Same.");
		}
		
		if (xyzCompany.equals(Company2))
		{
			System.out.println("Both company have same attributes.");
		}
		else
		{
			System.out.println("Not Same.");
		}
		
		if (xyzCompany.equals(Company3))
		{
			System.out.println("Both company have same attributes.");
		}
		
	}

}
