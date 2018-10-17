/**
 * 
 */
package com.ibm.tpd.primarydb.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author AMRITENDUPANDA
 *
 */
public class UnitLevelFurtherAggregatedUI {

	public UnitLevelFurtherAggregatedUI(String identifier) {
		super();
		this.identifier = identifier;
	}
	
	
	public UnitLevelFurtherAggregatedUI() {}
	
	@JsonProperty("aggregatedUIs2")
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
