
public class SplitDemo1 {

	public static void main(String[] args) {
		
		String str = "one and two and three and four";
		
		String[] tokens = str.split(" and ");
		
			for (String s : tokens)
			{
				System.out.println(s);
			}
	}

}
