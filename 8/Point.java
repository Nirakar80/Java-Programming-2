
public class Point extends Shape
{
	private int x;
	private int y;
	
	public Point()
	{
		x = 0;
		y = 0;
	}
	
	public Point(int xValue,int yValue)
	{
		x = xValue;
		y = yValue;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String getName() {
		return "Point";
	}
	
}
