package com.sapient.lms.model;

import java.io.Serializable;

public class Employee implements Serializable{
	private int id;
	private String name;
	private String dept;
	private LeaveDetails leaveDetails;
	public Employee(int id,String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public Employee(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return dept;
	}
	public void setDetails(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public LeaveDetails getLeaveDetails() {
		return leaveDetails;
	}
	public void setLeaveDetails(LeaveDetails leaveDetails) {
		this.leaveDetails = leaveDetails;
	}
}
