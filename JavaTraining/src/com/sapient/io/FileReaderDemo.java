package com.sapient.io;

import java.io.*;

public class FileReaderDemo {
	public static void main(String[] args) {
		File file = new File("C://Users/piysacha/Documents/text.txt");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			int character = 0;
			character = fileReader.read();
			while(character != -1){
				System.out.print((char)character);
				character = fileReader.read();
			}
		} catch(FileNotFoundException e){
			System.out.printf("File is not present %s %n",file.getName());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception");
			e.printStackTrace();
		} finally {
			try {
				if(fileReader != null)
					fileReader.close();
			} catch (IOException e){
				System.out.printf("File reader cannot be closed %s %n", e.getMessage());
			}
		}
	}

}
