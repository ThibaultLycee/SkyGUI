package fr.nothing76.skygui.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataFileReader {

	private File file;
	
	public DataFileReader(File file) {
		this.file = file;
	}
	
	private String searchForField(String fieldName) {
		
		try {
			Scanner reader = new Scanner(this.file);
			boolean stop = false;
			while (reader.hasNextLine() && !stop) {
				String line = reader.nextLine();
				if (line.startsWith(fieldName)) {
					reader.close();
					stop = false;
					return line;
				}
			}
			reader.close();
			System.out.println("§5Failed to find " + fieldName + " in file " + this.file.getName());
			return null;
		} catch (FileNotFoundException e) {
			System.out.println("§5File " + this.file.getName() + " not exist");
		}
		
		return "";
	}
	
	public int getIntFromField(String fieldName) {
		
		String line = searchForField(fieldName);
		if (line != null) {
			try {
				return Integer.valueOf(line.split(" ")[1]);
			} catch (NumberFormatException e) {
				System.out.println("§5Value " + line.split(" ")[1] + " from field " + fieldName + " is not an integer");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("§5Field " + fieldName + " has no set value");
			}
		}
		
		return 0;
	}
	
}
