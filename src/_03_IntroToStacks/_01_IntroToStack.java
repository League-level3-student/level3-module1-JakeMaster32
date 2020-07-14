package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack <Double> doubles = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int x = 0; x< 100; x++) {
			Random rand = new Random();
			doubles.push(rand.nextDouble()*100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		boolean c = false;
		String y = JOptionPane.showInputDialog("Enter a number between 0 and 100");
		int y1 = Integer.parseInt(y);
		String z = JOptionPane.showInputDialog("Enter a different number between 0 and 100");
		int z1 = Integer.parseInt(z);
		if (y1>z1) {
			c = true;
		}
		else {
			c = false;
		}
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for (int a = 0; a<100; a++) {
			double b = doubles.pop();
		    if (c == true) {
		    	if (b>z1 && b<y1) {
		    		System.out.println(b);
		    	}
		    }
		    else {
		    	if (b>y1 && b<z1) {
		    		System.out.println(b);
		    	}
		    }
		}
	
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
