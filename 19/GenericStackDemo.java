public class GenericStackDemo 
{
	public static void main(String[] args) 
	{
		GenericStack<String> string = new GenericStack<String>();
		string.push("New York");
		string.push("London");
		string.push("Tokyo");
		System.out.println(string.toString());
		
		GenericStack<Integer> integer = new GenericStack<Integer>();
		integer.push(2);
		integer.push(3);
		integer.push(4);
		System.out.println(integer.toString());
		
		integer.pop();
		System.out.println(integer.toString());
		
	}

}
