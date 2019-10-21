import java.io.File;
import java.util.Scanner;

public class DirectorySize 
{
	public static void main(String[] args) 
	{
		Scanner in= new Scanner (System.in);
		System.out.print("Enter a directory:  ");
		String directory = in.nextLine();
		
		File file = new File(directory);             
		System.out.println(getSize(file) + " bytes");
	}

	public static long getSize(File file)
	{
		long bytes = 0;
		
		if(file.isDirectory())
		{
			File[] files = file.listFiles();
			for (int i = 0; files != null && i < files.length; i++)
			{
				bytes += getSize(files[i]);
			}
		}
		else 
		{
			bytes += file.length();
		}
		return bytes;
	}
}
