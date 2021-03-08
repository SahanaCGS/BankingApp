package com.banking.bankingdemo.dto;

import com.banking.bankingdemo.entity.Account;
import com.banking.bankingdemo.entity.DT_Transaction;

public class TransactionRequest {
	private DT_Transaction transactionRequested;



	public DT_Transaction getTransactionRequested() {
		return transactionRequested;
	}



	public void setTransactionRequested(DT_Transaction transactionRequested) {
		this.transactionRequested = transactionRequested;
	}



	public TransactionRequest() {
		super();
	}

	
}
