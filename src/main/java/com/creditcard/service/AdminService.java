package com.creditcard.service;

import com.creditcard.entities.Admin;
import com.creditcard.entities.User;

public interface AdminService {

	Admin addAdmin(Admin admin);

	Admin checkLogin(String userName, String password);
	

	Admin getAdmin(int Id);





}
