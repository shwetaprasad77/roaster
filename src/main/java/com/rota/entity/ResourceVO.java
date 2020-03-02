package com.rota.entity;

import java.util.Date;

public class ResourceVO {

	private int resourceId;
	private String enterpriseId;
	private String password;
	private int sapId;
	private String name;
	private int team;
	private int project;
	private int supervisorId;
	private String supervisorFlg;
	private boolean activeFlg;
	private String createdBy;
	private Date createdOn;
	private String amendedBy;
	private Date amendedOn;
	
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	public String getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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
	public String getSupervisorFlg() {
		return supervisorFlg;
	}
	public void setSupervisorFlg(String supervisorFlg) {
		this.supervisorFlg = supervisorFlg;
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
