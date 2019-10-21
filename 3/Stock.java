
public class Stock 
{
	private String symbol;
	private double sharePrice;
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	public String toString()
	{
		return "Symbol = " + symbol + " SharePrice: " + sharePrice;
	}
	
	public boolean equals(Stock object2)
	{
		if(symbol.equals(object2.getSymbol())
			&& sharePrice == object2.getSharePrice())
		{	
			return true;
		}		
		else 
		{
			return false;
		}
	}
		
	public Stock copy()
	{
		Stock copyObject= new Stock();
		copyObject.setSymbol(symbol);
		copyObject.setSharePrice(sharePrice);
		return copyObject;
	}

}
