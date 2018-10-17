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
public class ApplyAggregateUIMessageEntity extends BaseMessageEntity implements Serializable{

	public ApplyAggregateUIMessageEntity(String eventTime, String aUI, int aggregationType,
			ArrayList<UnitLevelAggregatedUI> initialAggregatedUIs,
			ArrayList<UnitLevelFurtherAggregatedUI> furtherAggregatedUIs, String aUIComment) {
		super();
		this.eventTime = eventTime;
		this.aggregatedUI = aUI;
		this.aggregationType = aggregationType;
		this.initialAggregatedUIs = initialAggregatedUIs;
		this.furtherAggregatedUIs = furtherAggregatedUIs;
		this.aggregatedUIComment = aUIComment;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApplyAggregateUIMessageEntity() {}
	
	private String eventTime;
	
	@JsonProperty("aUI")
	private String aggregatedUI;
	
	private int aggregationType;
	
	@JsonProperty("aggregatedUIs1s")
	private ArrayList<UnitLevelAggregatedUI> initialAggregatedUIs = new ArrayList<UnitLevelAggregatedUI>();
	
	@JsonProperty("aggregatedUIs2s")
	private ArrayList<UnitLevelFurtherAggregatedUI> furtherAggregatedUIs = new ArrayList<UnitLevelFurtherAggregatedUI>();
	
	private String aggregatedUIComment;

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getAggregatedUI() {
		return aggregatedUI;
	}

	public void setAggregatedUI(String aggregatedUI) {
		this.aggregatedUI = aggregatedUI;
	}

	public int getAggregationType() {
		return aggregationType;
	}

	public void setAggregationType(int aggregationType) {
		this.aggregationType = aggregationType;
	}

	public ArrayList<UnitLevelAggregatedUI> getInitialAggregatedUIs() {
		return initialAggregatedUIs;
	}

	public void setInitialAggregatedUIs(ArrayList<UnitLevelAggregatedUI> initialAggregatedUIs) {
		this.initialAggregatedUIs = initialAggregatedUIs;
	}

	public ArrayList<UnitLevelFurtherAggregatedUI> getFurtherAggregatedUIs() {
		return furtherAggregatedUIs;
	}

	public void setFurtherAggregatedUIs(ArrayList<UnitLevelFurtherAggregatedUI> furtherAggregatedUIs) {
		this.furtherAggregatedUIs = furtherAggregatedUIs;
	}

	public String getAggregatedUIComment() {
		return aggregatedUIComment;
	}

	public void setAggregatedUIComment(String aggregatedUIComment) {
		this.aggregatedUIComment = aggregatedUIComment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ApplyAggregateUIMessageEntity [eventTime=" + eventTime + ", aUI=" + aggregatedUI + ", aggregationType="
				+ aggregationType + ", initialAggregatedUIs=" + initialAggregatedUIs + ", furtherAggregatedUIs="
				+ furtherAggregatedUIs + ", aUIComment=" + aggregatedUIComment + "]";
	}
}
