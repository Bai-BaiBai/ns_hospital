package com.dr.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dr.mapper.LoginMapper;
import com.dr.pojo.User;
import com.dr.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

//	@Autowired
	@Resource
	private LoginMapper loginMapper;

	public User findUser(User user) throws Exception {
		return loginMapper.findUser(user);
	}
}
