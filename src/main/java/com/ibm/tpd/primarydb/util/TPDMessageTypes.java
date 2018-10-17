package com.ibm.tpd.primarydb.util;

/**
 * @author SangitaPal
 *
 */
public enum TPDMessageTypes {
	DeactivateUI("2-3", "deactivateUI","Request for deactivation of UIs"),
	ApplyUPUI("3-1", "applyUPUI","Application of unit level UIs on unit packets"),
	ApplyAUI("3-2", "applyAUI","Application of aggregated UIs on unit packets"),
	Dispatch("3-3","dispatch", "Dispatch of tobacco products"),
	Arrival("3-4", "arrival", "Arrival of tobacco products at a facility"),
	Transloading("3-5","transLoading","Transloading of tobacco products"),
	DisaggregateAUI("3-6","disaggregateAUI","Disaggregation of aggregated UIs"),
	ReportDelivery("3-7","reportDeliveryVanToRetail","Report of delivery via vending van to retail"),
	IssueInvoice("4-1", "invoice","Issuing of invoice"),
	IssueOrderNo("4-2", "order","Issuing of Order number"),
	PaymentReceipt("4-3", "payment","Receipt of the payment"),
	Recall("5", "recall","Recall");
	
	
	private String msgType;
	private String msgShortDesc;
	private String msgDesc;
	
	
	TPDMessageTypes(String msgType, String msgShortDesc, String msgDesc ){
		this.msgType = msgType;
		this.msgShortDesc =msgShortDesc; 
		this.msgDesc = msgDesc;
		
	}

	/**
	 * @return the messageType
	 */
	public String getMsgType() {
		return msgType;
	}
	
	/**
	 * @return the msgDesc
	 */
	public String getMsgDesc() {
		return msgDesc;
	}

	/**
	 * @return the msgShortDesc
	 */
	public String getMsgShortDesc() {
		return msgShortDesc;
	}

	/**
	 * @param msgShortDesc the msgShortDesc to set
	 */
	public void setMsgShortDesc(String msgShortDesc) {
		this.msgShortDesc = msgShortDesc;
	}
	
}
