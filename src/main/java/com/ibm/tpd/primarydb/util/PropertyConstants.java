package com.ibm.tpd.primarydb.util;

public final class PropertyConstants {
	private PropertyConstants() {
	}

	public static String hashing_algorithm = "SHA-256";
	public static String date_format_long = "dd-MMM-yyyy HH:mm:ss:SSS z(XXX)";
	public static String date_format_precise = "dd-MMM-yyyy HH:mm:ss:SSS z";
	public static String UTC_timezone = "UTC";
	public static String date_conversion_error_message = "Can't convert to UTC date format";
	public static String msghash_generate_error_message = "Could not generate hash for the input message: ";
	public static String msghash_generate_error_code = "450";

}
