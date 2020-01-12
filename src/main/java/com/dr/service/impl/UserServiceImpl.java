package com.dr.service.impl;

import com.dr.mapper.UserMapper;
import com.dr.pojo.User;
import com.dr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Resource
	UserMapper userMapper;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public List<User> getUserList() throws Exception {
		return userMapper.getUserList();
	}

	@Override
	public User selectByName(String username) {
		try {
			return userMapper.selectByName(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 增加用户，密码加密后存储
	 */
	@Override
	public int doUserAdd(User user) throws Exception {
		String encodePassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodePassword);
		return userMapper.doUserAdd(user);
	}

	@Override
	public boolean findUserByAccount(String account) throws Exception {
		User user = userMapper.findUserByAccount(account);
		return user != null;
	}

	@Override
	public User findUserById(Integer id) throws Exception {
		return userMapper.findUserById(id);
	}

}
