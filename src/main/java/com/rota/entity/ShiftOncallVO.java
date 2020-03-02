package com.rota.entity;

public class ShiftOncallVO {
	
	private int shiftOncall;
	private String decsription;
	private String team;
	private boolean activeFlg;
	public ShiftOncallVO(int shiftOncall, String decsription, String team, boolean activeFlg) {
		super();
		this.shiftOncall = shiftOncall;
		this.decsription = decsription;
		this.team = team;
		this.activeFlg = activeFlg;
	}
	
	public int getShiftOncall() {
		return shiftOncall;
	}
	public void setShiftOncall(int shiftOncall) {
		this.shiftOncall = shiftOncall;
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
