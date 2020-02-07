package task;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FindingWeek {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a date(dd-mm-yy).");
		String date = null;
		String d = scanner.next(date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMMM-yy");
		Date week = dateFormat.parse(d);
		System.out.println(week.getDay());
	}

}
