
public class Circle extends Point 
{
	private double radius;
	
	public Circle()
	{
		radius = 0.0;
	}
	
	public Circle(int xValue, int yValue, double radiusValue)
	{
		super(xValue, yValue);
		radius = radiusValue;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getName() {
		return "Circle";
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
}
