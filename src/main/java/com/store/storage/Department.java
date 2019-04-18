package com.store.storage;

public class Department {

	String deptId;
	String deptName;
	
	public Department(String deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
