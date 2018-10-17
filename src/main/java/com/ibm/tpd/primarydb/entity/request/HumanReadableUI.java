package com.ibm.tpd.primarydb.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HumanReadableUI {

	public HumanReadableUI(String identifier) {
		super();
		this.identifier = identifier;
	}

	public HumanReadableUI() {}
	
	@JsonProperty("upUI2")
	private String identifier;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public String toString() {
		return "HumanReadableUI [identifier=" + identifier + "]";
	}

	
}
