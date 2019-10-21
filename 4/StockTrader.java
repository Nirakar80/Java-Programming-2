import java.util.Scanner;

public class StockTrader 
{

	public static void main(String[] args) 
	{
		Stock xyzCompany = new Stock();
		xyzCompany.setSymbol("XYZ");
		xyzCompany.setSharePrice(9.62);
		
		System.out.println("XYZ Stock is currently "+ xyzCompany.getSharePrice());
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many shares do you want to buy?");
		int sharesToBuy = in.nextInt();
		
		StockPurchase buy = new StockPurchase(xyzCompany, sharesToBuy);
		
		
		System.out.println("Cost of the stock: "+ buy.getCost());
	}

}
