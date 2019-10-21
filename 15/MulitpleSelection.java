import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;

public class MulitpleSelection extends JFrame
{
	private JScrollPane scrollPane1;
	private JList<String> dayList;
	
	private JScrollPane scrollPane2;
	private JList<String> selectedDaysList;
	
	private JButton button;
	
	private String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	public MulitpleSelection()
	{
		setTitle("List Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		buildDayPanel();
		
		buildSelectedDaysPanel();
		
		buildAddButton();
		
		pack();
		setVisible(true);
	}
	
	private void buildDayPanel()
	{
		dayList = new JList<String> (days);
		dayList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		dayList.setVisibleRowCount(4);
		scrollPane1 = new JScrollPane(dayList);
		add(scrollPane1, BorderLayout.NORTH);
	}
	
	private void buildSelectedDaysPanel()
	{
		selectedDaysList = new JList<String> ();
		selectedDaysList.setVisibleRowCount(4);
		scrollPane2 = new JScrollPane(selectedDaysList);
		add(scrollPane2, BorderLayout.CENTER);
	}
	
	private void buildAddButton()
	{
		button = new JButton("Add");
		button.addActionListener(new ButtonListener());
		add(button, BorderLayout.SOUTH);		
	}
	
	private class ButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			List<String> selections = dayList.getSelectedValuesList();
			selectedDaysList.setListData(selections.toArray(new String [0]));
		}
		
	}
	
	public static void main(String[] args)
	{
		new MulitpleSelection();
	}
}
