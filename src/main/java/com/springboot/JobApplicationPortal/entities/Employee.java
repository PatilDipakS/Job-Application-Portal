package com.springboot.JobApplicationPortal.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name ="Emp_Name")
	String empName;
	
	@Column(name ="Emp_Email")
	String empEmail;
	
	@Column(name ="Emp_Mobile")
	String empMobile;
	
	@Column(name ="Emp_Designation")
	String empDesignation;
	
	@Column(name ="Emp_Resume")
	String empResume;
	
	@Column(name ="Emp_Tick")
	String empTick;

	
	public Employee() {
		super();
	}
	
	
	public Employee(Long id, String empName, String empEmail, String empMobile, String empDesignation, String empResume,
			String empTick) {
		super();
		this.id = id;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empMobile = empMobile;
		this.empDesignation = empDesignation;
		this.empResume = empResume;
		this.empTick = empTick;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpEmail() {
		return empEmail;
	}


	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}


	public String getEmpMobile() {
		return empMobile;
	}


	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}


	public String getEmpDesignation() {
		return empDesignation;
	}


	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}


	public String getEmpResume() {
		return empResume;
	}


	public void setEmpResume(String empResume) {
		this.empResume = empResume;
	}


	public String getEmpTick() {
		return empTick;
	}


	public void setEmpTick(String empTick) {
		this.empTick = empTick;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empEmail=" + empEmail + ", empMobile=" + empMobile
				+ ", empDesignation=" + empDesignation + ", empResume=" + empResume + ", empTick=" + empTick + "]";
	}

}