import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListWindow extends JFrame 
{
	private JPanel monthPanel;
	private JPanel selectedMonthPanel;
	private JList<String> monthList;
	private JTextField selectedMonth;
	private JLabel label;
	
	private String[] months = {"January", "February", "March", "April", "May", "June", "July",
				 "August", "September", "October", "November", "December"};
	
	public ListWindow()
	{
		setTitle("List Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		buildMonthPanel();
		add(monthPanel, BorderLayout.CENTER);
		buildSelectedMonthPanel();
		add(selectedMonthPanel, BorderLayout.SOUTH);		
		pack();
		setVisible(true);
	}
	
	private void buildMonthPanel()
	{
		monthPanel = new JPanel();
		monthList = new JList<String>(months);
		monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		monthList.addListSelectionListener(new ListListener());
		monthList.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		monthPanel.add(monthList);
	}
		
	private void buildSelectedMonthPanel()
	{
		selectedMonthPanel = new JPanel();
		label = new JLabel("You Selected: ");
		selectedMonth = new JTextField(10);
		selectedMonth.setEditable(false);
		selectedMonthPanel.add(label);
		selectedMonthPanel.add(selectedMonth);
	}
	

	private class ListListener implements ListSelectionListener
	{

		@Override
		public void valueChanged(ListSelectionEvent arg0) 
		{
			String selection = monthList.getSelectedValue();
			selectedMonth.setText(selection);
		}
	}
	
	public static void main(String[] args) 
	{
		new ListWindow();
	}
	
}
