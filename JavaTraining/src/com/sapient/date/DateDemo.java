package com.sapient.date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println(currentDate.getDate());
		System.out.println(currentDate.getMonth()+1);
		System.out.println(currentDate.getDay());
		System.out.println("Date >> "+ currentDate);
		//changing formats for date
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMMM-yy");
		System.out.println("Date >> "+ dateFormat.format(currentDate));
	}

}
