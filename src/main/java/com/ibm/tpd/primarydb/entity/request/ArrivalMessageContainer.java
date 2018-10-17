/**
 * 
 */
package com.ibm.tpd.primarydb.entity.request;

/**
 * @author AMRITENDUPANDA
 *
 */
public class ArrivalMessageContainer {

	public ArrivalMessageContainer(ArrivalMessageEntity arrival) {
		super();
		this.arrival = arrival;
	}

	public ArrivalMessageContainer() {}
	
	private ArrivalMessageEntity arrival;

	public ArrivalMessageEntity getArrival() {
		return arrival;
	}

	public void setArrival(ArrivalMessageEntity arrival) {
		this.arrival = arrival;
	}

	@Override
	public String toString() {
		return "ArrivalMessageContainer [arrival=" + arrival + "]";
	}
}
