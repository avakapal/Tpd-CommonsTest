/**
 * 
 */
package com.ibm.tpd.primarydb.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author AMRITENDUPANDA
 *
 */
public class UnitLevelAggregatedUI {

	public UnitLevelAggregatedUI(String identifier) {
		super();
		this.identifier = identifier;
	}
	
	
	public UnitLevelAggregatedUI() {}
	
	@JsonProperty("aggregatedUIs1")
	private String identifier;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public String toString() {
		return "AggregateLevelUI [identifier=" + identifier + "]";
	}
}
