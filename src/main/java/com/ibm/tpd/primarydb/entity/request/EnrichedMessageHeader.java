package com.ibm.tpd.primarydb.entity.request;

import java.sql.Timestamp;

/**
 * @author SangitaPal
 *
 */
public class EnrichedMessageHeader extends InputMessageHeader{
	private String primaryRepositoryID;
	private String messageHash;
	private String apiInitiatedTime;
	
	public EnrichedMessageHeader() {}
	
	
	/**
	 * @return the primaryRepositoryID
	 */
	public String getPrimaryRepositoryID() {
		return primaryRepositoryID;
	}
	/**
	 * @param primaryRepositoryID the primaryRepositoryID to set
	 */
	public void setPrimaryRepositoryID(String primaryRepositoryID) {
		this.primaryRepositoryID = primaryRepositoryID;
	}
	/**
	 * @return the messageHash
	 */
	public String getMessageHash() {
		return messageHash;
	}
	/**
	 * @param messageHash the messageHash to set
	 */
	public void setMessageHash(String messageHash) {
		this.messageHash = messageHash;
	}
	/**
	 * @return the apiInitiatedTime
	 */
	public String getApiInitiatedTime() {
		return apiInitiatedTime;
	}
	/**
	 * @param apiInitiatedTime the apiInitiatedTime to set
	 */
	public void setApiInitiatedTime(String apiInitiatedTime) {
		this.apiInitiatedTime = apiInitiatedTime;
	}
	
	@Override
	public String toString() {
		return "MessageHeader [sourceMessageID=" + getSourceMessageID() + ", testFlag=" + getTestFlag() 
				+ "primaryRepositoryID=" + primaryRepositoryID + ", messageHash=" + messageHash 
				+ ", apiInitiatedTime=" + apiInitiatedTime + ", clientAppName=" + getClientAppName() +  "]";
	}
}
