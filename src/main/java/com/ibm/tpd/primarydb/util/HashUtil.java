package com.ibm.tpd.primarydb.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class HashUtil {

	/**
	 * @param Object
	 * @return String This method generates hash for any input object
	 * @throws NoSuchAlgorithmException
	 */
	/*
	 * public static String getHashForObject(Object input) throws
	 * NoSuchAlgorithmException {
	 * 
	 * String hashCode = ""; MessageDigest md =
	 * MessageDigest.getInstance(PropertyConstants.hashing_algorithm); // TODO if
	 * (input != null) { byte[] inputBuffer =
	 * input.toString().getBytes(StandardCharsets.US_ASCII); // TODO
	 * md.update(inputBuffer); byte[] digest = md.digest(); hashCode =
	 * encodeHex(digest); return hashCode; } return hashCode; }
	 */

	/*
	 * public static String getHash(String inputMsg) throws NoSuchAlgorithmException
	 * {
	 * 
	 * String hashCode = ""; MessageDigest md =
	 * MessageDigest.getInstance(PropertyConstants.hashing_algorithm); // TODO if
	 * (inputMsg != null) { byte[] inputBuffer =
	 * inputMsg.getBytes(StandardCharsets.US_ASCII); // TODO md.update(inputBuffer);
	 * byte[] digest = md.digest(); hashCode = encodeHex(digest); return hashCode; }
	 * return hashCode; }
	 */

	/**
	 * @param String
	 * @return String This method generates hash for String
	 * @throws NoSuchAlgorithmException
	 */

	public static String getHash(String inputMsg) throws /*NoSuchAlgorithmException, JsonSyntaxException,*/Exception {
		String hashCode = null;
		String input = null;
		JsonParser parser = new JsonParser();
		JsonElement jsonElement = parser.parse(inputMsg);
		/*
		 * System.out.println(inputMsg); System.out.println(jsonElement);
		 * System.out.println(jsonElement.isJsonObject());
		 */

		if (jsonElement.isJsonObject()) {
			input = jsonElement.toString();
		} else {
			input = inputMsg;
		}

		MessageDigest md = MessageDigest.getInstance(PropertyConstants.hashing_algorithm); // TODO
		if (input != null) {
			byte[] inputBuffer = input.getBytes(StandardCharsets.US_ASCII); // TODO
			md.update(inputBuffer);
			byte[] msgDigest = md.digest();
			hashCode = encodeHex(msgDigest);
		}

		return hashCode;
	}

	/**
	 * @param byte[]
	 * @return string This method converts byte array to hex code
	 */
	private static String encodeHex(byte[] digest) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < digest.length; i++) {
			sb.append(Integer.toString((digest[i] & 0xff) + 0x100, 16).substring(1));
		}

		return sb.toString();
	}

}
