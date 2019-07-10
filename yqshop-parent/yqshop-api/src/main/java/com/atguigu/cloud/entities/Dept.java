package com.atguigu.cloud.entities;

import java.io.Serializable;

public class Dept implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer deptNo;
	private String deptName;
	private String dbSource;

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDbSource() {
		return dbSource;
	}

	public void setDbSource(String dbSource) {
		this.dbSource = dbSource;
	}

	public Dept(Integer deptNo, String deptName, String dbSource) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.dbSource = dbSource;
	}

	public Dept() {
		super();
	}
}
