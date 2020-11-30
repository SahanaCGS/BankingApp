package com.banking.bankingdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.bankingdemo.dto.AddRequest;
import com.banking.bankingdemo.entity.Customer;
import com.banking.bankingdemo.repository.AccountRepository;
import com.banking.bankingdemo.repository.CustomerRepository;

@RestController
@RequestMapping("/bankingApp")
public class BankController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@PostMapping("/addAccount")
	public Customer addAccount(@RequestBody AddRequest request) {
		return customerRepository.save(request.getCustomer());
	}
	
	@GetMapping("/findAllAccounts")
	public List<Customer> findAllAccounts(){
		return customerRepository.findAll();
	}
	
	
	
	
	
	/*get all customer details*/	
	/*@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}*/
}
