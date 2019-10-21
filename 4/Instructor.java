
public class Instructor 
{
	private String lastName;
	private String firstName;
	private String officeNumber;
	
	public Instructor(String lName, String fName, String oNum)
	{
		lastName = lName;
		firstName = fName;
		officeNumber = oNum;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	
	public String toString()
	{
		return "Last Name:" + lastName +
				", First Name: " + firstName +
				", Office Number: " + officeNumber;
	}
	
}
