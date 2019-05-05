package com.dr.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.dr.mapper.UserMapper;
import com.dr.pojo.User;
import com.dr.service.UserService;

@Component
public class SecurityService implements UserDetailsService{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		logger.info("请求登录的用户：" + username);
		User user = userMapper.findUserByAccount(username);
		return user;
	}

}
