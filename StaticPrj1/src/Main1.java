import java.text.SimpleDateFormat;
import java.util.Date;

class MyDateUtil {
	
	static final String TARGET_DATE_PATTERN = "mm/dd/yyyy";
	
	public static String getFormattedDate(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat(TARGET_DATE_PATTERN);
		return sdf.format(d);
	}
	
}


public class Main1 {

	public static void main(String[] args) {

		Date now = new Date();
		System.out.println( now );
		
		String formattedDate = MyDateUtil.getFormattedDate(now);
		System.out.println( formattedDate );
	}

}
