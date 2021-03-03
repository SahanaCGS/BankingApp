package com.banking.bankingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.banking.bankingdemo.entity.Transaction;


@SpringBootApplication(scanBasePackages = {"Transaction.class"} )
public class BankingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingDemoApplication.class, args);
	}
	
}
