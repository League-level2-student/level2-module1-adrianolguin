package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button1 = new JButton("Add Name");
	static JButton button2 = new JButton("View Names");
	
	void createGUI() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button1);
	button1.setEnabled(true);
	button1.addActionListener(this);
	panel.add(button2);
	button2.setEnabled(true);
	button2.addActionListener(this);
	frame.pack();
	
}
	
	public static void main(String[] args) {
		
		GuestBook gb = new GuestBook();
		
		gb.createGUI();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
