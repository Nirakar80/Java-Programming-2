import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWriter 
{

	public static void main(String[] args) 
	{
		String output = "Go with the Flow!";
		int rawData;
		
		try
		{
			FileWriter fwriter = new FileWriter("NewFile.txt");
			
			for (int i = 0; i < output.length() ; i++)
			{
				rawData = (int)output.charAt(i);
				
				fwriter.write(rawData);
			}
			
			fwriter.close();
		}
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}

}
