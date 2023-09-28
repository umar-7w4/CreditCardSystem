package com.creditcard.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="userId",nullable=false)
	private int userId; 
	private String fName;
	private String lName;
	private String mail;
	private int phNumber;
	private String address;
	private String city;
	private String state;
	private String userName;
	private String password;
	private int income;
	private int pincode;
	private String education;
	private int dob;
	private String gender;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getId() {
		return userId;
	}
	public void setId(int id) {
		this.userId = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getNumber() {
		return phNumber;
	}
	public void setNumber(int number) {
		this.phNumber = number;
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
	
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public User() {
		super();
	}
	
	public User(int userId, String fName, String lName, String mail, int phNumber, String address, String city,
			String state, String userName, String password, int income, int pincode, String education, int dob,
			String gender) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.mail = mail;
		this.phNumber = phNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.userName = userName;
		this.password = password;
		this.income = income;
		this.pincode = pincode;
		this.education = education;
		this.dob = dob;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", mail=" + mail + ", number="
				+ phNumber + ", address=" + address + ", city=" + city + ", state=" + state + ", userName=" + userName
				+ ", password=" + password + ", income=" + income + ", pincode=" + pincode + ", education=" + education
				+ ", dob=" + dob + ", gender=" + gender + "]";
	}
	
	
	

}
