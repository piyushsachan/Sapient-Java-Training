package com.sapient.date;

public class MathDemo {
	public static void main(String[] args) {
		int maxNumber = Math.max(45, 46);
		System.out.println(maxNumber);
		int minNumber = Math.min(34, 33);
		System.out.println(minNumber);
		for (int index = 0; index < 20; index++) {
			System.out.println("Random Number :" + (int)Math.ceil(Math.random()*1000));
		}
		System.out.println(Math.pow(2, 31));
	}

}
