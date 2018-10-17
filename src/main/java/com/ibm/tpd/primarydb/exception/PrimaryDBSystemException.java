package com.ibm.tpd.primarydb.exception;

public class PrimaryDBSystemException extends PrimaryDBException{
	
	private static final long serialVersionUID = 1L;
		
	public PrimaryDBSystemException(String errMsg) {
		super(errMsg);
	}
	
	public PrimaryDBSystemException(String errCode, String errMsg) {
		super(errCode, errMsg);
	}
}
