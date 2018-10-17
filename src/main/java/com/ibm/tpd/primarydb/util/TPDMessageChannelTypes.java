package com.ibm.tpd.primarydb.util;

/**
 * @author SangitaPal
 *
 */
public enum TPDMessageChannelTypes {
	Ingest_BAT_Operational("Ingest_BAT_Operational", "Ingest BAT Operational channel"),
	Ingest_BAT_Retry("Ingest_BAT_Retry", "Ingest BAT Retry channel"),
	Ingest_BAT_Error("Ingest_BAT_Error", "Ingest BAT Error or Dead Letter Queue channel");
	
	private String msgChannelType;
	private String msgChannelDesc;
	
	TPDMessageChannelTypes(String msgChannelType, String msgChannelDesc ){
		this.msgChannelType = msgChannelType;
		this.msgChannelDesc =msgChannelDesc; 
	}

	public String msgChannelType() {
		return msgChannelType;
	}

	public String msgChannelDesc() {
		return msgChannelDesc;
	}
}
