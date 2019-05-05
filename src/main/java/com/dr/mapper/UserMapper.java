package com.dr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dr.pojo.User;

@Mapper
public interface UserMapper {

	List<User> getUserList() throws Exception;
	User selectByName(String username) throws Exception;
	int doUserAdd(User user) throws Exception;
	User findUserByAccount (String account);
	User findUserById(Integer id) throws Exception;
}
