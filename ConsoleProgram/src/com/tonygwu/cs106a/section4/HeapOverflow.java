package com.tonygwu.cs106a.section4;

import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class HeapOverflow extends ConsoleProgram {
	
	/**
	 * Boggle is a great method
	 * @param a the number of boggles you want
	 * @param b the number of times to boggle
	 * @return the number 5
	 */
	public int boggle(int a, long b) {
		return 5;
	}
	
	/**
	 * Dooda is a method for bold people.
	 * @param s the String you want to put in
	 * @param c the Arraylist that get's put in as well.
	 * @return the integer 3
	 */
	public int dooda(String s, ArrayList<Integer> c) {
		return 3;
	}
	
	
	public void run() {
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		myArray.add(3);
		myArray.add(5);
		dooda("hi there", myArray);
	}
}
