package com.bosko.springsecurity.dao;

import com.bosko.springsecurity.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
