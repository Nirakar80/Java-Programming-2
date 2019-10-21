
public class BoxingExample {

	public static void main(String[] args) {
		
		//Create an Integer object with value 10
		Integer i = new Integer(10);
		
		//Un-boxing the Object
		int i1 = i;
		
		System.out.println("The value of i = "  + i);
		System.out.println("The value of i1 = " + i1);
		
		//Auto-boxing of char
		Character gfg = 'a';
		
		//Auto-Un-bocing of character
		char fgf = gfg;
		
		System.out.println("The value of gfg = "  + gfg);
		System.out.println("The value of fgf = " + fgf);
		
	}

}
