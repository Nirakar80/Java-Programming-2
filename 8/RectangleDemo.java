
public class RectangleDemo 
{

	public static void main(String[] args) 
	{
		Rectangle rectangle = new Rectangle( 30, 70, 6.5, 8.0);
		
		System.out.println("The location  of rectangle is: ("
				+ rectangle.getX() + ", " + rectangle.getY() +"), "
						+ "and the dimensions are: " +
				rectangle.getLength() + ", " + rectangle.getWidth());
		System.out.println("The area of rectangle is " + rectangle.getArea() +" sq. units");
	}

}
