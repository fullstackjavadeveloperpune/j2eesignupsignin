package com.fullstack.model;

import java.util.Objects;

public class Employee {

	private int empId;

	private String empName;

	private double empSalary;

	private String empEmailId;

	private String empPassword;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double empSalary, String empEmailId, String empPassword) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empEmailId = empEmailId;
		this.empPassword = empPassword;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpEmailId() {
		return empEmailId;
	}

	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empEmailId="
				+ empEmailId + ", empPassword=" + empPassword + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empEmailId, empId, empName, empPassword, empSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empEmailId, other.empEmailId) && empId == other.empId
				&& Objects.equals(empName, other.empName) && Objects.equals(empPassword, other.empPassword)
				&& Double.doubleToLongBits(empSalary) == Double.doubleToLongBits(other.empSalary);
	}

}
