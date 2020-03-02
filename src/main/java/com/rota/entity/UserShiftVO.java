package com.rota.entity;

import java.util.Date;

public class UserShiftVO {

	private int userShift;
	private int shiftOncall;
	private int sequence;
	private String user;
	private Date assignFrom;
	private Date assignTo;
	
	public UserShiftVO(int userShift, int shiftOncall, int sequence, String user, Date assignFrom, Date assignTo) {
		super();
		this.userShift = userShift;
		this.shiftOncall = shiftOncall;
		this.sequence = sequence;
		this.user = user;
		this.assignFrom = assignFrom;
		this.assignTo = assignTo;
	}
	
	public int getUserShift() {
		return userShift;
	}

	public void setUserShift(int userShift) {
		this.userShift = userShift;
	}

	public int getShiftOncall() {
		return shiftOncall;
	}

	public void setShiftOncall(int shiftOncall) {
		this.shiftOncall = shiftOncall;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Date getAssignFrom() {
		return assignFrom;
	}

	public void setAssignFrom(Date assignFrom) {
		this.assignFrom = assignFrom;
	}

	public Date getAssignTo() {
		return assignTo;
	}

	public void setAssignTo(Date assignTo) {
		this.assignTo = assignTo;
	}
	
	
	
}
