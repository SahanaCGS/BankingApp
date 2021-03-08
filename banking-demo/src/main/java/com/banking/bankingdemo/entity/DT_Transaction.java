package com.banking.bankingdemo.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.banking.bankingdemo.enums.AccountType;
import com.banking.bankingdemo.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="transaction")
public class DT_Transaction implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="trans_id")
	private int transId;
		
	@Column(name="date")
	private Date date;
	
	@Column(name="description")
	private String description;
	
	@Column(name="amount")
	private int amount;

	@Column(name="transaction_type")
	private TransactionType transactionType;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transactionmapped", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Account account;

	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public DT_Transaction() {
		super();
	}

	public int getTransactionconId(){
	    return account.getAccId();
	}

	public DT_Transaction(Date date, String description, TransactionType transactionType,int amount) {
		super();
		this.date = date;
		this.description = description;
		this.transactionType = transactionType;
		this.amount = amount;

	}


	
}
