package com.banking.bankingdemo.dto;

import com.banking.bankingdemo.entity.Account;
import com.banking.bankingdemo.entity.DT_Transaction;

public class TransactionRequest {
	private Account accountrequested;

	public Account getAccountrequested() {
		return accountrequested;
	}

	public void setAccountrequested(Account accountrequested) {
		this.accountrequested = accountrequested;
	}

	public TransactionRequest() {
		super();
	}

	
}
