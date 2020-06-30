package _01_IntroToArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
ArrayList<String> greetings = new ArrayList<String>();
		//2. Add five Strings to your list
		greetings.add("hi");
		greetings.add("hello");
		greetings.add("hey");
		greetings.add("howdy");
		greetings.add("sup");
		//3. Print all the Strings using a standard for-loop
		for (int x = 0; x<greetings.size(); x++) {
			System.out.println(greetings.get(x));
		}
		
		//4. Print all the Strings using a for-each loop
		for (String string : greetings) {
			System.out.println(string);
		}
		//5. Print only the even numbered elements in the list.
		for (int y = 0; y<greetings.size(); y+=2) {
			System.out.println(greetings.get(y));
		}
		//6. Print all the Strings in reverse order.
		for (int z = greetings.size()-1; z>=0; z--) {
			System.out.println(greetings.get(z));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int a = 0; a<greetings.size(); a++)
			if (greetings.get(a).contains("e")) {
				System.out.println(greetings.get(a));
			}
	}
}
