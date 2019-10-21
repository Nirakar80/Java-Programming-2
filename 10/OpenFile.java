import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class OpenFile 
{

	public static void main(String[] args) 
	{
		File file;
		Scanner in;
		String fileName;
		
		fileName = JOptionPane.showInputDialog("Enter the name of a file.");
		
		try
		{
			file = new File(fileName);
			in = new Scanner(file);
		}
		
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "The file was not found.");
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		JOptionPane.showMessageDialog(null, "Done.");
	}

}
