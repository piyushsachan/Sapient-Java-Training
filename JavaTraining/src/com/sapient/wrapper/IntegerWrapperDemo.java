package com.sapient.wrapper;

public class IntegerWrapperDemo {
	public static void main(String[] args){
		Integer i =45;
		String str = "45";
		int intValue = Integer.parseInt(str);
		int integerValue = i.intValue();
		
		Integer obj = Integer.valueOf(integerValue);
		System.out.println(i.MAX_VALUE);
		System.out.println(i.MIN_VALUE);
	}
}
