package com.banking.bankingdemo.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.banking.bankingdemo.enums.AccountType;

@Entity
public class Account implements Serializable {

	@Id
	private int accId;
	
	private String bankName;
	
	private String branch;
	
	private AccountType accountType;
	
	private String bankCode;
	
	@Column(unique=true)
	private int accountNumber;
	
	private long balance;

	

	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@OneToMany(targetEntity = Transaction.class , cascade = CascadeType.ALL)
	private List<Transaction> transaction;
	
	
	public List<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
 		this.branch = branch;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	

	public Account() {

	}
	public Account(int accId, String bankName, String branch, AccountType accountType, String bankCode,
			int accountNumber, long balance, List<Transaction> transaction) {
		super();
		this.accId = accId;
		this.bankName = bankName;
		this.branch = branch;
		this.accountType = accountType;
		this.bankCode = bankCode;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.transaction = transaction;
	}
	
    
}
