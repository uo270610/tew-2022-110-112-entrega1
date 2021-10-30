package com.tew.business;

import com.tew.model.ReturnVerify;

public interface LoginService {
	
	public ReturnVerify verify(String name, String password);
	
	
}