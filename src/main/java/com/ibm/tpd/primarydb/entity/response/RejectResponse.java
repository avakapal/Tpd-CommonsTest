package com.ibm.tpd.primarydb.entity.response;

/**
 * @author SangitaPal
 *
 */
public class RejectResponse {
	private String messageType;
	private String primaryRepositoryID;
	private String status;
	
	public RejectResponse(String messageType, String primaryRepositoryID, String status) {
		this.messageType = messageType;
		this.primaryRepositoryID = primaryRepositoryID;
		this.status = status;
	}
	
	public RejectResponse() {

	}
	
	/**
	 * @return the messageType
	 */
	public String getMessageType() {
		return messageType;
	}
	/**
	 * @param messageType the messageType to set
	 */
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
