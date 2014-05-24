package com.tonygwu.cs106a.section4;

import acm.program.ConsoleProgram;

public class DeletingCharactersFromAString extends ConsoleProgram {
	
	/**
	 * Removes all occurrences of character ch in string str
	 * @param str the String you want to remove characters from
	 * @param ch the character to remove
	 * @return the string with occurrences of ch removed
	 * @throws IllegalArgumentException when ch is not a character
	 */
	public String removeAllOccurrences(String str, char ch) throws IllegalArgumentException {
		String modified = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c != ch) {
				modified += c;
			}
		}
		return modified;
	}

	public void run() { 
		while (true) { 
			String str = readLine("Enter a string: "); 
			if (str.length() == 0) break;
			char ch = readLine("Enter a character: ").charAt(0);
			println(removeAllOccurrences(str, ch)); 
		} 
	} 

}
