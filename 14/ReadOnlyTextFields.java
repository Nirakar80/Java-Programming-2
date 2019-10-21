import java.awt.*;
import javax.swing.*;

public class ReadOnlyTextFields 
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3, 2, 5, 5));
		
		JLabel subtotalLabel = new JLabel("Subtotal");
		frame.add(subtotalLabel);
		
		JTextField subtotalField = new JTextField(10);
		subtotalField.setEditable(false);
		subtotalField.setText("100.00");
		frame.add(subtotalField);
		
		JLabel salesTaxLabel = new JLabel("Sales Tax");
		frame.add(salesTaxLabel);	
		
		JTextField salesTaxField = new JTextField(10);
		salesTaxField.setEditable(false);
		salesTaxField.setText("6.00");
		frame.add(salesTaxField);
		
		JLabel totalLabel = new JLabel("Total");
		frame.add(totalLabel);
		
		JTextField totalField = new JTextField(10);
		totalField.setEditable(false);
		totalField.setText("106.00");
		frame.add(totalField);
	
		frame.pack();
		frame.setVisible(true);
	}

}
