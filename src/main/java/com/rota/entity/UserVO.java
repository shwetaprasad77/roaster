package com.rota.entity;

import java.util.Date;

public class UserVO {

	private String user;
	private String name;
	private String password;
	private int role;
	private String team;
	private String email;
	private Date rollon_date;
	private Date rolloff_date;
	private boolean activeFlg;
	
	public UserVO(){
		
	}
	
	public UserVO(String user, String name, String password, int role, String team, String email, Date rollon_date,
			Date rolloff_date, boolean activeFlg) {
		super();
		this.user = user;
		this.name = name;
		this.password = password;
		this.role = role;
		this.team = team;
		this.email = email;
		this.rollon_date = rollon_date;
		this.rolloff_date = rolloff_date;
		this.activeFlg = activeFlg;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRollon_date() {
		return rollon_date;
	}

	public void setRollon_date(Date rollon_date) {
		this.rollon_date = rollon_date;
	}

	public Date getRolloff_date() {
		return rolloff_date;
	}

	public void setRolloff_date(Date rolloff_date) {
		this.rolloff_date = rolloff_date;
	}

	public boolean isActiveFlg() {
		return activeFlg;
	}

	public void setActive_flg(boolean activeFlg) {
		this.activeFlg = activeFlg;
	}

	@Override
	public String toString() {
		return "UserVO [user=" + user + ", name=" + name + ", password=" + password + ", role=" + role + ", team="
				+ team + ", email=" + email + ", rollon_date=" + rollon_date + ", rolloff_date=" + rolloff_date
				+ ", activeFlg=" + activeFlg + "]";
	}

	
	
	
}
