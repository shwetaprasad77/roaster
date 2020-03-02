package com.rota.entity;

import java.util.Date;

public class ConstantVO {

	private int constant;
	private String key;
	private String name;
	private boolean activeFlg;
	private String createdBy;
	private Date createdOn;
	private String amendedBy;
	private Date amendedOn;
	public int getConstant() {
		return constant;
	}
	public void setConstant(int constant) {
		this.constant = constant;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getActiveFlg() {
		return activeFlg;
	}
	public void setActiveFlg(boolean activeFlg) {
		this.activeFlg = activeFlg;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getAmendedBy() {
		return amendedBy;
	}
	public void setAmendedBy(String amendedBy) {
		this.amendedBy = amendedBy;
	}
	public Date getAmendedOn() {
		return amendedOn;
	}
	public void setAmendedOn(Date amendedOn) {
		this.amendedOn = amendedOn;
	}
	
	
}
