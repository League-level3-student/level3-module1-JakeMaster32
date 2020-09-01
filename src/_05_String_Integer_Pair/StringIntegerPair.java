package _05_String_Integer_Pair;

import java.lang.reflect.Array;

public class StringIntegerPair {
	//1. create a private array of Strings called keys. Don't initialize it.
private String[] keys;
	//2. create a private array of integers called values.
private int[] values;
	StringIntegerPair(){
		//3. initialize both member arrays to a length of 0
		keys = new String[0];
		values = new int[0];
	}
	
	// 4. Complete the steps in the put method
	public void put(String key, int value) {
		//A. iterate through the keys. If you find a key that matches
		//   the passed in String, set the value at that location to the
		//   passed in value and return from the method.
		for (int x = 0; x<keys.length; x++) {
			if (keys[x].equals(key)) {
				values[x] = value;
				return;
			}
		}
		//B. create a String array that is one element longer than the keys
		String[] tempKeys = new String[keys.length+1];
		//C. create an integer array that is one element longer than values
		int[] tempValues = new int[values.length+1];
		//D. set the last element of the new String array to the passed in key
		tempKeys[tempKeys.length-1] = key;
		//E. set the last element of the new int array to the passed in value
		tempValues[tempValues.length-1] = value;
		//F. iterate through the keys and values and copy the elements to the new arrays
		for (int y = 0; y<keys.length; y++) {
			tempKeys[y] = keys[y];
		}
		for (int z = 0;z<values.length; z++) {
			tempValues[z] = values[z];
		}
		//G. Set the keys and values arrays equal to the new arrays created in steps B and C.
		keys = tempKeys;
		values = tempValues;
		//for (int b = 0; b<keys.length; b++) {
		//	System.out.println(""+keys[b]);
		//	System.out.println(""+values[b]);
		//}
	}
	
	//5. Complete the method so it returns the value located at the passed in key.
	//   If the key does not exist, return Integer.MIN_VALUE.
	public int get(String key) {
		for (int a = 0; a<keys.length; a++) {
			if (keys[a].equals(key)) {
				return values[a];
			}
		}
		return Integer.MIN_VALUE;
	}
	
	//6. Complete the containsKey method so that it returns true if the
	//   passed in keys is contained in the keys array
	public boolean containsKey(String key) {
		for (int c = 0; c<keys.length; c++) {
			if (keys[c].equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	//7. Complete the containsValue method so that it returns true if the
	//   passed in value is contained in the values array
	public boolean containsValue(int value) {
		for (int d = 0; d<values.length; d++) {
		if (values[d] == (value)) {
			return true;
		}
		
	}
		return false;
	}
	//8. Complete the getKeysMethod so it returns the keys as an array
	public String[] getKeys() {
		return keys;
	}
	
	//9. Complete the getValues so it returns the values as an array
	public int[] getValues() {
		return values;
	}
}
