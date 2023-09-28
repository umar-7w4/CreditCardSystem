package com.creditcard.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CustomerCreditCard {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cardNumber",nullable=false)
	private long cardNumber;
	private int fDate;
	private int toDate;
	private int code;
	private String name;
	
	
	@OneToOne
	@JoinColumn(name="userId",referencedColumnName ="userId")
	private User user;
	
	@OneToOne
	@JoinColumn(name="cardId",referencedColumnName = "cardId")
	private CreditCard creditCard;
//	 
//	@OneToMany(targetEntity = CreditCard.class)
//	@JoinColumn(name="titanium",referencedColumnName = "titanium")
//	
	

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getfDate() {
		return fDate;
	}

	public void setfDate(int fDate) {
		this.fDate = fDate;
	}

	public int getToDate() {
		return toDate;
	}

	public void setToDate(int toDate) {
		this.toDate = toDate;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public CustomerCreditCard() {
		super();
	}

	public CustomerCreditCard(long cardNumber, int fDate, int toDate, int code, String name, User user, CreditCard creditCard ) {
		super();
		this.cardNumber = cardNumber;
		this.fDate = fDate;
		this.toDate = toDate;
		this.code = code;
		this.name = name;
		this.user = user;
		this.creditCard = creditCard;
	}

	@Override
	public String toString() {
		return "CustomerCreditCard [cardNumber=" + cardNumber + ", fDate=" + fDate + ", toDate=" + toDate + ", code="
				+ code + ", name=" + name + ", user=" + user + ", creditCard=" + creditCard + "]";
	}

	 
	

	
 

}
