package com.ibm.tpd.primarydb.exception;

public class InvalidMessageTypeException extends PrimaryDBSystemException{
	
	private static final long serialVersionUID = 1L;
	
	public InvalidMessageTypeException(String errMsg) {
		super(errMsg);
	}
	
	public InvalidMessageTypeException(String errCode, String errMsg) {
		super(errCode, errMsg);
	}
}
