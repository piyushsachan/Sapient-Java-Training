package com.sapient.exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
	public static void main(String[] args) throws FileNotFoundException{
		readFile();
	}
	public static void readFile() throws FileNotFoundException{
		FileReader reader = new FileReader(new File("C://test.txt"));
		System.out.println("Reader is" + reader);
	}

}
