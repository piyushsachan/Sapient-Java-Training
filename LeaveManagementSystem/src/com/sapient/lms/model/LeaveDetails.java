package com.sapient.lms.model;

public class LeaveDetails {
	private int numberOfLeaves;

	public int getNumberOfLeaves() {
		return numberOfLeaves;
	}

	public void setNumberOfLeaves(int numberOfLeaves) {
		this.numberOfLeaves = numberOfLeaves;
	}
	public LeaveDetails(){
		this.numberOfLeaves = 20;
	}
	public void updateLeaves(int leaves){
		this.numberOfLeaves = this.numberOfLeaves + leaves;
	}
}
