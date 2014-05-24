package com.tonygwu.cs106a.section4;

import acm.program.ConsoleProgram;

public class AddCommaToString extends ConsoleProgram {
	
	private String addCommasToNumericString(String digits) {
		String modified = "";
		int j = 0;
		for (int i = digits.length() - 1; i >= 0; i--) {
			char c = digits.charAt(i);
			
			if (j > 0 && j % 3 == 0 && j < digits.length()) {
				modified = ',' + modified;
			}
			j++;
			modified = c + modified;
		}
		return modified;
	}
	
	public void run() { 
		while (true) { 
			String digits = readLine("Enter a numeric string: "); 
			if (digits.length() == 0) break; 
			println(addCommasToNumericString(digits)); 
		}
		
	} 

	
}
