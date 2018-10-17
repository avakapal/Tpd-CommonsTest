package com.ibm.tpd.primarydb.exception;

public class KafkaErrorTopicFailureException extends PrimaryDBSystemException{
	
	private static final long serialVersionUID = 1L;
	
	public KafkaErrorTopicFailureException(String errMsg) {
		super(errMsg);
	}
	
	public KafkaErrorTopicFailureException(String errCode, String errMsg) {
		super(errCode, errMsg);
	}
}
