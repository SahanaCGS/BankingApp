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
@Table(name="account")
public class Account implements Serializable {

	@Id
	@Column(name="acc_id")
	private int accId;
	
	@Column(name="bank_name")
	private String bankName;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="account_type")
	private AccountType accountType;
	
	@Column(name="bank_code")
	private String bankCode;
	
	@Column(name="account_number",unique=true)
	private int accountNumber;
	
	@Column(name="balance")
	private long balance;

	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@OneToMany(targetEntity = DT_Transaction.class , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn
	private List<DT_Transaction> transaction;
	
	
	public List<DT_Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<DT_Transaction> transaction) {
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
	public Account( String bankName, String branch, AccountType accountType, String bankCode,
			int accountNumber, long balance) {
		super();
		this.bankName = bankName;
		this.branch = branch;
		this.accountType = accountType;
		this.bankCode = bankCode;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
    
}
