package com.ibm.tpd.primarydb.exception;

public class KafkaRetryTopicFailureException extends PrimaryDBSystemException{
	
	private static final long serialVersionUID = 1L;
	
	public KafkaRetryTopicFailureException(String errMsg) {
		super(errMsg);
	}
	
	public KafkaRetryTopicFailureException(String errCode, String errMsg) {
		super(errCode, errMsg);
	}
}
