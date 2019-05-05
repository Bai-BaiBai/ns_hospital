package com.dr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dr.pojo.User;
@Mapper
public interface LoginMapper {
    User findUser(User user);
}