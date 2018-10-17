package com.ibm.tpd.primarydb.entity.request;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author SangitaPal
 *
 */
public class ApplyUPUIMessageEntity extends BaseMessageEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	public ApplyUPUIMessageEntity() {}
	
	@JsonProperty("upUI1s")
	private ArrayList<FullLengthUI>  fullLengthUIs = new ArrayList<FullLengthUI>();
	
	@JsonProperty("upUI2s")
	private ArrayList<HumanReadableUI>  humanReadableUIs = new ArrayList<HumanReadableUI>();
	private String upUIComment;
	
	/**
	 * @return the fullLengthUIs
	 */
	public ArrayList<FullLengthUI> getFullLengthUIs() {
		return fullLengthUIs;
	}

	/**
	 * @param fullLengthUIs the fullLengthUIs to set
	 */
	public void setFullLengthUIs(ArrayList<FullLengthUI> fullLengthUIs) {
		this.fullLengthUIs = fullLengthUIs;
	}

	/**
	 * @return the humanReadableUIs
	 */
	public ArrayList<HumanReadableUI> getHumanReadableUIs() {
		return humanReadableUIs;
	}

	/**
	 * @param humanReadableUIs the humanReadableUIs to set
	 */
	public void setHumanReadableUIs(ArrayList<HumanReadableUI> humanReadableUIs) {
		this.humanReadableUIs = humanReadableUIs;
	}

	/**
	 * @return the upUIComment
	 */
	public String getUpUIComment() {
		return upUIComment;
	}

	/**
	 * @param upUIComment the upUIComment to set
	 */
	public void setUpUIComment(String upUIComment) {
		this.upUIComment = upUIComment;
	}

	@Override
	public String toString() {
		return "ApplyUPUIMessageEntity [messageHeader=" + getMessageHeader().toString() + 
				", messageType=" + getMessageType() + ", eoid=" + getEoid()
				+ ", fid=" + getFid() + ", upUIComment=" + upUIComment + ", fullLengthUIs=" + fullLengthUIs
				+ ", humanReadableUIs=" + humanReadableUIs + "]";
	}
}
