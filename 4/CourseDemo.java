
public class CourseDemo {

	public static void main(String[] args) {
		
		Instructor myInstructor = 
				new Instructor("Shawn", "Kramer", "RH3010");
		
		Textbook myTextbook =
				new Textbook("Starting out with  Java", "Gaddis", "Scott/Jones");
		
		Course myCourse =
				new Course("Intro to Java", myInstructor, myTextbook);
		
		System.out.println(myCourse);
		
	}

}
