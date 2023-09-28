package com.creditcard.entities;

import java.sql.Date;
import java.util.List;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class Transaction {
	@Id
	
	private int transactionId;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "DD-MM-YYYY")
	private Date transactiondate;
	private String status;
	private int amount;
	private int transactiontime;
	
	@ManyToOne
	@JoinColumn(name="cardNumber",referencedColumnName ="cardNumber")
	private CustomerCreditCard cardnumber;
	
	@ManyToOne
	@JoinColumn(name="userId",referencedColumnName = "userId")
	private User userId;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTime() {
		return transactiontime;
	}

	public void setTime(int time) {
		this.transactiontime = transactiontime;
	}

	public CustomerCreditCard getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(CustomerCreditCard cardnumber) {
		this.cardnumber = cardnumber;
	}
	

	public Date getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}

	public int getTransactiontime() {
		return transactiontime;
	}

	public void setTransactiontime(int transactiontime) {
		this.transactiontime = transactiontime;
	}

	public Transaction() {
		super();
	}

	public Transaction(int transactionId, Date transactiondate, String status, int amount, int transactiontime,
			CustomerCreditCard cardnumber) {
		super();
		this.transactionId = transactionId;
		this.transactiondate = transactiondate;
		this.status = status;
		this.amount = amount;
		this.transactiontime = transactiontime;
		this.cardnumber = cardnumber;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactiondate=" + transactiondate + ", status=" + status + ", amount="
				+ amount + ", transactiontime=" + transactiontime + ", cardnumber=" + cardnumber + "]";
	}
	
	

}
