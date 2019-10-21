
public class StockPurchase 
{
	private Stock stock;
	private int shares;
	
	public StockPurchase(Stock stockObject, int numShares)
	{
		stock = new Stock();
		stock.setSymbol(stockObject.getSymbol());
		stock.setSharePrice(stockObject.getSharePrice());
		shares = numShares;
	}

	public Stock getStock() 
	{
		return stock;
	}

	public int getShares() 
	{
		return shares;
	}
	
	public double getCost()
	{
		return shares*stock.getSharePrice();
	}
}
