package show.value;

public class SubClass extends SuperClass {

	public void ShowValue(int arg) {
		System.out.println("SUBCLASS: the int argument was " + arg );
	}
	
	public void ShowValue(double arg) {
		System.out.println("SUBCLASS: the double argument was " + arg );
	}
} 
