package com.rota.entity;

public class TaskVO {
	
	private int task;
	private String decsription;
	private String team;
	private boolean activeFlg;
	
	public TaskVO() {
		
	}
	
	public int getTask() {
		return task;
	}
	public void setTask(int task) {
		this.task = task;
	}
	public String getDecsription() {
		return decsription;
	}
	public void setDecsription(String decsription) {
		this.decsription = decsription;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public boolean isActiveFlg() {
		return activeFlg;
	}
	public void setActiveFlg(boolean activeFlg) {
		this.activeFlg = activeFlg;
	}
	
	

}
