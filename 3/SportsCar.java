
public class SportsCar
{
	private CarType make;
	private CarColor color;
	private double price;
	
	public SportsCar(CarType aMake, CarColor aColor, double aPrice)
	{
		make = aMake;
		color = aColor;
		price = aPrice;
	}

	public CarType getMake() {
		return make;
	}

	public void setMake(CarType make) {
		this.make = make;
	}

	public CarColor getColor() {
		return color;
	}

	public void setColor(CarColor color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString()
	{
		return "Make: " + make + " Color: " + color + " Price: " + price;
	}
	
}
