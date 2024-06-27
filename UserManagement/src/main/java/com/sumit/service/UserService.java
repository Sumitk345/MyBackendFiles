package com.sumit.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.entity.UserAccount;
import com.sumit.repository.UserAccountRepository;

@Service
public class UserService {

	@Autowired
	UserAccountRepository userAccountRepository;
	
	public List<UserAccount> getUserAccount() {
		return userAccountRepository.findAll();
	}
	
	public UserAccount saveEntity(UserAccount user) {
		return userAccountRepository.save(user);
	}
	
	public Optional<UserAccount> findById(int id) {
        return userAccountRepository.findById(id);
    }

    public void deleteById(int id) {
    	userAccountRepository.deleteById(id);
    }
}
