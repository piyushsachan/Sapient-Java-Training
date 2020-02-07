package com.sapient.scanner;

import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enetr a number.");
		int operand1 = scanner.nextInt();
		System.out.println("Please enetr another number.");
		int operand2 = scanner.nextInt();
		System.out.println("Please enetr the operation.");
		System.out.println("1 -> add");
		System.out.println("2 -> sub");
		System.out.println("3 -> product");
		
		int operation = scanner.nextInt();
	}

}
