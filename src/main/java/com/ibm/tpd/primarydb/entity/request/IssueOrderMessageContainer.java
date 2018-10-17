/**
 * 
 */
package com.ibm.tpd.primarydb.entity.request;

/**
 * @author AMRITENDUPANDA
 *
 */
public class IssueOrderMessageContainer {

	public IssueOrderMessageContainer(IssueOrderMessageEntity order) {
		super();
		this.order = order;
	}

	public IssueOrderMessageContainer() {}
	
	private IssueOrderMessageEntity order;

	public IssueOrderMessageEntity getOrder() {
		return order;
	}

	public void setOrder(IssueOrderMessageEntity order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "IssueOrderMessageContainer [order=" + order + "]";
	}
}
