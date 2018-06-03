package java20180531;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextSign000 {

	public static Date nextSign(Date sign, int day) {
		// Date ---> Calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(sign);// 2016-5-8
		// 计算合同的到期时间
		//cal.add(Calendar.YEAR, -year);//2018-5-8
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		/*
		 * while (i - weekday - 1 - day <= 0) { cal.add(Calendar.MONTH, -1); i +=
		 * cal.getActualMaximum(Calendar.DAY_OF_MONTH); }
		 */

		cal.add(Calendar.DATE,day -1 - weekday );

		return cal.getTime();
	}

	public static void main(String[] args) {

		String str = "2016-5-10";
		int day=90 ;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date next = null;
		try {
			next = nextSign(sdf.parse(str), day);
			System.out.println(sdf.format(next));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
