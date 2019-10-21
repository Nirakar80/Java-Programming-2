import java.io.FileReader;
import java.io.IOException;

public class SimpleFileReader 
{

	public static void main(String[] args) 
	{
		int rawData;
		char ch;
		
		try
		{
			FileReader freader = new FileReader("GoodFile.txt");
			
			rawData = freader.read();
			while (rawData != -1)
			{
				ch = (char) rawData;
				System.out.print(ch);
				
				rawData = freader.read();
			}
		}
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}

}
