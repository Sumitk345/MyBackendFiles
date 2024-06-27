package com.sumit.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {

}
