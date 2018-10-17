package com.ibm.tpd.primarydb.entity.request;

import java.io.Serializable;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author SangitaPal
 *
 */

public class ArrivalMessageEntity extends BaseMessageEntity implements Serializable{
	
	public ArrivalMessageEntity(int uiType, int productReturn, String eventTime, String arrivalComment,
			ArrayList<AggregateLevelUI> aggregateLevelUIs, ArrayList<UnitLevelUI> unitLevelUIs) {
		super();
		this.uiType = uiType;
		this.productReturn = productReturn;
		this.eventTime = eventTime;
		this.arrivalComment = arrivalComment;
		this.aggregateLevelUIs = aggregateLevelUIs;
		this.unitLevelUIs = unitLevelUIs;
	}

	public ArrivalMessageEntity() {}
	
	private static final long serialVersionUID = 1L;
	
	private int uiType;
	
	private int productReturn;
	
	private String eventTime;
	
	private String arrivalComment;
	
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

	public int getProductReturn() {
		return productReturn;
	}

	public void setProductReturn(int productReturn) {
		this.productReturn = productReturn;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getArrivalComment() {
		return arrivalComment;
	}

	public void setArrivalComment(String arrivalComment) {
		this.arrivalComment = arrivalComment;
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
		return "ArrivalMessageEntity [uiType=" + uiType + ", productReturn=" + productReturn + ", eventTime="
				+ eventTime + ", arrivalComment=" + arrivalComment + ", aggregateLevelUIs=" + aggregateLevelUIs
				+ ", unitLevelUIs=" + unitLevelUIs + "]";
	}
	
	
}