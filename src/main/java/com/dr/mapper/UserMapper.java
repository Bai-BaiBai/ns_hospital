package com.dr.mapper;

import com.dr.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

	List<User> getUserList() throws Exception;

	User selectByName(String username) throws Exception;

	int doUserAdd(User user) throws Exception;

	User findUserByAccount(String account);

	User findUserById(Integer id) throws Exception;

	int updateUserInfo(User user);
}
