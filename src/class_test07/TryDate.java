package class_test07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class TryDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.getTime());
		System.out.println(date.getYear()+1900);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		String format = sdf.format(date);
		System.out.println(format);
		Date parse = sdf.parse("1996/02/23 24:12:10:789");
		System.out.println(parse);
//		Arrays.toString()
//		Arrays.sort();
//		Arrays.copyOf(,);
	}

}
