/**
 * 
 */
package com.ibm.tpd.primarydb.entity.request;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author AMRITENDUPANDA
 *
 */
public class PaymentMessageEntity extends BaseMessageEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PaymentMessageEntity(int uiType, String eventTime, String paymentDate, int paymentType, double paymentAmount,
			String paymentCurrency, int payerLocationIndicator, String payerIdentity, String payerName,
			String payerAddress, String payerCountryReg, String payerTaxN, String paymentRecipient, int paymentInvoice, String invoicePaid,
			String paymentComment, ArrayList<AggregateLevelUI> aggregateLevelUIs, ArrayList<UnitLevelUI> unitLevelUIs) {
		super();
		this.uiType = uiType;
		this.eventTime = eventTime;
		this.paymentDate = paymentDate;
		this.paymentType = paymentType;
		this.paymentAmount = paymentAmount;
		this.paymentCurrency = paymentCurrency;
		this.payerLocationIndicator = payerLocationIndicator;
		this.payerIdentity = payerIdentity;
		this.payerName = payerName;
		this.payerAddress = payerAddress;
		this.payerCountryReg = payerCountryReg;
		this.payerTaxN = payerTaxN;
		this.paymentRecipient = paymentRecipient;
		this.paymentInvoice = paymentInvoice;
		this.invoicePaid = invoicePaid;
		this.paymentComment = paymentComment;
		this.aggregateLevelUIs = aggregateLevelUIs;
		this.unitLevelUIs = unitLevelUIs;
	}

	public PaymentMessageEntity() {}
	
	private int uiType;
	
	private String eventTime;
	
	private String paymentDate;
	
	private int paymentType;
	
	private double paymentAmount;
	
	private String paymentCurrency;
	
	@JsonProperty("paymentPayer1")
	private int payerLocationIndicator;
	
	@JsonProperty("paymentPayer2")
	private String payerIdentity;
	
	private String payerName;
	
	private String payerAddress;
	
	private String payerCountryReg;
	
	private String payerTaxN;
	
	private String paymentRecipient;
	
	private int paymentInvoice;
	
	private String invoicePaid;
	
	
	private String paymentComment;
	
	@JsonProperty("aUIs")
	private ArrayList<AggregateLevelUI>  aggregateLevelUIs = new ArrayList<AggregateLevelUI>();
	
	@JsonProperty("upUIs")
	private ArrayList<UnitLevelUI>  unitLevelUIs = new ArrayList<UnitLevelUI>();

	public int getUiType() {
		return uiType;
	}

	public void setUiType(int uiType) {
		this.uiType = uiType;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public int getPaymentInvoice() {
		return paymentInvoice;
	}

	public void setPaymentInvoice(int paymentInvoice) {
		this.paymentInvoice = paymentInvoice;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public int getPayerLocationIndicator() {
		return payerLocationIndicator;
	}

	public void setPayerLocationIndicator(int payerLocationIndicator) {
		this.payerLocationIndicator = payerLocationIndicator;
	}

	public String getPayerIdentity() {
		return payerIdentity;
	}

	public void setPayerIdentity(String payerIdentity) {
		this.payerIdentity = payerIdentity;
	}

	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerAddress() {
		return payerAddress;
	}

	public void setPayerAddress(String payerAddress) {
		this.payerAddress = payerAddress;
	}

	public String getPayerCountryReg() {
		return payerCountryReg;
	}

	public void setPayerCountryReg(String payerCountryReg) {
		this.payerCountryReg = payerCountryReg;
	}

	public String getPayerTaxN() {
		return payerTaxN;
	}

	public void setPayerTaxN(String payerTaxN) {
		this.payerTaxN = payerTaxN;
	}

	public String getPaymentRecipient() {
		return paymentRecipient;
	}

	public void setPaymentRecipient(String paymentRecipient) {
		this.paymentRecipient = paymentRecipient;
	}

	public String getInvoicePaid() {
		return invoicePaid;
	}

	public void setInvoicePaid(String invoicePaid) {
		this.invoicePaid = invoicePaid;
	}

	public String getPaymentComment() {
		return paymentComment;
	}

	public void setPaymentComment(String paymentComment) {
		this.paymentComment = paymentComment;
	}

	public ArrayList<AggregateLevelUI> getAggregateLevelUIs() {
		return aggregateLevelUIs;
	}

	public void setAggregateLevelUIs(ArrayList<AggregateLevelUI> aggregateLevelUIs) {
		this.aggregateLevelUIs = aggregateLevelUIs;
	}

	public ArrayList<UnitLevelUI> getUnitLevelUIs() {
		return unitLevelUIs;
	}

	public void setUnitLevelUIs(ArrayList<UnitLevelUI> unitLevelUIs) {
		this.unitLevelUIs = unitLevelUIs;
	}

	@Override
	public String toString() {
		return "PaymentMessageEntity [uiType=" + uiType + ", eventTime=" + eventTime + ", paymentDate=" + paymentDate
				+ ", paymentType=" + paymentType + ", paymentAmount=" + paymentAmount + ", paymentCurrency="
				+ paymentCurrency + ", payerLocationIndicator=" + payerLocationIndicator + ", payerIdentity="
				+ payerIdentity + ", payerName=" + payerName + ", payerAddress=" + payerAddress + ", payerCountryReg="
				+ payerCountryReg + ", payerTaxN=" + payerTaxN + ", paymentRecipient=" + paymentRecipient + ", paymentInvoice=" + paymentInvoice
				+ ", invoicePaid=" + invoicePaid + ", paymentComment=" + paymentComment + ", aggregateLevelUIs="
				+ aggregateLevelUIs + ", unitLevelUIs=" + unitLevelUIs + "]";
	}
}
