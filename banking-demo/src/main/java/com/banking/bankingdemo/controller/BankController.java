package com.banking.bankingdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.banking.bankingdemo.dto.AddRequest;
import com.banking.bankingdemo.dto.TransactionRequest;
import com.banking.bankingdemo.dto.TransactionResponse;
import com.banking.bankingdemo.entity.Account;
import com.banking.bankingdemo.entity.Customer;
import com.banking.bankingdemo.entity.DT_Transaction;
import com.banking.bankingdemo.repository.AccountRepository;
import com.banking.bankingdemo.repository.CustomerRepository;
import com.banking.bankingdemo.repository.TransactionRepository;

@RestController
@RequestMapping("/bankingApp")
public class BankController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Account addAccount(@RequestBody Account account) {
		System.out.println(account.getCustomer());
		return accountRepository.save(account);
	}
			
	@RequestMapping(value = "/getAccount", method = RequestMethod.GET)
	public @ResponseBody List<Account> findAccounts(){
		return accountRepository.findAll();
	}

	@RequestMapping(value = "/getAccount/{id}", method = RequestMethod.GET)
	public Optional<Account> findAccountsById(@PathVariable(value = "id") int id){
		return accountRepository.findById(id);
	}

	@RequestMapping(value = "/getCustomer", method = RequestMethod.GET)
	public List<Customer> findCustomers(){
		return customerRepository.findAll();
	}
	
	@RequestMapping(value = "/getCustomer/{id}", method = RequestMethod.GET)
	public Optional<Customer> findCustomersById(@PathVariable(value = "id") int id){
		return customerRepository.findById(id);
	}
	@RequestMapping(value = "/listOfTransactions", method = RequestMethod.GET)
	public List<DT_Transaction> findTransactions() {
		return transactionRepository.findAll();
	}
	@RequestMapping(value = "/transaction/{id}", method = RequestMethod.POST)
	public Optional<DT_Transaction> findTransactions(@PathVariable(value = "id") int id) {
		return transactionRepository.findById(id);
	}
	
	
	
	@RequestMapping(value = "/transaction/deposit", method = RequestMethod.POST)
	public DT_Transaction makeDeposit(@RequestBody DT_Transaction transact) {
		 int amount = transactionRepository.save(transact).getAmount();
         Optional<Account> account = accountRepository.findById(transact.getAccount().getAccId());
         if(account.isPresent()) {
             Account account1=account.get();
        	 int newbalance = account1.getBalance() + amount;
             account1.setBalance(newbalance);
             accountRepository.save(account1);
         }
         else {
        	 System.out.println(account);
         }
		 return transact;			
	}
	
	@RequestMapping(value = "/transaction/withdraw", method = RequestMethod.POST)
	public DT_Transaction makeWithdraw(@RequestBody DT_Transaction transact) {
		 int amount = transactionRepository.save(transact).getAmount();
         Optional<Account> account = accountRepository.findById(transact.getAccount().getAccId());
         if(account.isPresent()) {
             Account account1=account.get();
        	 int newbalance = account1.getBalance() - amount;
             account1.setBalance(newbalance);
             accountRepository.save(account1);
         }
         else {
        	 System.out.println(account);
         }
		 return transact;			
	}
}
