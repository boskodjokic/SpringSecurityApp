package com.bosko.springsecurity.dao;

import com.bosko.springsecurity.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
    void save(User user);
	
}
