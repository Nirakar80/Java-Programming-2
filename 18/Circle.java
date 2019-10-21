import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class Circle extends JApplet 
{
	public void init()
	{
		getContentPane().setBackground(Color.WHITE);
	}
	
	public void paint(Graphics g)
	{
		drawCircles(g, 10, 5, 300);
	}
	
	public void drawCircles(Graphics g, int n, int topXY, int size)
	{
		System.out.println("n = " + n + " topXY = " + topXY + " size = " + size);
		if ( n > 0 )
		{
			g.drawOval(topXY, topXY, size, size);
			drawCircles(g, n-1, topXY +15, size - 30);
		}
	}

	public static void main(String[] args)
	{
		
	}

}
