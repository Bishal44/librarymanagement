package com.bishal.lmscrud.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "borrower_info")
public class Borrower {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="borrower_id")
	private int BorrowerId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="user_name")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name = "dob")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dob;
	@Column(length = 45, nullable = false)
	private String email;
	private String gender;
	private String departments;
	private int roll;
	public int getBorrowerId() {
		return BorrowerId;
	}
	public void setBorrowerId(int borrowerId) {
		BorrowerId = borrowerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}

	
	
}
