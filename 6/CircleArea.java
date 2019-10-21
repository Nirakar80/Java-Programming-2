import javax.swing.JOptionPane;

public class CircleArea {

	public static void main(String[] args) {

		String input;
		String cont;
		double radius;
		double area;
		char choice;
		
		do {
			input = JOptionPane.showInputDialog("Enter the radius of the circle.");
			radius = Double.parseDouble(input);
			
			area = Math.PI * radius * radius;
			
			JOptionPane.showMessageDialog(null, 
					String.format("The area is %.2f.\n", area));
			
			cont = JOptionPane.showInputDialog("Do you want to do this again?(Y/N)");
			choice = cont.charAt(0);
			
		} while (Character.toUpperCase(choice) == 'Y');
		
	
	}

}
