package com.tonygwu.tutoring.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class ReadingFiles extends ConsoleProgram {
	public void run() {
		try {
			FileReader fileReader = new FileReader("colt.txt");
			BufferedReader reader = new BufferedReader(fileReader);
			ArrayList<String> lines = new ArrayList<String>();
			String line;
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
			
			for (int i = 0; i < lines.size(); i++) {
				println(lines.get(i));
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
