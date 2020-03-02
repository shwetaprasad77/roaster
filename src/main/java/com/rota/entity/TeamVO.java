package com.rota.entity;

public class TeamVO {
	
	private String team;
	private String description;
	private String email;
	private boolean activeFlg;
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActiveFlg() {
		return activeFlg;
	}

	public void setActiveFlg(boolean activeFlg) {
		this.activeFlg = activeFlg;
	}

	public TeamVO(String team, String description, String email, boolean activeFlg) {
		super();
		this.team = team;
		this.description = description;
		this.email = email;
		this.activeFlg = activeFlg;
	}
	
	

}
