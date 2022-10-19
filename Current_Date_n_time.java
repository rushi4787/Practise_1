package Program_practise;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Current_Date_n_time {

	public static void main(String[] args) {

		SimpleDateFormat date = new SimpleDateFormat();
		String time = date.format(new Date());
		System.out.println(time);

		System.out.println(java.time.LocalDate.now());
	

	}

}
