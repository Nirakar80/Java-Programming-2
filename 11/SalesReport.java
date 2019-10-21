import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SalesReport 
{

	public static void main(String[] args)
	{
		String filename = "SalesData.txt";
		int months = 0;
		double oneMonth;
		double total = 0.0;
		double average;
		
		try
		{
			File file = new File(filename);
			Scanner in = new Scanner(file);
			
			while(in.hasNext()) 
			{
				try
				{
					oneMonth = in .nextDouble();
					total += oneMonth;
					months++;
				}
				catch (InputMismatchException d)
				{
					JOptionPane.showMessageDialog(null, "The line was not a double variable");
					in.nextLine();
				}
			}
			
			in.close();
		
			average = total / months;
			
			JOptionPane.showMessageDialog(null, "Number of months: " + months +
					" Total sales: " + total
					+ " Average sales per month: " + average);
		}
		catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
