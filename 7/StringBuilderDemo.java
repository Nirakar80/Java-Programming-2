
public class StringBuilderDemo 
{
	public static void main(String[] args) 
	{
		StringBuilder str = new StringBuilder("I ate 100 blueberries.");
		System.out.println(str);
		
		str.replace(10, 14, "straw");
		System.out.println(str);
		
		str.deleteCharAt(8);
		System.out.println(str);

		str.delete(9, 14);
		System.out.println(str);
		
		str.setCharAt( 6, '5');
		System.out.println(str);
		
	}

}
