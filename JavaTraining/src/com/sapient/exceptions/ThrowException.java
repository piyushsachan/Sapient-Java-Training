package com.sapient.exceptions;

public class ThrowException {
	public static void main(String[] args){
		try{
			throwException(args[0]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Pass the number as argument");
		}finally{
			System.out.println("Finally Block");
		}
	}
	private static void throwException(String arg){
		int age = Integer.parseInt(arg);
		if(age<18){
			throw new IllegalArgumentException("Invalid age for casting vote");
		}
	}

}
