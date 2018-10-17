/**
 * 
 */
package com.ibm.tpd.primarydb.entity.request;

/**
 * @author AMRITENDUPANDA
 *
 */
public class ApplyUPUIMessageContainer {

	public ApplyUPUIMessageContainer(ApplyUPUIMessageEntity applyUPUI) {
		super();
		this.applyUPUI = applyUPUI;
	}

	public ApplyUPUIMessageContainer() {}
	
	private ApplyUPUIMessageEntity applyUPUI;

	public ApplyUPUIMessageEntity getApplyUPUI() {
		return applyUPUI;
	}

	public void setApplyUPUI(ApplyUPUIMessageEntity applyUPUI) {
		this.applyUPUI = applyUPUI;
	}

	@Override
	public String toString() {
		return "ApplyUPUIMessageContainer [applyUPUI=" + applyUPUI + "]";
	}
}
