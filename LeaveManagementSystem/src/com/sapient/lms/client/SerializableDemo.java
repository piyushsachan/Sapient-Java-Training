package com.sapient.lms.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.sapient.lms.model.Employee;

public class SerializableDemo {
	public static void main(String[] args) throws IOException, Exception {
		// For serialization
		Employee emp1 = new Employee(6, "Usha", "Developer");
		File file = new File("C:\\Piyush\\test.txt");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
		out.writeObject(emp1);
		out.close();
		// For deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Piyush\\test.txt"));
		Employee employee = (Employee) in.readObject();
		System.out.println(employee);
		in.close();
	}

}
