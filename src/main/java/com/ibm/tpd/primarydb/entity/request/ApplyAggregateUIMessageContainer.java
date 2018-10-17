/**
 * 
 */
package com.ibm.tpd.primarydb.entity.request;

/**
 * @author AMRITENDUPANDA
 *
 */
public class ApplyAggregateUIMessageContainer {

	
	public ApplyAggregateUIMessageContainer(ApplyAggregateUIMessageEntity applyAUI) {
		super();
		this.applyAUI = applyAUI;
	}
	
	public ApplyAggregateUIMessageContainer() {}

	private ApplyAggregateUIMessageEntity applyAUI;

	public ApplyAggregateUIMessageEntity getApplyAUI() {
		return applyAUI;
	}

	public void setApplyAUI(ApplyAggregateUIMessageEntity applyAUI) {
		this.applyAUI = applyAUI;
	}

	@Override
	public String toString() {
		return "ApplyAggregateUIMessageContainer [applyAUI=" + applyAUI + "]";
	}
}
