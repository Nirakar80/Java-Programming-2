
public class Rectangle extends Point 
{
	private double length;
	private double width;
	
	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	
	public Rectangle(int xValue, int yValue, double lengthValue, double widthValue)
	{
		super(xValue, yValue);
		length = lengthValue;
		width = widthValue;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public String getName() {
		return "Rectangle";
	}
	
	public double getArea() {
		return length * width;
	}
}
