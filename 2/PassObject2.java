
public class PassObject2 
{

	public static void main(String[] args) 
	{
		Rectangle box = new Rectangle();
		
		box.setLength(30.0);
		box.setWidth(40.0);
		
		PassObject.displayRectangle(box);
		
		changeRectangle(box);
		
		PassObject.displayRectangle(box);
	}
	
	public static void changeRectangle(Rectangle rec)
	{
		rec.setLength(0.0);
		rec.setWidth(0.0);
	}

}
