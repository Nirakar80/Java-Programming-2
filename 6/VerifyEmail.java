import javax.swing.JOptionPane;

public class VerifyEmail {

	public static void main(String[] args) {
		
		char ampersand = '@';
		String dotCom = ".com";
		String dotEdu = ".edu";
		
		String emailAddress;
		emailAddress = JOptionPane.showInputDialog("Enter an email address.");
		
		int index = emailAddress.indexOf(ampersand);
		
		boolean ending = emailAddress.endsWith(dotCom) || emailAddress.endsWith(dotEdu);
		
		if (index >= 0 && ending == true)
		{
			JOptionPane.showMessageDialog(null, "This is a valid email address.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The email address is not valid.");
		}
	}

}
