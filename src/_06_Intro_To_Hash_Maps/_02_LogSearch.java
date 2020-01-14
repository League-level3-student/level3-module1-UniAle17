package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * 

	 * 
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
	HashMap<Integer, String> project = new HashMap<Integer, String>();
	
	
	JFrame frame= new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	
	_02_LogSearch(){
		
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		
		button1.setText("Add Entry");
		button2.setText("Search by ID");
		button3.setText("View List");
		
		frame.setVisible(true);
		frame.pack();
		
		
		
	}
	
	public static void main(String[] args) {
		
		_02_LogSearch lsrunner = new _02_LogSearch();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==button1) {
			
			String IDNumber = JOptionPane.showInputDialog("Please enter your ID number");
			String name = JOptionPane.showInputDialog("Please enter you name");
			
			int IDnum = Integer.parseInt(IDNumber);
			
			project.put(IDnum, name);
			
		}
		
		if(e.getSource()==button2) {
			
			String IDNumberSearch = JOptionPane.showInputDialog("Please enter ID number");
			int IDNumSearch = Integer.parseInt(IDNumberSearch);
			
			for (Integer i : project.keySet()){
				
				if(IDNumSearch==i) {
					
					JOptionPane.showMessageDialog(null, project.get(i));
					
				}
				
			}
			
		}
		
		if(e.getSource()==button3) {
			
			String allValues = "";
			
			for(Integer i : project.keySet()) {
				
				allValues += i+ " "+ project.get(i);
				
			}
			
			JOptionPane.showMessageDialog(null, allValues);
			
			
		}
		
		
	}

	
}



