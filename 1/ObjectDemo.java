import java.util.Random;
import java.util.Scanner;

public class ObjectDemo {

	public static void main(String[] args) {
		
		int  maxNumbers;
		int number;
		
		Scanner in = new Scanner(System.in);
				
		Random rand = new Random();
		
		System.out.println("How many random numbers should I write?");
		maxNumbers = in.nextInt();
		
		for ( int index = 0; index < maxNumbers; index++)
		{
			number = rand.nextInt(1000);
			
			System.out.println(number);
		}
		
		System.out.println("Done");
	}

	
}
