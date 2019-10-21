
public class ShapeDemo {

	public static void main(String[] args) {
		
		Shape shapes[] = new Shape[3];
		
		shapes[0] = new Point(72,115);
		shapes[1] = new Circle(36, 43, 2.0);
		shapes[2] = new Rectangle(42, 50, 6.0, 5.0);
		
		for ( int i = 0; i < shapes.length; i++)
		{
			System.out.println("The area of the " + shapes[i].getName() + " is " + shapes[i].getArea()
					+ " sq. units");
		}
	}
}
