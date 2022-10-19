package Program_practise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date_using_simpledateformat {

	public static void main(String[] args) {
		SimpleDateFormat D= new  SimpleDateFormat();
		
		System.out.println(D.format(new Date()));

	}

}
