package com.ibm.tpd.primarydb.exception;

public class KafkaConsumerException extends PrimaryDBSystemException{
	
	private static final long serialVersionUID = 1L;
	
	public KafkaConsumerException(String errMsg) {
		super(errMsg);
	}
	
	public KafkaConsumerException(String errCode, String errMsg) {
		super(errCode, errMsg);
	}
}
