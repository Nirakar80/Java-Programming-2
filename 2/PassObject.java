
public class PassObject 
{
	
	public static void main(String[] args) 
	{
		Rectangle box = new Rectangle();
		
		box.setLength(10.0);
		box.setWidth(20.0);
		
		displayRectangle(box);
	}

	public static void displayRectangle(Rectangle rec)
	{
		System.out.println("Length: " +rec.getLength());
		System.out.println("Width: " +rec.getWidth());
	}

}
