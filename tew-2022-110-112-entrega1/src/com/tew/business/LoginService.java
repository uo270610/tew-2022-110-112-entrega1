package com.tew.business;

import com.tew.model.ReturnVerify;
import com.tew.model.User;

public interface LoginService {
	
	public ReturnVerify verify(String name, String password);
	
	
}