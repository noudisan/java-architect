package com.ztt.rest;

import java.io.Serializable;

public class TradeModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String startModified;
	private String endModified;
	private String status;

	public String getStartModified() {
		return startModified;
	}

	public void setStartModified(String startModified) {
		this.startModified = startModified;
	}

	public String getEndModified() {
		return endModified;
	}

	public void setEndModified(String endModified) {
		this.endModified = endModified;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
