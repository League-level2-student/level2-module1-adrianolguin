package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	ArrayList<String> names = new ArrayList<String>();

	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button1 = new JButton("Add Name");
	static JButton button2 = new JButton("View Names");
	static JButton button3 = new JButton("Change Name");

	void createGUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.setEnabled(true);
		button1.addActionListener(this);
		button2.setEnabled(true);
		button2.addActionListener(this);
		button3.setEnabled(true);
		button3.addActionListener(this);
		frame.pack();

	}

	public static void main(String[] args) {

		GuestBook gb = new GuestBook();

		gb.createGUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if ((JButton) e.getSource() == button1) {
			String input1 = JOptionPane.showInputDialog("Input a Name");
			names.add(input1);

		}

		if (e.getSource() == button2) {

			if (names.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Add a name please");
			} else if (names.size() == 1) {
				JOptionPane.showMessageDialog(null, "Guest #1: " + names.get(0));
			} else if (names.size() == 2) {
				JOptionPane.showMessageDialog(null, "Guest #1: " + names.get(0) + "\nGuest #2: " + names.get(1));
			} else if (names.size() == 3) {
				JOptionPane.showMessageDialog(null, "Guest #1: " + names.get(0) + "\nGuest #2: " + names.get(1) + "\nGuest #3: " + names.get(2));
			} else if (names.size() == 4) {
				JOptionPane.showMessageDialog(null, "Guest #1: " + names.get(0) + "\nGuest #2: " + names.get(1) + "\nGuest #3: " + names.get(2) + "\nGuest #4: " + names.get(3));
			} else if (names.size() == 5) {
				JOptionPane.showMessageDialog(null, "Guest #1: " + names.get(0) + "\nGuest #2: " + names.get(1) + "\nGuest #3: " + names.get(2) + "\nGuest #4: " + names.get(3) + "\nGuest #5: " + names.get(4));
			}
		}

		if (e.getSource() == button3) {
			String input2 = JOptionPane.showInputDialog("Which guest would you like to change?\nType their name.");

			int place = names.indexOf(input2);

			if (place == -1) {
				JOptionPane.showMessageDialog(null, "That person is not in the gues book");
			} else {
				String newName = JOptionPane.showInputDialog("What is the name of the new Guest");
				names.set(place, newName);
			}

		}

	}
}
