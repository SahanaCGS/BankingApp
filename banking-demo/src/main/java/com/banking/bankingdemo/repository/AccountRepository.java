package com.banking.bankingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.bankingdemo.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}