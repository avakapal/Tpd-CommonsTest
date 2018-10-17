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
public class IssueOrderMessageEntity extends BaseMessageEntity implements Serializable{

	public IssueOrderMessageEntity(int uiType, int productReturn, String eventTime, String orderDate,
			String orderNumber, String orderComment, ArrayList<AggregateLevelUI> aggregateLevelUIs,
			ArrayList<UnitLevelUI> unitLevelUIs) {
		super();
		this.uiType = uiType;
		this.eventTime = eventTime;
		this.orderDate = orderDate;
		this.orderNumber = orderNumber;
		this.orderComment = orderComment;
		this.aggregateLevelUIs = aggregateLevelUIs;
		this.unitLevelUIs = unitLevelUIs;
	}

	
	public IssueOrderMessageEntity() {}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int uiType;
	
	private String eventTime;
	
	private String orderDate;
	
	private String orderNumber;
	
	private String orderComment;
	
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

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderComment() {
		return orderComment;
	}

	public void setOrderComment(String orderComment) {
		this.orderComment = orderComment;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "IssueOrderMessageEntity [uiType=" + uiType +  ", eventTime="
				+ eventTime + ", orderDate=" + orderDate + ", orderNumber=" + orderNumber + ", orderComment="
				+ orderComment + ", aggregateLevelUIs=" + aggregateLevelUIs + ", unitLevelUIs=" + unitLevelUIs + "]";
	}
	
}
