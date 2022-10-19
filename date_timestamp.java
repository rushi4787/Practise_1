package Program_practise;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date_timestamp {

	public static void main(String[] args) {
	Date date= new Date();
	Timestamp tp= new Timestamp(date.getTime());
	// by using Timestamp class
	System.out.println(tp);
	
	//  by using java.time package
	System.out.println(java.time.LocalDateTime.now());
	
	 
	//  by using SimpleDateFormat
	
	SimpleDateFormat D= new  SimpleDateFormat();
	
	System.out.println(D.format(new Date()));
	}

}
