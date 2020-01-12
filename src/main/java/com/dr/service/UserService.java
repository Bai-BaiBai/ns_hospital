package com.dr.service;

import com.dr.pojo.User;

import java.util.List;

public interface UserService {

	List<User> getUserList() throws Exception;

	User selectByName(String username);

	int doUserAdd(User user) throws Exception;

	boolean findUserByAccount(String account) throws Exception;

	User findUserById(Integer id) throws Exception;

	/**
	 * 修改用户信息
	 *
	 * @param user
	 * @return
	 */
	boolean updateUser(User user);
}
