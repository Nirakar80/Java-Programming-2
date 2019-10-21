import java.util.ArrayList;

public class LargetNumber {

	public static void main(String[] args) 
	{
		ArrayList<Number> list = new ArrayList<Number>();
		
		list.add( 45 );
		
		list.add(7080.79);
		
		list.add(new Long("3445"));
		
		list.add(new Float("2.0219301930"));
		
		System.out.println("The largest number is "+ getLargestNumber(list));
	}

	public static Number getLargestNumber(ArrayList<Number> list)
	{
		Number largest = list.get(0);
		
		for (int i = 1; i < list.size(); i++)
		{
			if (largest.doubleValue() < list.get(i).doubleValue())
			{
				largest = list.get(i);
			}
		}
	return largest;
	}
}
