package com.dr.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dr.mapper.UserMapper;
import com.dr.pojo.User;
import com.dr.service.UserService;

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
		// TODO Auto-generated method stub
		try {
			return userMapper.selectByName(username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
		// TODO Auto-generated method stub
		return userMapper.doUserAdd(user);
	}

	@Override
	public boolean findUserByAccount(String account) throws Exception {
		// TODO Auto-generated method stub
		User user = userMapper.findUserByAccount(account);
		return user != null ? true : false;
	}

	@Override
	public User findUserById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.findUserById(id);
	}

}
