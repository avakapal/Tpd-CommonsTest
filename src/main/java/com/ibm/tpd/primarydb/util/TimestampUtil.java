package com.ibm.tpd.primarydb.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


/**
 * @author KritiBhowmik
 * This utility class manages various time related operations
 */


public class TimestampUtil {

	
	/**
	 * @return String
	 * @param nil
	 * this method generates current time of system timezone in String format
	 */
	public static String getCurrentTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss:SSS z(XXX)");
		Date date = Calendar.getInstance().getTime();
		return (dateFormat.format(date));
	}
	
	/**
	 * @return Date
	 * @param nil
	 * this method generates current time of system timezone in Date Format
	 */
	public static Date getCurrentTimeInDateFormat() {

		Date date = Calendar.getInstance().getTime();
		return (new Timestamp(date.getTime()));
	}

	
	/**
	 * @return Timestamp
	 * @param nil
	 * this method generates current time of system timezone in Timestamp Format
	 */
	public static Timestamp getCurrentTimeInTimestampFormat() throws IllegalArgumentException {

		Date date = Calendar.getInstance().getTime();
		return (new Timestamp(date.getTime()));

	}

	/**
	 * @return String
	 * @param Date
	 * this method converts input date to UTC format and returns value as string 
	 */
	public static String convertTimeToUTC(Date d) {
		String timeInStr = "";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss:SSS z");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		if (d != null) {
			timeInStr = sdf.format(d);
		}
		return timeInStr;
	}
	
	/**
	 * @return String
	 * @param Date
	 * this method converts input date to UTC format and returns value as string 
	 */
	public static String getCurrentTimeInUTC() {
		String timeInStr = "";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss:SSS z");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		timeInStr = sdf.format(getCurrentTimeInTimestampFormat());
		return timeInStr;
	}
	
	/**
	 * @return Timestamp
	 * @param Date
	 * this method converts input date to UTC format and returns value as Timestamp Format
	 */
	public static Timestamp convertToTimestampInUTC(Date d) {

		Timestamp timeInUTC = null;
		if (d != null) {
			LocalDateTime ldt = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
			ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.systemDefault());
			ZonedDateTime utc = zdt.withZoneSameInstant(ZoneId.of("UTC"));
			timeInUTC = Timestamp.valueOf(utc.toLocalDateTime());
		}
		return timeInUTC;

	}

	/**
	 * @return string
	 * @param Timesatmp
	 * this method converts input date to UTC format and returns value as returns value in string Format
	 */
	public static String convertTimeToUTC(Timestamp t) {
		String timeInStr = "";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss:SSS z");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		if (t != null) {
			timeInStr = sdf.format(t);
		}
		return timeInStr;
	}
	/**
	 * @return Timestamp
	 * @param Timesatmp
	 * this method convert current time of system timezone in UTC and returns value in string Format
	 */
	public static Timestamp convertToTimestampInUTC(Timestamp t) {

		Timestamp timeInUTC = null;
		if (t != null) {
			LocalDateTime ldt = t.toLocalDateTime();
			ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.systemDefault());
			ZonedDateTime utc = zdt.withZoneSameInstant(ZoneId.of("UTC"));
			timeInUTC = Timestamp.valueOf(utc.toLocalDateTime());
		}
		return timeInUTC;

	}

}
