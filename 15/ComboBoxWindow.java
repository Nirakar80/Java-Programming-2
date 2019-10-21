import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxWindow extends JFrame 
{
	private JPanel coffeePanel;
	private JComboBox<String> coffeeBox;
	
	private JPanel selectedCoffeePanel;
	private JLabel label;
	private JTextField selectedCoffee;
	
	private String[] coffee = {"Espresso", "Dopio", "Capuccino", "Latte", "Mocha"};
	
	public ComboBoxWindow()
	{
		setTitle("Coffee Shop");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		buildCoffeePanel();
		buildSelectedCoffeePanel();
		
		pack();
		setVisible(true);
	}
	
	private void buildCoffeePanel()
	{
		coffeePanel = new JPanel();
		coffeeBox = new JComboBox<String> (coffee);
		coffeeBox.addActionListener(new itemListener());
		coffeePanel.add(coffeeBox, BorderLayout.CENTER);
		add(coffeePanel);
	}
	
	private void buildSelectedCoffeePanel()
	{
		selectedCoffeePanel = new JPanel();
		selectedCoffeePanel.setLayout(new BorderLayout());
		label = new JLabel("      Your Choice:");
		selectedCoffee = new JTextField(10);
		selectedCoffee.setEditable(false);
		selectedCoffeePanel.add(label, BorderLayout.NORTH);
		selectedCoffeePanel.add(selectedCoffee, BorderLayout.SOUTH);
		add(selectedCoffeePanel, BorderLayout.SOUTH);
	}
	
	private class itemListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			String selection = (String) coffeeBox.getSelectedItem();
			selectedCoffee.setText(selection);
		}
		
	}
	
	public static void main(String[] args) 
	{
		new ComboBoxWindow();
	}

}
