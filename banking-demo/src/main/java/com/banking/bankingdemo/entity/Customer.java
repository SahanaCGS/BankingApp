package com.banking.bankingdemo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Customer implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;

	private String firstName;

	private String lastName;
	

	@OneToMany(targetEntity = Account.class , cascade = CascadeType.ALL)
	@JoinColumn
	private List<Account> account;

	
	public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Customer() {

	}	
	public long getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}

	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


}