package com.ibm.tpd.primarydb.util;

/**
 * @author SangitaPal
 *
 */
public enum TPDServiceNames {
	Ingest_Service("Ingest_Service", "Ingest Service"),
	DeactivateUI_Persist_Service("DeactivateUI_Persist_Service", "DeactivateUI Persist Service for message type 2-3"),
	ApplyUPUI_Persist_Service("ApplyUPUI_Persist_Service", "ApplyUPUI Persist Service for message type 3-1"),
	ApplyAUI_Persist_Service("ApplyAUI_Persist_Service", "ApplyAUI Persist Service for message type 3-2"),
	Dispatch_Persist_Service("Dispatch_Persist_Service", "Dispatch Persist Service for message type 3-3"),
	Arrival_Persist_Service("Arrival_Persist_Service", "Arrival Persist Service for message type 3-4"),
	Transloading_Persist_Service("Transloading_Persist_Service", "Transloading Persist Service for message type 3-5"),
	DisaggregateAUI_Persist_Service("DisaggregateAUI_Persist_Service", "DisaggregateAUI Persist Service for message type 3-6"),
	ReportDeliveryVanToRetail_Persist_Service("ReportDeliveryVanToRetail_Persist_Service", "ReportDeliveryVanToRetail Persist Service for message type 3-7"),
	IssueInvoice_Persist_Service("IssueInvoice_Persist_Service", "IssueInvoice Persist Service for message type 4-1"),
	IssueOrder_Persist_Service("IssueOrder_Persist_Service", "IssueOrder Persist Service for message type 4-2"),
	PaymentReceipt_Persist_Service("PaymentReceipt_Persist_Service", "PaymentReceipt Persist Service for message type 4-3"),
	Recall_Persist_Service("Recall_Persist_Service", "Recall Persist Service for message type 5");
	
	private String serviceName;
	private String  serviceDesc;
	
	TPDServiceNames(String serviceName, String serviceDesc ){
		this.serviceName = serviceName;
		this.serviceDesc =serviceDesc; 
	}

	public String serviceName() {
		return serviceName;
	}
    
	public String serviceDesc() {
		return serviceDesc;
	}
}
