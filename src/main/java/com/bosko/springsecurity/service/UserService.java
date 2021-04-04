package com.bosko.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.bosko.springsecurity.entity.User;
import com.bosko.springsecurity.user.CrmUser;

public interface UserService extends UserDetailsService {

	  User findByUserName(String userName);

	    void save(CrmUser crmUser);
	
}
