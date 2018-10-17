package com.ibm.tpd.primarydb.entity.request;

/**
 * @author SangitaPal
 *
 */
public abstract class BaseMessageEntity{
	private EnrichedMessageHeader messageHeader;
	private String messageType;
	private String eoid;
	private String fid;
	
	/**
	 * @return the messageHeader
	 */
	public EnrichedMessageHeader getMessageHeader() {
		return messageHeader;
	}
	/**
	 * @param messageHeader the messageHeader to set
	 */
	public void setMessageHeader(EnrichedMessageHeader messageHeader) {
		this.messageHeader = messageHeader;
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
	 * @return the eoid
	 */
	public String getEoid() {
		return eoid;
	}
	/**
	 * @param eoid the eoid to set
	 */
	public void setEoid(String eoid) {
		this.eoid = eoid;
	}
	/**
	 * @return the fid
	 */
	public String getFid() {
		return fid;
	}
	/**
	 * @param fid the fid to set
	 */
	public void setFid(String fid) {
		this.fid = fid;
	}
}
