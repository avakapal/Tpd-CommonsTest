package com.ibm.tpd.primarydb.entity.request;

/**
 * @author SangitaPal
 *
 */
public abstract class InputMessageHeader {
	private String sourceMessageID;
	private int testFlag;
	private String clientAppName;
	
	/**
	 * @return the sourceMessageID
	 */
	public String getSourceMessageID() {
		return sourceMessageID;
	}
	/**
	 * @param sourceMessageID the sourceMessageID to set
	 */
	public void setSourceMessageID(String sourceMessageID) {
		this.sourceMessageID = sourceMessageID;
	}
	/**
	 * @return the testFlag
	 */
	public int getTestFlag() {
		return testFlag;
	}
	/**
	 * @param testFlag the testFlag to set
	 */
	public void setTestFlag(int testFlag) {
		this.testFlag = testFlag;
	}
	
	public String getClientAppName() {
		return clientAppName;
	}
	public void setClientAppName(String clientAppName) {
		this.clientAppName = clientAppName;
	}
}
