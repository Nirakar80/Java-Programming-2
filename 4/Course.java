
public class Course {
	
	private String courseName;
	private Instructor instructor;
	private Textbook textbook;
	
	public Course( String cName, Instructor instructorObject, Textbook textbookObject)
	{
		courseName = cName;
		
		instructor = new Instructor(instructorObject.getLastName(),
				instructorObject.getFirstName(), instructorObject.getOfficeNumber());
				
		textbook = new Textbook(textbookObject.getAuthor(), 
				textbookObject.getPublisher(), textbookObject.getTitle() );
	}
		
	public String getCourseName() {
		return courseName;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public Textbook getTextbook() {
		return textbook;
	}

	public String toString()
	{
		return "Course Name: " + courseName + 
				 ", Instructor: " + instructor +
				", Textbook: " + textbook;
	}

}
