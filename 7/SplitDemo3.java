
public class SplitDemo3 {

	public static void main(String[] args) {

		String str = "Jill$Bill%Holly*Michelle&Rose";
		
		String[] tokens = str.split("[$%*&]");
		
		for (String s : tokens)
		{
			System.out.println(s);
			
		}
		String a = str.join(" ", "Jill" ,"Bill", "Holly", "Michelle", "Rose" );
		System.out.println(a);
	}

}
