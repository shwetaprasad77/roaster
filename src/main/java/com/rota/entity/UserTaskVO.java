package com.rota.entity;

import java.util.Date;

public class UserTaskVO {

	private int userTask;
	private int task;
	private String user;
	private Date assignmentDate;
	private String notes;
	
	public UserTaskVO(int userTask, int task, String user, Date assignmentDate, String notes) {
		super();
		this.userTask = userTask;
		this.task = task;
		this.user = user;
		this.assignmentDate = assignmentDate;
		this.notes = notes;
	}
	
	
	public int getUserTask() {
		return userTask;
	}

	public void setUserTask(int userTask) {
		this.userTask = userTask;
	}

	public int getTask() {
		return task;
	}

	public void setTask(int task) {
		this.task = task;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Date getAssignmentDate() {
		return assignmentDate;
	}

	public void setAssignmentDate(Date assignmentDate) {
		this.assignmentDate = assignmentDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}
