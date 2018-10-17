package com.ibm.tpd.primarydb.exception;

public class PrimaryDBBusinessException extends PrimaryDBException{
	
	private static final long serialVersionUID = 1L;
	
	public PrimaryDBBusinessException(String errMsg) {
		super(errMsg);
	}
	
	public PrimaryDBBusinessException(String errCode, String errMsg) {
		super(errCode, errMsg);
	}
}
