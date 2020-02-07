package com.sapient.package3;

public class StringBufferDemo {
	public static void main(String[] ags){
		StringBuffer strBuffer = new StringBuffer();
		String result = strBuffer.append("Hello").append("World").toString();
		System.out.println(result);
	}

}
