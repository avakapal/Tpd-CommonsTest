package com.ibm.tpd.primarydb.entity.response;

import java.util.Date;

/**
 * @author SangitaPal
 *
 */
public class ErrorResponse {
	private String statusCode;
	private String statusDesc;
	private String moreInfo;
	private Date exceptionOccuredAt;
	
	public ErrorResponse() {
		
	}
	
	public ErrorResponse(String statusCode, String statusDesc, String moreInfo, Date exceptionOccuredAt) {
		this.statusCode = statusCode;
		this.statusDesc = statusDesc;
		this.moreInfo = moreInfo;
		this.exceptionOccuredAt = exceptionOccuredAt;
	}
	
	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the statusDesc
	 */
	public String getStatusDesc() {
		return statusDesc;
	}

	/**
	 * @param statusDesc the statusDesc to set
	 */
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
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

	/**
	 * @return the exceptionOccuredAt
	 */
	public Date getExceptionOccuredAt() {
		return exceptionOccuredAt;
	}

	/**
	 * @param exceptionOccuredAt the exceptionOccuredAt to set
	 */
	public void setExceptionOccuredAt(Date exceptionOccuredAt) {
		this.exceptionOccuredAt = exceptionOccuredAt;
	}
	
}
