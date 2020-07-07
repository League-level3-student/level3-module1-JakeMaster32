package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();

	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.

		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */

	}

	public static void main(String[] args) {
		new _06_IPodShuffle();
		_06_IPodShuffle ipod = new _06_IPodShuffle();
		ipod.setup();

	}

	private void setup() {
		frame.add(panel);
		panel.add(button);
		button.setText("Surprise Me!");
		button.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {
		String address = "";
		Random rand = new Random();
		int x = rand.nextInt(3);
		if (x == 0) {
			address = "04 Sweater Weather.mp3";
		}
		else if (x == 1) {
			address = "04 Sweater Weather.mp3";
		}
		else {
			address = "04 Sweater Weather.mp3";
		}
		Song song = new Song(address);
song.play();
	}
}