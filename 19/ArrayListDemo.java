import java.util.ArrayList;

public class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("White");
		String s = list.get(0);
		
		//list.add(new Integer(1));
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(5);
		
		ArrayList<Double> doubleList = new ArrayList<Double>();
		// 5.5 is automatically converted to new Double(5.5)
		doubleList.add(5.5);
		// 3.0 is automatically converted to new Double(5.5)
		doubleList.add(3.0);

		Double doubleObject = doubleList.get(0);
		
		double d = doubleList.get(1);
	}
}
