package com.banking.bankingdemo.dto;

public class TransactionResponse {
	private int accountNumber;
	private int balance;
	private int amount;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public TransactionResponse() {
		super();
	}
	public TransactionResponse(int accountNumber, int balance, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.amount = amount;
	}

	
}
