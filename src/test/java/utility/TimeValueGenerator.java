package utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeValueGenerator {
public static String getDate() {
	DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy dd MM"); // date minute year
	LocalDateTime now = LocalDateTime.now();
	String timeValue =df.format(now);
	String date = timeValue.replace(" ","-");
	return date;
}
public static String getTime() {
	DateTimeFormatter df=DateTimeFormatter.ofPattern("hh mm"); // date minute year
	LocalDateTime now = LocalDateTime.now();
	String timeValue =df.format(now);
	String time = timeValue.replace(" ",":");
	return time;
}

public static void main(String[] args) {
	String date =getDate();
	String time = getTime();
	System.out.println(date);
	System.out.println(time);
}
}
