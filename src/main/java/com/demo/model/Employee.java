package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "eid")
	private int eid;
	
	@Size(min= 4,max=40, message = "First Name should be Greater than 4")
	@Column(name = "fname")
	private String fname;
	@Size(min= 4,max=40, message = "Last Name should be Greater than 4")	
	@Column(name = "lname")
	private String lname;
	@Size(max=10, message = "First Name should be 10 Number")
	@Column(name = "phone")
	private String phone;

	@Email(message="Enter Proper Email Address")
	@Column(name = "email")
	private String email;
	
	@Column(name = "salary")
	private double salary;
	
	
	@Size(min= 4,max=40, message = "Username should be Greater than 4")
	@Column(name = "username")
	private String username;
	
	@Size(min= 4,max=40, message = "Password should be Greater than 4")	
	@Column(name = "password")
	private String password;

	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
