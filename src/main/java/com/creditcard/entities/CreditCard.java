package com.creditcard.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditCard  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cardId;
	@Column(name="Type")
	private String name;
	private int joiningfee;
	private int annulfee;
	private int limit;
	private String bankName;
	public int getCustomerId() {
		return cardId;
	}
	public void setCustomerId(int customerId) {
		this.cardId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJoiningfee() {
		return joiningfee;
	}
	public void setJoiningfee(int joiningfee) {
		this.joiningfee = joiningfee;
	}
	public int getAnnulfee() {
		return annulfee;
	}
	public void setAnnulfee(int annulfee) {
		this.annulfee = annulfee;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public CreditCard() {
		super();
	}
	public CreditCard(int customerId, String name, int joiningfee, int annulfee, int limit, String bankName) {
		super();
		this.cardId = customerId;
		this.name = name;
		this.joiningfee = joiningfee;
		this.annulfee = annulfee;
		this.limit = limit;
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "CustomerCard [customerId=" + cardId + ", name=" + name + ", joiningfee=" + joiningfee
				+ ", annulfee=" + annulfee + ", limit=" + limit + ", bankName=" + bankName + "]";
	}
	
	
}
