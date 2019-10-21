
public class SplitDemo2 {

	public static void main(String[] args) {

		String email = "nshrestha@caldwell.edu";
		
		String[] tokens = email.split("[@.]");
		
		for ( String s : tokens)
		{
			System.out.println(s);
		}
		
	}

}
