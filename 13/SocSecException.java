
public class SocSecException extends Exception 
{
	private String error;
	
	public SocSecException()
	{
		super("Error: Invalid SSN");
	}
	
	public SocSecException(String ssn)
	{
		super(ssn);
	}
}
