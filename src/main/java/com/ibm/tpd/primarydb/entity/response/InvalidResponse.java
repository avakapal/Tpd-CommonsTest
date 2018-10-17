package com.ibm.tpd.primarydb.entity.response;

/**
 * @author SangitaPal
 *
 */
public class InvalidResponse {
	private String httpCode;
	private String httpMessage;
	private String moreInfo;
	
	public InvalidResponse(String httpCode, String httpMessage, String moreInfo) {
		this.httpCode = httpCode;
		this.httpMessage = httpMessage;
		this.moreInfo = moreInfo;
	}
	
	public InvalidResponse() {

	}
	
	/**
	 * @return the httpCode
	 */
	public String getHttpCode() {
		return httpCode;
	}

	/**
	 * @param httpCode the httpCode to set
	 */
	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	/**
	 * @return the httpMessage
	 */
	public String getHttpMessage() {
		return httpMessage;
	}

	/**
	 * @param httpMessage the httpMessage to set
	 */
	public void setHttpMessage(String httpMessage) {
		this.httpMessage = httpMessage;
	}

	/**
	 * @return the moreInfo
	 */
	public String getMoreInfo() {
		return moreInfo;
	}

	/**
	 * @param moreInfo the moreInfo to set
	 */
	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}
	
}
