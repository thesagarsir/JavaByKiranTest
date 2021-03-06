package com.test.SpringBottwithHibernate.Entity;
// Generated May 26, 2020 3:23:43 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "employee", catalog = "employee_master")
public class Employee implements java.io.Serializable {

	private Integer empId;
	private String empName;
	private int empAge;
	private String status;

	public Employee() {
	}

	public Employee(String empName, int empAge) {
		this.empName = empName;
		this.empAge = empAge;
	}

	public Employee(String empName, int empAge, String status) {
		this.empName = empName;
		this.empAge = empAge;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "emp_id", unique = true, nullable = false)
	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Column(name = "emp_name", nullable = false, length = 45)
	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Column(name = "emp_age", nullable = false)
	public int getEmpAge() {
		return this.empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	@Column(name = "status", length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
