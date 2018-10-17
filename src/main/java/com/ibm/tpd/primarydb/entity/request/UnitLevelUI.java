/**
 * 
 */
package com.ibm.tpd.primarydb.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author AMRITENDUPANDA
 *
 */
public class UnitLevelUI {

	public UnitLevelUI(String identifier) {
		super();
		this.identifier = identifier;
	}

	public UnitLevelUI() {}
	
	@JsonProperty("upUI")
	private String identifier;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public String toString() {
		return "UnitLevelUI [identifier=" + identifier + "]";
	}
	
	
}
