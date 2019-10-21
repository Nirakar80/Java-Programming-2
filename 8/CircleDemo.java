
public class CircleDemo 
{

	public static void main(String[] args) 
	{
		Point point = new Point( 80, 179);
		
		System.out.println("The location of the point is "
				+ "(" + point.getX() + ", " + point.getY() +").");
		
		Circle circle = new Circle(37, 43, 2.5);
		
		System.out.println("The location and radius is ("+
				circle.getX() + ", " + circle.getY() + "), " + circle.getRadius());
		System.out.println("The area of the circle is " + circle.getArea() + " sq. units");
	}

}
