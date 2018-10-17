package com.ibm.tpd.primarydb.entity.response;

/**
 * @author SangitaPal
 *
 */
public class SuccessResponse {
	private String statusCode;
	private String statusDesc;
	
	public SuccessResponse(String statusCode, String statusDesc) {
		this.statusCode = statusCode;
		this.statusDesc = statusDesc;
	}
	
	public SuccessResponse() {
		
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((statusCode == null) ? 0 : statusCode.hashCode());
		result = prime * result + ((statusDesc == null) ? 0 : statusDesc.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SuccessResponse)) {
			return false;
		}
		
		SuccessResponse other = (SuccessResponse) obj;
		
		if (statusCode == null) {
			if (other.statusCode != null) {
				return false;
			}
		} else if (!statusCode.equals(other.statusCode)) {
			return false;
		}
		
		if (statusDesc == null) {
			if (other.statusDesc != null) {
				return false;
			}
		} else if (!statusDesc.equals(other.statusDesc)) {
			return false;
		}
		
		return true;
	}
	
}
