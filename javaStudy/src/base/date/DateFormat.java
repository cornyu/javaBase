package base.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Date d = new Date();
		String s;

		/** Date类的格式: Sat Apr 16 13:17:29 CST 2006 */
		System.out.println(d);

		System.out.println("******************************************");

		/** getDateInstance() */
		/** 输出格式: 2006-4-16 */
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date datetmp = dateformat.parse("2006-04-16");
			System.out.println(datetmp);

			
			// 初始化时设置 日期和时间模式
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(sdf.format(new Date())); 
			
			
			// 通过格式化输出日期
			java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
			Calendar cal = Calendar.getInstance();// 取当前日期。
			System.out.println("Today is:" +cal.getTime());
			System.out.println("Today is:" + format.format(cal.getTime()));
			

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
