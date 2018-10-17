package com.ibm.tpd.primarydb.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FullLengthUI {

	public FullLengthUI(String identifier) {
		super();
		this.identifier = identifier;
	}

	public FullLengthUI() {}
	
	@JsonProperty("upUI1")
	String identifier;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public String toString() {
		return "FullLengthUI [identifier=" + identifier + "]";
	}

	
}
