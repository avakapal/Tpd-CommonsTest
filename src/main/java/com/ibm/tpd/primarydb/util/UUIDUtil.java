package com.ibm.tpd.primarydb.util;

import java.util.UUID;

/**
 * @author KritiBhowmik
 * This utility class generates UUID 
 *
 */
public class UUIDUtil {

	/**
	 * @return UUID
	 * @param nil
	 * This method generates UUID
	 */
	public static UUID getUUID() {
		UUID uuid = UUID.randomUUID();
		return(uuid);
		
	}
}
