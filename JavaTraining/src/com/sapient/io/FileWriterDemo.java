package com.sapient.io;

import java.io.*;

public class FileWriterDemo {
	public static void main(String[] args) {
		File file = new File("C://Users/piysacha/Documents/text.txt");
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file, true);
			fileWriter.write("written again");
//			while(character != -1){
//				System.out.print((char)character);
//				character = fileWriter.write();
//			}
		} catch(FileNotFoundException e){
			System.out.printf("File is not present %s %n",file.getName());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception");
			e.printStackTrace();
		} finally {
			try {
				if(fileWriter != null)
					fileWriter.close();
			} catch (IOException e){
				System.out.printf("File reader cannot be closed %s %n", e.getMessage());
			}
		}
	}

}
