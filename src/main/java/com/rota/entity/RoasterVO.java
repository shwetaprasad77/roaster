package com.rota.entity;

import java.util.Date;

public class RoasterVO {

	private int resource;
	private String enterprise;
	private String password;
	private int sapId;
	private String name;
	private int team;
	private int project;
	private int supervisorId;
	private boolean supervisorFlg;
	private boolean activeFlg;
	private String createdBy;
	private Date createdOn;
	private String amendedBy;
	private Date amendedOn;
	
	public int getResource() {
		return resource;
	}
	public void setResource(int resource) {
		this.resource = resource;
	}
	public String getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSapId() {
		return sapId;
	}
	public void setSapId(int sapId) {
		this.sapId = sapId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team = team;
	}
	public int getProject() {
		return project;
	}
	public void setProject(int project) {
		this.project = project;
	}
	public int getSupervisorId() {
		return supervisorId;
	}
	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}
	public boolean isSupervisorFlg() {
		return supervisorFlg;
	}
	public void setSupervisorFlg(boolean supervisorFlg) {
		this.supervisorFlg = supervisorFlg;
	}
	public boolean isActiveFlg() {
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
