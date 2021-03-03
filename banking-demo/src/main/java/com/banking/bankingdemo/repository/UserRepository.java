//package com.banking.bankingdemo.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.banking.bankingdemo.entity.User;
//
//
//public interface UserRepository extends JpaRepository<User, Integer>{
//	  @Query("select email from User u where u.email = :email and u.password = :password")
//	  User findByEmailAddress(@Param("email") String email, @Param("password") String password);
//}

