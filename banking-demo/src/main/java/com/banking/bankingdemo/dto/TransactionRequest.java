package com.banking.bankingdemo.dto;

import com.banking.bankingdemo.entity.Transaction;

public class TransactionRequest {
	private Transaction transaction;

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public TransactionRequest() {
		
	}

}
