package com.ibm.tpd.primarydb.entity.response;

/**
 * @author SangitaPal
 *
 */
public class MessageHashResponse {
	private String messageHash;
	
	public MessageHashResponse(String messageHash) {
		this.messageHash = messageHash;
	}
	
	public MessageHashResponse() {
		
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
		
}
