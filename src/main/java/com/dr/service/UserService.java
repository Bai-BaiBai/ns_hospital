package com.dr.service;

import java.util.List;

import com.dr.pojo.User;

public interface UserService {

	List<User> getUserList() throws Exception;
	User selectByName(String username);
	int doUserAdd(User user) throws Exception;
	boolean findUserByAccount(String account)throws Exception;
	User findUserById(Integer id) throws Exception;
}
