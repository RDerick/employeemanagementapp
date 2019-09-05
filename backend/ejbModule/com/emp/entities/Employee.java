package com.emp.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the employees database table.
 * 
 */
@Entity
@Table(name="employees")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="emp_id")
	private int empId;

	@Column(name="emp_name")
	private String empName;

	@Column(name="emp_salary")
	private BigDecimal empSalary;

	@Column(name="emp_surname")
	private String empSurname;

	public Employee() {
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public BigDecimal getEmpSalary() {
		return this.empSalary;
	}

	public void setEmpSalary(BigDecimal empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpSurname() {
		return this.empSurname;
	}

	public void setEmpSurname(String empSurname) {
		this.empSurname = empSurname;
	}

}