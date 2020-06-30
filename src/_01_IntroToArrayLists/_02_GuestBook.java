package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton();
	JButton viewNames = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	String add = "";
	public static void main(String[] args) {
		_02_GuestBook book = new _02_GuestBook();
		book.setup();
	}
	private void setup() {
		frame.add(panel);
		panel.add(addName);
		panel.add(viewNames);
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500,500);
		addName.setText("Add Name");
		viewNames.setText("View Names");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(addName)) {
			add = JOptionPane.showInputDialog("Enter a name");
			names.add(add);
		}
		else {
			JOptionPane.showMessageDialog(null, "Guests: "+names);
		}
		
	}










}