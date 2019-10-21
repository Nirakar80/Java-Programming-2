import java.util.ArrayList;

public class AnyWildCardDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(-2);
		
		print(intList);
	}
	
	public static void print(ArrayList<?> list)
	{
		for ( int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
	}

}
