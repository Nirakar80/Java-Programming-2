import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MultiCatch 
{

	public static void main(String[] args) 
	{
		int number;
		int a = 1;
		
		try
		{
			File file = new File("Numbers.txt");
			Scanner in = new Scanner(file);
			
			while (in.hasNext())
			{
				try
				{
					number = in.nextInt();
					System.out.println(number);
					a++;
					
				}
				catch (InputMismatchException d)
				{
					JOptionPane.showMessageDialog(null, "Line " + a + " was not an integer.");
					in.nextLine();
				}
			}
			
			in.close();
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}

}
