package com.rota.entity;

public class SequenceVO {
	
	private int sequence;
	private String status;
	
	public SequenceVO(int sequence, String status) {
		super();
		this.sequence = sequence;
		this.status = status;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
