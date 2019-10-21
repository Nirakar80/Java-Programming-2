import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TempConverter extends JFrame 
{
	private JLabel label1, label2;
	private JTextField fahrenheitTemp;
	private JTextField celsiusTemp;
	private JPanel fPanel, cPanel, sliderPanel;
	private JSlider slider;
	
	public TempConverter()
	{
		setTitle("Temperature Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));
		
		label1 = new JLabel("Fahrenheit: ");
		label2 = new JLabel("Celsius: ");
		
		fahrenheitTemp = new JTextField("32.0", 10);
		fahrenheitTemp.setEditable(false);
		celsiusTemp = new JTextField("0.0", 10);
		celsiusTemp.setEditable(false);
		
		slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new SliderListener());

		fPanel = new JPanel();
		fPanel.add(label1);
		fPanel.add(fahrenheitTemp);
		cPanel = new JPanel();
		cPanel.add(label2);
		cPanel.add(celsiusTemp);
		sliderPanel = new JPanel();
		sliderPanel.add(slider);
		
		add(fPanel);
		add(cPanel);
		add(sliderPanel);
		
		pack();
		setVisible(true);
	}
	
	private class SliderListener implements ChangeListener
	{

		@Override
		public void stateChanged(ChangeEvent e) 
		{
			double fahrenheit, celsius;
			celsius = slider.getValue();
			fahrenheit = celsius*(9.0 / 5.0) + 32.0;
			celsiusTemp.setText(Double.toString(celsius));
			fahrenheitTemp.setText(String.format("%.1f", fahrenheit));
		}
		
	}
	
	
	public static void main(String[] args)
	{
		new TempConverter();
	}

	
		
	

}
