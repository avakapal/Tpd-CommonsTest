package com.ibm.tpd.primarydb.exception;

public class KafkaProducerException extends PrimaryDBSystemException{
	
	private static final long serialVersionUID = 1L;
	
	public KafkaProducerException(String errMsg) {
		super(errMsg);
	}
	
	public KafkaProducerException(String errCode, String errMsg) {
		super(errCode, errMsg);
	}
}
