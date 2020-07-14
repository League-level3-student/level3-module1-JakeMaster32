package _03_IntroToStacks;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<Character> deleted = new Stack<Character>();

	public static void main(String[] args) {
		_02_TextUndoRedo object = new _02_TextUndoRedo();
		object.setup();
	}

	void setup() {
		frame.add(panel);
		panel.add(label);
		label.setText("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		frame.addKeyListener(this);
	}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {
		if (!(e.getKeyChar() == KeyEvent.VK_DELETE) || !(e.getKeyChar() == KeyEvent.VK_LEFT)) {

			label.setText(label.getText() + e.getKeyChar());

		} else if (e.getKeyChar() == KeyEvent.VK_DELETE) {

			deleted.push(label.getText().charAt(label.getText().length() - 1));

			label.setText(label.getText().substring(0, label.getText().length() - 2));
			System.out.println(label.getText().substring(0, label.getText().length() - 2));
		}
		else if (e.getKeyChar()== KeyEvent.VK_LEFT){
			label.setText(label.getText()+deleted.pop());
		}
	}

	public void keyReleased(KeyEvent e) {

	}
}
