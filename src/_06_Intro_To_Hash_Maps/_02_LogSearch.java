package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	HashMap<Integer, String> hash = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton search = new JButton();
	JButton view = new JButton();
	JButton remove = new JButton();

	public static void main(String[] args) {
		_02_LogSearch object = new _02_LogSearch();
		object.setup();
	}

	void setup() {
		frame.add(panel);
		panel.add(add);
		panel.add(search);
		panel.add(view);
		panel.add(remove);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		add.setLabel("Add Entry");
		search.setLabel("Search ID");
		view.setLabel("View List");
		remove.setLabel("Remove Entry");
		add.addActionListener(this);
		search.addActionListener(this);
		view.addActionListener(this);
		remove.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			String ID1 = JOptionPane.showInputDialog("Enter an ID number");
			int ID = Integer.parseInt(ID1);
			String name = JOptionPane.showInputDialog("Enter an name");
			hash.put(ID, name);
		} else if (e.getSource() == search) {
			String searchID1 = JOptionPane.showInputDialog("Enter the ID number");
			int searchID = Integer.parseInt(searchID1);
			if (hash.containsKey(searchID)) {
				JOptionPane.showMessageDialog(null, hash.get(searchID));
			} else {
				JOptionPane.showMessageDialog(null, "Sorry, this entry does not exist");
			}
		}
		else if (e.getSource() == view){
			String all = "";
			for (Integer i : hash.keySet()) {
				all = all + "ID: "+i + " Name: " + hash.get(i) +"\n";
			}
			JOptionPane.showMessageDialog(null, all);
		}
		else {
			String removeID1 = JOptionPane.showInputDialog("Enter the ID number");
			int removeID = Integer.parseInt(removeID1);
			if (hash.containsKey(removeID)) {
				hash.remove(removeID);
			}
			else {
				JOptionPane.showMessageDialog(null, "Sorry, this entry does not exist");
			}
		}
	}
}
