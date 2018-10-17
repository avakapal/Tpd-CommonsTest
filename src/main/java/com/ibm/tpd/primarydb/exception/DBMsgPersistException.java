package com.ibm.tpd.primarydb.exception;

public class DBMsgPersistException extends PrimaryDBSystemException{
	
	private static final long serialVersionUID = 1L;
	
	public DBMsgPersistException(String errMsg) {
		super(errMsg);
	}
	
	public DBMsgPersistException(String errCode, String errMsg) {
		super(errCode, errMsg);
	}
}
