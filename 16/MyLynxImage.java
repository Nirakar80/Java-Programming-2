import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyLynxImage extends JFrame 
{
	private JPanel imagePanel;
	private JLabel imageLabel;
	
	private JPanel buttonPanel;
	private JButton button;
	private JButton reset;
	
	public MyLynxImage()
	{
		setTitle("My Lynx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		buildImagePanel();
		buildButtonPanel();
		
		pack();
		setVisible(true);
	}
	
	public void buildImagePanel()
	{
		imagePanel = new JPanel();
		imageLabel = new JLabel("Click the Button to see Lynx");
		imagePanel.add(imageLabel);
		add(imagePanel, BorderLayout.CENTER);
	}
	
	public void buildButtonPanel()
	{
		ImageIcon teaCupImage;
		teaCupImage = new ImageIcon("Teacup.png");
		
		buttonPanel = new JPanel();
		button = new JButton("Get Image");
		button.setIcon(teaCupImage);
		button.addActionListener(new ButtonListener());
		
		reset = new JButton("Reset");
		reset.addActionListener(new ResetButtonListener());
		buttonPanel.add(button);
		buttonPanel.add(reset);
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
	}
	
	public class ButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			ImageIcon lynxImage = new ImageIcon("lynx.jpeg");
			imageLabel.setIcon(lynxImage);
			imageLabel.setText("");
			pack();
		}
		
	}
	
	public class ResetButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			ImageIcon lynxImage = new ImageIcon("");
			imageLabel.setIcon(lynxImage);
			imageLabel.setText("Click the Button to see Lynx");
			pack();
		}
		
	}
	
	public static void main(String[] args) 
	{
		new MyLynxImage();
	}

}
