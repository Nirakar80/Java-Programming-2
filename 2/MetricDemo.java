import javax.swing.JOptionPane;

public class MetricDemo 
{

	public static void main(String[] args) 
	{
		String input;
		double miles;
		double kilos;
		
		input = JOptionPane.showInputDialog("Enter a distance in miles.");
		miles = Double.parseDouble(input);
		kilos = Metric.milesToKilometers(miles);
		JOptionPane.showMessageDialog(null, miles +" miles equals" + kilos + " kilometers.");
		
		input = JOptionPane.showInputDialog("Enter a distance in kilometers");
		kilos = Double.parseDouble(input);
		miles = Metric.kilometersToMiles(kilos);
		JOptionPane.showMessageDialog(null, kilos + " kilometers equals " + miles +" miles.");
		
		
	}

}
