package com.leaderment.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

public class Demo {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		//03/12/2018 5:38:39 PM GMT+09:00   07/01/2018 23:50:45 GMT+00:00 13.01.2018 22:30:29 GMT+00:00
		Locale locale=new Locale("en", "AU");
		String datetimeStr = "11/02/2019 12:20:42 PM GMT+09:00";
		SimpleDateFormat countrySDF = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a",new Locale("en", "AU"));
		datetimeStr = datetimeStr.trim().replace("\"", "");
		try {
			/*Locale[] ls = Locale.getAvailableLocales();
			 
			for (Locale aaa:ls) {
			  System.out.println("locale :"+aaa);
			}
			 */
			boolean empty = StringUtils.isEmpty(datetimeStr);
			Date parse = countrySDF.parse(datetimeStr);
			System.out.println(empty);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
