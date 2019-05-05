package com.dr.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.dr.pojo.Dept;

@Mapper
public interface DeptMapper {

	ArrayList<Dept> getDeptList() throws Exception;
}
