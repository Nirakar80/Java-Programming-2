import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFile 
{

	public static void main(String[] args) throws IOException 
	{
		int[] numbers = {2, 4, 8, 10, 12, 14, 16};
		
		FileOutputStream fstream = new FileOutputStream("Numbers.dat");
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		System.out.println("Wrting numbers to the file...");
		
		for (int i = 0; i < numbers.length; i++)
		{
			outputFile.writeInt(numbers[i]);
		}
		
		outputFile.close();
		System.out.println("Done.");
	}

}
