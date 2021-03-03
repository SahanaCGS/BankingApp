package com.banking.bankingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.bankingdemo.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer>{
	

}
