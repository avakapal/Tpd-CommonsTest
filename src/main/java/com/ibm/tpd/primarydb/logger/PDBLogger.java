package com.ibm.tpd.primarydb.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PDBLogger {

	private Logger logger; 
	
	/**
	 * @param logger
	 */
	public PDBLogger(Class<?> clazz) {
		logger = LoggerFactory.getLogger(clazz);
	}
	
	public void debug(String message) {
		this.logger.debug(message);
	}

	public void info(String message) {
		this.logger.info(message);
		this.delegateLogToELK(message);

	}

	public void error(String message) {
		this.logger.error(message);
		this.delegateLogToELK(message);
	}

	// asynchronous implementation
	public void delegateLogToELK(String message) {

	}

}
