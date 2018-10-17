/**
 * 
 */
package com.ibm.tpd.primarydb.entity.request;

/**
 * @author AMRITENDUPANDA
 *
 */
public class PaymentMessageContainer {

	public PaymentMessageContainer(PaymentMessageEntity payment) {
		super();
		this.payment = payment;
	}

	public PaymentMessageContainer() {}
	
	private PaymentMessageEntity payment;

	public PaymentMessageEntity getPayment() {
		return payment;
	}

	public void setPayment(PaymentMessageEntity payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "PaymentMessageContainer [payment=" + payment + "]";
	}
}
