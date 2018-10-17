/**
 * 
 */
package com.ibm.tpd.primarydb.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author AMRITENDUPANDA
 *
 */
public class AggregateLevelUI {

	public AggregateLevelUI(String identifier) {
		super();
		this.identifier = identifier;
	}
	
	
	public AggregateLevelUI() {}
	
	@JsonProperty("aUI")
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
