package _04_HangMan;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(new BorderLayout());
	JLabel label = new JLabel();
	JLabel lives = new JLabel();
	String popped = "";

	void setup() {
		String y = JOptionPane
				.showInputDialog("Enter a number less than " + Utilities.getTotalWordsInFile("dictionary.txt") + 1);

		int z = Integer.parseInt(y);
		if (z > 2661) {
			JOptionPane.showMessageDialog(null, "Please don't enter a number higher than 2661");
			System.exit(0);
		}
		for (int x = 0; x < z; x++) {
			String string = Utilities.readRandomLineFromFile("dictionary.txt");
			if (!(stack.contains(string))) {
				stack.push(string);
			} else {
				x = x - 1;
			}
		}

		popped = stack.pop();
		
		int LIVES = 6;
		frame.add(panel);
		panel.add(label, BorderLayout.NORTH);
		panel.add(lives, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(300, 300);
		int length = popped.length();
		String popped2 = "               ";
		for (int a = 0; a < length; a++) {
			popped2 = popped2 + "_";
		}
		System.out.println(popped);
		System.out.println(popped2);
		label.setText(popped2);
		lives.setText("                            LIVES: "+LIVES);
		frame.addKeyListener(this);
		
	}

	Stack<String> stack = new Stack<String>();

	public static void main(String[] args) {
		HangMan man = new HangMan();
		man.setup();
	

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char character = e.getKeyChar();
		for (int b = 0; b<popped.length(); b++) {
			if (popped.charAt(b) == character) {
				if (b == 0) {
					String newString = popped.charAt(0) + label.getText().substring(1);
					label.setText(newString);
				}
				else if (b == (popped.length()-1)) {
					String newString = label.getText().substring(0, popped.length()-1) + popped.charAt(popped.length()-1);
					label.setText(newString);
					System.out.println(newString);
				}
				else { 
					String newString = label.getText().substring(0,b) + popped.charAt(b) + label.getText().substring(b+1);
					label.setText(newString);
				}
			}
		} 
		if (popped.contains(""+character)) {
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
