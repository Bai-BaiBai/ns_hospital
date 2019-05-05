package com.dr.service;

import com.dr.pojo.User;

public interface LoginService {
	User findUser(User user)throws Exception;
}
